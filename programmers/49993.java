import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skillTree : skill_trees) {
            boolean result = soultion2(skill, skillTree);
            if (result == true) {
                answer++;
            }

        }

        return answer;
    }
    private static boolean soultion2(String skill, String skillTree) {

        Set<Character> set = makeSet(skill);
        String resultString = remove(set, skillTree);
        return isPrefix(skill, resultString);
    }

    private static Set<Character> makeSet(String skill) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < skill.length(); i++) {
            set.add(skill.charAt(i));
        }
        return set;
    }

    private static String remove(Set<Character> set, String skillTree) {
        String resultString = skillTree;

        for (int i = 0; i < skillTree.length(); i++) {
            char c = skillTree.charAt(i);

            if (!set.contains(c)) {
                resultString = resultString.replace(c + "", "");
            }

        }

        return resultString;
    }

    private static boolean isPrefix(String resultString, String skill) {
        if (resultString.startsWith(skill)) {
            return true;
        } else {
            return false;
        }
    }
}