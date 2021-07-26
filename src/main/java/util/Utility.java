/*
 *  Created by Gulzar Safar on 11/29/2020
 */

package util;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    /**
    Function to read data from file
     */
    public static ArrayList<ArrayList<String>> importCSV(String filename, String separator) {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null){
                ArrayList<String> dataAsString = new ArrayList<String>(Arrays.asList(line.split(separator)));
                data.add(dataAsString);
            }
            br.close();
        }catch(IOException e) {e.printStackTrace();}
        return data;
    }

    /**
    Function to create new csv file and write all data into it
     */
    public static void exportDataToCSV(String filename, String data) {
        try {
            Writer out = new BufferedWriter(new FileWriter(filename));
            out.write(data);
            out.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    /**
     * Function to read data from csv file and prepare it for
     *
     */
    public static ArrayList<ArrayList<String>> dataForScatterPlot(String filename, String separator) {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null){
                ArrayList<String> dataAsString = new ArrayList<String>(Arrays.asList(line.split(separator)));
                data.add(dataAsString);
            }
            br.close();
        }catch(IOException e) {e.printStackTrace();}



        return data;
    }
}
