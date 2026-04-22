class Person{//class 
    int age;
    String name;
    double weight;

    Person(String name, int age, double weight){//constructor
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void greet(){//method
        System.out.println("Hello my name is "+name);

    }

    void showAge(){//method
        System.out.println("I am "+age+" years old");
    }
    void birthday(){//method
        System.out.println("Happy birthday "+name+", you are "+age+" years old");
    }
    void confession(){
        System.out.println("I love you so much");
    }
}