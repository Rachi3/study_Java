public class ProfilePrint{
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint p1=new ProfilePrint();
        
        p1.setAge((byte)22);
        p1.setName("김현우");
        p1.setMarried(false);

        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1.isMarried());
    }

    public void setAge(byte paramAge){
        age=paramAge;
    }

    public byte getAge(){
        return age;
    }

    public void setName(String paramName){
        name=paramName;   
    }

    public String getName(){
        return name;
    }

    public void setMarried(boolean paramIsMarried){
        isMarried=paramIsMarried;
    }

    public boolean isMarried(){
        return isMarried;
    }
}