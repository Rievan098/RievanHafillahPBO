/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8;

/**
 *
 * @author Rievan Hafillah
 */
public class StudentExample {
    public static void main(String[] args) {
        Person ref;
        Student Hafillah = new Student();
        Hafillah.setName("Hafillah");
        Hafillah.setAddress("Bukittinggi");
        Employee Asep = new Employee();
        Asep.setName("Asep");
        Asep.setAddress("Bukittinggi");
        
        printInformation(Hafillah);
        printInformation(Asep);

    }
    
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Mahasiswa :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
        if(p instanceof Employee){
            System.out.println("Nama Karyawan  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
    }
}
