package review.it;

import java.util.Scanner;

public class Phrase_String {
    public static void main(String[] args)
    {
        int i;
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        //从键盘接收一个字符串
        String s = sc.nextLine();
        for(i = 0;i<s.length()/2;i++)
        {
            //将字符串头尾对应的两个字符进行比较，如果一样就继续循环下去，i加一
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            {

            }
            //如果不相等，直接跳出循环
            else
            {
                break;
            }
        }
        //如果是回文的话，肯定循环完了，循环完了之后i是等于s.length()/2的
        if(i==s.length()/2)
        {
            System.out.println("是回文！");
        }
        else
        {
            System.out.println("不是回文！");
            System.out.println("在第"+(i+1)+"个位置比较时发现不是回文数");
        }
    }

}

