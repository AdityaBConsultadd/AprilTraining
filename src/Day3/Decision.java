package Day3;

import java.util.Scanner;

public class Decision {
    /**
     * conditional:
     * if ,else ,switch
     *
     * ladder
     * nested
     * */
    public static void main(String[] args) {
        int age=5;
        if(age>=18){
            if(age>60)
                System.out.println("old");
            else
            System.out.println("adult");
        }else if(age<12){
            System.out.println("kid");
        }else if(age<18){
            System.out.println("teen");
        }


//        switch
        Scanner in = new Scanner(System.in);
        String morningDrink=in.next();
        switch (morningDrink){
            case "tea":
                System.out.println("I love "+morningDrink);
                break;
            case "coffee":
                System.out.println("I love "+morningDrink);
                break;
            case "greentea":
                System.out.println("I love "+morningDrink);
                break;
            default:
                System.out.println("I love "+morningDrink);
        }
    }
}
