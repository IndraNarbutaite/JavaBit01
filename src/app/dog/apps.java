package app.dog;


public class apps {
    private static Dog dog1;

    public static void main(String[] args){
        Dog.dog1 = new Dog();
        Dog.name = "Baksas";
        Dog.variety = "German shepherd";


        Dog dog2 = new Dog("Izis", "doberman");



        System.out.println(dog1.name + " " + dog1.variety);
        System.out.println(dog2.name + " " + dog2.variety );
    }
    }
class Dog {
    public static Dog dog1;
    static String name;
    static String variety;


    public Dog() {
    }

    public Dog(String n, String s) {
        this.name = n;
        this.variety = s;
    }
}


