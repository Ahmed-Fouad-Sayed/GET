/**
 * 
 */
package com.go.euro.csv.builder;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.go.euro.rest.dto.Location;

/**
 * @author Ahmed Fouad Sayed
 * Holds the logic related to writing a CSV document
 *
 */
public class CsvBuilder {
	
	private static final String CSV_SEPARATOR = ",";
	private static final String FILE_NAME="locations.csv";
	private static final String FILE_HEADER = "_id, name, type, latitude, longitude";
	private static Logger LOGGER = LogManager.getLogger(CsvBuilder.class);
			
	/**
	 * Builds a CSV file using the data represented in locations array
	 * @param locations - an array containing the data to be written
	 * @throws Exception - in case an error occurred
	 */
	public static void buildCsvFile(Location[] locations) throws Exception{
		LOGGER.info("Starting to build CSV file");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(FILE_NAME);
			fileWriter.append(FILE_HEADER);
			fileWriter.append("\n");
			for(Location location : locations){
				fileWriter.append(String.valueOf(location.get_id()));
				fileWriter.append(CSV_SEPARATOR);
				fileWriter.append(location.getName());
				fileWriter.append(CSV_SEPARATOR);
				fileWriter.append(location.getType());
				fileWriter.append(CSV_SEPARATOR);
				fileWriter.append(String.valueOf(location.getGeo_position().getLatitude()));
				fileWriter.append(CSV_SEPARATOR);
				fileWriter.append(String.valueOf(location.getGeo_position().getLongitude()));
				fileWriter.append("\n");
			}
			LOGGER.info("Ended building CSV file successfully");
		} catch (Exception e) {
			LOGGER.error("Error occurred while building CSV file : ",e);
		} finally{
			if(fileWriter != null){
				try {
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e) {
					LOGGER.error("Error occurred while flushing/closing file writer : ", e);
					throw new Exception("Error wrting data to CSV",e);
				}
			}
		}
		
		
	}
}
