class Solution {
    public long[] solution(long x, int n) {
        long[] answer = {};

        if (x >= -10000000 && x <= 10000000 && n > 0) {
            answer = new long[n];
            answer[0] = x;

            for (int i = 1; i < n; i++) {
                answer[i] = (i + 1) * x;
            }
        }

        return answer;
    }
}