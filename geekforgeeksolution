//leetcode 50 
import java.util.*;
class Main
  {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in) ;
      int num = sc.nextInt() ;
      int power = sc.nextInt() ;
      double z  = (double)Math.pow(num , power);
      System.out.print(z) ;
        
    }
  }
// leetcode squareroot 
class Solution {
    public int mySqrt(int x) {
        
        int z = (int)Math.pow(x,0.5) ;
        return z ;
    }
}
// LOVE BABBER SHEET SOLUTIONS 
// QUESWTION 1 
import java.util.*;
class Main 
  {
    static void reverse(char array[] , int size)
    {
      System.out.print("\n");
      for(int i = size-1 ; i>=0 ; i--)
        {
          System.out.print(""+array[i]) ;
          
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int size = sc.nextInt() ;
      char array[]= sc.next().toCharArray() ;
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print(""+array[i]) ;
        }
      reverse(array , size) ;
      
    }
    
  }
// QUESTION 2 // longest substring in a array leetcode 6 

import java.util.*;
class Main 
{
  static void substring(char array[] , int size)
  {
    int counter = 0 ;
    for(int i= 0  ; i<size ; i++)
      {
        for(int j = size -1 ; j>=0 ; j--)
          {
            if(array[i]==array[j])
            {
              counter ++ ;
            }
            else 
            {
              break ;
            }
          }
      }
    char tnew[] = new char[counter] ;
    for(int i= 0  ; i<size ; i++)
      {
        for(int j = size -1 ; j>=0 ; j--)
          {
            if(array[i]==array[j])
            {
              tnew[i] = array[i] ;
            }
          }
      }
    for(int i = 0 ; i<counter ; i++)
      {
        System.out.print(" "+tnew[i]);
      }
    
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    int  size = sc.nextInt() ;
    char array[] = sc.next().toCharArray() ;
   for(int i = 0 ; i<size ; i++)
     {
       System.out.print(" "+array[i]);
     }
    substring(array , size) ;
    
  }
}

// Question 3 maximum and minimum elements
import java.util.*;
class Main
  {
    static void selectionsort(int array[] , int size)

    {
      
      for(int i = 0 ; i<size ; i++)
        {
          int min = i ;
          for(int j = i+1 ; j<size ;j++)
            {
              if(array[i]>array[j])
              {
                int temp =array[i] ;
                array[i] = array[j] ;
                array[j] = temp  ;
                
              }
            }
        }
      for(int k= 0 ; k<size ; k++)
        {
            System.out.print(" "+array[k]) ;
          
        }
    }
    public static void main(String args[])

    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)

        {
          System.out.print("enter the number") ;
          array[i] = sc.nextInt();
      }
      selectionsort(array , size) ;
    }
  }
  // 1,2,0 sorting algorithm 
  import java.util.*;
class Main
  {
    static void selectionsort(int array[] , int size)

    {
      
      for(int i = 0 ; i<size ; i++)
        {
          int min = i ;
          for(int j = i+1 ; j<size ;j++)
            {
              if(array[i]>array[j])
              {
                int temp =array[i] ;
                array[i] = array[j] ;
                array[j] = temp  ;
                
              }
            }
        }
      for(int k= 0 ; k<size ; k++)
        {
           System.out.print(" "+array[k]) ;
        }
    }
    public static void main(String args[])

    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)

        {
          System.out.print("enter the number") ;
          array[i] = sc.nextInt();
      }
      selectionsort(array , size) ;
    }
  }
// negative on one side of the array 
import java.util.*;
class Main
  {
    static void negative(int array[] , int size)
    {
      for(int k = 0 ; k<size ; k++)
        {
          
          for(int u = k+1 ; u<size ; u++)
            {
              if(array[k]>array[u])
              {
                int temp = array[k] ;
                array[k]= array[u] ;
                array[u] = temp  ;
               }
            }
        }
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print(" "+array[i]) ;
        }
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)
        {
          array[i] =sc.nextInt() ;
        }
    
      negative(array , size) ;
      
    }
  }
// union wihtout any inbuilt operation 

  import java.util.*;
  class Main
    {
      
      static void union(int array[] , int narray[] , int size, int num)
      {
        int min  ;
        if(size<num)
        {
          min = size ;
        }
        else 
        {
          min = num  ;
        }
        int g = 0 ;
        int union[] = new int [min] ;
        for(int i =0 ; i<size ; i++)
          {
            for(int j = 0 ; j<num  ; j++)
              {
                if(array[i] == narray[j])
                {
                  union[g] = narray[j] ;
                  g++ ;
                }
              }
          }
        for(int s=0 ; s<min  ; s++)
          {
            if(union[s]!=0)
  
            {
                System.out.print(" "+union[s]);
            }
          }
      }
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int num = sc.nextInt() ;
        int array[] = new int[size] ;
        int narray[] = new int[num] ;
        for(int i = 0 ;i<size ; i++)
          {
            System.out.print("enter the input ") ;
            array[i] = sc.nextInt() ;
          }
        for(int l= 0 ; l<num ; l++)
  
          {
            System.out.print("input for the next array") ;
            narray[l] = sc.nextInt() ; 
          }
        union(array , narray , size , num) ;
       
      }
    }
// intersection question 

import java.util.*;
class Main 
  {
    static void intersect(int array[]  , int size , int you[] ,int num)
    {
      int total = size+num ;
      int narray[] = new int[total] ;
      for(int i = 0 ; i<size ; i++)
        {
          narray[i] = array[i] ;
          
        }
      for(int j =0  ; j<num  ; j++)
        {
          narray[size+j+1] =you[j] ;
          
        }
      int duplicate[] = new int[total] ;
      
      for(int j = 0 ; j<total ; j++)
        {
          for(int k =  j+1; k<total ; k++)
            {
              if(narray[k]!=narray[j])
              {
              duplicate[j] = narray[j] ;
              }
            }
        }
      for(int o = 0 ; o<total ; o++)
        {
          System.out.print(" "+duplicate[o]) ;
        
        }
        
    }
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int l = 0 ;l<size ; l++) ;
      {
        System.out.print("enter the number ") ;
        array[l] = sc.nextInt() ;
      }
      int num = sc.nextInt() ;
      int you[] = new int[num] ;
      for(int i = 0 ; i<num  ; i++)
        {
          System.out.print("enter  :");
          you[i] = sc.nextInt() ;
          
        }
      intersect(array , size , you , num) ;
      
    }
  }
  // reverse the array wihtout the for/while loop 
  import java.util.*;
class Main
  {
    static void cyclic(int array[] , int size , int cycle)
    {
      int i = 0 ;
      while(i!=cycle)
        {
          int temp = array[i] ;
          array[i]=  array[size-1-i] ;
          array[size-1-i] = temp ;
          i++ ;
          
        }
      for(int p= 0 ; p<size ; p++)
        {
          System.out.print(" "+array[p]);
        }
    }
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int cycle = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print("enter ") ;
          array[i]=sc.nextInt() ;
        }
      cyclic(array , size , cycle);
      
    }

    
  } 
// maxium subarray sum error 

import java.util.*;
class Main
  {
    static void subarray(int array[] , int size , int sum)
    {
      
      int newsum= 0;
      for(int i = 1 ; i<=size ; i++)
        {
          
          for(int k = i +1 ; k<= size ; k++)
            {
               newsum  = array[i]+array[k] ;
              
             while(newsum<sum)
               
                  k++ ;
                 newsum = newsum+array[k] ;
               }
          
            }
      System.out.println(newsum);
        }
  
    
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt() ;
      int array[]= new int [size+1 ] ;
      int sum = sc.nextInt() ;
      for(int i = 1 ; i<=size ; i++)
        {
          System.out.print(" enter ");
          array[i] = sc.nextInt() ;
          
        }
      subarray(array , size , sum) ;
      
    }
  }
// missing number in the array // one liner
class Solution {
  int missingNumber(int array[], int n) {
    return (n*(n+1))/2-Arrays.stream(array).sum();
  }
}
// long ALGORITHM 
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
  for(int k =0  ; k<size; k++)
    {
      System.out.print(" enter ") ;
      array[k] = sc.nextInt() ;
    }
    for(int i = 0 ; i<size ; i++)
      {
        for(int k= i+1 ; k<size ; k++)
          {
            if(array[i]>array[k])
            {
              int temp  = array[i] ;
            array[i] = array[k] ;
            array[k] =temp;
            }
            
            
          }
      }
    for(int i = 0 ; i<size  ; i++)
      {
        System.out.print(" "+array[i]) ;
      }
    int min = array[0] ;
    int max = array[size-1] ;
    int fnew = max-min ;
    int posarray[] = new int[max-min] ;
    for(int i= 0 ; i<fnew ; i++)
      {
        array[i] = posarray[i] ;
      }
    for(int i = min ; i<max ; i++)
      {
        if(posarray[i]!=i && posarray[i]!=0)
        {
            System.out.print(" "+posarray[i]) ;
        }
      }
  }
}
// minimum ju8mpws needed 
import java.util.*;
class Main 
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int[size];
      for(int i = 0 ; i<size  ;i++)
        {
          System.out.print("enter ") ;
          array[i] = sc.nextInt() ;
          
        }
      int counter = 0;
      for(int i = 0  ; i<size ; i++)
        {
          if(array[0]==0)
          {
            counter = 0 ;
            System.out.print(counter) ;
          }
          else 
          {
            i = i+array[i] ;
            counter ++ ;
            if(i>size)
            {
              System.out.print("the max values that are needed is"+counter ) ;
            }
            
          }
        }
    }
  }
