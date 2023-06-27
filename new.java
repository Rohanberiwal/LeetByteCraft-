// hello world
class main{
    public static void main(String[] args)
    {
        System.out.println("hello world");
    }
}
// takinf dynamic inputs in java 
import java.util.* ;
class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    String a = sc.nextLine() ;
    System.out.println("name : "+a) ;
    
  }
}

// sum of 2 number in java 
import java.util.* ;
class Main{
  public static void main(String[] args)
  {
    System.out.print("enter a number ") ;
    Scanner sc  = new Scanner(System.in) ;
    int a = sc.nextInt() ;
    System.out.print("enter anathor number ") ;
    int b  = sc.nextInt() ;
    int c = a+b  ;
    System.out.println("sum  : "+c) ;
    
    
  }
}

//  detecting if a guy is adult or not 
import java.util.* ;
class Main{
  public static void main(String[] args)
  {
    System.out.print("enter your age :" ) ;
    Scanner sc = new Scanner(System.in) ;
    int age = sc.nextInt() ;
    if(age>18)
    {
      System.out.println("Your are a adult ") ;
      
    }
    else 
    {
      System.out.println("your are not a adult ") ;
    }
  }
}

// even odd detector 
import java.util.* ;
class Main{
  public static void main(String[] args)
  {
    System.out.print("enter number  :" ) ;
    Scanner sc = new Scanner(System.in) ;
    int nums = sc.nextInt() ;
    if(nums%2==0 || nums!=0)
    {
      System.out.println("Even number ") ;
      
    }
    else 
    {
      System.out.println("Odd number") ;
    }
  }
}

// greater and less 
import java.util.*;
class Main
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in) ;
      System.out.print("enter a number : ");
      int a = sc.nextInt() ;
      System.out.print("enter the second number ") ;
      int b = sc.nextInt() ;
      if(a>b)
      {
        System.out.print(a+ " is greater number ") ;
        
      }
      else if(b>a)
      {
        System.out.print(b+" is greater ") ;
        
      }
      else 
      {
        System.out.print("Equal ");
      }
    }
  }

// choice greeting 
import java.util.*;
class Main
  {
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in) ;
      System.out.print("choose a number between 1,2,3 ");
      int a = sc.nextInt() ;
      if(a==1)
      {
        System.out.print("Namste") ;
        
      }
      else if(a==2)
      {
        System.out.print("Hello ");
        
      }
      else if(a==3)
      {
        System.out.print("bonjour");
        
      }
      else 
      {
        System.out.print("Invalid choice ");
      }
    }
  }

// swtich- case 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("enter a choice ");
    int button = sc.nextInt() ;
    switch(button)
      {
        case 1 : System.out.print("hello");
        break ;
        case 2 : System.out.print("Bonjour");
        break ;
        case 3 : System.out.print("namsate");
        break ;
        default : System.out.print("invalid choice ");
        
      }
  }
}

// pattern to print a reatangle using stars 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in);
    System.out.print("enter number ");
    int a = sc.nextInt() ;
    for(int i = 0 ; i<a ; i++)
      {
        for(int j = 0 ; j<a ; j++)
          {
            System.out.print("*");
          }
        System.out.print("\n");
      }
  }
}

// triangluar stars 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in);
    System.out.print("enter number ");
    int a = sc.nextInt() ;
    for(int i = 0 ; i<a ; i++)
      {
        for(int j = 0 ; j<=i ; j++)
          {
            System.out.print("*");
          }
        System.out.print("\n");
      }
  }
}

// Assignment -1 
// q-1
import java.util.Scanner;  
class Main  
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");   
n=sc.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{    
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");   
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
}  
}  

// array input and print 5 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("enter the array size : ");
    int a = sc.nextInt() ;
    int[] arr  = new int[a] ;
    for(int i = 0 ; i<a  ; i++)
      {
        System.out.print("enter number : ");
        arr[i] = sc.nextInt() ;
        
      }
    for(int i = 0 ; i<a ; i++)
      {
        System.out.print(arr[i]+" ,") ;
      }
  }
}

// average of a array 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in) ;
    System.out.print("enter size : ");
    int size = sc.nextInt() ;
    int arr[]  = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
          System.out.print("enter number : ");
        arr[i] = sc.nextInt() ;
        
      }
    int sum =0 ;
    for(int i = 0 ; i<size  ; i++)
      {
        sum = sum + arr[i] ;
        
      }
    int x = sum/size ;
    System.out.print(x+" is the average ");
  }
}
// min finader + location 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in) ;
    System.out.print("enter size : ");
    int size = sc.nextInt() ;
    int arr[]  = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
          System.out.print("enter number : ");
        arr[i] = sc.nextInt() ;
        
      }
    int min = arr[0] ;
    int min_local =0 ;
    for(int i = 0 ; i <size  ; i++)
      {
        if(arr[i]<min)
        {
          min = arr[i] ;
          min_local = i  ;
          
        }
        else 
        {
          i++ ;
        }
      }
    System.out.print(min+" is the minimum value in the array at "+min_local) ;
    
  }
}
// power of array 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter arry size : ");
    int size = sc.nextInt() ;
    int arr[] = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter inputs : ");
        arr[i]=sc.nextInt() ;
        
      }
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("_ "+Math.pow(arr[i] ,2));
      } 
    
  }
}
// array odd , even 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter arry size : ");
    int size = sc.nextInt() ;
    int arr[] = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter inputs : ");
        arr[i]=sc.nextInt() ;
        
      }
    for(int i = 0 ; i<size ; i++)
      {
       if(arr[i]%2!=0)
       {
         System.out.println("Odd number ");
       }
      else 
       {
         System.out.println("even number ");
       }
      }
     
  }
}
// code for reverse array 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter arry size : ");
    int size = sc.nextInt() ;
    int arr[] = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter inputs : ");
        arr[i]=sc.nextInt() ;
        
      }
    for(int i = size-1 ; i>=0 ; i--)
      {
        System.out.print("_ "+arr[i]);
      }   
  }
}

// reverse cubees in the array 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter arry size : ");
    int size = sc.nextInt() ;
    int arr[] = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter inputs : ");
        arr[i]=sc.nextInt() ;
        
      }
    for(int i = size-1 ; i>=0 ; i--)
      {
        System.out.print("_ "+Math.pow(arr[i],3));
      }
     
    
  }
}

// Linear search algorthim 

import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(  System.in) ;
    System.out.print("enter size of the array ");
    int size = sc .nextInt() ;
    int arr[] = new int[size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input : ");
        arr[i] = sc.nextInt() ;
        
      }
    System.out.print("enter the number you wish to search  :") ;
    int sa = sc.nextInt() ;
    for(int i = 0 ; i<size ; i++)
      {
        if(arr[i] ==sa)
        {
          System.out.print("Hit !! " +i);
          
        }
        
      }
  }
}

// code for the reaplcement of 1st and last value in a array 
import java.util.*;
class Main
{
  void replace(int arr[])
  {
    int z = 0 ; 
    int z_last = -1 ;
    int temp = arr[z];
    arr[z]= arr[z_last] ;
    arr[z_last]= temp ;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt() ;
    int arr[] = new int[size] ;
    for(int i = 0 ; i<size  ; i++)
      {
        System.out.print("enter input : ");
        arr[i] = sc.nextInt() ;
        
      }
    replace(arr[]) ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("_"+arr[i]);
      }
  }
}

// swap 1 st and last 
import java.util.*;
class Main
{
  static void replace(int arr[] , int size )
  {
    int z = 0 ; 
    int z_last = size -1  ;
    int temp = arr[z];
    arr[z]= arr[z_last] ;
    arr[z_last]= temp ;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt() ;
    int arr[] = new int[size] ;
    for(int i = 0 ; i<size  ; i++)
      {
        System.out.print("enter input : ");
        arr[i] = sc.nextInt() ;
        
      }
    replace(arr , size ) ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("_"+arr[i]);
      }
  }
}

// salary work 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new   Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i =0 ; i<size ; i++)
      {
        if (array[i]>500000)
        {
          System.out.print(" "+array[i]);
          
        }
        else 
        {
          continue ;
        }
      }
  }
}
// 3 times even and 2 rimes odd
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new   Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i =0 ; i<size ; i++)
      {
        if (array[i]%2==0)
        {
          System.out.print(" "+(3*array[i]));
          
        }
        else 
        {
          System.out.print(" "+((2*array[i])+1));
        }
      }
  }
}
// 7 and 3 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new   Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i =0 ; i<size ; i++)
      {
        if (array[i]%7==0)
        {
          System.out.print(" "+(array[i])/7);
          
        }
        else 
        {
          System.out.print(" "+((3*array[i])));
        }
      }
  }
}

// code to repalce the divisible value 
import java.util.*;
class Main
{
  static void replace(int array[] , int size  , int i)
  {
    if(i!=size-1)
    {
      int temp = array[i] ;
      array[i] = array[i+1];
      array[i+1]= temp  ;
      
    }
    else if(i==size-1 || array[i]%10 ==0)
    {
      int x =  array[i] ;
      array[i] = array[0] ;
      array[0] = x ;
     }
  }
  public static void main(String[] args)
  {
    Scanner sc = new   Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i = 0 ; i<size ; i++)
      {
        if(array[i]%10==0)
        {
          replace(array , size , i );
          i++ ;
        }
      }
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" ,"+array[i]);
      }
  }
}

// swap a number 

import java.util.*;
class Main
{
  static void pos_shift(int array[] , int size , int i)
  {
    {
    if(i!=size-1)
    {
      int temp = array[i] ;
      array[i] = array[i+1];
      array[i+1]= temp  ;
      
    }
    else if(i==size-1)
    {
      int x =  array[i] ;
      array[i] = array[0] ;
      array[0] = x ;
    }
    }
  }
 
  public static void main(String[] args)
  {
    Scanner sc = new   Scanner(System.in) ;
    System.out.print("enter size ");
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i = 0 ; i<size ; i++)
      {
        pos_shift(arr ,size , i) ;
        i++ ;
        
      }
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" ,"+array[i]);
      }
  }
}
// odd , even add 5,10
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("enter number : ");
    int size  = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input: ");
        array[i] = sc.nextInt() ;
        
      }
    for (int i= 0 ; i<size ; i++)
      {
        if(array[i]%2==0)
        {
          array[i] = array[i]+5 ;
          
        }
        else 
        {
          array[i] = array[i] + 10 ;
          
        }
      }
     for (int i= 0 ; i<size ; i++)
      {
        System.out.print(" ,"+array[i]);
      }
    
  }
}

// ERROR ! THIS CODE HAS TO BE CORRECTED 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("Enter input : ");
        array[i] = sc.nextInt() ;
        
      }
    for(int  i  = 0 ; i<size  ; i++)
      {
        int s = array[i] ;
        int array_extra[] = new int[5] ;
        for(int j =0 ; j<size ; j++)
          {
          s =s /10 ;
          array_extra[j] = s%10 ;
          //System.out.print(","+array_extra[j]);
          if(array_extra[j]==3)
          {
            System.out.print("YES\n");
            
          }
          }
        
      }
  }
}

// matrix 2-d array 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter row");
    int row = sc.nextInt() ;
    System.out.print("enter row");
    int col = sc.nextInt() ;
    //int array[] = new int [size] ;
    int arr[][] = new int [row][col] ;
    
    for(int i = 0 ; i<row ; i++)
      {
        for(int j = 0 ; j<col ; j++)
          {
           System.out.print("enter input ");
            arr[i][j] = sc.nextInt() ;
            
          }
      }  
    for(int i = 0 ; i<row ; i++)
      {
        for(int j = 0 ; j<col ; j++)
          {
           System.out.print(" "+arr[i][j]);
          }
        System.out.print("\n");
      }  
  }
  
}
// question 17 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input : ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
      }
    int sum = 0;
    for(int i = 0 ; i<size ; i++)
      {
        int mod = array[i]%10  ;
        if(mod==3)
        {
          sum = sum + array[i];
        }
      }
    System.out.print("\nsum : "+sum) ;
  }
}

// 1 0 0
// 2 2 0
// 3 3 3 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
    for(int i = 0  ; i<size ; i++)
      {
        System.out.print("enter input : ");
        array[i] = sc.nextInt() ;
      }
    for(int i = 0 ; i<size ; i++)
      {
       for(int j = 0 ; j<size ; j++)
         {
           if(i>=j)
           {
           System.out.print(" "+array[i]);
           }
           else
           {
             System.out.print(" "+0);
           }
         }
        System.out.print("\n");
      }
  }
}


// problem 18 assignment  error 

import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
    for(int i = 0  ; i<size ; i++)
      {
        System.out.print("enter input : ");
        array[i] = sc.nextInt() ;
      }
    int array_extra[][] = new int  [size][size] ;
    for(int i = 0 ; i<size ; i++)
      {
       for(int j = 0 ; j<size ; j++)
         {
           if(i>=j)
           {
             array_extra[i][j] = array[j] ;
           }
           else if(j>i)
           {
             array_extra[i][j] = 0 ;
           }
         }
        System.out.print("\n");
      }
    for(int i = 0 ; i<size ; i++)
      {
       for(int j = 0 ; j<size ; j++)
         {
           System.out.print(" "+array_extra[i][j]);
         }
        System.out.print("\n");
      }
  }
}

// column sum 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int row = sc.nextInt()  ;
    int col = sc.nextInt()  ;
    int array[][] = new int [row][col];
    for(int i = 0  ;i<row ; i++)
      {
        for(int j = 0 ; j<col ; j++)
          {
            System.out.print("enter the input : ");
            array[i][j] = sc.nextInt() ;
            
          }
      }
     for(int i = 0  ;i<row ; i++)
      {
        
        for(int j = 0 ; j<col ; j++)
          {
            System.out.print(" "+array[i][j]);
          }
       
        System.out.print("\n");
      }
    int sum = 0 ; 
    int sum_array[] =new int [row] ;
    for(int i = 0  ;i<row ; i++)
      {
        sum = 0 ;
        for(int j = 0 ; j<col ; j++)
          {
           sum = sum + array[j][i] ;
          }
        sum_array[i] = sum ;
        System.out.print(" "+sum);
      }
     //System.out.print(" "+sum);
  }
}

// row sum 
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int row = sc.nextInt()  ;
    int col = sc.nextInt()  ;
    int array[][] = new int [row][col];
    for(int i = 0  ;i<row ; i++)
      {
        for(int j = 0 ; j<col ; j++)
          {
            System.out.print("enter the input : ");
            array[i][j] = sc.nextInt() ;
            
          }
      }
     for(int i = 0  ;i<row ; i++)
      {
        
        for(int j = 0 ; j<col ; j++)
          {
            System.out.print(" "+array[i][j]);
          }
       
        System.out.print("\n");
      }
    int sum = 0 ; 
    int sum_array[] =new int [row] ;
    for(int i = 0  ;i<row ; i++)
      {
        sum = 0 ;
        for(int j = 0 ; j<col ; j++)
          {
           sum = sum + array[i][j] ;
          }
        sum_array[i] = sum ;
        System.out.print(" "+sum);
      }
     System.out.print(" "+sum);
  }
}

// binary search  // code has error 

import java.util.*;
class Main
{
  static void binarysearch(int arr[] , int size , int search)
  {
     if(size%2==0)
      {
    if(arr[size/2]==search)
    {
      System.out.print("found element :  "+arr[size/2]) ;
    }
    else if(arr[size/2]>search)
    {
      binarysearch(arr ,size/2-1 , search) ;
    }
    else
    {
      binarysearch(arr , size/2 +1 , search) ;
    }
    }
    else 
      {
    if(arr[(size+1)/2]==search)
    {
      System.out.print("found element :  "+arr[size/2]) ;
    }
    else if(arr[(size+1)/2]>search)
    {
      binarysearch(arr ,size/2 -1 , search) ;
    }
    else
    {
      binarysearch(arr , size/2 +1 , search) ;
    }
    }
       
    
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int arr[] =new int[size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input : ");
        arr[i] = sc.nextInt();
      }
    System.out.print("binary search: ");
    int search = sc.nextInt() ;
    binarysearch(arr , size , search) ;
    
  }
}

// merge sort algo 
// 

import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int arr_1[] = new int [size];
    int arr_2[] = new int [size] ;
    for(int i= 0 ;  i<size ; i++)
      {
        System.out.print("enter input for arr1 : ");
        arr_1[i] = sc.nextInt() ;
        System.out.print("enter input for arr2 : ");
        arr_2[i] = sc.nextInt() ; 
      }
    int array_vac[] = new int [2*size] ;
    for(int i= 0 ;  i<size ; i++)
      {
        System.out.print("-> "+arr_1[i]);
      }
    System.out.print("\n");
    for(int i= 0 ;  i<size ; i++)
      {
        System.out.print("-> "+arr_2[i]);
      }
    for(int i = 0 ;i<size ;i++)
      {
        for(int j = 0 ; j<size  ; j++)
          {
            while(i!=size || j!=size)
           { if(arr_1[i]>arr_2[j])
            {
              array_vac[j] = arr_2[j] ;
              //j++;
              
            }
            else if(arr_1[i]<arr_2[j])
            {
              array_vac[j] = arr_1[i];
              i++ ;
            }
            else if(arr_1[i]==arr_2[j])
            {
              array_vac[j] = arr_1[i] ;
            }
          }
            if(i==size)
            {
              array_vac[i]=arr_2[j];
              i++ ;
            }
            else if(j==size)
            {
              array_vac[i] = arr_1[j];
              i++ ;
            }
          }
      }
      for(int i = 0 ;i<2*size ;i++)
      {
        
        System.out.print("\n->"+array_vac[i]);
      }
  }
}

// question 24
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new  int [size] ;
    char res='N';
    for (int i =0  ; i<size ; i++)
      {
        System.out.print("enter inputs ");
        array[i] = sc.nextInt() ;
        
      }

    

    if(array[0]>=array[1])
    {
      res='D';
      for(int i=1;i<size-1;i++)
        {
          if(array[i]<array[i+1])
          {
            res='N';
            break;
          }
        }
    }

    if(array[0]<=array[1])
    {
      res='A';
      for(int i=1;i<size-1;i++)
        {
          if(array[i]>array[i+1])
          {
            res='N';
            break;
          }
        }
    }
    

    if(res=='A')
    {
      System.out.println("Ascending..");
    }
    else if(res=='D')
    {
      System.out.println("Descending..");
    }
    else
    {
      System.out.println("No order..");
    }
    
  }
}

// reverse the array by half 
import java.util.*;
class Main 
{
  static void reverse(int array[] , int size)
  {
    if(size%2==0)
    {
      int i = 0  ;
      int j = size /2  ;
      while(i!=(size/2) && j!=(size))
        {
          int temp = array[i] ;
          array[i] = array[j] ;
          array[j]=  temp ; 
          i++ ;
          j++;
        }   
    }
    else if(size%2!=0)
    {
      int i  = 0 ; 
      int j  = (size+1)/2 ;
      while(i!=((size+1)/2) && j!=(size))
        {
          int temp = array[i] ;
          array[i] = array[j] ;
          array[j]=  temp ; 
          i++ ;
          j++;
        }  
    }
    System.out.print("\n");
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("-->"+array[i]);
      }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i]= sc.nextInt() ;
      }
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("-> "+array[i]);
        
      }
    reverse(array , size);
  }
}

// code 26 
import java.util.*;
class Main 
{
  static void shift(int array[] , int size)
  {
    int i = 0 ;
    if(size%2!=0)
    {
    while(i!=(size-1))
      {
        int temp = array[i] ;
        array[i] = array[i+1];
        array[i+1]= temp  ;
        i=i+2 ;
      }
    }
    else 
    {
      while(i!=(size))
      {
        int temp = array[i] ;
        array[i] = array[i+1];
        array[i+1]= temp  ;
        i=i+2 ;
      }
    }
    System.out.print("\n");
    for(int j = 0 ; j<size ; j++)
      {
        System.out.print("-->"+array[j]);
      }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i]= sc.nextInt() ;
      }
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("-> "+array[i]);
        
      }
    shift(array , size);
  }
}

// code 27 
import java.util.*;
class Main 
{
  static void reverse(int array[] , int size)
  {
    System.out.print("\n");
    for(int i = size-1  ; i>=0  ; i--)
      {
        System.out.print("-->"+array[i]);
      }
  }
  
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i]= sc.nextInt() ;
      }
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("-> "+array[i]);
        
      }
    reverse(array , size);
  }
}

// code 28
import java.util.*;
class Main 
{
  static void assign(int array[][] , int row , int col )
  {
    System.out.print("\n");
    for(int i =  0 ; i<row  ; i++)
      {
        for(int j = 0 ; j<col ; j++)
          {
            System.out.print(" "+array[i][j]) ;
          }
        System.out.print("\n");
      }
  }
  
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int row = sc.nextInt() ;
    int col = sc.nextInt() ;
    int array[][] = new int [row][col] ;
    for(int i = 0 ; i<row ; i++)
      {
        for(int j = 0 ; j<col ; j++ )
          {
        System.out.print("enter input ");
        array[i][j]= sc.nextInt() ;
          }
      }
    assign(array , row , col);
  }
}

// selection sort algorithm 
import java.util.*;
class Main 
{
  static void selectionsort(int array[] , int size )
  {
    System.out.print("\n");
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ;j<size ;j++)
          {
            if(array[i]>array[j])
            {
              int temp = array[i] ;
              array[i] = array[j] ;
              array[j] = temp ;
            }
          }
      }
    System.out.print("\n");
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
       
          
      }
  }
  
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i]= sc.nextInt() ;
          
      }
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
       
          
      }
    selectionsort(array , size);
  }
}

//  duplicate remover
import java.util.*;
class Main 
{
  static void duplicateremover(int array[] , int size )
  {
    System.out.print("\n");
    for(int i=0;i<size;i++)
      {
        
        for(int j=i+1;j<size;j++)
          {
            if(array[i]==array[j])
            {
              for(int k=j;k<size-1;k++)
                {
                  array[k]=array[k+1];
                }
              size--;
              j--;
              
            }
            
          }
        
        
        
      }
    System.out.print("\n");
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
      }
  }
  
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i]= sc.nextInt() ;
          
      }
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
       
          
      }
    duplicateremover(array , size);
  }
}
// matrix upper half sum 
import java.util.*;
class Main
  {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the size ");
      int row = sc.nextInt() ;
      System.out.print("enter the size ");
      int col = sc.nextInt() ;
      int matrix[][]= new int[row][col];
      for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
              System.out.print("enter ");
              matrix[i][j] = sc.nextInt();
              
            }
        }
       for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
              System.out.print(" "+matrix[i][j]); 
            }
          System.out.print("\n");
        }
      int sum = 0;
      for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
             if(i<=j)
             {
               sum = sum + matrix[i][j] ;
             }
            }
        }
      System.out.print("the sum is : "+sum) ;
    }
  }
  // lower half matrix sum 
  import java.util.*;
class Main
  {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the size ");
      int row = sc.nextInt() ;
      System.out.print("enter the size ");
      int col = sc.nextInt() ;
      int matrix[][]= new int[row][col];
      for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
              System.out.print("enter ");
              matrix[i][j] = sc.nextInt();
              
            }
        }
       for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
              System.out.print(" "+matrix[i][j]); 
            }
          System.out.print("\n");
        }
      int sum = 0;
      for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
             if(i>=j)
             {
               sum = sum + matrix[j][i] ;
             }
            }
        }
      System.out.print("the sum is : "+sum) ;
    }
  }

// column sum of any dynmaix sizeed matrix 
import java.util.*;
class Main
  {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the size ");
      int row = sc.nextInt() ;
      System.out.print("enter the size ");
      int col = sc.nextInt() ;
      int matrix[][]= new int[row][col];
      for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
              System.out.print("enter ");
              matrix[i][j] = sc.nextInt();
              
            }
        }
      int column_sum[] = new int [row] ;
       for (int i = 0 ; i<row ; i++)
        {
          for(int j= 0 ; j<col  ; j++)
            {
              System.out.print(" "+matrix[i][j]); 
            }
          System.out.print("\n");
        }
      int sum = 0;
      for (int i = 0 ; i<row ; i++)
        {
          sum = 0 ;
          for(int j= 0 ; j<col  ; j++)
            {
             sum = sum + matrix[j][i] ;
            
            }
          column_sum[i] = sum ;
        }
      //System.out.print("the sum is : "+sum) ;
      for(int j = 0 ; j<row ; j++)
        {
          System.out.print(" "+column_sum[j]);
        }
    }
  }

// 2-digit calcualor 
import java.util.*;
class Main
{
  static void digitcounter(int array[] , int i  , int size)
  {
    System.out.print("\n") ;
    int counter = 0;
    int nums = array[i];
    while(nums!=0)
      {
        nums = nums/10 ;
        counter ++ ;
      }
    System.out.print("\n") ;
    System.out.print("\ncounter :\n "+counter) ;
    if (counter ==2)
    {
      System.out.print("Num  : "+array[i]);
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
      }
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" "+array[i]) ;
      } 
    for(int i = 0 ; i<size ; i++)
      {
        digitcounter(array , i , size);
      }
  }
}
//even counter in array ;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
      }
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" "+array[i]) ;
      } 
    int sum = 0 ;
    for(int i = 0 ; i<size ; i++)
      {
      if(array[i]%2==0)
    {
      sum = sum+ array[i] ;
    }
      }
    System.out.print("\nsum  : "+sum) ;
  }
}

// repalcement of 1 -->last and last-->1 in a 2d matrix 
import java.util.*;
class Main
{
  static void replace(int matrix[][] , int row , int col)
  {
   
        for (int j = 0 ; j<col ; j++)
          {
            int temp = matrix[0][j] ;
            matrix[0][j] = matrix[row-1][j] ;
            matrix[row-1][j] = temp  ;
          }
      
      for(int i = 0 ; i<row  ; i++)
      {
        for (int j = 0 ; j<col ; j++)
          {
            System.out.print(" "+matrix[i][j]);
          }
        System.out.print("\n");
      }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int row = sc.nextInt() ;
    int col = sc.nextInt() ;
    int matrix[][]= new int [row][col] ;
    for(int i = 0 ;  i<row ; i++)
      {
        for(int j = 0 ; j<col  ; j++)
          {
            System.out.print("enter ");
            matrix[i][j] = sc.nextInt() ;
          }
      }
    for(int i = 0 ;  i<row ; i++)
      {
        for(int j = 0 ; j<col  ; j++)
          {
            System.out.print(" "+matrix[i][j]);
           
          }
        System.out.print("\n");
      }
      replace(matrix , row , col);
    
  }
}

// 3 and 5 divisiblity 
import java.util.*;
class Main
{
  static void check(int matrix[][] , int row , int col)
  {

    int  new_matrix[]  = new int[row*col] ;
    for(int i = 0 ; i<row ; i++)
      {
        for (int j = 0 ; j<col ; j++)
          {
            if(matrix[i][j]%3==0 || matrix[i][j]%5==0)
            {
              new_matrix[i] = matrix[i][j] ;
            }
          }
      }
      
      for(int i = 0 ; i<row*col ; i++)
        {
          System.out.print(" "+new_matrix[i]);
        }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int row = sc.nextInt() ;
    int col = sc.nextInt() ;
    int matrix[][]= new int [row][col] ;
    for(int i = 0 ;  i<row ; i++)
      {
        for(int j = 0 ; j<col  ; j++)
          {
            System.out.print("enter ");
            matrix[i][j] = sc.nextInt() ;
          }
      }
    for(int i = 0 ;  i<row ; i++)
      {
        for(int j = 0 ; j<col  ; j++)
          {
            System.out.print(" "+matrix[i][j]);
           
          }
        System.out.print("\n");
      }
      check(matrix , row , col);
    
  }
}

// sum of the digit in a input arrray dynamic runtine 
import java.util.*;
class Main
{
  static void check(int array[]  , int size , int k)
  {
    int counter = 0;
    int sum = 0 ;
    int num =  array[k]  ;
    int temp  = num  ;
    while(num!=0)
      {
        num = num/10 ;
        counter ++ ;
      }
    int array_check[] = new int[counter] ;
    int i = 0;
    while(temp!=0)
      {
        array_check[i]=temp%10 ;
        temp =temp/10;
        i++ ;
      }
    System.out.print("\n");
    System.out.print("counter : "+counter);
    for(int j = 0  ; j<counter ; j++)
      {
        sum = sum +array_check[j] ;
      }
    System.out.print("\n");
    System.out.print("sum : "+sum);
  }
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
    for(int i = 0  ; i<size ; i++)
      {
        System.out.print("\nenter ");
        array[i] = sc.nextInt() ;
        check(array , size , i);
      }
    for(int i = 0  ; i<size ; i++)
      {
        check(array , size , i);
      }
   
  }
}

// palindrome checker _error 
import java.util.*;
class Main
{
  static void palindrome(int array[] , int i , int size)
  {
    System.out.println("\n");
    int nums = array[i] ;
    int temp  = nums ;
    int counter = 0;
    while(nums!=0)
      {
        nums= nums/10 ;
        counter ++ ;
        
      }
    int arraycheck[] = new int[counter];
    int k = 0;
    while(k!=counter)
      {
       array[k] = temp%10  ;
        temp = temp/10 ;
        k++ ;
      }
    System.out.println("counter :"+counter);
    int m = 0 ;
    int n =  counter-1 ;
    boolean flag = false ;
    while(m!=n)
      {
        if(arraycheck[m]==array[n])
        {
          flag = true ;
          m++ ;
          n-- ;
        }
        else
        {
          flag = false ;
          break ;
        }
      }
    if(flag == true)
    {
      System.out.println("not a palindorme");
    }
    else 
    {
      System.out.println("Yes palindorme");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
        
      }
    System.out.println("\n");
    for(int i = 0 ; i<size ; i++)
      {
       System.out.print(" "+array[i]);
      }
    for(int i = 0 ; i<size ; i++)
      {
        palindrome(array , i , size);
      }
  }
}

// 2nd max and 2nd min selection sort s
import java.util.*;
class Main
{
  static void checker(int array[], int size)
  {
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j<size ; j++)
          {
            if(array[i]>array[j])
            {
            int temp = array[i] ;
            array[i] =array[j] ;
            array[j] = temp  ;
            }  
          }
      }
     System.out.print("\n");
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" "+array[i]);
      }
    System.out.print("\n");
    System.out.println("2nd max : "+array[size-2]) ;
    System.out.println("2nd min : "+array[1]);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
      for(int i = 0 ; i<size  ; i++)
      {
        System.out.print("enter numebr ");
        array[i] = sc.nextInt() ;
        
      }
    for(int i = 0 ; i<size  ; i++)
      {
        System.out.print(" "+array[i]);
      }
  checker(array, size) ;
    
  }
  
}