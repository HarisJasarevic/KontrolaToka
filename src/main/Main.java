package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String carMake = "Ford";
//        int doors = 4;
//
//        switch (carMake) {
//            case "Ford": {
//                if (doors == 4) {
//                    System.out.println("Vozilo je sa 4oro vrata");
//                } else if (doors == 3) {
//                    System.out.println("Vozilo je sa 3oje vrata");
//                }
//            }
//            break;
//        }
//    }





//        int x = 523134;
//        int y = 325423;
//
//        if (x % y == 0) {
//            System.out.println("Nema ostatka");
//        }else if (x % y > 1000) {
//            System.out.println("Ostatak veći od hiljadu");
//        }else {
//            System.out.println("Ostatak manji od hiljadu");
//        }

        Scanner scanner = new Scanner(System.in);

        String s = "5";
        String s2 = "6";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s2);
        System.out.println(a + b);

        System.out.println("Unesite prvi broj: ");
        double operand1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Unesite drugi broj: ");
        int operand2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Unesite operator: ");
        String operator = scanner.next();

        if(operator.equals("*")) {
            System.out.println("Rezultat je: " + (operand1*operand2));
        }else if (operator.equals("/")) {
            if (operand2 != 0) {
                System.out.println("Rezultat je: " + (operand1 / operand2));
            }else {
                System.out.println("Dijeljenje sa nulom nije dozvoljeno");
            }
        }else if (operator.equals("+")) {
            System.out.println("Rezultat je: " + (operand1+operand2));
        }else if (operator.equals("-")) {
            System.out.println("Rezultat je: " + (operand1-operand2));
        }else {
            System.out.println("Greška");
        }
    }
}
