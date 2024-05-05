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

    @Override //override가 뭔지 안알려주고 쓰라고만함;;
    public String toString(){
        return name+" "+address+" "+phone+" "+email;
    }

}
