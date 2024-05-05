public class arrayInitialize{
    public static void main(String []args){
        arrayInitialize Ai= new arrayInitialize();

        Ai.primitiveTypes();
    }

    public void primitiveTypes(){
        byte []byteArray=new byte[1];
        short []shortArray=new short[1];
        int []intArray=new int[1];
        long []longArray=new long[1];

        char []charArray=new char[1];

        float[]floatArray=new float[1];
        double[]doubleArray=new double[1];

        boolean[]booleanArray=new boolean[1];

        int [][]arr=new int[3][5];

        // System.out.println("byteArray[0] = "+byteArray);
        // System.out.println("shortArray[0] = "+shortArray);
        // System.out.println("intArray[0] = "+intArray);
        // System.out.println("longArray[0] = "+longArray);

        // System.out.println("charArray[0] = "+charArray);

        // System.out.println("floatArray[0] = "+floatArray);
        // System.out.println("doubleArray[0] = "+doubleArray);

        // System.out.println("booleanArray[0] = "+booleanArray);

        // System.out.println("byteArray[0] = "+byteArray[0]);
        // System.out.println("shortArray[0] = "+shortArray[0]);
        // System.out.println("intArray[0] = "+intArray[0]);
        // System.out.println("longArray[0] = "+longArray[0]);

        // System.out.println("charArray[0] = "+charArray[0]);

        // System.out.println("floatArray[0] = "+floatArray[0]);
        // System.out.println("doubleArray[0] = "+doubleArray[0]);

        // System.out.println("booleanArray[0] = "+booleanArray[0]);

        //System.out.println("byteArray length = "+byteArray.length);

        System.out.println("int arr size = "+arr.length);
        
    }
}