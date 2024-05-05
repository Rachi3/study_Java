public class interestManager {
    public static void main(String[] args) {

        interestManager iM=new interestManager();
        long amount=1000000;

        // for (int day=1;day<=365;day++)
        // {
        //     System.out.println(day+"일 예금시 예상 수익은 "+iM.calculayeAmount(day, amount));
        // }

        for(int day=0;day<365;day+=10)
        {
            System.out.println(day+"일 예금시 예상 수익은 "+iM.calculayeAmount(day, amount));
        }
    }


    public double getInterestRate(int day){
        if (day>0&&day<=90)
            return 0.5;
        else if(day>90&&day<=180)
            return 1.0;
        else if(day>180&&day<=364)
            return 2.0;
        else if(day>=365)
            return 5.6;

        return -1;//이상한 값 들어오면 -1반환
    }

    public double calculayeAmount(int day,long amount){
        return amount+getInterestRate(day)/100*amount;
    }
}
