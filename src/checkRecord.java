public class checkRecord {
public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }
    public static boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                l = 0;
            } else if (s.charAt(i) == 'L') {
                l++;
            } else {
                l = 0;
            }
            if (a > 1 || l > 2) {
                return false;
            }
        }
        return true;
    }

}
