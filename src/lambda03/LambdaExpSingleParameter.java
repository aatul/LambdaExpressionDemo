/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda03;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpSingleParameter {
    public static void main(String[] args) {
        
        // Method 1, Using paranthesis or round brackets
        PrintMe p = (str)->{
            return ("Hello "+str);
        };
        System.out.println(p.printThis("ABC"));
        
        // Method 2, Without using paranthesis or round brackets
        PrintMe p2 = str->{
            return ("Hello "+str);
        };
        System.out.println(p2.printThis("XYZ"));
    }    
}
