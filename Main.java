//Coded By Masum Billah 221-15-5571.
//This is the SUPER CLASS.
 class Employee {
    private int employeeID;
    private String name;
    private double salary;
    // using constructor to intialize values
    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }
    // using get Methods to return values 
    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    // toString Method to return the attributes of Employees
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Salary: " + salary;
    }
    //This methode takes employees as array of Objects.
    public static double totalSalary(Employee[] employees) {
        double total = 0;
        //using Enhanced For loop to Calculate total salary.
        for (Employee emp : employees) {
            total += emp.getSalary();
            //calculating only salary using getSalary();
        }
        return total; //returning Total Salary.
    }
}

// This Class holds the information of Professors
 class Professor extends Employee {
    private String subjectOfExpertise;
    // using constructor to initialize values
    public Professor(int employeeID, String name, double salary, String subjectOfExpertise) {
        super(employeeID, name, salary);
        this.subjectOfExpertise = subjectOfExpertise;
    }
    // using get Methods to return values 
    public String getSubjectOfExpertise() {
        return subjectOfExpertise;
    }
    // toString Method to return the attributes of Professor
    //Overriding toString Method of Employee Class
    //and returning the value of Professor
    public String toString() {
        return super.toString() + ", Subject of Expertise: " + subjectOfExpertise;
    } 
}

// // This Class holds the information of Administrator
 class Administrator extends Employee {
    private String department;
    // using constructor to initialize values
    public Administrator(int employeeID, String name, double salary, String department) {
        super(employeeID, name, salary);
        this.department = department;
    }
    // using get Methods to return values 
    public String getDepartment() {
        return department;
    }
    //toString Method to return the attributes of Administrator
    //Overriding toString Method of Employee Class
    //and returning the value of Administrator
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

// SupportStaff.java
 class SupportStaff extends Employee {
    private String jobTitle;
    // using constructor to initialize values
    public SupportStaff(int employeeID, String name, double salary, String jobTitle) {
        super(employeeID, name, salary);
        this.jobTitle = jobTitle;
    }
    // using get Methods to return values 
    public String getJobTitle() {
        return jobTitle;
    }
    //toString Method to return the attributes of SupportStaff
    //Overriding toString Method of Employee Class
    //and returning the value of SupportStaff
    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
    }
}

// This class has the main method
public class Main {
    public static void main(String[] args) {
        //array of the objets (employees)
        Employee[] employees = new Employee[3];
        //employees[0] is the object of Professor
        employees[0] = new Professor(5571, "Masum Billah", 100000, "CSE");
        //employees[1] is the object of Administrator
        employees[1] = new Administrator(5656, "Leo Messi", 100000, "FSIT");
        //employees[2] is the object of SupportStaff
        employees[2] = new SupportStaff(9999, "Cristiano Ronaldo", 100000, "IT Sector");

        // using loop to print the information of the employee
        for (Employee emp : employees) {
            System.out.println(emp.toString());
            //printing the information of that particular employee
        }
        //initializing total salary calculated in employee class
        double totalSalary = Employee.totalSalary(employees);
        //printing the total salary.
        System.out.println("Total Salary: " + totalSalary);
    }
}
