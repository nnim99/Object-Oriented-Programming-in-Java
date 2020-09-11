
package javaapplication13;

/**
 *
 * @author Nimra
 */
import java.util.Scanner;
class Encryption {
    int integer;
    //int a[]= new int[4];
    int w;
    int x;
    int y;
    int z;
    Encryption(int integer){
        this.integer = integer;
        w = (integer%10);
        integer = integer/10;
        x = (integer%10);
        integer = integer/10 ; 
        y = (integer%10);
        integer = integer/10;
        z = integer;
        w = (w+7)%10;
        x = (x+7)%10;
        y = (y+7)%10;
        z = (z+7)%10;
        //a[0] = x;
        //a[1] = w;
        //a[2] = z;
        //a[3] = y;
    }
    public void getEncrypted(){
        System.out.print(x);
        System.out.print(w);
        System.out.print(z);
        System.out.print(y);
    }    
 
    }
class Decryption {
    int integer;
    int w;
    int x;
    int y;
    int z;
    Decryption(int integer){
        this.integer = integer;
        w = (integer%10);
        integer = integer/10;
        x = (integer%10);
        integer = integer/10 ; 
        y = (integer%10);
        integer = integer/10;
        z = integer;
        {if (w<7)
            w=w+3;
        else
            w=w-7;}
           
        
            {if (x<7)
                x=x+3;
            else
                x=x-7;}
            {if (y<7)
            y=y+3;
        else
            y=y-7;}
            {if (z<7)
            z=z+3;
        else
            z=z-7;}
                    
    }
    public void getDecrypted(){
        System.out.print(x);
        System.out.print(w);
        System.out.print(z);
        System.out.print(y);
    }    
 
    }
public class test{
     public static void main(String[] arg){
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the integer you want to Encrypt: ");
         int integer01 = input.nextInt();
         Encryption e1 = new Encryption(integer01);
         e1.getEncrypted();
         System.out.println(" ");
         System.out.print("Enter the integer you want to Decrypt: ");
         int integer02 = input.nextInt();
         Decryption d1 = new Decryption(integer02);
         d1.getDecrypted();
     }
    
}