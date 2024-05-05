public class tempt {
    public static void main(String[] args) {
        castingParent CTP=new castingChild();//child 클래스를 parent 클래스로 형변환 오류x
        //castingChild PTC=new castingParent();//parent를 child로 형변환 -> 오류
        //castingChild PTC=(castingChild)(CTP);//명시적인 형변환시 가능은함

        // 이때 자식은 부모가 가진 매소드와 변수들을 모두 가지고 있기에 가능
        // 그렇다면 override를 한상태여도 가능하냐???

        CTP.printName();
        CTP.printUpcasting();
    }
}
