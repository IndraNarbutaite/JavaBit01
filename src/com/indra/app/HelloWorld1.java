package com.indra.app;

public class HelloWorld1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Pasaulio gyventojų skaičius bei asmens kodas negali būti int  kintamajam JAVA kalboje.Skaičiai yra per dideli.
        //Kintamjo int min ir max reikšmės -->
        System.out.println("int Min : " + Integer.MIN_VALUE);
        System.out.println("int Max : " + Integer.MAX_VALUE);

        //Overflow (kai reiksme per didele):-->
        System.out.println(Integer.MAX_VALUE + 1);

        //Underflow (kai reiksme per maza):-->
        System.out.println(Integer.MIN_VALUE - 1);


        //Kadangi AK negalim atspausdinti int kintamajam,jam tinkamas butu string:-->
        String ak = "49101012525";

        //antra uzduotis su operatoriais -->
        System.out.println("Operatorius \"%\" dalyba 5 iš 2: " + (5%2));

        // Dalyba iš 2 is nulio;--> deja JAVA'oje dalyba is nulio negalima.

        // x=10 be kintamojo,todel priskyriau int tipui -->
        int x = 10;
        int y = 5;
        System.out.println(x == 10 && y<=5); // true
        System.out.println(x <= y && y > 5); // false
        System.out.println("abc" instanceof String); //true


        //sekantys nd ir 1uzduotis -->
        System.out.println("Sveiki, Jonai,\n- Kaip sekasi?");

        //2uzduotis:
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        //mazosios raides print all-->
        System.out.println(text.toLowerCase());
        //spausdintines raides print all-->
        System.out.println(text.toUpperCase());
        //keiciamos raides o-z  -->
        System.out.println(text.replace('o','z'));
        // ar string baiges zodziu “elit” -->
        System.out.println(text.endsWith("elit"));
    }

}




