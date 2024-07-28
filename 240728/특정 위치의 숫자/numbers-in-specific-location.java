import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] N = new int [10];
        int i = 0;
        while (sc.hasNext()) {
            N[i]= sc.nextInt();
            i++;
            }
        System.out.print(N[2] + N[4] +N[9]); 
    }
}