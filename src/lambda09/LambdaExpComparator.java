/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpComparator {
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<Product>();
        
        // Add products
        list.add(new Product(1,"Windows",15000.00F));
        list.add(new Product(2,"Android",10000.00F));
        list.add(new Product(3,"IPhone",150000.00F));
        
        // Sort alphabetically
        // Using Lambda
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        
        // Print sorted list
        for(Product p: list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
