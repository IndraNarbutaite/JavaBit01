package com.indra.app;

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

//          // done :)<-->



        }
    }
}
