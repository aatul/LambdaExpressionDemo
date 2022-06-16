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
public class WithoutLambdaExpression {
    public static void main(String[] args) {
        int a=10;
        
        // Without Lambda, implementating MyInterface using Anonymous Inner Class
        MyInterFace m = new MyInterFace() {
            @Override
            public void show() {
                System.out.println("A = "+a);
            }
        };
        
        m.show();
    }
}
