class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] car = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car, (a, b) -> Integer.compare(b[0], a[0]));
        double maxtime = 0.0;
        int fleet = 0;
        for (int[] p : car) {
            double t = (double)(target - p[0] )/ p[1];
            if (t > maxtime) {
                fleet++;
                maxtime = t;
            }
        }

        return fleet;
    }
}
