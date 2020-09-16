package data;

public class App {
    public static void main(String[] args) {

        //ND darbas su employee;
                Person person1 = new Person();
                person1.name = "Indra";
                person1.surname = "Narbutaitė";
                person1.age = 28;

                Person person2 = new Person("Viktorija", "Kazlauskaitė");
                person2.setAge(34);

                System.out.println(person1.name + " " + person1.surname + " " + person1.age);
                System.out.println(person2.name + " " + person2.surname + " " + person2.age);
            }
        }
        class Person {
            String name;
            String surname;
            int age;

            public Person(){ }

            public Person(String n, String s){
                this.name = n;
                this.surname = s;
            }

            public int getAge(){
                return this.age;
            }
            public void setAge(int age){
                if(age <= 0 || age > 110){
                    System.out.println("Please provide correct age!");
                } else {
                    this.age = age;
                }
            }
        }


