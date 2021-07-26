/*
 *  Created by Gulzar Safar on 11/30/2020
 */

package model;

import util.Utility;

public class Application {

    public static void main(String[] args) {

        KMeans classifier = new KMeans("src/dataset/iris.data", ",", 3, 4);

        System.out.println("*** Initial clusters ***");
        classifier.initClusters();
        classifier.printClusters();



//        classifier.getAllPoints().forEach(point -> System.out.println(point.toString()));


        for(int i = 0; i < 1000; i++) {
            classifier.kMeansStep();
        }
        System.out.println("\n*** Final clusters ***");
        classifier.printClusters();

        Utility.exportDataToCSV("src/dataset/clusters.data", classifier.toString());


    }
}
