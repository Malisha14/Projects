/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_clas;

/**
 *
 * @author MALISHA JOSEPHIN
 */
public class Bank_Clas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banks icici = new Banks("ICICI ", 7);
        Banks sbi = new Banks("SBI ", 8);
        Banks iob= new Banks("IOB ", 9);
        icici.display();
        sbi.display();
        iob.display();
    }
    
}
