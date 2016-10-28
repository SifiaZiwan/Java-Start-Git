package com.first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//import java.util.StringTokenizer;

public class ReaderWriterCSV {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File csvReader = new File("C:\\RowData(2).csv");
		File csvWriter = new File("C:\\result.csv");
		try {
			BufferedReader readFile = new BufferedReader(new FileReader(
					csvReader));
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(
					csvWriter));
			/* Read value from csv and input to HashMap */
			String line = "";
			String key = "";
			int count = 0;
			Map<String, Integer> map = new HashMap<String, Integer>();
//			Map<String, Integer> map1 = new ListMap<String, Integer>();
			while ((line = readFile.readLine()) != null) {
				String readStr[] = line.split(",");
				key = readStr[0] + "," + readStr[1];
				boolean orgKey = map.containsKey(key);
				if (orgKey) {
					count = map.get(key);
					map.replace(key, ++count);
				} else {
					map.put(key, 1);
				}
			}
			/* Get value from HashMap and write to csv file */
			writeFile.write("IOT" + "\t");
			writeFile.write("IMT" + "\t");
			writeFile.write("COUNT" + "\t");
			writeFile.newLine();
			String getKey = "";
			int value = 0;
			Iterator<String> iter = map.keySet().iterator();
			while (iter.hasNext()) {
				getKey = iter.next();
				value = map.get(getKey);
				writeFile.write(getKey + ",");
				writeFile.write(String.valueOf(value));
				writeFile.newLine();
				System.out.println(getKey + "," + String.valueOf(value));
			}
			readFile.close();
			writeFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
