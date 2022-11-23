/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@XmlRootElement
public class Result {

    private double celsius;

    /**
     * Get the value of celsius
     *
     * @return the value of celsius
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * Set the value of celsius
     *
     * @param celsius new value of celsius
     */
    @XmlElement
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
}
