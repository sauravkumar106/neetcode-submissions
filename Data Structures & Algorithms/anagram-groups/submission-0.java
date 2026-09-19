class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String result = new String(arr);
            if(!map.containsKey(result)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(result,list);
            }else{
                ArrayList<Integer> list = map.get(result);
                list.add(i);
                map.put(result,list);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String,ArrayList<Integer>> entry:map.entrySet()){
            ArrayList<Integer> l = entry.getValue();
            ArrayList<String> l1 = new ArrayList<>();
            for(int i=0;i<l.size();i++){
                l1.add(strs[l.get(i)]);
            }
            list.add(l1);
        }
        return list;
    }
}
