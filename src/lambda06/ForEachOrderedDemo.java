package lambda06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AatulPalandurkar
 */
public class ForEachOrderedDemo {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        list.add("Asia");
        list.add("Africa");
        list.add("America");
        list.add("Antarctica");
        list.add("Australia");
        
        // forEach() Method with Lambda
        System.out.println("Using forEach():");
        list.stream()
                .filter(f->f.startsWith("A"))
                .parallel()
                .forEach(str->System.out.println(str));
        System.out.println();
        
        // forEachOrdered() Method with lambda
        System.out.println("Using forEachOrdered():");
        list.stream()
                .filter(f->f.startsWith("A"))
                .parallel()
                .forEachOrdered(str->System.out.println(str));
        System.out.println();
    }
}
