/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Patarakorn
 */
@XmlRootElement
public class Result {
    
        private double area;

    public double getArea() {
        return area;
    }
    @XmlElement
    public void setArea(double area) {
        this.area = area;
    }

    private double circu;

    public double getCircu() {
        return circu;
    }
    @XmlElement
    public void setCircu(double circu) {
        this.circu = circu;
    }

}
