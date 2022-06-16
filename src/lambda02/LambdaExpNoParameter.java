/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda02;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpNoParameter {
    public static void main(String[] args) {
        
        PrintMe p = ()->{
            return ("There is nothing to print");
        };
        
        System.out.println(p.printThis());
    }    
}
