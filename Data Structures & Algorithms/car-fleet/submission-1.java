class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i])/speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        double[] stack = new double[position.length];
        int top = -1;
        for (double[] car: cars) {
            if (top == -1 || car[1] > stack[top]) stack[++top] = car[1]; 
            else continue;
        }
    return top+1;
    }

}
