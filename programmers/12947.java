class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String[] num = ("" + x).split("");
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum = sum + Integer.parseInt(num[i]);
        }


        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}