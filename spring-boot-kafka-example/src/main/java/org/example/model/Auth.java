package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Singleton for representing an authentication attempt in {@code SshIncident}.
 */
public class Auth {

	/** The logger for this class. */
	private static Logger log = LoggerFactory.getLogger(Auth.class);

	/**
	 * Username used for authentication attempt.
	 */
	private String username;
	/**
	 * Password used for the authentication attempt.
	 */
	private String password;
	/**
	 * Whether or not the authentication attempt was successful.
	 */
	private boolean success;
	/**
	 * The datetime associated with the authentication attempt.
	 */
	private String dateTime;
	

	/**
	 * Instantiates a new {@code Auth}.
	 */
	public Auth() {
		super();
	}

	/**
	 * Instantiate a new {@code Auth}.
	 *
	 * @param username
	 *            the username used in the authentication attempt
	 * @param password
	 *            the password used in the authentication attempt
	 * @param success
	 *            the boolean indicating the success or failure of the
	 *            authentication attempt
	 * @param time
	 *            the time
	 */
	public Auth(String username, String password, boolean success, String time) {
		log.trace("Create new Auth instance with username [{}], password [{}], success [{}], dateTime [{}]", username,
				password, success, time);
		this.username = username;
		this.password = password;
		this.success = success;
		this.dateTime = time;
	}

	/**
	 * Gets the username used for authentication attempt.
	 *
	 * @return the username used for authentication attempt
	 */
	public String getUsername() {
		log.trace("Get username, returns [{}]", username);
		return username;
	}

	/**
	 * Sets the username used for authentication attempt.
	 *
	 * @param username
	 *            the new username used for authentication attempt
	 */
	public void setUsername(String username) {
		log.trace("Set username to [{}]", username);
		this.username = username;
	}

	/**
	 * Gets the password used for the authentication attempt.
	 *
	 * @return the password used for the authentication attempt
	 */
	public String getPassword() {
		log.trace("Get password, returns [{}]", password);
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		log.trace("Set password to [{}]", password);
		this.password = password;
	}

	/**
	 * Checks if the authentication attempt was successful.
	 *
	 * @return true, if is success
	 */
	public boolean isSuccess() {
		log.trace("Auth isSuccess, returns [{}]", success);
		return success;
	}

	/**
	 * Sets the boolean value of whether or not the authentication attempt was
	 * successful.
	 *
	 * @param success
	 *            boolean value of whether or not the authentication attempt was
	 *            successful
	 */
	public void setSuccess(boolean success) {
		log.trace("Set success to [{}]", success);
		this.success = success;
	}

	/**
	 * Gets the datetime associated with the authentication attempt.
	 *
	 * @return the datetime associated with the authentication attempt
	 */
	public String getDateTime() {
		log.trace("Get dateTime, returns [{}]", dateTime);
		return dateTime;
	}

	/**
	 * Sets the datetime associated with the authentication attempt.
	 *
	 * @param dateTime
	 *            the new datetime associated with the authentication attempt
	 */
	public void setDateTime(String dateTime) {
		log.trace("Set dateTime to [{}]", dateTime);
		this.dateTime = dateTime;
	}

}