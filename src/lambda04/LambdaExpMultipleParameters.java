/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda04;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpMultipleParameters {
    public static void main(String[] args) {
        
        // Method 1
        // Multiple Parameters in Lambda Expression, without data type
        AddMe am = (a,b)->(a+b);
        System.out.println(am.add(10, 20));
        
        // Method 2
        // Multiple Parameters in Lambda Expression, with data type
        AddMe am2 = (int a, int b)->(a+b);
        System.out.println(am2.add(30, 40));
    }
}
