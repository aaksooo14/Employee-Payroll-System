import java.sql.SQLOutput;
import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;

    // Employee is a constructor (parameterized)
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    //getter for accessing name
    public String getName(){
        return name;
    }

    //getter for accessing id
    public int getId(){
        return id;
    }

    //abstract method ::: we never define  abstract method
    public abstract  double calculateSalary();

    @Override
    public String toString(){
        return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}

//Full time Employee Class
class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(String name , int id , double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}


// Part Time Employee Class
class PartTimeEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;

    // Constructor to read value during object initialization
    public PartTimeEmployee(String name , int id ,int hoursWorked ,double hourlyRate){
        super(name,id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem{

    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    //add employee
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    //remove
    public void removeEmployee(int id){
        Employee employeeToRemove = null;

        for(Employee employee : employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    // display employee
    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println("Employee in the company :: "+employee);
        }
    }
}

public class Main {
    public static  void main (String []args){
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee f1 = new FullTimeEmployee("vikas chauhan", 1, 50000.00);
        PartTimeEmployee p1 = new PartTimeEmployee("Rahul", 101, 40 , 100);
        //add employee
        payrollSystem.addEmployee(f1);
        payrollSystem.addEmployee(p1);

        //show detail
        System.out.println("Display Employee in the company");
        payrollSystem.displayEmployee();

        //remove employee
        payrollSystem.removeEmployee(101);

        System.out.println("Display Employee in the company after removal ");
        payrollSystem.displayEmployee();

    }
}

