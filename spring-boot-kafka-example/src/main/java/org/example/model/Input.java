package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * Singleton for representing the commands executed by attacker in
 * {@code SshIncident}.
 */
public class Input {

	/** The logger for this class. */
	private static Logger log = LoggerFactory.getLogger(Input.class);

	/**
	 * Command attempted by the attacker.
	 */
	private String command;
	/**
	 * Whether or not the command was executed successfully.
	 */
	private boolean success;
	/**
	 * The datetime when the command was executed.
	 */
	private String dateTime;
	
	

	/**
	 * Instantiates a new {@code Input}.
	 */
	public Input() {
		super();
	}

	/**
	 * Instantiates a new {@code Input}.
	 *
	 * @param command
	 *            the command
	 * @param success
	 *            the success
	 * @param time
	 *            the time
	 */
	public Input(String command, boolean success, String time) {
		log.trace("Create new Incident instance with command [{}], success [{}], time [{}] ", command, success, time);
		this.command = command;
		this.success = success;
		this.dateTime = time;
	}

	/**
	 * Gets the command attempted by the attacker.
	 *
	 * @return the command attempted by the attacker
	 */
	public String getCommand() {
		log.trace("Get command, returns [{}]", command);
		return command;
	}

	/**
	 * Sets the command attempted by the attacker.
	 *
	 * @param command
	 *            the new command attempted by the attacker
	 */
	public void setCommand(String command) {
		log.trace("Set command to [{}]", command);
		this.command = command;
	}

	/**
	 * Checks if is whether or not the command was executed successfully.
	 *
	 * @return the whether or not the command was executed successfully
	 */
	public boolean isSuccess() {
		log.trace("Input isSuccess, returns [{}]", success);
		return success;
	}

	/**
	 * Sets the whether or not the command was executed successfully.
	 *
	 * @param success
	 *            the new whether or not the command was executed successfully
	 */
	public void setSuccess(boolean success) {
		log.trace("Set success to [{}]", success);
		this.success = success;
	}

	/**
	 * Gets the datetime when the command was executed.
	 *
	 * @return the datetime when the command was executed
	 */
	public String getDateTime() {
		log.trace("Get dateTime, returns [{}]", dateTime);
		return dateTime;
	}

	/**
	 * Sets the datetime when the command was executed.
	 *
	 * @param dateTime
	 *            the new datetime when the command was executed
	 */
	public void setDateTime(String dateTime) {
		log.trace("Set dateTime to [{}]", dateTime);
		this.dateTime = dateTime;
	}

}