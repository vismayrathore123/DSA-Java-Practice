//monday, tuesday
public class Duplicate_ClientInterview {
    public static void  duplicate(String[] strArray) {
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    System.out.println(strArray[i]+" ");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        String[] strArray={"Monday","Tuesday","Wednesday","Thursday","Monday","Tuesday"};
        Duplicate_ClientInterview sc=new Duplicate_ClientInterview();
        sc.duplicate(strArray);
    }
}
