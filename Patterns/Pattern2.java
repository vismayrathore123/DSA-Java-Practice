public class Pattern2 {
    public static void main(String[] args) {
        int rows =5;
        for(int i=rows;i>=1;i--){//outer row
           
            for(int j=1;j<=i;j++){//inner column
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    
}
