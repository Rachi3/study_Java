public class variable {
    int instanceVariable;//인스턴스 변수
    static int classVariable;//클래스 변수

    public void method(int parameter/*매개변수*/){
        int localVariable;//매소드 안에 존재하면 지역변수
    }

    public static void main(String[] args) {
        boolean a=true,b=true;

        System.out.println(a==b);
    }
}
