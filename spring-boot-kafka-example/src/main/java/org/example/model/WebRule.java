package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Singleton for describing the Modsecurity rule triggered by the
 * {@code WebIncident}.
 */
public class WebRule {

	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(WebRule.class);

	/**
	 * Category of the triggered rule.
	 */
	private String ruleCategory;
	
	/**
	 * Message of the triggered rule.
	 */
	private String ruleMessage;
	
	/**
	 * File that contains triggered rule.
	 */
	private String ruleFile;
	
	/**
	 * Unique Id of the triggered rule.
	 */
	private String ruleId;
	
	/**
	 * Regex pattern matched that triggered the rule.
	 */
	private String regexPattern;

	/**
	 * Data within the http request/response that matched the regex.
	 */
	private String matchedData;


	private List<String> tags;
	
	/**
	 * Instantiates a new web rule.
	 */
	public WebRule() {
		super();
	}


	/**
	 * Instantiates a new web rule.
	 *
	 * @param ruleCategory
	 *            the rule category
	 * @param ruleMessage
	 *            the rule message
	 * @param ruleFile
	 *            the rule file
	 * @param ruleId
	 *            the rule id
	 * @param regexPattern
	 *            the regex pattern
	 * @param matchedData
	 *            the matched data
	 */
	public WebRule(String ruleCategory, String ruleMessage, String ruleFile, String ruleId, String regexPattern,
			String matchedData, List<String> tags) {
		super();
		this.ruleCategory = ruleCategory;
		this.ruleMessage = ruleMessage;
		this.ruleFile = ruleFile;
		this.ruleId = ruleId;
		this.regexPattern = regexPattern;
		this.matchedData = matchedData;
		this.tags = tags;
	}

	/**
	 * Gets the category of the triggered rule.
	 *
	 * @return the category of the triggered rule
	 */
	public String getRuleCategory() {
		log.trace("Get ruleCategory, returns [{}]", ruleCategory);
		return ruleCategory;
	}

	/**
	 * Sets the category of the triggered rule.
	 *
	 * @param ruleCategory
	 *            the new category of the triggered rule
	 */
	public void setRuleCategory(String ruleCategory) {
		log.trace("Set ruleCategory to [{}]", ruleCategory);
		this.ruleCategory = ruleCategory;
	}

	/**
	 * Gets the message of the triggered rule.
	 *
	 * @return the message of the triggered rule
	 */
	public String getRuleMessage() {
		log.trace("Get ruleMessage, returns [{}]", ruleMessage);
		return ruleMessage;
	}

	/**
	 * Sets the message of the triggered rule.
	 *
	 * @param ruleMessage
	 *            the new message of the triggered rule
	 */
	public void setRuleMessage(String ruleMessage) {
		log.trace("Set ruleMessage to [{}]", ruleMessage);
		this.ruleMessage = ruleMessage;
	}


	/**
	 * Gets the regex pattern matched that triggered the rule.
	 *
	 * @return the regex pattern matched that triggered the rule
	 */
	public String getRegexPattern() {
		return regexPattern;
	}


	/**
	 * Sets the regex pattern matched that triggered the rule.
	 *
	 * @param regexPattern
	 *            the new regex pattern matched that triggered the rule
	 */
	public void setRegexPattern(String regexPattern) {
		this.regexPattern = regexPattern;
	}


	/**
	 * Gets the file that contains triggered rule.
	 *
	 * @return the file that contains triggered rule
	 */
	public String getRuleFile() {
		return ruleFile;
	}


	/**
	 * Sets the file that contains triggered rule.
	 *
	 * @param ruleFile
	 *            the new file that contains triggered rule
	 */
	public void setRuleFile(String ruleFile) {
		this.ruleFile = ruleFile;
	}


	/**
	 * Gets the unique Id of the triggered rule.
	 *
	 * @return the unique Id of the triggered rule
	 */
	public String getRuleId() {
		return ruleId;
	}


	/**
	 * Sets the unique Id of the triggered rule.
	 *
	 * @param ruleId
	 *            the new unique Id of the triggered rule
	 */
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}


	/**
	 * Gets the data within the http request/response that matched the regex.
	 *
	 * @return the data within the http request/response that matched the regex
	 */
	public String getMatchedData() {
		return matchedData;
	}


	/**
	 * Sets the data within the http request/response that matched the regex.
	 *
	 * @param matchedData
	 *            the new data within the http request/response that matched the
	 *            regex
	 */
	public void setMatchedData(String matchedData) {
		this.matchedData = matchedData;
	}


	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}