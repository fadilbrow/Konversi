/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Widening Casting

package konversi;

/**
 *
 * @author fadil
 */
public class WideningCasting {
    
    public static void main(String[] args) {
        //byte-short-char-int-long-float-double
        
        int myByte =9;
        double myDouble = myByte;//Automatic casting: int to double
        
        System.out.println(myByte); //Output 9
        System.out.println(myDouble); //Output 9.0
    }
    
}
