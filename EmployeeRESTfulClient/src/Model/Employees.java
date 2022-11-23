/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@XmlRootElement(name = "employees")
public class Employees {
    List<Employee> employees;
    public List<Employee> getEmployees() {
        return employees;
    }
    
    @XmlElement(name = "employee")
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
