package com.indra.app;

import java.util.Scanner;

public class HelloWord {
    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            // Pasaugio gyventoju skaičius ir ak negali būti int kintamajame,skaičiai per dideli.
            // pvz int worldPopulation = 7585000000;
            // pvz int asmensKodas = 49201011020;

            //int kintamojo max min reikšmės-->
            System.out.println("int Max reikšmė: " + Integer.MAX_VALUE);
            System.out.println("int Min reikšmė: " + Integer.MIN_VALUE);
            //Overflow :-->
            System.out.println("Prie max int pridedant \"1\", gaunama min reikšmė: ");
            System.out.println(Integer.MAX_VALUE + 1);
            //Underflow :-->
            System.out.println("Iš min int atimant \"1\", gaunama max reikšmė: ");
            System.out.println(Integer.MIN_VALUE - 1);
            System.out.println("---------------------------------------");
            //Ak tinka string kintamajam:
            String ak = "49201011020";
            //atspausdinamas gyv.sk. su long-->
            long sum;
            long worldPopulation = 758500000;
            sum = worldPopulation * 10;
            System.out.println("Gyventojų skaičius su long tipu, padauginama iš 10: " + sum);
            System.out.println("---------------------------------------");
            //5 padalinama iš 2 su dalybos operatorium % -->
            System.out.println("Operatoriaus panaudojimas \"%\" dalinant 5 iš 2: " + (5%2));
            // // Dalybos veiksmas 2 / 0 --> nesidalina -->
            // System.out.println(2/0);  Exception in thread "main" java.lang.ArithmeticException: / by zero
            System.out.println("---------------------------------------");
            // x=10 be kintamojo ,tod4l prid4jau kintamaji int -->
            int x = 10;
            int y = 5;
            System.out.println(x == 10 && y<=5); // --> true
            System.out.println(x <= y && y > 5); // --> false
            System.out.println("abc" instanceof String); // --> true
            System.out.println("---------------------------------------");
            //one out -->
            System.out.println("Sveiki, Jonai,\n- Kaip sekasi?");
            System.out.println("---------------------------------------");
            //String -->
            String tekstas = "LoREM ipsum dolor sit amet, consectetur adipiscing elit";
            //string su mažosiom raidem -->
            System.out.println(tekstas.toLowerCase());
            //stringas su didziosiom raidem -->
            System.out.println(tekstas.toUpperCase());
            //sukeiciamos raides "o" su "z" -->
            System.out.println(tekstas.replace('o','z'));
            //Ar string baigiasi zodziu “elit”:
            System.out.println(tekstas.endsWith("elit"));
            // done :)<-->

            // nex homework .... -->
            // condition statements -->

            System.out.println("Enter the age: ");
            Scanner usersInput =new Scanner(System.in); ;
            String age = usersInput.nextLine();

            if (Integer.parseInt(age) >= 18) {
                System.out.println("You can vote.");
            } else {
                System.out.println("You cant vote.");
            }

            System.out.println("--- For different ages.");

            System.out.println("Enter the age: ");
            age = usersInput.nextLine();

            int ageNumber = Integer.parseInt(age);

            if (ageNumber >= 45) {
                System.out.println("You can vote and stand as a candidate.");
            } else if (ageNumber >= 18) {
                System.out.println("You can vote.");
            } else {
                System.out.println("You cant vote.");
            }

            //  Condition statements In the End :)




            //Cycles while for --> 1 part
            //  never running cycles while for
            System.out.println(" Never running");
            boolean condition= true ;
            while(condition = false) {
                System.out.println("And this never running.");
            }
            for (;condition = false;) {
                System.out.println("And this cycle never running.");
            }

            // Endless cycles 2part
            // System.out.println("Endless cycle");
            // while(condition = true) {
            //     System.out.println("And this endless cycle.");
            // }
            // for (;condition = true;) {
            //     System.out.println("And this never-ending cycle works.");
            // }




            // part 3 the cycle ends at the letter q

            usersInput = new Scanner(System.in);
            String inputValue = "";
            while(!inputValue.equals("q")) {
                System.out.println("Enter the text. ('q' the cycle is over): ");
                inputValue = usersInput.nextLine();
            }

            //  part 4 reverse printed cycle
            System.out.println("Cycle  reverse echo");
            inputValue = "";
            while(!inputValue.equals("q")) {
                System.out.println("Enter the text. ('q' the cycle is over): ");
                inputValue = usersInput.nextLine();
                StringBuilder reverseInput = new StringBuilder();
                reverseInput.append(inputValue);
                reverseInput.reverse();
                System.out.println(reverseInput);
            }

            // part 5  cycle literally
            System.out.println("---------");
            System.out.println("Cycle literally");

            inputValue = "";
            char[] charArr;
            while(!inputValue.equals("q")) {
                System.out.println("Enter the text. ('q' the cycle is over): ");
                inputValue = usersInput.nextLine();
                charArr = inputValue.toCharArray();
                for (int i = 0; i < charArr.length; i++) {
                    System.out.println(charArr[i] + " " + (i + 1));
                }
            }

            // Cycles In the End :)
            // homework 2020-09-08 done :)


        }
    }
}
