package chapter12;

public class Student {
    public String name,address,phone,email;

    public Student(String name){
        this.name=name;
    }

    public Student(String name,String address,String phone,String email){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

    public static void main(String[] args) {
        Student st1=new Student("HW","도제원로 68","010xxxxxxxx","아무거나@gmail.com");
        Student st2=new Student("HW","도제원로 68","010xxxxxxxx","아무거나@gmail.com");

        if(st1.equals(st2))
        {
            System.out.println("st1 = "+st1);
            System.out.println("st2 = "+st2);
        }
    }

    @Override
    public String toString(){
        return name+" "+address+" "+phone+" "+email;
    }

    @Override
    //실제로는 Student 클래스를 받을것이지만 업캐스팅해서 사용
    //override하는 것이기에 매개변수도 Object obj로 사용
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj==null||!(obj instanceof Student)) return false;

        Student student=(Student)obj;

        if(this.email!=student.email) return false;
        if(this.address!=student.address) return false;
        if(this.name!=student.name) return false;
        if(this.phone!=student.phone) return false;

        return true;
    }

}

