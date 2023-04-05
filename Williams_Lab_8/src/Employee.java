/**
 *  Employee.java
 *  Creates an Employee object, defined by their name and ID number.
 *  @author Joshua Williams
 *  4/5/2023
 */

public class Employee
{
    String empID = "";      // Employee's ID
    String empName = "";    // Employee's Name

    /**
     * Constructor
     * @param name the employee's name
     * @param id the employee's ID number
     */
    public Employee(String name, String id)
    {
        empName = name;
        empID = id;
    }

    /**
     * Allows the user to retrieve the employee's ID number.
     * @return the employee' ID number
     */     
    public String getID()
    {
        return empID;
    }

    /**
     * Allows the user to retrieve the employee's name.
     * @return the employee's name.
     */
    public String getName()
    {
        return empName;
    }
}
