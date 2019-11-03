//package IBAN;
//
//import java.math.BigInteger;
//
//public final class bankAccount {
//    public static void main(String[] args) {
//
//    }
//
//    public static final int IBANNUMBER_MIN_SIZE = 15;
//    public static final int IBANNUMBER_MAX_SIZE = 32;
//    public static final BigInteger IBANNUMBER_MAGIC_NUMBER = new BigInteger("97");
//
//
//    public static boolean BankAccount(String) {
//
//        public String accountNumber = "GB82 WEST 1234 5698 7654 32";
//
//
//        String newAccountNumber = accountNumber.trim();
//
// //       newAccountNumber = newAccountNumber.replace(" ", " ");
//
//        if (newAccountNumber.length() < IBANNUMBER_MIN_SIZE || newAccountNumber.length() > IBANNUMBER_MAX_SIZE) {
//            return false;
//        }
//
//        newAccountNumber = newAccountNumber.substring(4) + newAccountNumber.substring(0, 4);
//
//        StringBuilder numericAccountNumber = new StringBuilder();
//        for (int i = 0; i < newAccountNumber.length(); i++) {
//            numericAccountNumber.append(Character.getNumericValue(newAccountNumber.charAt(i)));
//
//        }
//
//        BigInteger ibanNumber = new BigInteger(numericAccountNumber.toString());
//        return ibanNumber.mod(IBANNUMBER_MAGIC_NUMBER).intValue() == 1;
//
//    }
//}
