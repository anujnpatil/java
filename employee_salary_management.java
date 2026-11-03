import java.util.Scanner;

class employee{
    String name;
    int employeeID;
    String department;
    double basicSalary;
    double DA, HRA, TA, grossSalary;

    void readEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        employeeID = sc.nextInt();
        System.out.print("Enter Department: ");
        department = sc.next();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
        sc.close();
    }

    void calculateSalary(){
        DA = basicSalary * 0.50;
        HRA = basicSalary * 0.30;
        TA = basicSalary * 0.10;
        grossSalary = basicSalary + DA + HRA + TA;
    }

    void displayEmployee(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("TA: " + TA);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class employee_salary_management {
    public static void main(String[]args){
        employee e1 = new employee();
        e1.readEmployee();
        e1.calculateSalary();
        e1.displayEmployee();
    }    
}
