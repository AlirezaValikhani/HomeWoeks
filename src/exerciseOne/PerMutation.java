package exerciseOne;

import java.util.*;

public class PerMutation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a word : ");
        String input = scanner.nextLine();
        HashMap<String , List<String>> words = new HashMap<>();
        List<String> words3 = new ArrayList<>();
        List<String> words2 = printPermutation(input,"",words3);
        words.put(input,words2);

        for (String s:words2) {
            System.out.print(s);
        }
    }

    public static List<String> printPermutation(String str, String ans, List<String> result){
            if (str.length() == 0) {
                result.add(ans + " ");
            }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                printPermutation(ros, ans + ch, result);
            }
            return result;
    }


}

