class CustomException extends Exception{
    public CustomException(String str) {
        super(str);
    }
}

public class Experiment3 {
    public static void main(String[] args) throws CustomException{
        try {
            throw new CustomException("throws custom exception");
        }catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}