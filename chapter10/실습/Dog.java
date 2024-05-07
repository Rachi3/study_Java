
public class Dog extends Animal{
    boolean isNeutering;//중성화 여부

    @Override
    public void move(){
        System.out.println("개가 움직였습니다.");
    }

    @Override
    public void Crying(){
        System.out.println("개가 울부짖었습니다.");
    }

    @Override
    public void Scratching(){
        System.out.println("개가 자기 몸을 긁습니다.");
    }

    @Override 
    public void eatFood(){
        System.out.println("개가 음식을 먹습니다.");
    }
}
