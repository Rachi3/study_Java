public class smartphone {
    int bright;
    int power;
    int sound;
    public smartphone(){
    }

    public void powerOn(){
        power=1;
        //내용 생략
    }
    public void powerOff(){
        power=-1;
        //내용 생략
    }
    public void brightUp(){
        //내용 생략
        bright=bright+1;
    }

    public void brightDown(){
        //내용 생략
        bright=bright-1;
    }

    public void soundUp(){
        //내용 생략
        sound=sound+1;
    }

    public void soundDown(){
        sound=sound-1;
        //내용 생략
    }

    public int returnCurrentValue(int Value){
        return Value;
    }// 현재 값 리턴
    public static void main(String[] args) {
        smartphone myPhone=new smartphone();

        // myPhone.bright=0;
        // myPhone.power=-1;
        // myPhone.sound=0;

        myPhone.brightUp();

        System.err.println(myPhone.bright);
    }
}

