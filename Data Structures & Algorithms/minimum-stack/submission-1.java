class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int val) {
        stack1.push(val);
        if(stack2.isEmpty()){
            stack2.add(val);
        }else{
            if(stack2.peek()>=val){
                stack2.add(val);
            }
        }
    }
    
    public void pop() {
        int num=stack1.pop();
        if(stack2.peek()==num){
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
