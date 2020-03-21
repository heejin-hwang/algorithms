import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        StringTokenizer st = new StringTokenizer(dartResult, "S|D|T|*|#");
        int[] score = new int[3];
        for (int i = 0; i < 3; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        List<String> darts = new ArrayList<String>();

        Pattern p = Pattern.compile("\\d+(S|D|T)(\\*|#)?");
        Matcher m = p.matcher(dartResult);
        while (m.find()) {
            darts.add(m.group());
        }



        for (int i = 0; i < score.length; i++) {
            Pattern p2 = Pattern.compile("(S|D|T)");
            Matcher m2 = p2.matcher(darts.get(i));


            while (m2.find()) {

                if (m2.group().equals("S")) {
                    score[i] = score[i];
                } else if (m2.group().equals("D")) {
                    score[i] = score[i] * score[i];
                } else if (m2.group().equals("T")) {
                    score[i] = score[i] * score[i] * score[i];
                }
            }


            if(i == 0) {
                if(darts.get(0).contains("*")) {
                    score[0] = score[0]*2;
                }

            } else {

                if(darts.get(i).contains("*")) {
                    score[i] = score[i]*2;
                    score[i-1] = score[i-1]*2;
                }
            }


            if(darts.get(i).contains("#")) {
                score[i] = score[i]*-1;
            }
        }

        for(int value : score) {
            answer += value;
        }

        return answer;
    }
}