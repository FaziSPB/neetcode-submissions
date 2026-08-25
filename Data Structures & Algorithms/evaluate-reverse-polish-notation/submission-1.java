class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int pop1;
        int pop2;
        for (String str : tokens) { 
            if (str.matches("-?\\d+")) {
                stack.push(Integer.parseInt(str));
            }
            else {
                pop1 = stack.pop();
                pop2 = stack.pop();
                if (str.equals("+")) stack.push(pop1 + pop2);
                else if (str.equals("*")) stack.push(pop1 * pop2);
                else if (str.equals("-")) stack.push(pop2 - pop1);
                else stack.push(pop2 / pop1); 
            }
        }
    return stack.pop();
    }
}
