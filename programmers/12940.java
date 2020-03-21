class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};

        answer = new int[2];

        int big;
        int small;
        int max = 0;
        int min = 0;


        if(n>m) {
            big = n;
            small = m;
        } else {
            big = m;
            small = n;
        }

        for(int i=1; i <= big; i++) {
            if(big%i==0 && small%i==0) {
                max = i;
            }
        }
        answer[0] = max;

        min = (big/max)*(small/max)*max;
        answer[1] = min;

        return answer;
    }
}