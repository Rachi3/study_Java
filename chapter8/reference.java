public class reference {
    
    static String word;
    int num;
    public reference(){}
    public reference(String startWord){
        word=startWord;
    }
    public static void main(String[] args) {
        reference []r=new reference[3];

        printHello();
        for (reference tmp:r){
            System.out.println(tmp.word);
        }

        r[0].word="zzzz 바꼈당";

        for (reference tmp:r){
            System.out.println(tmp.word);
        }// 클래스 변수 변경시 모든 인스턴스의 word 변경됨

        // reference r=new reference("hi im hyun woo");
        // r.printR();
    }// 생성자 실험

    // public void printR(){
    //     System.out.println(word);
    // }

    public static void printHello(){
        //this.word="xx"; 클래스 변수는 건들이지 못함
        System.out.println(word);
    }

    public void setNum(int num){
        //num=num; 이렇게 사용시 어떤 num이 어떤 num인지 알지못함
        this.num=num;// 이와 같이 매개변수의 이름이 같더라도 this를 통해서 구분 가능
    }
}
