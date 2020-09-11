/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

interface RelationInterface{
    boolean isGreater(Object one, Object two);
    boolean isLess(Object three, Object four);
    boolean isEqual(Object five, Object six);
}
class Line implements RelationInterface{
    double x1;
    double x2;
    double y1;
    double y2;

    
    Line(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    double getLength(){
        return Math.pow(((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))),0.5);
        
    }
    @Override
    public boolean isGreater(Object one, Object two) {
        Line line1 = (Line) one;
        Line line2 = (Line) two;
        return line1.getLength()>line2.getLength();
    }

    @Override
    public boolean isLess(Object three, Object four) {
        Line line1 = (Line) three;
        Line line2 = (Line) four;
        return line1.getLength()<line2.getLength();
    }

    @Override
    public boolean isEqual(Object five, Object six) {
        Line line1 = (Line) five;
        Line line2 = (Line) six;
        return line1.getLength()==line2.getLength();
    }
    
}
public class Main01 {
public static void main(String[] args) {
// Create two Line object instances.
Line line1 = new Line(1.0, 2.0, 1.0, 2.0);
Line line2 = new Line(2.0, 3.0, 2.0, 3.0);
boolean b1 = line1.isGreater(line1, line2);
System.out.println("line1 is greater than line2: " + b1);
boolean b2 = line1.isEqual(line1, line2);
System.out.println("line1 is equal with line2: " + b2);
// Note that the line3 is object instance of Line type.
// Because the Line type is also a type of RelationInterface,
// the line3 variable can be declared as RelationInterface type.
// This is a very very important concept you need to understand.
RelationInterface line3 = new Line(1.0, 5.0, 1.0, 5.0);
boolean b3 = line3.isEqual(line1, line3);
System.out.println("line1 is equal with line3: " + b3);
System.out.println("Length of line1 is " + line1.getLength());
System.out.println("Length of line2 is " + line2.getLength());
}
}