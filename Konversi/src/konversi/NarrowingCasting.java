/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

/**
 *
 * @author fadil
 */
public class NarrowingCasting {
    public static void main(String[] args) {
        //double-float-long-int-char-short-byte
        
        double myDouble = 9.78;
        int myByte = (byte) myDouble; //Manual casting: double to int
        
        System.out.println(myDouble); //Output 9.78
        System.out.println(myByte); //Output 9
    }   
}
