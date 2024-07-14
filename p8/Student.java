/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8;

/**
 *
 * @author Rievan Hafillah
 */
public class Student extends Person {
    public Student(){
        super();
        //super("Rievan", "Bukittinggi");
        super.name = "Rievan";
        super.address = "Bukittinggi";
        System.out.println("Inside Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}
