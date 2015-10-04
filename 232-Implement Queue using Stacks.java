class MyQueue {
    Stack<Integer> stackInput = new Stack<>();
    Stack<Integer> stackOutput = new Stack<>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        stackInput.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stackOutput.isEmpty()){
            stackOutput.pop();
        }else{
            while(!stackInput.isEmpty()){
                stackOutput.push(stackInput.pop());
            }
            stackOutput.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if(!stackOutput.isEmpty()){
            return stackOutput.peek();
        }else{
            while(!stackInput.isEmpty()){
                stackOutput.push(stackInput.pop());
            }
            return stackOutput.peek();
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackOutput.empty() && stackInput.empty();
    }
}
