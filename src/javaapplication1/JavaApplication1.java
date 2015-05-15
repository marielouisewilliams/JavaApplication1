/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author williams-m
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public void hello(String name){
        System.out.println("Hello "+name);
    }
    
    public static void main(String[] args) {
        JavaApplication1 testapp = new JavaApplication1();
        testapp.hello("Marielou");
    }
    
}
