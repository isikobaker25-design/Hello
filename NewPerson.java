public class NewPerson {
    public static void main(String[] args) {
        
        Person p1 = new Person("Baker", 21, 63.4);
        Person p2 = new Person("Terry",16,54.7);


        /*System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p2.weight);*/

        p2.greet();//calling mthod 
        p2.showAge();//calling method
        p1.birthday();//calling method
        p2.confession();
        //so you can use methods to callout elements in a constructor once the its instantiated
    }

}
