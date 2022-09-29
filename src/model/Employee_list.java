/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author essni
 */
public class Employee_list {
    
    private ArrayList<Employee> emp_list;

    public Employee_list() {
        this.emp_list = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmp_list() {
        return emp_list;
    }

    public void setEmp_list(ArrayList<Employee> emp_list) {
        this.emp_list = emp_list;
    }
    
    public Employee addEmployee(){
        Employee emp=new Employee();
        emp_list.add(emp);
        return emp;
    }

    public void deleteEmployee(Employee emp) {
        emp_list.remove(emp);
    }
    
}
