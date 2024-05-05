public class dataType {
    byte b;
    short s;
    int i;
    long li;
    float f;
    double d;
    char c;
    boolean bl;

    public static void main(String[] args)
    {
        int b;
        
        dataType tmp=new dataType();
        tmp.printInstance();
    }

    public void printInstance(){
        System.out.println("byte = "+b);
        System.out.println("short = "+s);
        System.out.println("int = "+i);
        System.out.println("long = "+li);
        System.out.println("float = "+f);
        System.out.println("double = "+d);
        System.out.println("char = "+c);
        System.out.println("boolean = "+bl);
    }
}
