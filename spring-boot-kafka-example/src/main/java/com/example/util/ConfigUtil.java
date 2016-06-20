package com.example.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigUtil {

	private static Logger log = LoggerFactory.getLogger(ConfigUtil.class);
	/**
	 * Static constant for state properties file path
	 */
	public static final String STATE_PATH = System.getProperty("user.dir") + "/config/state.properties";
	/**
	 * Static constant for archival agent properties file path
	 */
	public static final String DB_ADAPTER_PATH = System.getProperty("user.dir") + "/config/db-adapter.properties";

	public static final String SENSOR_LOG_PATH = System.getProperty("user.dir") + "/out/";

	private static Properties STATE_PROPS = null;

	private static Properties DB_PROPS = null;
	/**
	 * Load state properties into static properties
	 */
	public static Properties loadProperties(String fileName) {
		log.info("Loading state properties");
		BufferedReader br = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e1) {
			log.error("FATAL: Error occured while trying to read file [{}]", fileName);
			log.info("Stopping Adopter.");
			System.exit(-1);
		}
		Properties p = new Properties();
		try {
			br = new BufferedReader(fileReader);
			p.load(br);
		} catch (FileNotFoundException e) {
			log.error("Error occurred while trying to read from property file [{}] ", fileName, e);
		} catch (IOException e) {
			log.error("Error occurred while trying to read from property file [{}] ", fileName, e);
		}

		return p;

	}

	/**
	 * Get State Properties
	 * 
	 * @return
	 */
	public static Properties getStateProperties() {
		if (STATE_PROPS == null)
			STATE_PROPS = loadProperties(STATE_PATH);
		return STATE_PROPS;
	}

	/**
	 * Get DB Properties
	 * 
	 * @return
	 */
	public static Properties getDBProperties() {
		if (DB_PROPS == null)
			DB_PROPS = loadProperties(DB_ADAPTER_PATH);
		return DB_PROPS;
	}

	/**
	 * 
	 */
	public static void editStateProperties(String prop, String value) {
		getStateProperties().setProperty(prop, value);
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(STATE_PATH);
			STATE_PROPS.setProperty(prop, value);
			try {
				STATE_PROPS.store(output, null);
			} catch (IOException e) {
				log.error("Error occurred while trying to write to property file [{}]", STATE_PROPS, e);

			}

		} catch (FileNotFoundException e) {
			log.error("Error occurred while trying to write to property file [{}]", STATE_PROPS, e);
		} finally {

			if (output != null) {
				try {
					output.close();
				} catch (IOException io) {
					log.error("Error occurred while trying to close FileOutputStream ", io);
				}
			}
		}
		log.info("Successfully written value [{}], to property [{}] ", value, prop);

	}

}
