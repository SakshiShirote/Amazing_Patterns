public class ButterFly {
    public static void  Bt_pattern(int n){
        //1st part
        for(int i=1;i<=n;i++){
            //Stars - 1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars -i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd part
        for(int i=n;i>=1;i--){
            //Stars -1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars -i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Bt_pattern(4);
    }
    
}
