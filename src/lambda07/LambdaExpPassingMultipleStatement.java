/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda07;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpPassingMultipleStatement {
    public static void main(String[] args) {
        PrintMe p = (str)->{
            String str1 = "Hello ";
            String str2 = str1 + str;
            return str2;
        };
        System.out.println(p.printThis("ABC"));
    }
}
