/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda01;

/**
 *
 * @author AatulPalandurkar
 */
public class UsingLambdaExpression {
    public static void main(String[] args) {
        int a=10;
        
        // Using Lambda: ->
        MyInterFace m = () -> {
            System.out.println("A = "+a);
        };
        
        m.show();
    }
}
