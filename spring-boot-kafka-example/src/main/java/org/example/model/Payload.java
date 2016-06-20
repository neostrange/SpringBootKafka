package org.example.model;
// TODO: Auto-generated Javadoc

/**
 * Network Payload.
 */
public class Payload {

	/**
	 * Raw data, encoded in hex.
	 */
	private String encodedData;

	/**
	 * Decoded data.
	 */
	private String decodedData;

	
	
	/**
	 * Instantiates a new payload.
	 */
	public Payload() {
		super();
	}

	/**
	 * Instantiates a new payload.
	 *
	 * @param encodedData the encoded data
	 * @param decodedData the decoded data
	 */
	public Payload(String encodedData, String decodedData) {
		super();
		this.encodedData = encodedData;
		this.decodedData = decodedData;
	}

	/**
	 * Gets the raw data, encoded in hex.
	 *
	 * @return the raw data, encoded in hex
	 */
	public String getEncodedData() {
		return encodedData;
	}

	/**
	 * Sets the raw data, encoded in hex.
	 *
	 * @param encodedData
	 *            the new raw data, encoded in hex
	 */
	public void setEncodedData(String encodedData) {
		this.encodedData = encodedData;
	}

	/**
	 * Gets the decoded data.
	 *
	 * @return the decoded data
	 */
	public String getDecodedData() {
		return decodedData;
	}

	/**
	 * Sets the decoded data.
	 *
	 * @param decodedData
	 *            the new decoded data
	 */
	public void setDecodedData(String decodedData) {
		this.decodedData = decodedData;
	}

}
