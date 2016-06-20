package org.example.model;


import com.example.util.GeoPoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Destination.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {

	/** Sensor name. */
	private String sensorName;

	/** Sensor ip. */
	private String ip;

	/** Sensor country. */
	private String country;

	/** Sensor city. */
	private String city;

	/** Sensor placement. */
	private String placement;

	/** Sensor {@link GeoPoint}. */
	private GeoPoint geoPoint;

	/**
	 * Instantiates a new sensor.
	 */
	public Sensor() {
		super();
	}

	/**
	 * Instantiates a new sensor.
	 *
	 * @param sensorIP
	 *            the sensor ip
	 */
	public Sensor(String sensorIP) {
		super();
		this.sensorName = null;
		this.ip = sensorIP;
		this.country = null;
		this.city = null;
		this.placement = null;
		this.geoPoint = null;
	}

	/**
	 * Instantiates a new sensor.
	 *
	 * @param sensorName
	 *            the sensor name
	 * @param sensorIP
	 *            the sensor ip
	 * @param sensorCountry
	 *            the sensor country
	 * @param sensorCity
	 *            the sensor city
	 * @param sensorPlacement
	 *            the sensor placement
	 * @param geoPoint
	 *            the geo point
	 */
	public Sensor(String sensorName, String sensorIP, String sensorCountry, String sensorCity, String sensorPlacement,
			GeoPoint geoPoint) {
		super();
		this.sensorName = sensorName;
		this.ip = sensorIP;
		this.country = sensorCountry;
		this.city = sensorCity;
		this.placement = sensorPlacement;
		this.geoPoint = geoPoint;
	}

	/**
	 * Gets the sensor Name.
	 *
	 * @return the sensor Name
	 */
	public String getSensorName() {
		return sensorName;
	}

	/**
	 * Sets the sensor Name.
	 *
	 * @param sensorName
	 *            the new sensor Name
	 */
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	/**
	 * Gets the sensor ip.
	 *
	 * @return the sensor ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Sets the sensor ip.
	 *
	 * @param ip
	 *            the new sensor ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * Gets the sensor country.
	 *
	 * @return the sensor country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the sensor country.
	 *
	 * @param country
	 *            the new sensor country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the sensor city.
	 *
	 * @return the sensor city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the sensor city.
	 *
	 * @param city
	 *            the new sensor city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the sensor placement.
	 *
	 * @return the sensor placement
	 */
	public String getPlacement() {
		return placement;
	}

	/**
	 * Sets the sensor placement.
	 *
	 * @param placement
	 *            the new sensor placement
	 */
	public void setPlacement(String placement) {
		this.placement = placement;
	}


	/**
	 * Gets the sensor {@link GeoPoint}.
	 *
	 * @return the sensor {@link GeoPoint}
	 */
	public GeoPoint getGeoPoint() {
		return geoPoint;
	}

	/**
	 * Sets the sensor {@link GeoPoint}.
	 *
	 * @param geoPoint
	 *            the new sensor {@link GeoPoint}
	 */
	public void setGeoPoint(GeoPoint geoPoint) {
		this.geoPoint = geoPoint;
	}

}
