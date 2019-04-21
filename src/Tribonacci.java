import java.util.Scanner;

public class Tribonacci {
    public static int[] sequenceBuilder(){
        //getting sequence length
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the desired sequence length:  ");
        int a = x.nextInt();

        //making the array
        int[] seq = new int[a];

        //variables needed for populating
        //the array
        int first = 0, second = 1, third = 1, result, n = 3;
        seq[0] = 0;
        seq[1] = 1;
        seq[2] = 1;

        //building the sequence
        for(int i = 0; i < a-3; i++){
            result = first + second + third;
            first = second;
            second = third;
            third = result;
            seq[n] = result;
            n++;
        }

        return seq;
    }
}
