class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty()){
            minstack.push(val);
        }else{ //the top value is already the min of the stack, just compare it with our val
            minstack.push(Math.min(val, minstack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
