package review.it;

import java.util.*;

public class huawei03_caclu_name_size {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Set set = new HashSet( 500 );
        set.add( input.nextLine() );
        int num= Integer.parseInt( input.nextLine(  ));
        for (int i = 0; i <num ; i++) {
            String[] name = input.nextLine().split( "\\," );
            for (int j = 0; j < name.length; j++) {
                if(!set.contains( name[j] )) {
                    set.add( name[j] );
                }
            }

        }

        System.out.println(set.size());

    }

    }

