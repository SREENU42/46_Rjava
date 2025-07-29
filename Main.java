/******************************************************************************
Multilevel inheritance in java
*******************************************************************************/
class Animal{
 void sleep(){
    System.out.println("Sleeping");
 }  
 void eat(){
    System.out.println("Eating");
 }
 void jump(){
    System.out.println("Jumping");
  }
}
class Dog extends Animal{
    String name;
    int age;
    String color;
    Dog(String name, int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void displayDogInfo(){
        System.out.println("Dog name is "+this.name);
        System.out.println("Dog Age is "+this.age);
        System.out.println("Dog color is "+this.color);
    }
}
class Cat extends Animal{
    String name;
    int age;
    String color;
    Cat(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void displayCatInfo(){
        System.out.println("Cat name is "+this.name);
        System.out.println("Cat Age is "+this.age);
        System.out.println("Cat color is "+this.color);
    }
}
public class Main{
   public static void main(String[] args){
    Dog d=new Dog("Huskey",2,"Golden Brown");
    d.sleep();
    d.eat();
    d.jump();
    d.displayDogInfo();
    Cat c=new Cat("Max", 3,"black");
    c.sleep();
    c.eat();
    c.jump();
    c.displayCatInfo();
   }
}

