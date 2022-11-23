/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellorestfulclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import util.HelloJerseyClient;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class HelloRESTfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloJerseyClient obj = new HelloJerseyClient();
        String xml = obj.getXml("Anuwatr");
        //System.out.println(xml);
        String str = (String) JAXB.unmarshal(new StringReader(xml), String.class);
        System.out.println(str);
    }
    
}
