/******************************************************************************
 INIHERITANCE IN JAVA
*******************************************************************************/
class Animal{
    void sleep(){
        System.out.println("Sleeping");
    }
    void eat(){
        System.out.println("Eating");
    }
    void bark(){
        System.out.println("Barking");
    }
}
class Dog extends Animal{
    String name;
    int age;
    float weight;
    Dog(String name, int age, float weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
}
class Main{
    public static void main(String[]args){
    Dog d=new Dog("Huskey",2,2.2f);
    d.sleep();
    d.eat();
    d.bark();
    System.out.println("Name is: "+d.name);
    System.out.println("Age is: "+d.age + "years old");
    System.out.println("Weight is: "+d.weight + "kgs");
    }
}