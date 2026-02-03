import java.util.*;

class Studentmanagmentsystem{


    private static ArrayList<Student> Student = new ArrayList<>();

    static class Student{
        private String id;
        private String name;
        private int age;


        public Student(String id, String name , int age ){
            this.id=id;
            this.name=name;
            this.age=age;
        }
        @Override
        public String toString (){
               return "(1)id:  " +id + "(2)name:  " +name + "(3)age:  " +age;       }

    }





    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ch=0;
        while (ch!=3){
            disme();
            ch=scan.nextInt();
            switch (ch) {
                case 1:
                    add(scan);
                    break;
                case 2:
                    vis();
                    break;
                case 3:
                    System.err.println("Exit");
                    break;
                default:
                    System.err.println("Invalid choice");
                    break;
            }
        }

    
    }


    public static void disme(){
        System.out.println("welcome to student managmentsystem ");
        System.out.println(" 1. Add student  ");
        System.out.println(" 2. View all student ");
        System.out.println(" 3. Exit ");
    }

    private static void add(Scanner scan){
        System.out.println("Enter student id:");
        String id = scan.next();
        System.out.println("Enter Student name:");
        String name = scan.next();
        System.out.println("Enter Student age:");
        int age = scan.nextInt();

        Student s = new Student (id,name,age);
        Student.add(s);System.out.println("succesfully added");
    }
    private static void vis(){
        System.out.println("\nAll Students");
        for(Student a:Student){
            System.out.println(a);
        }
    }
}