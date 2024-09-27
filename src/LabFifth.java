public class LabFifth {
    boolean IsDoubleEven (String number) {
        int sum = 0;
        int multi = 1;
        char[] c_arr = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            int temp = c_arr[i] - '0';
            sum += temp;
            multi *= temp;
        }
        if ((sum % 2 == 0) && (multi % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
