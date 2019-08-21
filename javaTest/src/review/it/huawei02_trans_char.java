package review.it;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei02_trans_char {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num  = input.nextInt();
        String basic = input.nextLine();

        String[] str = basic.trim().split("\\s+");
        List<String> list=new ArrayList<>();
        for (int i = 0; i <str.length ; i++) {

            list.add( str[i] );
        }
        int count = 0;
        for (int i = 0; i < num - 1; i++) {
            if (str[i].equals("A")) {
                list.remove( "A" );
                list.add( "12" );
                list.add( "34" );
                count++;
            }
            if (str[i].equals("B")) {
                list.remove( "B" );
                list.add( "AB" );
                list.add( "CD" );
                count++;

            }
        }
        int length = num +count;
        System.out.print(length+" ");
        for (int j = 0; j < length-1; j++) {

            System.out.print(list.get( j )+" ");
        }
    }
}
