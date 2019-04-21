public class Tester {
    public static void main(String args[]){
        int[] x = Fibonacci.sequenceBuilder();
        System.out.println("Here is your fibonnacci sequence:  ");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " - ");
        }
        System.out.println();

        int[] y = Tribonacci.sequenceBuilder();
        System.out.println("Here is your tribonacci sequence:   ");
        for(int j = 0; j < y.length; j++){
            System.out.print(y[j] + " - ");
        }
    }
}
