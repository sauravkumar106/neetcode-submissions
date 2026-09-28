class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       for(String str:tokens){
        if(str.charAt(0)=='+'){
            int f=stack.pop();
            int s=stack.pop();
            stack.push(f+s);
        }else if((str.length()==1) && (str.charAt(0)=='-')){
            int f=stack.pop();
            int s=stack.pop();
            stack.push(s-f);
        }else if(str.charAt(0)=='*'){
            int f=stack.pop();
            int s=stack.pop();
            stack.push(f*s);
        }else if(str.charAt(0)=='/'){
            int f=stack.pop();
            int s=stack.pop();
            stack.push(s/f);
        }else{
            int num=Integer.parseInt(str);
            stack.push(num);
        }
       } 
       return stack.peek();
    }
}
