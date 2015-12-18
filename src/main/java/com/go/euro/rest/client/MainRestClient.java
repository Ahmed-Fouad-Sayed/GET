/**
 * 
 */
package com.go.euro.rest.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.go.euro.csv.builder.CsvBuilder;
import com.go.euro.rest.dto.Location;
import com.go.euro.rest.parsers.JsonMapper;
import com.go.euro.services.LocationService;

/**
 * @author Ahmed Fouad Sayed
 *
 */
public class MainRestClient {
	
	private static Logger LOGGER = LogManager.getLogger(MainRestClient.class); 
	
	/**
	 * The main method the program starts from
	 * @param args - An array of arguments sent at program startup,
	 * 				arg[0] - contains the name of the city to search for
	 * 
	 */
	public static void main(String[] args) {
		if(args == null || args.length == 0){
			LOGGER.error("An argument with city name is required");
			return;
		}
		try{
			String jsonResponse = LocationService.invoke(args[0]);
			Location[] locations = JsonMapper.mapJsonToArray(jsonResponse, Location[].class);
			CsvBuilder.buildCsvFile(locations);
		}catch(Exception e){
			LOGGER.error("Program is aborted due to Exception : ", e);
		}
	}
}
