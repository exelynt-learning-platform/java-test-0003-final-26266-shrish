public class JAVA_TEST_0003 {

    public static void main(String[] args) {
        int rows = 6;

        for (int i=1 ; i<=rows ; i++){

            int start = (i%2 !=0)? 1:0;
            for (int j= 1 ; j<=i ; j++){

                int value = (j%2!=0) ? start : 1-start;

                if(j<i) System.out.print(value +" ");
                else System.out.print(value);
            }
            System.out.println();
        }
    }
}

