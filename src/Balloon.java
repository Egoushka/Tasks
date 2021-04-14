public class Balloon {
    String balloon = "BALLOON";
    public int start(String string) {
        String tmpString = string;
        int count = 0;
        while (true){
            tmpString = removeBalloons(tmpString);
            if(tmpString == null || tmpString.equals("")){
                break;
            }
            ++count;
        }
        return count;
    }
    private String removeBalloons(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        for(int index = 0, index2 ; index <  balloon.length();++index){
            boolean isFind = false;
            int indexToRemove = 0;
            for(index2 =0 ; index2 < stringBuilder.length();++index2){
                if(stringBuilder.charAt(index2) == balloon.charAt(index)){
                    isFind = true;
                    break;
                }
            }
            if(!isFind){
                return null;
            }
            stringBuilder.deleteCharAt(index2);
        }
        return stringBuilder.toString();
    }
}
