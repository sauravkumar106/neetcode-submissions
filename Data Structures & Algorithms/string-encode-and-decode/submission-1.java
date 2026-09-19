class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            String s = strs.get(i);
           ans.append(s.length()).append('#').append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List <String> list = new ArrayList<>();
         StringBuilder ans = new StringBuilder(str);
        //4#lint4#code4#love3#you
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1,j+1+length);
            list.add(word);
            i=j+1+length;
        }
        return list;
    }
}
