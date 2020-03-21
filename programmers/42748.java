import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        answer = new int[commands.length];

        for(int i=0; i<answer.length; i++) {

            int from = commands[i][0]-1;
            int to = commands[i][1];
            int[] newArr = new int[to];

            newArr = Arrays.copyOfRange(array, from, to);

            Arrays.parallelSort(newArr);

            answer[i] = newArr[commands[i][2]-1];

        }

        return answer;
    }
}