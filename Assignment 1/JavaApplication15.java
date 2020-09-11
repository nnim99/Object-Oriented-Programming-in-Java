
package javaapplication15;

/**
 *
 * @author Nimra
 */
class Prime{
    boolean array[];
    Prime(){
        boolean array[] = new boolean[1000];
        for(int counter = 0; counter<array.length;counter++){
            array[counter] = true;
        }
        for (int counter = 2 ; counter<array.length ;counter++ ){
            for(int counter01 = counter+1; counter01<array.length; counter01++){
                if (counter01%counter != 0 && array[counter01]!=false)
                    array[counter01]=true;
                else
                    array[counter01]=false;
                  
            }    
        }
        System.out.println("The prime numbers are! ");
        for (int counter02 = 2;counter02<array.length;counter02++ ){
            if (array[counter02]==true)
                System.out.println(counter02);
        }
        
    }
}

    
public class JavaApplication15 {

    
    public static void main(String[] args) {
        Prime p1 = new Prime();
       
       
    }
}

