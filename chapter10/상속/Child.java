package 상속;

public class Child extends Parent {
    public Child(){
        super("hi");
        System.out.println("Child Constructor");
    }

    @Override
    public void printName(){
        System.out.println("Child printName()");
    }//overriding
}
