import java.lang.ArithmeticException;

class TryCatch{
    final int val = 25;
    public void divideBy(int d) {
        int res = 0;
        try {
            res =  val/d;
        }catch(ArithmeticException e) {
            System.out.println("Dividing by 0 is not allowed.");
        }finally {
            System.out.println("Never divide any number with 0, it is a crime, next time if you do it you will be imprisoned");
            System.out.println(res);
        }
    }
}

public class TryCatchImplementation{

    public static void main(String[] args){
        TryCatch t = new TryCatch();
        t.divideBy(0);
    }

}