

public class customExceptionPrac {
    public static void main(String[] args) {
        customExceptionPrac sample=new customExceptionPrac();

        try {
            sample.throwMyException();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    public void throwMyException() throws MyException{
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
