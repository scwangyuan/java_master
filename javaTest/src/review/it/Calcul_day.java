package review.it;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calcul_day {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner( System.in );
        String input = sc.nextLine();
        List<String> list = new ArrayList<> ();
        list.add( input.substring( 0,4 ) );
        for (int i = 4; i < input.length(); i++) {
            list.add(input.substring( i,i+2 ));
        }
        int year = Integer.parseInt( list.get(0) );
        int month = Integer.parseInt( list.get(1) );
        int day = Integer.parseInt( list.get(2) );
        if((year%4 == 0&& year%100 !=0 || year %400 ==0)&& month>2)
            number += 1;
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i <month-1 ; i++) {
            number+=days[i];
        }
        number +=day;
        System.out.println("这是今年的第"+ number+"天");
    }
}
