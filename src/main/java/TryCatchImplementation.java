import java.lang.ArithmeticException;

class TryCatch{
    private int val=25;
    public int divideBy(int d) {
        try {
            return val/d;
        }catch(ArithmeticException e) {
            System.out.println("Dividing by 0 is not allowed.");
            return -1;
        }finally {
            System.out.println("Never divide any number with 0");
        }
    }
}

public class TryCatchImplementation{

    public static void main(String[] args){
        TryCatch t = new TryCatch();
        t.divideBy(0);
    }

}