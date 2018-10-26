package com.company;
import java.util.*;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
	String[] name = new String [50];
        name[0]="Dan";
        name[1]= "Val";
        name[2]= "Eden";
        name[3]="Alex";
        name[4]= "Bennett";
        name[5]="Prem";
        name[6]="Bryce";
        name[7]="Sydney";
        name[8]="Bobby";
        name[9]="Emma";
        name[10]="Tanner";
        name[11]="Phillipe";
        name[12]="Winston";
        name[13]="Todd";
        name[14]="Sean";
        name[15]="Jacob";
        name[16]="Bryan";
        name[17]="Grace";
        name[18]="Angelo";
        name[19]="Amanda";
        name[20]="Ruby";
        name[21]="Eve";
        name[22]="Audrey";
        name[23]="Luke";
        name[24]="Amy";
        name[25]="Andy";
        name[26]="Roman";
        name[27]="Sydney";
        name[28]="Ally";
        name[29]="Derek";
        name[30]="Carol";
        name[31]="Buck";
        name[32]="Jayson";
        name[33]="Lyn";
        name[34]="Chris";
        name[35]="Michael";
        name[36]="Lauren";
        name[37]="Sofia";
        name[38]="Lily";
        name[39]="Lucio";
        name[40]="Tommy";
        name[41]="Nina";
        name[42]="Matthew";
        name[43]="Ian";
        name[44]="Sue";
        name[45]="Delaney";
        name[46]="Hailey";
        name[47]="Kathleen";
        name[48]="Don";
        name[49]="Jen";
String nombre = ("blank");
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
        System.out.println("Pick a name above and keep it in your head. I will try to guess the name you are thinking of. Respond to each guess with: closer to a, closer to z, or correct");
        Arrays.sort(name);


        while(!nombre.equalsIgnoreCase("correct")){
            System.out.println("\n" + "Is your name " + name[name.length/2]);
            Scanner kbInput1 = new Scanner(System.in);
            nombre= kbInput1.nextLine();

            if (!nombre.equalsIgnoreCase("closer to a")){
                String min = name[0];
                String max = name[name.length / 2];
                String mid = name[((name.length / 2) / 2) - 1];
                Scanner kbInput2 = new Scanner(System.in);
                System.out.println("Is your name " + mid);
                String first = kbInput2.next();
            }
            else if (nombre.equalsIgnoreCase("closer to z")){
                String min2 = name[((name.length/2)+1)];
                String max2 = name[((name.length/2)+24)];
                String mid2 = name[((name.length/2)+37)];
                Scanner kbInput3 = new Scanner(System.in);
                System.out.println("Is your name ");
            }
            else if (nombre.equalsIgnoreCase("correct")) {
                //do nothing
            }
            else {
                System.out.println("Say: 'closer to a' or 'closer to z");
            }
            }



    }
}
