/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecalrestclient;

import util.CircleClient;

/**
 *
 * @author Patarakorn
 */
public class CircleCalRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleClient client = new CircleClient();
        String xml = client.getXml("4");
        System.out.println(xml);
    }
    
}
