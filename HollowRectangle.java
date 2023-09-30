public class HollowRectangle {
    public static void hollow_rect(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 ||j == totCols){
                    //Boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        hollow_rect(5,4);
    }
    
}
