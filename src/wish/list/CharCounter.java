package wish.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
        String word = scanner.nextLine();

        // Creo un map di carattere : valore
        Map<Character, Integer> charCountMap = new HashMap<>();


        for (char c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1); //restituisce 0 + 1 se ancora non si è trovata la lettera oppure le sue occorrenze + 1
        }

        //stampo ciò che ho messo nel map
        Set<Character> keys = charCountMap.keySet();
        for (char key : keys) {
           int value = charCountMap.get(key);
            System.out.println(key + ": " + value);
        }

        scanner.close();
    }
}
