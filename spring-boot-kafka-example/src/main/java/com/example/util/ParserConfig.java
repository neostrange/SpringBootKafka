package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * Created by geek on 4/4/16.
 */
public class ParserConfig {

	private Pattern matchedPattern;

	private Pattern filePattern;

	private Pattern attackCategoryPattern;

	private Pattern idPattern;

	private Pattern msgPattern;

	private Pattern dataPattern;

	private Pattern severityPattern;

	private Pattern maturityPattern;

	private Pattern accuracyPattern;

	private Pattern tagPattern;

	private String rawString;

	private Pattern protoclPattern;

	private static ParserConfig instance = null;

	private Logger log = LoggerFactory.getLogger(ParserConfig.class);

	private Properties patterns;

	private ParserConfig() {

		FileReader fileReader;

		try {
			fileReader = new FileReader("config/patterns.properties");
			patterns = new Properties();
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			patterns.load(bufferedReader);

			setMatchedPattern(compilePattern(patterns.getProperty("matched_pattern")));
			setFilePattern(compilePattern(patterns.getProperty("file_pattern")));
			setAttackCategoryPattern(compilePattern(patterns.getProperty("attack_category_pattern")));
			setIdPattern(compilePattern(patterns.getProperty("id_pattern")));
			setMsgPattern(compilePattern(patterns.getProperty("msg_pattern")));
			setDataPattern(compilePattern(patterns.getProperty("data_pattern")));
			setSeverityPattern(compilePattern(patterns.getProperty("serverity_pattern")));
			setMaturityPattern(compilePattern(patterns.getProperty("maturity_pattern")));
			setAccuracyPattern(compilePattern(patterns.getProperty("accuracy_pattern")));
			setTagPattern(compilePattern(patterns.getProperty("tag_pattern")));
			setProtoclPattern(compilePattern(patterns.getProperty("protocol_pattern")));
			setRawString(patterns.getProperty("raw_log"));

		} catch (FileNotFoundException e) {
			log.error("{}", e.getMessage());
		} catch (IOException e) {
			log.error("{}", e.getMessage());
		}
	}

	public static ParserConfig getInstance() {
		if (instance == null) {
			instance = new ParserConfig();
		}
		return instance;
	}

	public Pattern getMatchedPattern() {
		return matchedPattern;
	}

	public void setMatchedPattern(Pattern matchedPattern) {
		this.matchedPattern = matchedPattern;
	}

	public Pattern getFilePattern() {
		return filePattern;
	}

	public void setFilePattern(Pattern filePattern) {
		this.filePattern = filePattern;
	}

	public Pattern getAttackCategoryPattern() {
		return attackCategoryPattern;
	}

	public void setAttackCategoryPattern(Pattern attackCategoryPattern) {
		this.attackCategoryPattern = attackCategoryPattern;
	}

	public Pattern getIdPattern() {
		return idPattern;
	}

	public void setIdPattern(Pattern idPattern) {
		this.idPattern = idPattern;
	}

	public Pattern getMsgPattern() {
		return msgPattern;
	}

	public void setMsgPattern(Pattern msgPattern) {
		this.msgPattern = msgPattern;
	}

	public Pattern getDataPattern() {
		return dataPattern;
	}

	public void setDataPattern(Pattern dataPattern) {
		this.dataPattern = dataPattern;
	}

	public Pattern getSeverityPattern() {
		return severityPattern;
	}

	public void setSeverityPattern(Pattern severityPattern) {
		this.severityPattern = severityPattern;
	}

	public Pattern getMaturityPattern() {
		return maturityPattern;
	}

	public void setMaturityPattern(Pattern maturityPattern) {
		this.maturityPattern = maturityPattern;
	}

	public Pattern getAccuracyPattern() {
		return accuracyPattern;
	}

	public void setAccuracyPattern(Pattern accuracyPattern) {
		this.accuracyPattern = accuracyPattern;
	}

	public Pattern getTagPattern() {
		return tagPattern;
	}

	public void setTagPattern(Pattern tagPattern) {
		this.tagPattern = tagPattern;
	}

	public String getRawString() {
		return rawString;
	}

	public void setRawString(String rawString) {
		this.rawString = rawString;
	}

	private Pattern compilePattern(String rawPattern) {
		return Pattern.compile(rawPattern);
	}

	public Pattern getProtoclPattern() {
		return protoclPattern;
	}

	public void setProtoclPattern(Pattern protoclPattern) {
		this.protoclPattern = protoclPattern;
	}
}
