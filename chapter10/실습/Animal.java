
public class Animal {
    int name,legCount,iq;
    String kind;//종
    boolean hasWing,hasLongHair;//날개가 있는지, 장모종인지 단모종인지

   
    public void move(){
        System.out.println("동물이 움직였습니다.");
    }

    public void Crying(){
        System.out.println("동물이 울부짖었습니다.");
    }

    public void Scratching(){
        System.out.println("동물이 자기 몸을 긁습니다.");
    }

    public void eatFood(){
        System.out.println("동물이 음식을 먹습니다.");
    }
}
