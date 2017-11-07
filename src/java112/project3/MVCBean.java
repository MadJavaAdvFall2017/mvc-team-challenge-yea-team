package java112.project3;
import java.io.*;
import java.util.*;

/**
 * @author Yeah!Team
 * class name
 */
 
public class MVCBean {
    

    private List<String> nameList;
    private List<Integer> idList;   
    private List<Integer> salaryList;
    
    /**
     * Constructor for the MVCBean object
     */
    public MVCBean() {
        
        nameList = new ArrayList<String>();
        idList = new ArrayList<Integer>();
        salaryList = new ArrayList<Integer>();
    }    
    

    
    /**
     * Returns the value of name.
     */
    public List<String> getNameList() {
        return nameList;
    }


    /**
     * Sets the value of name.
     * @param name The value to assign name.
     */
    public void setNameList(List<String> employeeNameList) {
        this.nameList = employeeNameList;
    }    
    

   
    /**
     * Returns the value of id.
     */
    public List<Integer> getIdList() {
        return idList;
    }


    /**
     * Sets the value of id.
     * @param id The value to assign id.
     */
    public void setIdList(List<Integer> employeeIdList) {
        this.idList = employeeIdList;
    }


    /**
     * Returns the value of salary.
     */
    public List<Integer> getSalaryList() {
        return salaryList;
    }


    /**
     * Sets the value of salary.
     * @param salary The value to assign salary.
     */
    public void setSalary(List<Integer> employeeSalaryList) {
        this.salaryList = employeeSalaryList;
    }



    
    public String toString() {
        return "{" + nameList + idList + salaryList + "}";
    }

    
}