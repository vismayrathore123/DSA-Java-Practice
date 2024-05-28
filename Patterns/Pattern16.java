public class Pattern16 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++) {
                System.out.print(j);
            }
            System.out.println();

            for(int k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
            if(i<3){
                System.out.println();
            }
        }
    }
}
