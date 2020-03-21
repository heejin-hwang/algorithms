class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int num = phone_number.length();
        String change = phone_number.substring(0, num-4);
        String str = phone_number.substring(num-4);


        for(int i = 0; i<change.length(); i++) {
            answer += "*";
        }

        answer = answer+str;
        return answer;
    }
}