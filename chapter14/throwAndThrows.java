
public class throwAndThrows {
    public static void main(String[] args) {
        throwAndThrows sample=new throwAndThrows();

        //sample.throwException(7);
        //sample.throwException(13);

        try {
            sample.test2();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("test1에서 발생한 예외가 test2 를 거쳐 처리됩니다.");
        }
    }

    public void throwException(int number){
        try{
            if(number>12)
            {
                throw new Exception("Number is over than 12!");
            }//이제 12보다 큰 숫자는 Exception에 포함됩니다.

            System.out.println("Number is "+number);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void test1() throws Exception{
        throw new Exception("예외를 발생시켜 상위 매소드로 넘깁니다.");
    }

    public void test2() throws Exception{
        test1();//test1을 호출하지만 직접 해결할 능력이 없어 더 상위로 넘겨줍니다.
    }
}
