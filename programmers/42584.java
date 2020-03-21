class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};

        answer = new int[prices.length];
        int i;
        int j;

        for(i=0; i<prices.length; i++) {

            for(j=i+1; j<prices.length; j++) {

                if(prices[i] > prices[j]) {

                    answer[i] =j-i;
                    break;
                }
                answer[i] = j-i;
            }
        }
        return answer;
    }
}