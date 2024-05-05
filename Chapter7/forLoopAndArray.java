public class forLoopAndArray {
    public static void main(String[] args) {
        forLoopAndArray fLAA = new forLoopAndArray();

        fLAA.newFor();
    }

    public void newFor(){
        int []oneDim={1,2,3,4,5,6,7,8,9,10};
        for(int data:oneDim)
            System.out.println(data);
    }
}
