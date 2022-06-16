/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaForEachLoop {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        list.add("J2SE");
        list.add("J2EE");
        list.add("J2ME");
        list.add("Struts");
        list.add("Hibernate");
        list.add("Spring");
        
        list.forEach(System.out::println);
    }
}
