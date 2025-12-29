class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            int amount = -100;
            if (amount < 0)
                throw new InvalidAmountException("Invalid Amount");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

