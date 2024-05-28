import java.util.HashSet;

public class UniqueCharacterInString {
    public boolean uniqueCharacter(String str){
        if(str == null || str.isEmpty()){
            return false;
        }

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!set.add(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Evision";
        UniqueCharacterInString sc = new UniqueCharacterInString();
        boolean isUnique = sc.uniqueCharacter(str);
        System.out.println("Are characters unique? " + isUnique);
    }
}
