import org.w3c.dom.ls.LSOutput;

public class ReverseString1 {
    public String revers(String str){
        String str1="";
        for(int i =str.length()-1;i>=0;i--){
          str1=str1+str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="Vismay";
        ReverseString1 rs=new ReverseString1();
      String result= rs.revers(str);
        System.out.println(result);
    }
}
