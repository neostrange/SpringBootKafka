package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Network layer packets where snort alert is triggered.
 */
public class NetworkInfo {

	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(NetworkInfo.class);

	/**
	 * The incident datetime.
	 */
	private String dateTime;

	/**
	 * Snort signature triggered.
	 */
	private String signature;

	/**
	 * Snort signature classification.
	 */
	private String signatureClass;

	/**
	 * Network Payload. 
	 */
	private Payload payload;

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
	 * Severity score for the {@code Incident}. 
	 */
	private int severityScore;

	/**
	 * Information regarding the origin of the attack.
	 */
	private String origin;

	/**
	 * Information regarding the destination of the attack.
	 */
	private String destination;

	/**
	 * Instantiates a new network pcap.
	 */
	public NetworkInfo() {
		super();
	}

    /**
	 * Instantiates a new network info.
	 *
	 * @param dateTime
	 *            the date time
	 * @param signature
	 *            the signature
	 * @param signatureClass
	 *            the signature class
	 * @param payload
	 *            the payload
	 * @param severityScore
	 *            the severity score
	 * @param service
	 *            the service
	 * @param protocol
	 *            the protocol
	 * @param origin
	 *            the origin
	 * @param srcPort
	 *            the src port
	 * @param destination
	 *            the destination
	 * @param dstPort
	 *            the dst port
	 */
    public NetworkInfo(String dateTime, String signature, String signatureClass, Payload payload, int severityScore, String service, String protocol, String origin, int srcPort,String destination,int dstPort ) {
        this.dateTime = dateTime;
        this.signature = signature;
        this.signatureClass = signatureClass;
        this.payload = payload;
        this.srcPort = srcPort;
        this.service = service;
        this.dstPort = dstPort;
        this.protocol = protocol;
        this.severityScore = severityScore;
        this.origin = origin;
        this.destination = destination;
    }

    /**
	 * Gets the incident datetime.
	 *
	 * @return the incident datetime
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the incident datetime.
	 *
	 * @param dateTime
	 *            the new incident datetime
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Gets the snort signature for this particular {@code Incident}.
	 *
	 * @return the snort signature for this particular {@code Incident}
	 */
	public String getSignature() {
		log.trace("Get signature, returns [{}]", signature);
		return signature;
	}

	/**
	 * Sets the snort signature for this particular {@code Incident}.
	 *
	 * @param signature
	 *            the new snort signature for this particular {@code Incident}
	 */
	public void setSignature(String signature) {
		log.trace("Set signature to [{}]", signature);
		this.signature = signature;
	}

	/**
	 * Gets the snort signature classification.
	 *
	 * @return the snort signature classification
	 */
	public String getSignatureClass() {
		log.trace("Get signatureClass, returns [{}]", signatureClass);
		return signatureClass;
	}

	/**
	 * Sets the snort signature classification.
	 *
	 * @param signature_class
	 *            the new snort signature classification
	 */
	public void setSignatureClass(String signature_class) {
		log.trace("Set signatureClass to [{}]", signature_class);
		this.signatureClass = signature_class;
	}

	/**
	 * Gets the network payload.
	 *
	 * @return the network payload
	 */
	public Payload getPayload() {
		return payload;
	}

	/**
	 * Sets the network payload.
	 *
	 * @param payload
	 *            the new network payload
	 */
	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	/**
	 * Gets the source port where the attack originated from.
	 *
	 * @return the source port where the attack originated from
	 */
	public int getSrcPort() {
		return srcPort;
	}

	/**
	 * Sets the source port where the attack originated from.
	 *
	 * @param srcPort
	 *            the new source port where the attack originated from
	 */
	public void setSrcPort(int srcPort) {
		this.srcPort = srcPort;
	}

	/**
	 * Gets the type of service.
	 *
	 * @return the type of service
	 */
	public String getService() {
		return service;
	}

	/**
	 * Sets the type of service.
	 *
	 * @param service
	 *            the new type of service
	 */
	public void setService(String service) {
		this.service = service;
	}

	/**
	 * Gets the this is the destination port of the targeted sensor.
	 *
	 * @return the this is the destination port of the targeted sensor
	 */
	public int getDstPort() {
		return dstPort;
	}

	/**
	 * Sets the this is the destination port of the targeted sensor.
	 *
	 * @param dstPort
	 *            the new this is the destination port of the targeted sensor
	 */
	public void setDstPort(int dstPort) {
		this.dstPort = dstPort;
	}

	/**
	 * Gets the transport layer protocol (tcp, udp, etc).
	 *
	 * @return the transport layer protocol (tcp, udp, etc)
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Sets the transport layer protocol (tcp, udp, etc).
	 *
	 * @param protocol
	 *            the new transport layer protocol (tcp, udp, etc)
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
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
	public void setSeverityScore(int severityScore) {
		this.severityScore = severityScore;
	}

    /**
	 * Gets the information regarding the origin of the attack.
	 *
	 * @return the origin ip of the attack
	 */
    public String getOrigin() {
        return origin;
    }

    /**
	 * Sets the information regarding the origin of the attack.
	 *
	 * @param origin
	 *            the origin ip of the attack
	 */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
	 * Gets the information regarding the destination of the attack.
	 *
	 * @return the destination ip of the attack
	 */
    public String getDestination() {
        return destination;
    }

    /**
	 * Sets the information regarding the destination of the attack.
	 *
	 * @param destination
	 *            the destination ip of the attack
	 */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}