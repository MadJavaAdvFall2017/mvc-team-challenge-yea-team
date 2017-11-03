package java112.project3;

/**
 * @author Yeah!Team
 * class name
 */
 
public class MVCBean {
    
    private String name;
    private String id;
    private String salary;
    
    /**
     * Constructor for the MVCBean object
     */
    public MVCBean() {
        
    }    
    
    /**
     * Returns the value of name.
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the value of name.
     * @param name The value to assign name.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Returns the value of id.
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the value of id.
     * @param id The value to assign id.
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Returns the value of salary.
     */
    public String getSalary() {
        return salary;
    }


    /**
     * Sets the value of salary.
     * @param salary The value to assign salary.
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    
    
    public void display() {
        
        System.out.println(name + " " + id + " " + salary);
        
        
        
    }

    
}