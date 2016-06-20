package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is the main incident class which contains all the common elements found
 * in all its subtypes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Incident {

	/** The logger for this class. */
	private static Logger log = LoggerFactory.getLogger(Incident.class);

	/**
	 * The incident datetime.
	 */
	private String dateTime;

	/**
	 * Source port where the attack originated from.
	 */
	private int srcPort;

	/**
	 * The type of service.
	 */
	private String service;

	/**
	 * This is the destination port of the targeted sensor.
	 */
	private int dstPort;

	/**
	 * The transport layer protocol (tcp, udp, etc).
	 */
	private String protocol;

	/**
	 * For cases where there is a separate application layer protocol, like SIP
	 * for VoIP.
	 */
	private String appLayerProtocol;

	/** Severity score for the {@code Incident}. */
	private double severityScore;

	/** Signature, in case of network-layer incident. */
	private String signature;

	/** Signature class, in case of network-layer incident. */
	private String signatureClass;

	/** Incident category. */
	private String category;

	/**
	 * Information regarding the origin of the attack.
	 */
	private Origin origin;

	/**
	 * Information regarding the destination of the attack.
	 */
	private Sensor destination;


	private String tool;
	/**
	 * Instantiates a new incident.
	 */
	public Incident() {
		super();
	}

	/**
	 * Instantiates a new incident.
	 *
	 * @param dateTime
	 *            the date time
	 * @param srcIP
	 *            the src ip
	 * @param srcPort
	 *            the src port
	 * @param service
	 *            the service
	 * @param dstIP
	 *            the dst ip
	 * @param dstPort
	 *            the dst port
	 * @param protocol
	 *            the protocol
	 * @param appLayerProtocol
	 *            the app layer protocol
	 */
	public Incident(String dateTime, String srcIP, int srcPort, String service, String dstIP, int dstPort,
					String protocol, String appLayerProtocol, String tool) {
		super();
		this.dateTime = dateTime;
		this.srcPort = srcPort;
		this.service = service;
		this.dstPort = dstPort;
		this.protocol = protocol;
		this.appLayerProtocol = appLayerProtocol;
		this.origin = new Origin(srcIP);
		this.destination = new Sensor(dstIP);
		this.setTool(tool);
	}

	/**
	 * Instantiates a new incident.
	 *
	 * @param dateTime
	 *            the date time
	 * @param srcIP
	 *            the src ip
	 * @param srcPort
	 *            the src port
	 * @param service
	 *            the service
	 * @param dstIP
	 *            the dst ip
	 * @param dstPort
	 *            the dst port
	 * @param protocol
	 *            the protocol
	 * @param appLayerProtocol
	 *            the app layer protocol
	 * @param signature
	 *            the signature
	 * @param signatureClass
	 *            the signature class
	 */
	public Incident(String dateTime, String srcIP, int srcPort, String service, String dstIP, int dstPort,
					String protocol, String appLayerProtocol, String signature, String signatureClass) {
		super();
		this.dateTime = dateTime;
		this.srcPort = srcPort;
		this.service = service;
		this.dstPort = dstPort;
		this.protocol = protocol;
		this.appLayerProtocol = appLayerProtocol;
		this.origin = new Origin(srcIP);
		this.destination = new Sensor(dstIP);
		this.signature = signature;
		this.signatureClass = signatureClass;
	}

	/**
	 * Gets the date time.
	 *
	 * @return the date time
	 */
	public String getDateTime() {
		log.trace("Get dateTime, returns [{}]", dateTime);
		return dateTime;
	}

	/**
	 * Sets the date time.
	 *
	 * @param datetime
	 *            the new date time
	 */
	public void setDateTime(String datetime) {
		log.trace("Set dateTime to [{}]", datetime);
		this.dateTime = datetime;
	}

	/**
	 * Gets the src port.
	 *
	 * @return the src port
	 */
	public int getSrcPort() {
		log.trace("Get srcPort, returns [{}]", srcPort);
		return srcPort;
	}

	/**
	 * Sets the src port.
	 *
	 * @param srcPort
	 *            the new source port where the attack originated from
	 * @return the src port
	 */
	public void setSrcPort(int srcPort) {
		log.trace("Set srcPort to [{}]", srcPort);
		this.srcPort = srcPort;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public String getService() {
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service
	 *            the new service
	 */
	public void setService(String service) {
		log.trace("Set Service to [{}]", service);
		this.service = service;
	}

	/**
	 * Gets the dst port.
	 *
	 * @return the dst port
	 */
	public int getDstPort() {
		log.trace("Get dstPort, returns [{}]", dstPort);
		return dstPort;
	}

	/**
	 * Sets the dst port.
	 *
	 * @param dstPort
	 *            the new dst port
	 */
	public void setDstPort(int dstPort) {
		log.trace("Set dstPort to [{}]", dstPort);
		this.dstPort = dstPort;
	}

	/**
	 * Gets the protocol.
	 *
	 * @return the protocol
	 */
	public String getProtocol() {
		log.trace("Get protocol, returns [{}]", protocol);
		return protocol;
	}

	/**
	 * Sets the protocol.
	 *
	 * @param protocol
	 *            the new protocol
	 */
	public void setProtocol(String protocol) {
		log.trace("Set protocol to [{}]", protocol);
		this.protocol = protocol;
	}

	/**
	 * Gets the application layer protocol.
	 *
	 * @return the application layer protocol
	 */
	public String getAppLayerProtocol() {
		return appLayerProtocol;
	}

	/**
	 * Sets the application layer protocol.
	 *
	 * @param appLayerProtocol
	 *            the new application layer protocol
	 */
	public void setAppLayerProtocol(String appLayerProtocol) {
		this.appLayerProtocol = appLayerProtocol;
	}

	/**
	 * Gets the severity score for the {@code Incident}.
	 *
	 * @return the severity score for the {@code Incident}
	 */
	public double getSeverityScore() {
		return severityScore;
	}

	/**
	 * Sets the severity score for the {@code Incident}.
	 *
	 * @param severityScore
	 *            the new severity score for the {@code Incident}
	 */
	public void setSeverityScore(double severityScore) {
		this.severityScore = severityScore;
	}

	/**
	 * Gets the origin.
	 *
	 * @return the origin
	 */
	public Origin getOrigin() {
		log.trace("Get origin, returns [{}]", origin);
		return origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param org
	 *            the new origin
	 */
	public void setOrigin(Origin org) {
		log.trace("Set origin to [{}]", org);
		this.origin = org;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public Sensor getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination
	 *            the new destination
	 */
	public void setDestination(Sensor destination) {
		this.destination = destination;
	}

	/**
	 * Gets the signature, in case of network-layer incident.
	 *
	 * @return the signature, in case of network-layer incident
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * Sets the signature, in case of network-layer incident.
	 *
	 * @param signature
	 *            the new signature, in case of network-layer incident
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * Gets the signature class, in case of network-layer incident.
	 *
	 * @return the signature class, in case of network-layer incident
	 */
	public String getSignatureClass() {
		return signatureClass;
	}

	/**
	 * Sets the signature class, in case of network-layer incident.
	 *
	 * @param signatureClass
	 *            the new signature class, in case of network-layer incident
	 */
	public void setSignatureClass(String signatureClass) {
		this.signatureClass = signatureClass;
	}

	/**
	 * Gets the incident category.
	 *
	 * @return the incident category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the incident category.
	 *
	 * @param category
	 *            the new incident category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}
}