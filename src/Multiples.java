public class Multiples {
    public static void main(String[] args) {
        /*
        print out how many multiples of 3 and 5 are below 1000
         */
        int count = 0;
        for(int i=1; i<1000; i++){
            if(i%3 == 0 || i%5 == 0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
