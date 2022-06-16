/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda08;

/**
 *
 * @author Aatul Palandurkar
 */
public class CreatingThreadsUsingLambda {

    public static void main(String[] args) {
        //Creating Thread without Lambda 
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        //Creating Thread with Lambda
        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();

    }
}