package chapter14;

public class ExceptionPrac {
    public static void main(String srgs[]){
        int []arr=new int[5];

        try{
            System.out.println(arr[5]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(Exception e){
            System.out.println("배열의 범위를 벗어났습니다.");
        }
        finally{
            System.out.println("얘는 무조건 실행해야해");
        }
    }
}
