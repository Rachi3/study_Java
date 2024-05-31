package chapter14;

public class ThrowablePrac {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Exception caught(use getMessage): " + e.getMessage());
            System.out.println("Exception caught(use toString): " + e.toString());
            e.printStackTrace();
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("Custom error message");
    }
}
