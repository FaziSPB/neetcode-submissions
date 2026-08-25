class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        double[] stack = new double[position.length];
        int top = -1;
        double time;
        for (int[] car: cars) {
            time = (double)(target - car[0])/car[1];
            if (top == -1 || time > stack[top]) stack[++top] = time; 
            else continue;
        }
    return top+1;
    }

}
