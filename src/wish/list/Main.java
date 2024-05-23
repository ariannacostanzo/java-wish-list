package wish.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //creo una lista
        ArrayList<String> christmasGifts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        while(play) {

            System.out.println("Inserisci il regalo che vuoi aggiungere alla lista: ");
            String gift = scanner.nextLine();
            christmasGifts.add(gift);
            if (christmasGifts.size() == 1) {
                System.out.println("La tua lista contiene " + christmasGifts.size() + " regalo");
            } else {
                System.out.println("La tua lista contiene " + christmasGifts.size() + " regali");
            }
            System.out.println("****************************");
            System.out.println("Vuoi aggiungere un regalo? s/n");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("s")) {
                continue;
            } else {
                play = false;
            }

        }

        //ordino la lista
        Collections.sort(christmasGifts);
        //ho optato per fori perchè avevo bisogno dell'index
//        System.out.println("Questa è la tua lista di regali: ");
//        for (String gift : christmasGifts) {
//            System.out.println(gift);
//        }

        System.out.print("Questa è la tua lista di regali: ");
        //mostro tutti gli elementi della lista
        for (int i = 0; i < christmasGifts.size(); i++) {
            if (i == christmasGifts.size() - 1) {
                System.out.print((christmasGifts.get(i)) + ".");
            } else {
                System.out.print(christmasGifts.get(i) + ", ");
            }
        }


        scanner.close();
    }
}
