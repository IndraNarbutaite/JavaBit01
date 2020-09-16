package encapsulation.nd2part;

//Nd 2part...
// toString() method ;
class Best_Friend {
    String name;
    int age;
    String college;
    String course;
    String address;
    Best_Friend
            (String name, int age, String college, String course, String address)
    {
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }
    public static void main(String[] args)
    {
        Best_Friend a =
                new Best_Friend("Jonas", 26, "BIT ", "JavaScript", "Kaunas");
        System.out.println(a);
        System.out.println(a.toString());

    }
}
