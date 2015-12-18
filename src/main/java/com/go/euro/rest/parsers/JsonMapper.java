/**
 * 
 */
package com.go.euro.rest.parsers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

/**
 * @author Ahmed Fouad Sayed
 * Contains the logic related to JSON parsing, and mapping to specific object
 */
public class JsonMapper {

	private static Logger LOGGER = LogManager.getLogger(JsonMapper.class);
	
	/**
	 * Converts a JSON string to an object of specific type 
	 * 
	 * @param json - the JSON to be parsed
	 * @param targetClass - The type of the product list
	 * @return a list object of the type of the target class, contains the data represented in JSON
	 * @throws Exception - in case an error occurred
	 */
	public static <T> T[] mapJsonToArray(String json, Class<T[]> targetClass) throws Exception{
		LOGGER.info("Starting to map json response to object(s)");
		try{
			Gson gson = new Gson();
			T[] jsonArray = gson.fromJson(json,targetClass);
			LOGGER.info("Ended mapping json response to object(s) successfully");
			return jsonArray;
		}catch(Exception e){
			LOGGER.error("An error occurred while mapping JSON data : ", e);
			throw new Exception("Error parsing/mapping JSON",e);
		}
	}
	
}
