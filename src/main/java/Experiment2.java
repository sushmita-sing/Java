import java.lang.ArrayIndexOutOfBoundsException;

class TryCatch2{
    private int arr[] = new int[10];
    public int get(int d) {
        try {
            return arr[12];
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
            return -1;
        }
    }
}

public class Experiment2 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        TryCatch2 t = new TryCatch2();
        t.get(0);
    }
}