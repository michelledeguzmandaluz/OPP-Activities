public class inheritance2 {
    public static void main(String[] args) {
       
        student2 student2 = new student2("Michelle Daluz", "Caybunga", 2, "BSIT");

        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Address: " + student2.getAddress());
        System.out.println("Student Year: " + student2.getYear());
        System.out.println("Student Program: " + student2.getProgram());
        System.out.println(student2.toString());
        
    }
}