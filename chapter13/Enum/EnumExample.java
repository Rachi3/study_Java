package chapter13.Enum;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Enum 상수의 이름 출력
        System.out.println("Name: " + today.name());

        // Enum 상수의 순서 출력 (0부터 시작하는 인덱스)
        System.out.println("Ordinal: " + today.ordinal());

        // Enum 상수의 클래스 타입 출력
        System.out.println("Class: " + today.getClass());

        // Enum 상수 비교
        if (today == Day.MONDAY) {
            System.out.println("Today is Monday");
        }
    }
}
