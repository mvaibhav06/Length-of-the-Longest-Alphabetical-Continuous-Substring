public class LongestAlphabeticSubString {
    public int longestContinuousSubstring(String s) {
        String pat = "abcdefghijklmnopqrstuvwxyz";

        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;

        while(i<s.length() && j<s.length()){
            String temp = s.substring(i,j+1);
            if(pat.contains(temp)){
                j++;
                if(temp.length() > max){
                    max = temp.length();
                }
            }else{
                i++;
                j = i;
            }
        }
        return max;
    }
}
