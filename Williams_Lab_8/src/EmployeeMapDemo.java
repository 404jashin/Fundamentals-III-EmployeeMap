/**
 *  EmployeeMapDemo.java
 *  Creates an EmployeeMap, fills it with Employee objects, and asks the user to search for employee's by ID number.
 *  @author Joshua Williams
 *  4/5/2023
 */

import java.util.Scanner;

public class EmployeeMapDemo 
{
    public static void main(String[] args) throws Exception
    {
        Scanner kbd = new Scanner(System.in);
        EmployeeMap empMap = new EmployeeMap();

        empMap.add(new Employee("Joshua", "207923"));
        empMap.add(new Employee("Connor", "100269"));
        empMap.add(new Employee("Odin", "972108"));
        empMap.add(new Employee("Sosa", "836552"));
        empMap.add(new Employee("Melody", "319679"));

        while(true)
        {
            try
            {
                System.out.print("Enter an employee's ID: ");
                String idChoice = kbd.nextLine();

                String name = empMap.lookUp(idChoice);
                if(name == null)
                {
                    throw new Exception();
                }
                System.out.println("This ID belongs to " + name);
            }
            catch(Exception e)
            {
                System.out.println("Invalid ID. Please try again.");
            }
        }
    }
}
