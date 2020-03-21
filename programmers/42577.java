import java.util.ArrayList;

class Solution {
    static ArrayList<String> list = new ArrayList<String>();
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for (int i = 0; i < phone_book.length; i++) {
            list.add(phone_book[i]);
        }

        for (int i = 0; i < phone_book.length; i++) {
            answer = isPrefix(list.get(i));

            if(answer == false) {
                break;
            }
        }


        return answer;
    }

    private static boolean isPrefix(String value) {
        for (int i = 0; i < list.size(); i++) {
            if (value != list.get(i)) {
                if (list.get(i).startsWith(value)) {
                    return false;
                }
            }
        }
        return true;
    }
}