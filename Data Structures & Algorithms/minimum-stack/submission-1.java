class MinStack {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        if (minStack.isEmpty()) minStack.push(val);
        else if (minStack.peek()>= val) minStack.push(val);
        mainStack.push(val);
    }
    
    public void pop() {
        if (minStack.peek().equals(mainStack.peek())) minStack.pop();
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
