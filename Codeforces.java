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
