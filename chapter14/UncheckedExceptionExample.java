public class UncheckedExceptionExample {
    public static void main(String[] args) {
        // try-catch 블록 없이도 컴파일 오류가 발생하지 않습니다.
        divide(10, 0);
        System.out.println("Program continues..."); // 이 코드는 실행되지 않습니다.
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
