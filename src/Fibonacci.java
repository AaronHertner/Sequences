import java.util.Scanner;

public class Fibonacci {
    public static int[] sequenceBuilder(){
        Scanner x = new Scanner(System.in);

        //getting desired sequence length
        System.out.println("Enter the length of the sequence:   ");
        int a = x.nextInt();

        //making the fibonacci array
        int[] seq = new int[a];

        //setting up variables needed to
        //populate array
        int  prev = 0, next = 1, result, n = 2;
        seq[0] = 0;
        seq[1] = 1;

        //populating array
        for (int i = 0; i < a-2; i++) {
            result=prev+next;
            prev=next;
            next=result;
            seq[n] = result;
            n++;
        }

        return seq;
    }
}
