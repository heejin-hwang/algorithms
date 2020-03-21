class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = F(n) % 1234567;

        return answer;
    }

    public static int F(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int[] bottom_up = new int[n + 1];
        bottom_up[0] = 0;
        bottom_up[1] = 1;

        for (int i = 2; i <= n; i++) {
            bottom_up[i] = bottom_up[i - 2]% 1234567 + bottom_up[i - 1]% 1234567;
        }

        return bottom_up[n];

    }
}