public class SumofTwoIntegers {
    public static int getSum(int a, int b) {
        if(b != 0 && a != 0){
            a = Math.addExact(a,b);
            return a;
        }
        if(b == 0){
            return a;
        } else if (a == 0){
            return b;
        }
        return 0;
    }
}
