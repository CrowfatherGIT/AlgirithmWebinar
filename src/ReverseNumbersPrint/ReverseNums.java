package ReverseNumbersPrint;

public class ReverseNums {
    public static void main(String[] args) {
        Integer number = 10;
        printOutNumber(number);
    }


    private static void printOutNumber(Integer number) {
        if (number != 0) {
            System.out.println(number);
            printOutNumber(number - 1);
        }
    }
}