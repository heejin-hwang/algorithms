import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();


        while(arr1.size()<10000) {
            arr1.add(1);
            arr1.add(2);
            arr1.add(3);
            arr1.add(4);
            arr1.add(5);
        }

        while(arr2.size()<10000) {
            arr2.add(2);
            arr2.add(1);
            arr2.add(2);
            arr2.add(3);
            arr2.add(2);
            arr2.add(4);
            arr2.add(2);
            arr2.add(5);
        }

        while(arr3.size()<10000) {
            arr3.add(3);
            arr3.add(3);
            arr3.add(1);
            arr3.add(1);
            arr3.add(2);
            arr3.add(2);
            arr3.add(4);
            arr3.add(4);
            arr3.add(5);
            arr3.add(5);
        }


        int[] result = new int[3];

        int count1 = 0;

        for(int i=0; i<answers.length; i++) {

            if(arr1.get(i) == answers[i]) {
                count1++;
            }
        }
        result[0] = count1;

        int count2 = 0;

        for(int i=0; i<answers.length; i++) {

            if(arr2.get(i) == answers[i]) {
                count2++;
            }
        }
        result[1] = count2;

        int count3 = 0;

        for(int i=0; i<answers.length; i++) {

            if(arr3.get(i) == answers[i]) {
                count3++;
            }
        }
        result[2] = count3;


        int max=0;
        ArrayList<Integer> same = new ArrayList<Integer>();

        for(int i=0; i<3; i++) {
            if(max<result[i]) {
                max = result[i];
            }
        }

        for(int i=0; i<3; i++) {
            if(result[i] == max) {
                same.add(i+1);
            }
        }


        answer = new int[same.size()];
        for(int i=0; i<same.size(); i++) {
            answer[i] = same.get(i);
        }


        return answer;
    }
}