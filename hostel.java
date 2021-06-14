import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        int test=0,host=0,days=0,i=0,j=0,hp=0,ans=0;
        Scanner scanner = new Scanner(System.in);
        test=scanner.nextInt();
        Scanner in = new Scanner(System.in);

        for(j=0;j<test;j++)
        {
            String s[]= in.nextLine().split(" ");
            for(i =0 ;i < s.length;i++)
            {
                host= Integer.parseInt(s[0]);
                days= Integer.parseInt(s[1]);
            }

            int a[][]= new int[host][2];
            for(i =0 ;i < host;i++)
            {
                s= in.nextLine().split(" ");
                for(j =0 ;j < s.length;j++)
                {
                    a[i][0]= Integer.parseInt(s[0]);
                    a[i][1]= Integer.parseInt(s[1]);
                }
            }
            for(i =0 ;i < host;i++)
            System.out.println(a[i][0]+"  "+a[i][1]);
            for(i =1 ;i <= days;)
            { 
                for(j =0 ;j < host;j++)
                {
                    if (a[j][0]<a[hp][0])
                        hp=j;
                    else if(a[j][0]==a[hp][0])
                        if(a[j][1]<a[hp][1])
                            hp=j;
                }
                if (a[hp][0]>days)
                    break;
                if(a[hp][0]<=i)
                {
                    if((a[hp][1]+i-2)<days)
                    {
                        i=a[hp][1]+i;
                        ans++;
                    }
                    a[hp][0]=days+1;
                }
                else
                    i++;
            }
            System.out.println(ans);
        }
    }
}