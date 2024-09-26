

class ar{
    static class pair{
        public int min(int[] x){
            int min = x[0];
            for (int i = 1; i < x.length; i++) {
                if (x[i] < min) {
                    min = x[i];
                }
            }
            return min;
        }

        public int max(int[] x){
            int max = x[0];
            for (int i = 1; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];
                }
            }
            return max;
        }
    }
}


public class another {
    public static void main(String[] args) {
        int[] x = {6,2,7,5,9};
        ar.pair z = new ar.pair();
        System.out.println(z.max(x));
        System.out.println(z.min(x));
    }
}
