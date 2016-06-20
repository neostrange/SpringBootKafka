package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * This class represents the {@code Incident} that employs the VoIP Session
 * Initiation Protocol.
 */
public class SipIncident extends Incident {

	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(SipIncident.class);

	/**
	 * A unique id for each attacker.
	 */
	private String sipCallId;
	/**
	 * List of SIP methods executed by the attacker.
	 */
	private String sipMethod;
	/**
	 * SIP user agent or tool used by the attacker.
	 */
	private String sipUserAgent;

	/**
	 * Instantiates a new sip incident.
	 */
	public SipIncident() {
		super();
	}

	/**
	 * Instantiates a new {@link SipIncident}.
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
	 * @param appProtocol
	 *            the application layer protocol
	 * @param sipCallId
	 *            the sip call id
	 * @param sipMethod
	 *            the sip method
	 * @param sipUserAgent
	 *            the sip user agent
	 */
	public SipIncident(String dateTime, String srcIP, int srcPort, String service, String dstIP, int dstPort,
			String protocol, String appProtocol, String sipCallId, String sipMethod, String sipUserAgent) {
		super(dateTime, srcIP, srcPort, service, dstIP, dstPort, protocol, appProtocol, sipUserAgent);
		log.trace("Create new SipIncident instance where sipCallId [{}], sipMethod [{}]", sipCallId, sipMethod);
		this.sipCallId = sipCallId;
		this.sipMethod = sipMethod;
	}

	/**
	 * Gets the a unique id for each attacker.
	 *
	 * @return the a unique id for each attacker
	 */
	public String getSipCallId() {
		log.trace("Get sipCallId, returns [{}]", sipCallId);
		return sipCallId;
	}

	/**
	 * Sets the a unique id for each attacker.
	 *
	 * @param sipCallId
	 *            the new a unique id for each attacker
	 */
	public void setSipCallId(String sipCallId) {
		log.trace("Set sipCallId to [{}]", sipCallId);
		this.sipCallId = sipCallId;
	}

	/**
	 * Gets the list of SIP methods executed by the attacker.
	 *
	 * @return the list of SIP methods executed by the attacker
	 */
	public String getSipMethod() {
		log.trace("Get sipMethod, returns [{}]", sipMethod);
		return sipMethod;
	}

	/**
	 * Sets the list of SIP methods executed by the attacker.
	 *
	 * @param sipMethod
	 *            the new list of SIP methods executed by the attacker
	 */
	public void setSipMethod(String sipMethod) {
		log.trace("Set sipMethod to [{}]", sipMethod);
		this.sipMethod = sipMethod;
	}

	/**
	 * Gets the SIP user agent or tool used by the attacker.
	 *
	 * @return the SIP user agent or tool used by the attacker
	 */
	public String getSipUserAgent() {
		log.trace("Get sipUserAgent, returns [{}]", sipUserAgent);
		return sipUserAgent;
	}

	/**
	 * Sets the SIP user agent or tool used by the attacker.
	 *
	 * @param sipUserAgent
	 *            the new SIP user agent or tool used by the attacker
	 */
	public void setSipUserAgent(String sipUserAgent) {
		log.trace("Set sipUserAgent to [{}]", sipUserAgent);
		this.sipUserAgent = sipUserAgent;
	}

}