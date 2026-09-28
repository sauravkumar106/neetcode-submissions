class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack();
        for(String str:operations){
            if(str.charAt(0)=='D'){
                int num=stack.peek();
                stack.push(2*num);
            }else if(str.charAt(0)=='+'){
                int n1=stack.peek();
                int n2=stack.get(stack.size()-2);
                stack.push(n1+n2);
            }else if(str.charAt(0)=='C'){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}