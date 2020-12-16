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
public class DetikKeJam {
       public static void DetikKeJam(long detik){
    detik %= (60 * 60 * 24);
    int jam = (int) (detik / (60 * 60));
}
}
