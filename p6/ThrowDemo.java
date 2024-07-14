/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6;

/**
 *
 * @author Rievan Hafillah
 */
import p5.MyException;

public class ThrowDemo {
    public static void main(String[] args) {
        String input = "Invalid Input";
        try {
            if(input.equals("Invalid Input")){
                throw new MyException("Input");
            } else {
                System.out.println(input);
            }
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
}