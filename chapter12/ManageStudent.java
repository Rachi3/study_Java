package chapter12;
import chapter12.Student;

public class ManageStudent {
    public void checkEquals(){
        Student a=new Student("Min","Seoul","010XXXXXXXX","ask@gmail.com");
        Student b=new Student("Min","Seoul","010XXXXXXXX","ask@gmail.com");

        if(a.equals(b)==true) System.out.println("Equal");
        else System.out.println("Not Equal");
    }

    public static void main(String[] args) {
        ManageStudent mStudent=new ManageStudent();

        mStudent.checkEquals();
    }
}
