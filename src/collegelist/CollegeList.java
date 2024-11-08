package collegelist;
import java.util.Scanner;

public class CollegeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee e = new Employee();
        Faculty f = new Faculty();
        Student s = new Student();

        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String choices = sc.nextLine().trim().toUpperCase();

        String name;
        String contactNumber;

        switch (choices) {
            case "E":
                System.out.println("Type employee's name, contact number, salary, and department.");
                System.out.println("Press Enter after every input.");
                name = sc.nextLine();
                contactNumber = sc.nextLine();
                double salary = sc.nextDouble();
                sc.nextLine(); 
                String department = sc.nextLine();

                e.setName(name);
                e.setContactNum(contactNumber);
                e.setSalary(salary);
                e.setDepartment(department);

                System.out.println("-------------------------------");
                System.out.println("Name: " + e.getName());
                System.out.println("Contact Number: " + e.getContactNum());
                System.out.println("Salary: " + e.getSalary());
                System.out.println("Department: " + e.getDepartment());
                break;

            case "F":
                System.out.println("Type faculty member's name, contact number, salary, department, and status.");
                System.out.println("Press Enter after every input.");
                name = sc.nextLine();
                contactNumber = sc.nextLine();
                salary = sc.nextDouble();
                sc.nextLine();
                department = sc.nextLine();
                System.out.print("Press Y if regular or N if not: ");
                String choice = sc.nextLine().trim().toUpperCase();

                f.setName(name);
                f.setContactNum(contactNumber);
                f.setSalary(salary);
                f.setDepartment(department);

                System.out.println("-------------------------------");
                System.out.println("Name: " + f.getName());
                System.out.println("Contact Number: " + f.getContactNum());
                System.out.println("Salary: " + f.getSalary());
                System.out.println("Department: " + f.getDepartment());
                
                switch (choice) {
                    case "Y":
                        f.isRegular();
                        System.out.println("Status: Regular/Tenured");
                        break;
                    case "N":
                        f.isRegular();
                        System.out.println("Status: Part Time");
                        break;
                    default:
                        System.out.println("Invalid status input.");
            }
                break;

            case "S":
                System.out.println("Type student's name, contact number, program, and year level.");
                System.out.println("Press Enter after every input.");
                name = sc.nextLine();
                contactNumber = sc.nextLine();
                String program = sc.nextLine();
                int yearLevel = sc.nextInt();

                s.setName(name);
                s.setContactNum(contactNumber);
                s.setProgram(program);
                s.setYearLevel(yearLevel);

                System.out.println("-------------------------------");
                System.out.println("Name: " + s.getName());
                System.out.println("Contact Number: " + s.getContactNum());
                System.out.println("Program: " + s.getProgram());
                System.out.println("Year Level: " + s.getYearLevel());
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}