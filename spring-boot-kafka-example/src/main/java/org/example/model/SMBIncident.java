package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.util.Constants;

/**
 * This class represents the {@link Incident} an incident on SMB service.
 */

public class SMBIncident extends Incident {

	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(SMBIncident.class);

	/**
	 * The smb download.
	 */
	private Download download;

	
	/**
	 * Instantiates a new SMB incident.
	 */
	public SMBIncident() {
		super();
	}


	/**
	 * Instantiates a new {@code SMBIncident}.
	 *
	 * @param dateTime            the date time
	 * @param srcIP            the source IP
	 * @param srcPort            the source port
	 * @param service            the service
	 * @param dstIP            the destination ip
	 * @param dstPort            the destination port
	 * @param protocol            the protocol
	 * @param download            the download
	 */
	public SMBIncident(String dateTime, String srcIP, int srcPort, String service, String dstIP,
			int dstPort, String protocol, Download download) {
		super(dateTime, srcIP, srcPort, service, dstIP, dstPort, protocol, Constants.SMB_PROTOCOL, null);
		log.trace("Create new SMBIncident instance.");
		this.download = download;
	}

	/**
	 * Gets the smb download.
	 *
	 * @return the smb download
	 */
	public Download getDownload() {
		return download;
	}

	/**
	 * Sets the smb download.
	 *
	 * @param download
	 *            the new smb download
	 */
	public void setDownload(Download download) {
		this.download = download;
	}

}