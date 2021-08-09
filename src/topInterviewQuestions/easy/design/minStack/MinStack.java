package topInterviewQuestions.easy.design.minStack;

public class MinStack {
    private Node stackTop;

    public MinStack() {
    }

    public void push(int val) {
        Node pushingNode = new Node(val);
        if (stackTop != null) {
            pushingNode.previous = stackTop;
        }
        if (pushingNode.previous == null)
            pushingNode.currentMinValue = val;
        else pushingNode.currentMinValue = Math.min(val, pushingNode.previous.currentMinValue);
        stackTop = pushingNode;
    }

    public void pop() {
        Node temp = stackTop.previous;
        stackTop.previous = null;
        stackTop = temp;
    }

    public int top() {
        return stackTop.val;
    }

    public int getMin() {
        return stackTop.currentMinValue;
    }

    static class Node {
        int val;
        Node previous;
        int currentMinValue;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-10);
        stack.push(14);
        stack.push(-20);
        stack.pop();
        stack.push(10);
        stack.push(-7);
        System.out.println(stack.getMin());
    }
}
