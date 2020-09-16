package com.indra.app.nd2;

public class Functions {
    public static void main(String[] args){
        sideEffect();
        int[] a = {32, 46, 11, 9, 21, 44, 76 ,39 ,66};

        System.out.println("The smallest array value--> " + min(a));
        System.out.println("Maximum array value--> " + max(a));
        System.out.println("The sum of the array--> " + sum(a));
    }
    public static void sideEffect(){
        System.out.println("Side-effect");
        //no return
    }
    public static int min(int[] a) {
        // System.out.println(b.length);
        int min = a[0];
        for (int i =0; i<a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        // System.out.println(min);
        return min;
    }
    public static int max(int[] a) {
        int max = a[0];
        for (int i =0; i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static int sum(int[] a) {
        int sum = 0;
        for (int i =0; i<a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

}



