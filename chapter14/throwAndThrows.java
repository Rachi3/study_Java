public class throwAndThrows {
    public static void main(String[] args) {
        throwAndThrows sample=new throwAndThrows();

        sample.throwException(7);
        sample.throwException(13);
    }

    public void throwException(int number){
        try{
            if(number>12)
            {
                throw new Exception("Number is over than 12!");
            }

            System.out.println("Number is "+number);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
