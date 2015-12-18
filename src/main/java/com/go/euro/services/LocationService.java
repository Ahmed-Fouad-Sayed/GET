/**
 * 
 */
package com.go.euro.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author Ahmed Fouad Sayed
 * Holds the logic related to invoking Location service 
 */
public class LocationService {

	private static Logger LOGGER = LogManager.getLogger(LocationService.class);
	private static final String BASE_SERVICE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";
	
	/**
	 * Invokes the Location service using the passed city name
	 * 
	 * @param cityName - the name of city to query about
	 * @return - String containing JSON response
	 * @throws Exception - in case an error occurred
	 */
	public static String invoke(final String cityName) throws Exception{
		try{
			LOGGER.info("Starting to invoke Location service with city name \"{}\"",cityName);
			Client client = Client.create();

			WebResource webResource = client
			   .resource(BASE_SERVICE_URL + cityName);

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);
			String jsonResponse = response.getEntity(String.class);
			LOGGER.info("Ended the invokation sucessfully");
			return jsonResponse;
		}catch(Exception ex){
			LOGGER.error("Error ocurred while calling the Location service :", ex);
			throw new Exception("Error invoking Location service",ex);
		}
	}
	
}
