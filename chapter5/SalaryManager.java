public class SalaryManager {
    public static void main(String []args){
        SalaryManager sM=new SalaryManager();

        int yearly=20000000;
        double monthly=0;

        monthly=sM.getMonthlySalary(yearly);

        System.out.println(monthly);
    }

    public double getMonthlySalary(int yearlySalary){
        double monthlySalary=yearlySalary/12.0;

        double allExpenses=calculateTax(monthlySalary)+calculateNationalPension(monthlySalary)+calculateHealthInsurance(monthlySalary);
        monthlySalary-=allExpenses;

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary){
    
        return monthlySalary*0.125;
    }

    public double calculateNationalPension(double monthlySalary){
        
        return monthlySalary*0.081;
    }

    public double calculateHealthInsurance(double monthlySalary){
        return monthlySalary*0.135;
    }
}
