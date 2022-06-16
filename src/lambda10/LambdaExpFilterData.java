/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpFilterData {
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<Product>();
        
        // Add products
        list.add(new Product(1,"Windows",15000.00F));
        list.add(new Product(2,"Android",10000.00F));
        list.add(new Product(3,"IPhone",150000.00F));
        
        // Using Lambda to filter data
        Stream<Product> filteredData = list.stream().filter(p->p.price>10000);
        
        // Using Lambda to iterate over collection
        filteredData.forEach(
        product->System.out.println(product.name+":"+product.price));
    }
}
