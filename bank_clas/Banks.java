/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_clas;

/**
 *
 * @author MALISHA JOSEPHIN
 */
public class Banks {
    String bank_name;
    float interest;
    Banks(String n, float i)
    {
        bank_name=n;
        interest=i;
    }
    void display()
    {
      System.out.println("Bank name is "+bank_name+" and the Interest is "+interest+"%p.a");   
    }
    
}
