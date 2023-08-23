// codeforces   Team A
import java.util.*;
class Main 
{
    public static void numbercheck(int array[][] , int size)
    {
        int check[] = new int[size] ;
        int count = 0;
        for(int i = 0 ; i<size ; i++)
        {
            count = 0 ;
            for(int j = 0  ; j<3 ; j++)
            {
                if(array[i][j]==1)
                {
                    count ++ ;
                }
                check[i] = count ;
            }
        }
        int counter = 0 ;
        for(int k = 0 ; k<size ; k++)
        {
            if(check[k]>=2)
            {
                counter++ ;
            }
        }
        System.out.print(" "+counter) ;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[][]= new int[size][3] ;
        for(int i = 0 ; i<size ; i++)
        {
           for(int j = 0 ; j<3 ; j++)
           {
            System.out.print("enter ") ;
            array[i][j] = sc.nextInt() ;
           }
        }
        for(int i =  0 ; i<size ; i++)
        {
            for(int j = 0 ; j<3 ; j++)
            {
                    System.out.print(" "+array[i][j]) ;
            }
            System.out.print("\n") ;
        }
        numbercheck(array , size) ;
    }
}
// Codeforces question Is your horseshoe on the other hoof?
import java.util.* ;
class Main 
{
    public static void checkarray(int array[] , int size)
    {
        int count = 0 ;
        int check[] = new int[size] ;
        for(int i = 0 ; i<size ; i++)
        {
            count = 0 ;
            for(int j = i+1 ;j<size ; j++)
            {
                if(array[i] ==array[j])
                {
                    count++ ;
                }
            }
            check[i] = count ;
        }
        int counter = 0 ;
        for(int i = 0 ; i<size  ; i++)
        {
            if(check[i]>=1)
            {
                counter ++ ;
            }
        }
        System.out.print("the total changes is "+counter);
    }
    public static void main(String arsg[])
    {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt() ;
        int array[] = new int[size] ;
        for(int i = 0 ; i<size  ; i++)
        {
            System.out.print("enter");
            array[i] = sc.nextInt() ;
        }
        checkarray(array,size);
    }
}
// codeforces A boy and girl
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in) ;
        boolean flag  = false ;
        String s = sc.nextLine() ;
        char array[] = s.toCharArray() ;
        int size  = array.length ;
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size ; j++)
            {
                if(array[i]==array[j])
                {
                    flag = true ;
                }
                else 
                {
                    flag = false ;
                }
            }
        }
        if(flag == true)
        {
            System.out.print("IGNORE HIM!") ;
        }
        else 
        {
            System.out.print("CHAT WITH HIM") ;
        }
       
    }
}
// codeforce 214/A
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in) ;
        int m = sc.nextInt() ;
        int n  = sc.nextInt() ;
        System.out.println("a2 + b = m");
        System.out.println("a + b2 = m");
        int max = 0 ;
        if(m>n)
        {
            max = m ;
        }
        else 
        {
            max = n ;
        }
        for(int i = 0 ; i<max  ; i++)
        {
           if((i + Math.pow((n-Math.pow(i,2)),2)==m)) 
           {
            System.out.println("The values  are "+i) ;
           }

        }

    }
}
// codeforces 202/A
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        String name = sc.nextLine() ;
        char array[] = name.toCharArray() ;
        int size = array.length  ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" "+array[i]);
        }
        int counter = 0 ;
        
    }
}
// codeforces 214A
import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m  = sc.nextInt() ;
        System.out.println("a2 + b = m");
        System.out.println("a + b2 = m");
        int max = 0 ;
        if(m>n)
        {
            max = m ;
        }
        else 
        {
            max = n ;
        }
        int count = 0 ;
        for(int i = 0 ; i<max  ; i++)
        {
           if((i + Math.pow((n-Math.pow(i,2)),2)==m)) 
           {
            count++ ;
           }

        }
        System.out.print(" "+count);
    }

}
// string name 
import java.util.*;

public class main
{

static String largestPalinSub(String s)
{
    String res = "";
    char mx = s.charAt(0);
 
    for (int i = 1; i < s.length(); i++)
        mx = (char)Math.max((int)mx,
                  (int)s.charAt(i));
    for (int i = 0; i < s.length(); i++)
        if (s.charAt(i) == mx)
            res += s.charAt(i);
 
    return res;
}
 
public static void main(String agrs[])
{
    Scanner sc = new Scanner(System.out.print) ;
    String name  = sc.nextLine() ;
    System.out.println(largestPalinSub(s));
}
}
// 41 wrong answer 
// codeforces 214A
import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m  = sc.nextInt() ;
        System.out.println("a2 + b = m");
        System.out.println("a + b2 = m");
        int max = 0 ;
        if(m>n)
        {
            max = m ;
        }
        else 
        {
            max = n ;
        }
        int count = 0 ;
        for(int i = 0 ; i<=max  ; i++)
        {
           if((i + Math.pow((n-Math.pow(i,2)),2)==m)) 
           {
            count++ ;
           }

        }
        System.out.print(" "+count);
    }

}

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int row  = sc.nextInt()  ;
        int col  = sc.nextInt() ;
        String array[][] = new String[row][col] ;
        for(int i = 0 ; i<row ; i++)
        {
            for(int j = 0 ; j<col ; j++)
            {
                System.out.print("enter ");
                array[i][j] = sc.next() ;
            }
        }
        for(int i = 0 ; i<row ; i++)
        {
            for(int j = 0 ; j<col  ; j++)
            {
                System.out.print(" "+array[i][j]) ;
            }
            System.out.print("\n");
        }
        int starcounter = 0 ;
        int calc[] = new int[row] ;
        for(int i = 0 ; i<row  ;  i++)
        {
            starcounter = 0  ;
            for(int j = 0 ; j<col ; j++)
            {
                if(array[i][j]=="*")
                {
                    starcounter++ ;
                }
            }
            calc[i] = starcounter ;
        }
        int index = 0 ;
        for(int k = 0 ; k<row  ; k++)
        {
            if(calc[k]==1)
            {
                index = calc[k] ;
            }
        }
        System.out.print("the index is "+index+1);

    }
}
