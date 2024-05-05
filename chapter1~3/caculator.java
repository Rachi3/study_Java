public class caculator {
    public static void main(String[] args) {
        System.out.println("계산기 클래스 시작입니다.!");

        caculator Cal=new caculator();
        int a=10,b=3;

        System.out.println("add = "+Cal.add(a, b));
        System.out.println("subtract = "+Cal.subtract(a, b));
        System.out.println("divide = "+Cal.divide(a, b));
        System.out.println("multiply = "+Cal.multiply(a, b));
    }

    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int divide(int a,int b){
        return a/b;//나눌시 뒤에 소수는 떼고 리턴해줌
    }

    public int multiply(int a,int b){
        return a*b;
    }
}

