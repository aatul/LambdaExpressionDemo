package lambda01;

/**
 *
 * @author AatulPalandurkar
 */
public class GeneralApproach implements MyInterFace{

    @Override
    public void show() {
        System.out.println("I am in Show");
    }
    
    public static void main(String[] args) {
        GeneralApproach l = new GeneralApproach();
        l.show();
    }
}