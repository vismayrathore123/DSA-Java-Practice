public class Pattern15 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
             //inner loop for number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //inner loops for star
            for(int k=i;k<5;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
