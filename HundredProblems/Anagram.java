package HundredProblems;

import java.util.Arrays;

public class Anagram {
     public boolean angramWords(String str,String str1){
            if(str.length()!=str1.length()){
                return false;
            }
            str1=str1.toLowerCase();
            str=str.toLowerCase();
            char[] c=str.toCharArray();
            char[]c1=str.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);

        return Arrays.equals(c,c1);
    }
    public static void main(String[] args) {
        String str= "race";
        String str1="care";
    Anagram ag=new Anagram();
    boolean areAnagram=ag.angramWords(str,str1);
    if(areAnagram){
        System.out.println(str1+" "+ " "+str + "is anagram");
    }else {
        System.out.println(str+" "+ " "+str1+ " not anagram");
    }

    }
}
