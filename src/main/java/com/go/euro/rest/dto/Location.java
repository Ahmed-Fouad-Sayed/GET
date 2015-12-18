package com.go.euro.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Ahmed Fouad Sayed
 *
 */
@XmlRootElement
public class Location {

	private Long _id;
	private String key;
	private String name;
	private String fullName;
	private String type;
	private String country;
	private Long location_id;
	private Boolean isEurope;
	private String countryCode;
	private Boolean coreCountry;
	private String distance;
	private String iata_airport_code;
	private GeoPosition geo_position;
	/**
	 * @return the geo_position
	 */
	public GeoPosition getGeo_position() {
		return geo_position;
	}
	/**
	 * @param geo_position the geo_position to set
	 */
	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}
	/**
	 * @return the _id
	 */
	public Long get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(Long _id) {
		this._id = _id;
	}
	/**
	 * @return the location_id
	 */
	public Long getLocation_id() {
		return location_id;
	}
	/**
	 * @param location_id the location_id to set
	 */
	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}
	/**
	 * @return the iata_airport_code
	 */
	public String getIata_airport_code() {
		return iata_airport_code;
	}
	/**
	 * @param iata_airport_code the iata_airport_code to set
	 */
	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the isEurope
	 */
	public Boolean getIsEurope() {
		return isEurope;
	}
	/**
	 * @param isEurope the isEurope to set
	 */
	public void setIsEurope(Boolean isEurope) {
		this.isEurope = isEurope;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the coreCountry
	 */
	public Boolean getCoreCountry() {
		return coreCountry;
	}
	/**
	 * @param coreCountry the coreCountry to set
	 */
	public void setCoreCountry(Boolean coreCountry) {
		this.coreCountry = coreCountry;
	}
	/**
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [id=" + _id + ", key=" + key + ", name=" + name
				+ ", fullName=" + fullName + ", type=" + type + ", country="
				+ country + ", locationId=" + location_id + ", isEurope="
				+ isEurope + ", countryCode=" + countryCode + ", coreCountry="
				+ coreCountry + ", distance=" + distance + ", iataAirportCode="
				+ iata_airport_code + ", geoPosition=" + geo_position + "]";
	}
	
}
