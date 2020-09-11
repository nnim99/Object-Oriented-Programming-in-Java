/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimra.bese16seecs
 */
abstract class LivingThing {
    private String name;
    LivingThing(String name){
        this.name = name;
    }
    public void breath(){
        System.out.print("Breathing");
    }
    public void eat(){
        System.out.print("Eating");
    }
    public abstract void  walk();
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Human extends LivingThing{

    public Human(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Human "+getName()+" walks");
    }
    
}
class Monkey extends LivingThing{

    public Monkey(String name) {
        super(name);
    }
    @Override
    public void walk() {
        System.out.println("Monkey "+getName()+" also walks");
    }  }
public class Main {
public static void main( String[] args) {
// Create Human object instance
// and assign it to Human type.
Human human1 = new Human( "Will Rodman");
human1.walk();

// Create Human object instance
// and assign it to LivingThing type.
LivingThing livingthing1 = human1;
livingthing1.walk();

// Create a Monkey object instance
// and assign it to LivingThing type.
LivingThing livingthing2 = new Monkey( "Caesar");
livingthing2.walk();

// Display data from human1 and livingthing1.
// Observe that they refer to the same object instance.
System.out.println( "human1.getName() = " + human1.getName());
System.out.println( "livingthing1.getName() = " +
livingthing1.getName());

// Check of object instance that is referred by x and
// y is the same object instance.
boolean b1 = ( human1 == livingthing1);
System.out.println( "Do human1 and livingthing1 point to the same object instance? " + b1);
//LivingThing z = new LivingThing(); this will give an error as the object of abstract class cannot be instantiated.

}
}

