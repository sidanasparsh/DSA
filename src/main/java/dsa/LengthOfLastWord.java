package dsa;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int wordLen = 0;
        for (int i=s.length()-1; i>=0; i--){
            if (Character.isLetter(s.charAt(i))) {
                wordLen++;
            }
            else if (wordLen > 0) {
                return wordLen;
            }
        }
        return wordLen;
    }
}
