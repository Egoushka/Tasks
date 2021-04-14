import java.util.HashSet;
import java.util.Set;

public class BalancedString {
    public  String start(String string) {
        String answer = "";
        for(int index = 0; index < string.length(); ++index){
            for(int index2 = index+1; index2 < string.length(); ++index2){
                var tmp = string.substring(index,index2+1);
                if(isBalanced(tmp)){
                    if(tmp.length() > answer.length()){
                        answer = tmp;
                    }
                }
            }
        }
        return answer;
    }
    private  boolean isBalanced(String string) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < string.length(); ++i) {
            characterSet.add(string.charAt(i));
        }
        char character;
        for (var item : characterSet) {
            if(Character.isUpperCase(item)){
                character = Character.toLowerCase(item);
            }
            else{
                character = Character.toUpperCase(item);
            }
            if(!characterSet.contains(character)){
                return false;
            }
        }
        return true;
    }
}
