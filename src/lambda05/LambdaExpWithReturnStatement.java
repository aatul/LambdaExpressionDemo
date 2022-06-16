package lambda05;

/**
 *
 * @author AatulPalandurkar
 */
public class LambdaExpWithReturnStatement {
    public static void main(String[] args) {
        
        // Multiple Parameters in Lambda Expression, without return statement
        AddMe am = (a,b)->(a+b);
        System.out.println(am.add(10, 20));
        
        // Multiple Parameters in Lambda Expression, with return statement
        AddMe am2 = (int a, int b)->{
            return (a+b);
        };
        System.out.println(am2.add(30, 40));
    }
}
