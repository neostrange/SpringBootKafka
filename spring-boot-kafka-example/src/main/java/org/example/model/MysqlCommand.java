package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Singleton for storing MySQL commands for {@code MysqlIncident}.
 */
public class MysqlCommand {

	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(MysqlCommand.class);

	/**
	 * The MySQL query executed by the attacker.
	 */
	private String mysqlQuery;
	/**
	 * The op number associated with MySQL query.
	 */
	private String mysqlOp;

	/*
	 * Instantiates a new {@code MysqlCommand}.
	 * 
	 */
	public MysqlCommand() {
		super();
	}

	/**
	 * Instantiates a new {@code MysqlCommand}.
	 *
	 * @param mysqlQuery
	 *            the mysql query
	 * @param mysqlOp
	 *            the mysql op
	 */
	public MysqlCommand(String mysqlQuery, String mysqlOp) {
		log.trace("Create new MysqlCommand instance");
		this.mysqlQuery = mysqlQuery;
		this.mysqlOp = mysqlOp;
	}

	/**
	 * Gets the MySQL query executed by the attacker.
	 *
	 * @return the MySQL query executed by the attacker
	 */
	public String getMysqlQuery() {
		log.trace("Get mysqlQuery, returns [{}]", mysqlQuery);
		return mysqlQuery;
	}

	/**
	 * Sets the MySQL query executed by the attacker.
	 *
	 * @param mysqlQuery
	 *            the new MySQL query executed by the attacker
	 */
	public void setMysqlQuery(String mysqlQuery) {
		log.trace("Set mysqlQuery to [{}]", mysqlQuery);
		this.mysqlQuery = mysqlQuery;
	}

	/**
	 * Gets the op number associated with MySQL query.
	 *
	 * @return the op number associated with MySQL query
	 */
	public String getMysqlOp() {
		log.trace("Get mysqlOp, returns [{}]", mysqlOp);
		return mysqlOp;
	}

	/**
	 * Sets the op number associated with MySQL query.
	 *
	 * @param mysqlOp
	 *            the new op number associated with MySQL query
	 */
	public void setMysqlOp(String mysqlOp) {
		log.trace("Set mysqlOp to [{}]", mysqlOp);
		this.mysqlOp = mysqlOp;
	}

}