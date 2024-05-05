public class staticBlock{
    static int data=1;
    int methodData=2;
    
    public static void main(String[] args) {
        staticBlock sB1=new staticBlock();
        staticBlock sB2=new staticBlock();

        sB1.printInstanceCreate();
    }

    static{
        System.out.println("first static block!");
        data=2;//스태틱 블록은 딱한번만 실행 + 클래스 변수만 컨트롤가능
        //methodData=1;//인스턴스 변수 사용불가
    }

    static{
        System.out.println("second static block!");
        data=3;
    }

    public void printInstanceCreate(){
        System.out.println("객체가 만들어졌습니다");
    }


}

