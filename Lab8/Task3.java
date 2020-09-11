/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

interface ProductInterface{
    double computeSalePrice();
    double getRegularPrice();
    void setRegularPrice(double price);
    
}
interface ElectronicInterface{
    String getManufacturer();
}
abstract class Product implements ProductInterface{
    double regularPrice;
    Product(double regularPrice){
        this.regularPrice = regularPrice;
    }
    @Override
    public double getRegularPrice() {
        return regularPrice;
    }

    @Override
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
class Book extends Product{
    String publisher;
    int yearPublished;

    public Book(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    

    @Override
    public double computeSalePrice() {
        return 0.5*getRegularPrice();}

    
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
        
    }
    public int getYearPublished(){
       return yearPublished;
    }
    public void setYearPublished(int yearPublished){
         this.yearPublished = yearPublished;
    }
    
}
abstract class Electronics extends Product implements ElectronicInterface{
    String manufacturer;
    
    public Electronics(double regularPrice, String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
}
class MP3Player extends Electronics{
    private String color;

    public MP3Player(double regularPrice, String manufacturer, String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }

    @Override
    public double computeSalePrice() {
         return 0.9*getRegularPrice();}

    
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
class TV extends Electronics{
    int size;

    public TV(double regularPrice, String manufacturer, int size ) {
        super(regularPrice, manufacturer);
        this.size = size;
    }

    @Override
    public double computeSalePrice() {
        return 0.8*getRegularPrice();}
    
}
public class Main02 {
public static void main(String[] args) {
// Declare and create Product array of size 5
ProductInterface[] pa = new Product[5];
// Create object instances and assign them to the type of Product.
pa[0] = new TV(1000, "Samsung", 30);
pa[1] = new TV(2000, "Sony", 50);
pa[2] = new MP3Player(250, "Apple", "blue");
pa[3] = new Book(34, "Sun press", 1992);
pa[4] = new Book(15, "Korea press", 1986);
// Compute total regular price and total sale price. 
double totalRegularPrice = 0; double totalSalePrice = 0;
for (int i=0; i<pa.length; i++){
// Call a method of the super class to get the regular price. 
totalRegularPrice += pa[i].getRegularPrice();
// Since the sale price is computed differently
// depending on the product type, overriding (implementation) 
// method of the object instance of the sub-class 
// gets invoked. This is runtime polymorphic behavior.
totalSalePrice += pa[i].computeSalePrice();
System.out.println("Item number " + i + ": Type = " + pa[i].getClass().getName() + ", Regular price = " + pa[i].getRegularPrice() + ", Sale price = " + pa[i].computeSalePrice()); }
System.out.println("totalRegularPrice = " + totalRegularPrice); System.out.println("totalSalePrice = " + totalSalePrice); } }