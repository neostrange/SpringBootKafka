package org.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.util.GeoPoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Information about the origin of the attack, and its geolocation information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Origin {

	/**
	 * The logger for this class.
	 */
	private static Logger log = LoggerFactory.getLogger(Origin.class);

	/** The attacking IP. */
	private String ip;

	/**
	 * The country from where the attack originated.
	 */
	private String country;

	/**
	 * The country code from where the attack originated.
	 */
	private String countryCode;

	/**
	 * The city from where the attack originated.
	 */
	private String city;

	/*
	 * Flag for internal threat. 
	 */
	private boolean internal;

	/** 
	 * The user assigned to host, for internal threat.
	 */
	private String userAssigned;

	/**
	 * The name assigned to host, for internal threat.
	 */
	private String hostname;

	/**
	 *  The MAC address of host, for internal threat. 
	 */
	private String hostMAC;

	/**
	 * The organizational department where host resides, for internal threat.
	 */
	private String department;

	/** 
	 * The branch name where the host is located, for internal threat. 
	 */
	private String branch;
	
	/**
	 *  The organization 
	 */
	private String organization;

	/**
	 * The geolocation information of the IP.
	 */
	private GeoPoint geoPoint;

	/**
	 * Instantiates a new origin.
	 */
	public Origin() {
		super();
	}

	/**
	 * Instantiates new origin.
	 * 
	 * @param country
	 * @param countryCode
	 * @param city
	 * @param geoPoint
	 */
	public Origin(String ip, String country, String countryCode, String city, GeoPoint geoPoint) {

		super();
		log.trace("Create new Origin, country [{}]", country);
		this.ip = ip;
		this.country = country;
		this.countryCode = countryCode;
		this.city = city;
		this.internal = false;
		this.geoPoint = geoPoint;
		this.userAssigned = null;
		this.hostname = null;
		this.hostMAC = null;
		this.department = null;
		this.branch = null;
	}

	/**
	 * For internal host
	 * @param userAssigned
	 * @param hostname
	 * @param hostMAC
	 * @param dept
	 * @param branch
	 */
	public Origin(String ip, String userAssigned, String hostname, String hostMAC, String dept, String branch, String city, String country, String organization, GeoPoint geoPoint) {
		super();
		this.ip = ip;
		this.internal = true;
		this.country = country;
		this.city = city;
		this.organization = organization;
		this.userAssigned = userAssigned;
		this.hostname = hostname;
		this.hostMAC = hostMAC;
		this.department = dept;
		this.branch = branch;
		this.geoPoint = geoPoint;

	}

	public Origin(String ip) {
		super();
		this.ip = ip;
		this.country = null;
		this.countryCode = null;
		this.city = null;
		this.internal = false;
		this.userAssigned = null;
		this.hostname = null;
		this.hostMAC = null;
		this.department = null;
		this.branch = null;
		this.geoPoint = null;
	}

	/**
	 * Instantiates a new origin.
	 *
	 * @param ip
	 *            the ip
	 * @param country
	 *            the country
	 * @param countryCode
	 *            the country code
	 * @param city
	 *            the city
	 * @param internal
	 *            the internal
	 * @param userAssigned
	 *            the user assigned
	 * @param hostname
	 *            the hostname
	 * @param hostMAC
	 *            the host mac
	 * @param department
	 *            the department
	 * @param branch
	 *            the branch
	 * @param geoPoint
	 *            the geo point
	 */
	public Origin(String ip, String country, String countryCode, String city, boolean internal, String userAssigned,
			String hostname, String hostMAC, String department, String branch, GeoPoint geoPoint) {
		super();
		this.ip = ip;
		this.country = country;
		this.countryCode = countryCode;
		this.city = city;
		this.internal = internal;
		this.userAssigned = userAssigned;
		this.hostname = hostname;
		this.hostMAC = hostMAC;
		this.department = department;
		this.branch = branch;
		this.geoPoint = geoPoint;
	}

	/**
	 * Gets the attacking IP.
	 *
	 * @return the attacking IP
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Sets the attacking IP.
	 *
	 * @param ip
	 *            the new attacking IP
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * Gets the country from where the attack originated.
	 *
	 * @return the country from where the attack originated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country from where the attack originated.
	 *
	 * @param country
	 *            the new country from where the attack originated
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the country code from where the attack originated.
	 *
	 * @return the country code from where the attack originated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the country code from where the attack originated.
	 *
	 * @param countryCode
	 *            the new country code from where the attack originated
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Gets the city from where the attack originated.
	 *
	 * @return the city from where the attack originated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city from where the attack originated.
	 *
	 * @param city
	 *            the new city from where the attack originated
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the user assigned to host.
	 *
	 * @return the user assigned to host
	 */
	public String getUserAssigned() {
		return userAssigned;
	}

	/**
	 * Sets the user assigned to host.
	 *
	 * @param userAssigned
	 *            the new user assigned to host
	 */
	public void setUserAssigned(String userAssigned) {
		this.userAssigned = userAssigned;
	}

	/**
	 * Gets the name assigned to host.
	 *
	 * @return the name assigned to host
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * Sets the name assigned to host.
	 *
	 * @param hostname
	 *            the new name assigned to host
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * Gets the MAC address of host.
	 *
	 * @return the MAC address of host
	 */
	public String getHostMAC() {
		return hostMAC;
	}

	/**
	 * Sets the MAC address of host.
	 *
	 * @param hostMAC
	 *            the new MAC address of host
	 */
	public void setHostMAC(String hostMAC) {
		this.hostMAC = hostMAC;
	}

	/**
	 * Gets the organizational department where host resides.
	 *
	 * @return the organizational department where host resides
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the organizational department where host resides.
	 *
	 * @param department
	 *            the new organizational department where host resides
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Gets the branch name where the host is located.
	 *
	 * @return the branch name where the host is located
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * Sets the branch name where the host is located.
	 *
	 * @param branch
	 *            the new branch name where the host is located
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * Checks if is flag for internal threat.
	 *
	 * @return the flag for internal threat
	 */
	public boolean isInternal() {
		return internal;
	}

	/**
	 * Sets the flag for internal threat.
	 *
	 * @param internal
	 *            the new flag for internal threat
	 */
	public void setInternal(boolean internal) {
		this.internal = internal;
	}

	/**
	 * Gets the geolocation information regarding the source IP.
	 *
	 * @return the geolocation information regarding the source IP
	 */
	public GeoPoint getGeoPoint() {
//		log.trace("Get geoPoint, returns GeoPoint with lat [{}], lon [{}]", geoPoint.lat(), geoPoint.lon());
		return geoPoint;
	}

	/**
	 * Sets the geolocation information regarding the source IP.
	 *
	 * @param geolocation
	 *            the new geolocation information regarding the source IP
	 */
	public void setGeoPoint(GeoPoint geolocation) {
//		log.trace("Set geoPoint to lat [{}], lon [{}]", geolocation.lat(), geolocation.lon());
		this.geoPoint = geolocation;
	}

}
