package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class represents the {@code Incident} that where the attacker attempts
 * to exploit the vulnerabilities emulated in the MSSQL service.
 */
public class MssqlIncident extends Incident {
	
	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(MssqlIncident.class);

	/**
	 * MSSQL client name.
	 */
	private String mssqlClientName;
	/**
	 * MSSQL command executed by the attacker.
	 */
	private String mssqlCommand;
	/**
	 * MSSQL command status.
	 */
	private String mssqlCommandStatus;
	/**
	 * MSSQL hostname used by the attacker.
	 */
	private String mssqlHostName;

	
	
	/**
	 * Instantiates a new mssql incident.
	 */
	public MssqlIncident() {
		super();
	}


	/**
	 * Instantiates a new {@link MssqlIncident}.
	 *
	 * @param dateTime
	 *            the date time
	 * @param srcIP
	 *            the source IP
	 * @param srcPort
	 *            the source port
	 * @param service
	 *            the service
	 * @param dstIP
	 *            the destination ip
	 * @param dstPort
	 *            the destination port
	 * @param protocol
	 *            the protocol
	 * @param origin
	 *            the origin {@link Origin}
	 * @param dest
	 *            the dest
	 * @param mssqlClientName
	 *            the mssql client name
	 * @param mssqlCommand
	 *            the mssql command
	 * @param mssqlCommandStatus
	 *            the mssql command status
	 * @param mssqlHostName
	 *            the mssql host name
	 */
	public MssqlIncident(String dateTime, String srcIP, int srcPort, String service, String dstIP, int dstPort,
			String protocol, Origin origin, Sensor dest, String mssqlClientName, String mssqlCommand, String mssqlCommandStatus,
			String mssqlHostName) {
		super(dateTime, srcIP, srcPort, service, dstIP, dstPort, protocol, null, null);
		log.trace("Create new MssqlIncident instance with mssqlClientName [{}], mssqlCommandStatus [{}]", mssqlClientName, mssqlCommandStatus);
		this.mssqlClientName = mssqlClientName;
		this.mssqlCommand = mssqlCommand;
		this.mssqlCommandStatus = mssqlCommandStatus;
		this.mssqlHostName = mssqlHostName;
	}


	/**
	 * Gets the Mssql client name.
	 *
	 * @return the Mssql client name
	 */
	public String getMssqlClientName() {
		log.trace("Get mssqlClientName, returns [{}]", mssqlClientName);
		return mssqlClientName;
	}

	
	/**
	 * Sets the Mssql client name.
	 *
	 * @param mssql_clientname
	 *            the new Mssql client name
	 */
	public void setMssqlClientName(String mssql_clientname) {
		log.trace("Set mssqlClientName to [{}]", mssql_clientname);
		this.mssqlClientName = mssql_clientname;
	}

	
	/**
	 * Gets the Mssql command executed by the attacker.
	 *
	 * @return the Mssql command executed by the attacker
	 */
	public String getMssqlCommand() {
		log.trace("Get mssqlCommand, returns [{}]", mssqlCommand);
		return mssqlCommand;
	}

	/**
	 * Sets the Mssql command executed by the attacker.
	 *
	 * @param mssql_command_cmd
	 *            the new Mssql command executed by the attacker
	 */
	public void setMssqlCommand(String mssql_command_cmd) {
		log.trace("Set mssqlCommand to [{}]", mssql_command_cmd);
		this.mssqlCommand = mssql_command_cmd;
	}

	
	/**
	 * Gets the Mssql command status.
	 *
	 * @return the Mssql command status
	 */
	public String getMssqlCommandStatus() {
		log.trace("Get mssqlCommandStatus, returns [{}]", mssqlCommandStatus);
		return mssqlCommandStatus;
	}

	
	/**
	 * Sets the Mssql command status.
	 *
	 * @param mssql_command_status
	 *            the new Mssql command status
	 */
	public void setMssqlCommandStatus(String mssql_command_status) {
		log.trace("Set mssqlCommandStatus to [{}]", mssql_command_status);
		this.mssqlCommandStatus = mssql_command_status;
	}

	
	/**
	 * Gets the Mssql hostname used by the attacker.
	 *
	 * @return the Mssql hostname used by the attacker
	 */
	public String getMssqlHostName() {
		log.trace("Get mssqlHostName, returns [{}]", mssqlHostName);
		return mssqlHostName;
	}


	/**
	 * Sets the Mssql hostname used by the attacker.
	 *
	 * @param mssql_hostname
	 *            the new Mssql hostname used by the attacker
	 */
	public void setMssqlHostName(String mssql_hostname) {
		log.trace("Set mssqlHostName to [{}]", mssql_hostname);
		this.mssqlHostName = mssql_hostname;
	}

	
	/**
	 * Calculate severity.
	 *
	 * @return the int
	 */
	public int calculateSeverity(){
		return 0;}
}