class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        int num=0;
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        num=queue1.poll();
        while(queue2.size()>0){
            queue1.add(queue2.poll());
        }
        return num;
    }
    
    public int top() {
        int num=0;
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        num=queue1.poll();
        while(queue2.size()>0){
            queue1.add(queue2.poll());
        }
        queue1.add(num);
        return num;
    }
    
    public boolean empty() {
        return queue1.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */