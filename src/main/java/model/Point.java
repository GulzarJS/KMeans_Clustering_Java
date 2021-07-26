/*
 *  Created by Gulzar Safar on 11/29/2020
 */

package model;

public class Point {
    private float[] attributes; // PL SL PW SW
    private int nbAttributes;   // nb of attributes in the data

    public Point(int dim) {
        this.attributes   = new float[dim];
        this.nbAttributes = dim;
    }

    public Point(float[] attributes){
        this.attributes   = attributes;
        this.nbAttributes = attributes.length;
    }

    /**
     * Function to calculate Euclidean distance between this and point p
     */
    public double distanceTo(Point p) {
        double distance = 0;
        if (this.attributes.length != p.attributes.length)
            throw new RuntimeException("distanceTo() : p dimensions does not match (this:"+attributes.length+" p:"+p.attributes.length);

        for (int i = 0; i < this.attributes.length; i++){
            double di = p.attributes[i] - this.attributes[i];
            distance += di*di;
        }

        return Math.sqrt(distance);
    }

    /**
     * Add p to this component-wise
     */
    public void addTo(Point p){
        Point point = new Point(this.nbAttributes);
        float accu  = 0;
        for (int i = 0; i < this.attributes.length; i++){
            accu = this.attributes[i] + p.attributes[i];
            this.attributes[i] = Math.round(accu) ;
//            System.out.print(accu + " ");
        }
    }

    public String toString(){
        String s = "";
        for (float f: this.attributes){
            s += f + " ";
        }
        return s;
    }

    /**
     * Getter and Setter functions
     */
    public int   getDimension() { return this.nbAttributes;}
    public float getAttribute(int index) { return this.attributes[index]; }

    public void setAttribute(int index, float value) { this.attributes[index] = value; }
}
