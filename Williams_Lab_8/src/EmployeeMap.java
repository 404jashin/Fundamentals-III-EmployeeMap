/**
 *  EmployeeMap.java
 *  Creates a map to be filled with Employee objects.
 *  @author Joshua Williams
 *  4/5/2023
 */

import java.util.TreeMap;
import java.util.SortedMap;

public class EmployeeMap
{
    private SortedMap<String, String> map;

    /**
     * Constructor
     */
    public EmployeeMap()
    {
        map = new TreeMap<String, String>();
    }

    /**
     * Adds an employee to the map.
     * @param emp the employee to add
     */
    public void add(Employee emp)
    {
        map.put(emp.getID(), emp.getName());
    }

    /**
     * Looks up an employee by ID number.
     * @param id the ID number to search with
     * @return the employee that corresponds with the ID number
     */
    public String lookUp(String id)
    {
        return map.get(id);
    }
}
