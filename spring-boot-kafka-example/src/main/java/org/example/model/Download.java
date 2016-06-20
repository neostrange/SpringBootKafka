package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Download.
 */
public class Download {
	
	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(Download.class);
	
	/**
	 * Download time.
	 */
	private String dateTime;

	/**
	 * The file hash.
	 */
	private String md5Hash;
	
	/**
	 * The url through which malware was loaded.
	 */
	private String url;
	
	/**
	 * The file path for the malware binary.
	 */
	private String filePath;

	/**
	 * Reference to the virustotal scan and its results.
	 */
	private VirusTotalScan vtScan;

	
	/**
	 * Default constructor.
	 */
	public Download() {
		super();
	}

	/**
	 * Instantiates a new download.
	 *
	 * @param md5Hash
	 *            the md5 hash
	 * @param url
	 *            the url
	 * @param filePath
	 *            the file path
	 * @param vtScan
	 *            the vt scan
	 */
	public Download(String md5Hash, String url, String filePath, VirusTotalScan vtScan) {
		super();
		log.trace("New Download instance created, where md5Hash [{}]", md5Hash);
		this.dateTime = null;
		this.md5Hash = md5Hash;
		this.url = url;
		this.filePath = filePath;
		this.vtScan = vtScan;
	}
	

	/**
	 * Instantiates a new download.
	 *
	 * @param time
	 *            the time
	 * @param md5Hash
	 *            the md5 hash
	 * @param url
	 *            the url
	 * @param filePath
	 *            the file path
	 * @param vtScan
	 *            the vt scan
	 */
	public Download(String time, String md5Hash, String url, String filePath, VirusTotalScan vtScan) {
		super();
		log.trace("New Download instance created, where md5Hash [{}]", md5Hash);
		this.dateTime = time;
		this.md5Hash = md5Hash;
		this.url = url;
		this.filePath = filePath;
		this.vtScan = vtScan;
	}

	/**
	 * Gets the file hash.
	 *
	 * @return the file hash
	 */
	public String getMd5Hash() {
		return md5Hash;
	}

	/**
	 * Sets the file hash.
	 *
	 * @param md5Hash
	 *            the new file hash
	 */
	public void setMd5Hash(String md5Hash) {
		this.md5Hash = md5Hash;
	}

	/**
	 * Gets the url through which malware was loaded.
	 *
	 * @return the url through which malware was loaded
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url through which malware was loaded.
	 *
	 * @param url
	 *            the new url through which malware was loaded
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the file path for the malware binary.
	 *
	 * @return the file path for the malware binary
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Sets the file path for the malware binary.
	 *
	 * @param filePath
	 *            the new file path for the malware binary
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * Gets the reference to the virustotal scan and its results.
	 *
	 * @return the reference to the virustotal scan and its results
	 */
	public VirusTotalScan getVtScan() {
		return vtScan;
	}

	/**
	 * Sets the reference to the virustotal scan and its results.
	 *
	 * @param vtScan
	 *            the new reference to the virustotal scan and its results
	 */
	public void setVtScan(VirusTotalScan vtScan) {
		this.vtScan = vtScan;
	}

	/**
	 * Gets the download time.
	 *
	 * @return the download time
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the download time.
	 *
	 * @param time
	 *            the new download time
	 */
	public void setDateTime(String time) {
		this.dateTime = time;
	}

}
