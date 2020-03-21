import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        LinkedList <String> list = new LinkedList<String>();
        for(String value : participant) {
            list.add(value);
        }

        for(int i=0; i<completion.length; i++) {
            if(list.contains(completion[i]) == true) {
                list.remove(completion[i]);
            };
        }

        answer = list.getFirst();
        return answer;
    }
}