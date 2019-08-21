package review.it;

import java.time.temporal.Temporal;
import java.util.Scanner;
import java.util.Stack;

public class trans_binary {
    public static void main(String[] args) {
        System.out.println("请输入需需要转换的十进制数：");
        Scanner input = new Scanner( System.in );
        int n = input.nextInt();
        Stack st =new Stack();
        while(n!=0){
            int temp =n%2;
            st.push( temp );
            n/=2;

        }

        while (!st.empty()){
            System.out.println( st.pop() );
        }


    }
}
