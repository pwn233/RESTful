/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftoc.restfulservice;

import Model.Result;
import java.io.StringReader;
import javax.xml.bind.JAXB;
import util.FtoCJerseyClient;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class FtoCRESTfulService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FtoCJerseyClient client = new FtoCJerseyClient();
        String xml = client.getXml("32");
        //System.out.println(xml);
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println(res.getCelsius());
    }
    
}
