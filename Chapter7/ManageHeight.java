public class ManageHeight {
    int [][]gradeHeights;//인스턴스 변수로 일단 배열을 만들고 매소드에서 초기화 시켜줘야함.
    public static void main(String[] args) {
        ManageHeight MH=new ManageHeight();

        MH.setData();
        for(int i=1;i<=5;i++){
           MH.printHeights(i);
           MH.printAvg(i);
        }
        }

    public void setData(){
        gradeHeights=new int[][]{{170,180,173,175,177}
        ,{160,165,167,186}
        ,{158,177,187,176}
        ,{173,182,181}
        ,{170,180,165,177,172}};
    
        /*
        for(int []arr:gradeHeights){
              System.out.println(arr.length);
        }// 2차원 배열에서 열의 개수가 원하는대로 나옴
        */
    }

    public void printHeights(int classNO){
        System.out.println("Class No.:"+classNO);
        for(int studentHeight:gradeHeights[classNO-1]){
            System.out.println(studentHeight);
        }
    }

    public void printAvg(int classNO){
        double classAvg=0;
        System.out.println("Class No.:"+classNO);

        for(int studentHeight:gradeHeights[classNO-1]){
            classAvg+=studentHeight;
        }

        classAvg/=(gradeHeights[classNO-1].length);
        System.out.println("Height average:"+classAvg);
    }// 가시성을 위해 자주 사용되는 gradeHeights[classNo-1]은 변수처리하는게 좋아보임
}
// 챕터 7의 실습문제

/* 타 메소드의 변수를 사용불가함 사용하고 싶으면 인스턴스 or 클래스 변수로 만들고 사용하기 */