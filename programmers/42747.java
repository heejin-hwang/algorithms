import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int paper : citations) {
            list.add(paper);

        }

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if(i+1 <= list.get(i)) {
                    answer = i+1;
                    System.out.println(answer);
                }
            }
        }
        return answer;
    }
}