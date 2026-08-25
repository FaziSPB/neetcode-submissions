class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int pop1;
        int pop2;
        for (String str : tokens) { 
            if (str.equals("+") || str.equals("-") 
            || str.equals("*") ||str.equals("/")) {
                pop1 = stack.pop();
                pop2 = stack.pop();
                if (str.equals("+")) stack.push(pop1 + pop2);
                else if (str.equals("*")) stack.push(pop1 * pop2);
                else if (str.equals("-")) stack.push(pop2 - pop1);
                else stack.push(pop2 / pop1); 
            }
            else stack.push(Integer.parseInt(str));
        }
    return stack.pop();
    }
}
