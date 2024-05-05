public class ManageStudent {
    public static void main(String[] args) {
        Student []student=null;

        ManageStudent sample=new ManageStudent();

        student=sample.addStudent();

        sample.printStudents(student);
    }

    public Student[] addStudent(){
        Student[] students=new Student[3];

        students[0]=new Student("Lim");
        students[1]=new Student("Min");
        students[2]=new Student("Sook","Seoul","010xxxxxxxx","asd@godofjava.com");

  
        return students;
    }

    public void printStudents(Student []student){
        // for(Student st:student){
        //     System.out.printf("%s %s %s %s",st.name,st.address,st.phone,st.email);
        // } 위의 방식으로 처리시 null값인 address phone email때문에 문제가 발생함
        
        //System.out.printf("%s %s %s %s",student[2].name,student[2].address,student[2].phone,student[2].email);
        //모든 값이 할당된 student[2]에 경우에는 이런식으로 출력해도 문제가 없음

        for(Student st:student){
            System.out.println(st);
        }
    }
}
