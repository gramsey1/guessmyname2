package com.company;
import java.util.*;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        String[] name = new String[50];
        name[0] = "Dan";
        name[1] = "Val";
        name[2] = "Eden";
        name[3] = "Alex";
        name[4] = "Bennett";
        name[5] = "Prem";
        name[6] = "Bryce";
        name[7] = "Sydney";
        name[8] = "Bobby";
        name[9] = "Emma";
        name[10] = "Tanner";
        name[11] = "Phillipe";
        name[12] = "Winston";
        name[13] = "Todd";
        name[14] = "Sean";
        name[15] = "Jacob";
        name[16] = "Bryan";
        name[17] = "Grace";
        name[18] = "Angelo";
        name[19] = "Amanda";
        name[20] = "Ruby";
        name[21] = "Eve";
        name[22] = "Audrey";
        name[23] = "Luke";
        name[24] = "Amy";
        name[25] = "Andy";
        name[26] = "Roman";
        name[27] = "Sydney";
        name[28] = "Ally";
        name[29] = "Derek";
        name[30] = "Carol";
        name[31] = "Buck";
        name[32] = "Jayson";
        name[33] = "Lyn";
        name[34] = "Chris";
        name[35] = "Michael";
        name[36] = "Lauren";
        name[37] = "Sofia";
        name[38] = "Lily";
        name[39] = "Lucio";
        name[40] = "Tommy";
        name[41] = "Nina";
        name[42] = "Matthew";
        name[43] = "Ian";
        name[44] = "Sue";
        name[45] = "Delaney";
        name[46] = "Hailey";
        name[47] = "Kathleen";
        name[48] = "Don";
        name[49] = "Jen";
        String nombre = ("blank");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("Pick a name above and keep it in your head. I will try to guess the name you are thinking of. Respond to each guess with: closer to a, closer to z, or correct");
        Arrays.sort(name);
        System.out.println("I will guess a name and you will respond with either 'correct', 'closer to a', or 'closer to z" +
                "\nrespond with yes if you are ready");
        Scanner kb1 = new Scanner(System.in);
        String r = kb1.nextLine();
        int min = 0;
        int max = 49;
        int j = 0;
        while (r.equalsIgnoreCase("yes")) {
            int avg = (min + max) / 2;
            String guess = name[avg];
            System.out.println("\n" + "Is your name " + guess);
            Scanner kbInput1 = new Scanner(System.in);
            nombre = kbInput1.nextLine();

            if (nombre.equalsIgnoreCase("closer to a")) {
                max = avg;
                j++;
            } else if (nombre.equalsIgnoreCase("closer to z")) {
                min = avg;
                j++;
            } else if (nombre.equalsIgnoreCase("correct")) {
                j++;
                System.out.println("YAYAYAYAYAYYA I GOT IT!");
                break;
            }


        }
    }
}
