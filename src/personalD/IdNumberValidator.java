package personalD;​

public class IdNumberValidator {
​

    public static void main(String[] args) {

        String id = "12128288882";
        int array[] = {1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int sum = 0;
​
        for (int i = 0; i < 10; i++) {
            sum += array[i] * Integer.parseInt(String.valueOf(id.charAt(i)));
        }
​
        int checksum = (1101 - sum) % 11;
        if (checksum == 10) {
            checksum = 0;
        }
​
        boolean isValid = checksum == Integer.parseInt(String.valueOf(id.charAt(10)));
        System.out.println(isValid);
    }
​
}