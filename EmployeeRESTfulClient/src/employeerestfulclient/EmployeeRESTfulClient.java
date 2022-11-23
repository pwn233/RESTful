/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerestfulclient;

import Model.Employee;
import Model.Employees;
import java.io.StringReader;
import java.util.List;
import javax.xml.bind.JAXB;
import service.EmployeeClient;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class EmployeeRESTfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeClient empClient = new EmployeeClient();
//         //IN Case Create
//        Employee empNew = new Employee();
//        empNew.setId(4);
//        empNew.setName("Alex");
//        empNew.setSalary(233.33);
//        empClient.create_XML(empNew);
//          //IN Case Create
//        String xmlSearch = empClient.find_XML(String.class, "4");
//        Employee empSearch = (Employee) JAXB.unmarshal(new StringReader(xmlSearch), Employee.class);
//        empSearch.setSalary(1000000.11);
//        empClient.edit_XML(empSearch, "4");
//            //IN Case Remove
//        empClient.remove("4");
        String xml = empClient.findAll_XML(String.class);
        Employees emps =(Employees) JAXB.unmarshal(new StringReader(xml), Employees.class);
        List<Employee> empList = emps.getEmployees();
        for(Employee emp: empList) {
            System.out.println(emp.getId()+" "+emp.getName()+ " "+ emp.getSalary());
        }
        //String xml = empClient.find_XML(String.class, "1");
        //Employee emp = (Employee) JAXB.unmarshal(new StringReader(xml), Employee.class);
        //System.out.println(xml);
        //System.out.println(emp.getName());
    }
    
}
