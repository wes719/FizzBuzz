public class Reduce {
    public static void main(String[] args) {
        /*
        Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
         */
        int count = 0;
        int start = 100;
        while (start != 0){
            if(start%2 == 0){
                start/=2;
            }

            else{
                start-=1;
            }

            count +=1;

        }
        System.out.println(count);
    }
}
