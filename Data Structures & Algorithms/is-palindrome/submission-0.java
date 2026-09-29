class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                str.append(c);
            }else if(c>='0' && c<='9'){
                str.append(c);
            }else if(c>='A' && c<='Z'){
                str.append(Character.toLowerCase(c));
            }
        }
        int l=0;
        int r=str.length()-1;
        while(l<=r){
            if(str.charAt(l++)!=str.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}
