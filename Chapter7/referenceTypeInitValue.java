public class referenceTypeInitValue {
    public static void main(String[] args) {
        referenceTypeInitValue []r1=new referenceTypeInitValue[1];

        System.out.println(r1);
        //System.out.println(new referenceTypeInitValue[1]);
        System.out.println(new String[1]);
        //r1[0].refreneceTypes();
    }

    public void refreneceTypes(){
        referenceTypeInitValue [] referenceArray = new referenceTypeInitValue[1];
        String [] stringsArray=new String[1];

        System.out.println("class init Value : "+referenceArray[0]);
        System.out.println("String init Value : "+stringsArray[0]);
    }
}
