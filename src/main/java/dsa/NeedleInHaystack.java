package dsa;

public class NeedleInHaystack {

    public int strStr(String haystack, String needle) {
        for (int i=0; i<haystack.length(); i++){
            String currentHaystack = haystack.substring(i);
            if (currentHaystack.length() < needle.length())
                break;
            if (isNeedleInHaystack(currentHaystack, needle))
                return i;
        }
        return -1;
    }
    private boolean isNeedleInHaystack(String haystack, String needle) {
        for (int i=0; i<needle.length(); i++) {
            if (haystack.charAt(i)!= needle.charAt(i))
                return false;
        }
        return true;
    }
}
