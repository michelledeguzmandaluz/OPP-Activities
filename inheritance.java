public class inheritance {
    public static void main(String[] args) {
       
        student student = new student("Michelle Daluz", "Caybunga", "BSIT", 2);
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        staff staff = new staff("Hazel", "Navotas", "BSU", 25000.0);
        System.out.println("\nStaff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: " + staff.getSalary());
    }
}