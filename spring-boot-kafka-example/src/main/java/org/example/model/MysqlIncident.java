package org.example.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class represents the {@code Incident} where the attacker exploited
 * exposed vulnerabilities of the MySQL service.
 */
public class MysqlIncident extends Incident {
	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(MysqlIncident.class);

	/**
	 * List of {@code MysqlCommand} which stores the list of MySQL commands
	 * carried out by the attacker in an incident and the corresponding
	 * operation number.
	 */
	private List<MysqlCommand> mysqlCommands;

	/**
	 * Instantiates a new mysql incident.
	 */
	public MysqlIncident() {
		super();
	}

	/**
	 * Instantiates a new mysql incident.
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
	 * @param mysqlCommands
	 *            the mysql commands
	 */
	public MysqlIncident(String dateTime, String srcIP, int srcPort, String service, String dstIP, int dstPort,
			String protocol, List<MysqlCommand> mysqlCommands) {
		super(dateTime, srcIP, srcPort, service, dstIP, dstPort, protocol, null, null);
		log.trace("Create new MysqlIncident");
		this.mysqlCommands = mysqlCommands;
	}

	/**
	 * Gets the list of {@code MysqlCommand} which stores the list of MySQL
	 * commands carried out by the attacker in an incident and the corresponding
	 * operation number.
	 *
	 * @return the list of {@code MysqlCommand} which stores the list of MySQL
	 *         commands carried out by the attacker in an incident and the
	 *         corresponding operation number
	 */
	public List<MysqlCommand> getMysqlCommands() {
		log.trace("Get mysqlCommands, returns [{}]", mysqlCommands);
		return mysqlCommands;
	}

	/**
	 * Sets the list of {@code MysqlCommand} which stores the list of MySQL
	 * commands carried out by the attacker in an incident and the corresponding
	 * operation number.
	 *
	 * @param mysqlCommands
	 *            the new list of {@code MysqlCommand} which stores the list of
	 *            MySQL commands carried out by the attacker in an incident and
	 *            the corresponding operation number
	 */
	public void setMysqlCommands(List<MysqlCommand> mysqlCommands) {
		log.trace("Set mysqlCommands to [{}]", mysqlCommands);
		this.mysqlCommands = mysqlCommands;
	}

}