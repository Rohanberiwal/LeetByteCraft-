// leetcode 217
import java.util.*;
class Main 
{
  static void duplicateremover(int array[] , int size)
  {
    int counter = 0;
    int array_2[]  = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        counter = 0 ;
        for(int j = i+1 ; j<size ; j++)
          {
            if(array[i]==array[j])
            {
              counter ++ ;
              
            }  
          }

        array[i]=counter ;
      }
    boolean flag = true ;
    for(int i = 0 ; i<size ; i++)
      {
        if(array[i]>0)
        {
          System.out.print("True");
          break ;
        }
        else 
        {
        flag = false ;
        }
      }
    if(flag == false)
    {
       System.out.print("False");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[] = new int[size];
    for(int i= 0 ; i<size ; i++)
      {
       // System.out.print("enter ");
        array[i] = sc.nextInt() ;
      }
    duplicateremover(array,size);
  }
}

// leetcode 53 

import java.util.*;
class Main 
{
  static void duplicateremover(int array[] , int size)
  {
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
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[] = new int[size];
    for(int i= 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
      }
    duplicateremover(array,size);
  }
}
//CHOCOLATE PROBLEM DISTRIBUTION 

import java.util.*;
class Main
{
  static void chocolatecheck(int array[] , int size , int num)
  {
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j<size ; j++)
          {
            if(array[i] > array[j])
            {
              int temp = array[i] ;
              array[i] = array[j] ;
              array[j] = temp  ;
            }
          }
      }
     for(int i = 0 ; i<size ; i++)
      {
        
            System.out.print(" "+array[i]);
          
      }
     System.out.print("\n");
    int array_2[] = new int [num];
    while(num<size)
      {
    //int array_2[] = new int [num];
    for(int k = 0 ; k<num ; k++ )
      {
       array_2[k] = array[k];
      }
    for(int k = 0 ; k<num ; k++ )
      {
        System.out.print(" "+array_2[k]);
      }
        break ;
      }
    if(num>size)
    {
      System.out.print("ERROR");
      
    }
    System.out.print("\n");
    int z = array_2[0] ;
    int s = array_2[num-1];
    int xv= s-z ;
    System.out.print("min : "+xv);
    
    
  }
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size]  ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter : ");
        array[i] = sc.nextInt();
        
      }
    System.out.print("enter the 'm' value ") ;
    int num = sc.nextInt() ;
    chocolatecheck(array,size ,num) ;
    
  }
}

// leetcode 33 // incomplte 
import java.util.*;
class Main
  {
    static void rotate(int array[] , int size)
    {
      Scanner kc = new Scanner(System.in);
       System.out.print("\n") ;
      System.out.print("enter the pivot : ") ;
      int pivot = kc.nextInt() ;
      for(int i = 0  ; i<pivot ; i++)
        {
          for(int j =pivot   ; j<size ; j++ )
            {
             int temp = array[i] ;
              array[i]=array[j];
              array[j] =temp ;
              
            }
        }
        System.out.print("\n") ;
        System.out.print("\n") ;
      for(int i = 0  ; i<pivot ; i++)
        {
          System.out.print(" "+array[i]);
        }
    }
    static void selectionsort(int array[] , int size)
    {
      for(int i =0 ; i<size ; i++)
        {
          for(int j = i+1  ;j<size ; j++)
            {
              if (array[i]>array[j])
              {
                int temp = array[i];
                array[i]= array[j];
                array[j] = temp ;
              }
          
              }
          }
       for(int i =0 ; i<size ; i++)
        {
          System.out.print(" "+array[i]);
        }
      rotate(array , size);
      
    }
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in);
      int size = sc.nextInt() ;
      int array[] = new int [size];
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print("enter ");
          array[i] = sc.nextInt();
        }
      selectionsort(array , size);
      
    }
  }
  // leetcode 33 kadane algo // search in a rotated array is bascially kadnae algo 

int max=Integer.MIN_VALUE;

        int cs=0;

        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            if(cs>max)
            {
                max=cs;
            }
            if(cs<0)
            {
                cs=0;
            }
        }
        return max;
    
// palindrome leetcode 
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}


// reverse a number

class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}

// string elements into the array 
package com.journaldev.util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToArrayExample {

    public static void main(String[] args) {
        String line = "My name";
       
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
      
        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(line);
        System.out.println(Arrays.toString(words));
    }
}

//leetcode -3 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
// leetcode problem number 31 NEXT PERMUYTATION // error !!

import java.util.*;
  class Main
    {
      static void permutation(int array[] , int size)
      {
        int storage[][] = new int [size][size];
        for(int i = 0 ; i<size ; i++)
          {
            for(int j = 0 ; j<size  ; j++)
              {
                int temp = array[i] ;
                array[i] = array[j] ;
                array[j]= temp ;
                
              }
          }
        for(int i = 0 ; i<size ; i++)
          {
            for(int j = 0 ; j<size ; j++)
              {
                storage[i][j] = array[i];
              }
          }
        for(int i = 0 ; i<size ; i++)
          {
            for(int j = 0 ; j<size ; j++)
              {
               System.out.print(" "+storage[i][j]);
              }
          }
       
      }
      static int factorial(int size)
      {
        int product =1  ;
        
        for(int i = 1 ; i<=size ; i++)
          {
            product = product*i ; 
          }
        return product ;
      }
      public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt() ;
        int array[]  = new int [size];
        for(int i = 0 ; i<size ; i++)
          {
            System.out.print("enter : ");
            array[i]  = sc.nextInt() ;
            
          }
        for(int i = 0 ; i<size ; i++)
          {
            System.out.print(" "+array[i]);  
          }
          System.out.print("\n");
        System.out.print("total permuataiton are : "+factorial(size));
          System.out.print("\n");
        permutation(array , size);
      }
    }

// Problem with the below approach works for some test cases 
import  java.util.*;
class Main 
{
  static void stock(int price[] , int day)
  {
    int min = price[1];
    int fix = 0;
    for(int i = 2 ; i<=day  ; i++)
      {
        if(price[i]<min)
        {
          min = price[i] ;
          fix = i;
        }
      }
    System.out.print(" min :  "+min) ;
    System.out.print("\n") ;
    System.out.print(" at  :  "+fix) ;
    int max =0;
    int date = 0 ;
    for(int i = fix ; i<day ; i++)
      {
        if(price[i]>max)
        {
          max = price[i] ;
          date = i ;
        }
      }
     System.out.print("\n") ;
    System.out.print(" max  :  "+max) ;
    System.out.print("\n") ;
    System.out.print(" at  :  "+date) ;
    System.out.print("\n") ;
    System.out.print(" the max stock differecne is  : "+(max-min));
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt() ;
    int price[] = new int [day+1];
    for(int i = 1 ; i<=day ; i++ )
      {
        System.out.print("enter ");
        price[i] =sc.nextInt();
      }
    stock(price , day);
  }
}
// MAX PROFIT LEET CODE 121 
import java.util.*;
class Main 
{

  static void stock(int array[] , int size)
  {
    int min = array[0] ;
    int buy =0 ;
   for(int i = 1 ; i<size  ; i++)
     {
      if(array[i]<min)
      {
        min = array[i] ;
        buy = i ;
      }
     }
   // System.out.print(" min   value  : "+min) ;
    System.out.print("\n") ;
  //  System.out.print("min index  :  "+buy) ;
  int max = 0;
    int sell = 0;
    for(int i = buy ; i<size ; i++)
      {
        if(array[i]>max)
        {
          max = array[i] ;
          sell = i ;
        }
      }
     // System.out.print(" max  value  : "+max) ;
    System.out.print("\n") ;
   // System.out.print("max index  :  "+sell) ;
    System.out.print("max_profit  :"+(max-min));
    
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt() ;
    int array[] = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter  : ");
        array[i]  = sc.nextInt() ;
      }
    stock(array , size);
  }
}
// miss and repeat 

import java.util.*;
class Main
{
  static void function(int array[] , int size)
  {
    // mising number is upwards 
    int repeat = 0;
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j<size ; j++ )
          {
            if(array[i] == array[j])
            {
              repeat = array[i] ;
            }
          }
      }
    System.out.print("\n");
    System.out.print(" repeated element is : "+repeat);
    System.out.print("\n");
    int counter[] =new int[size+1];
      System.out.print("\n");
    for(int i = 1 ; i<size+1 ; i++)
      {
        counter[i] = i ;
      }
    for(int i = 1 ; i<size+1 ; i++)
      {
       System.out.print(" "+counter[i]);
      }

   int s = 1 ; 
    int e = 1 ;
      System.out.print("\n");
    while(e!=(size))
      {
        if(array[s]!=array[e])
        {
          System.out.print(" " +array[s]);
          
        }
        s++ ;
        e++ ;
      }
  }
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size+1];
    for(int i =1 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i]= sc.nextInt();
        
      }
    for(int i =1 ; i<size+1 ; i++)
      {
       System.out.print(" "+array[i]);
      }
    function(array , size+1);
    
  }
}
// PROBLEM 215 KTH TERM IN THE ARRAY
import java.util.*;
class Main
{
  static void selectionsort(int array[] , int size ,int  k)
  {
    for(int i = 0 ; i<size  ; i++)
      {
        for(int j = i+1  ; j<size ; j++)
          {
            if(array[i]<array[j])
            {
              int temp = array[i];
              array[i] = array[j] ;
              array[j] = temp ;
            }
          }
      }
    for(int i =0 ; i<size  ; i++)
      {
        System.out.print(" "+array[i]);
      }
    System.out.print("\n");
    System.out.print(" kth index is : "+array[k-1]);
  }
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in);
    int size  = sc.nextInt() ;
    System.out.print("index~");
    int k = sc.nextInt() ;
    
    int array[]  = new int [size];
    for(int  i= 0; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
        
      }
    selectionsort(array , size,k);
    }
}
// Leetcode 42 doubt TRAPPING WATER 
// doubt 
// leetcode 238 error 
import java.util.*;
class Main 
{
  static void productarray(int array[]  , int size)
  {
    int product =1 ;
    int fix = 0;
    for(int i = 0 ; i<size ; i++)
      {
        product = 1 ;
        fix = i ;
        for(int j = 0 ; j<fix ; j++)
          {
            product = product*array[j] ;
          }
        for(int j = fix+1 ; j<size ; j++)
          {
            product = product*array[j];  
          }
        array[fix] = product;
      }
    System.out.print("\n");
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("  "+array[i]);
      }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[]  = new int[size];
    for(int j = 0 ; j<size ; j++)
      {
        System.out.print("enter ");
        array[j] = sc.nextInt();
        
      }
    productarray(array , size);
  }
}

// leetcode problem from miscellanous website 
// 238 product of n terms 

 int[] ans = new int[nums.length];
        int temp = 1;
        for(int i = 0; i< nums.length; i++) {
            ans[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }
// leet code 153 // min  elemtn in the array 
import java.util.*;
class Main
{
  static void selectionsort(int array[]  , int size)
      {
      for(int i = 0 ; i<size ; i++)
        {
          for(int j=i+1 ;j<size ; j++)
            {
              if(array[i]>array[j])
              {
                int temp = array[i] ;
                array[i] = array[j];
                array[j]= temp;
              }
            }
        }
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print(" "+array[i]);
        }
        System.out.print("\n");
        System.out.println("min element  "+array[0]);
      
}

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size];
    for(int j =0 ; j<size ; j++)
      {
        System.out.print(" enter ");
        array[j] = sc.nextInt();
        
      }
    selectionsort(array , size);
  }
}

// lettcode 15 3sum 
import java.util.*;
class Main
{
  static void sum(int array[] , int size)
  {
    
    for(int i = 0 ; i<size ; i++)
      {for(int j =i+1 ; j<size ; j++)
        {
          for(int k = j+1 ; k<size ; k++)
            {
              if(i!=j && j!=k && k!=i && (array[i]+array[j]+array[k])==0)
              {
                System.out.println(" "+array[i]) ;
                System.out.println(" "+array[j]) ;
                System.out.println(" "+array[k]) ;
                System.out.println("next set ");
             
              }
            }
        }
      }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] =new int [size];
    for(int j = 0 ; j<size ; j++){
      System.out.print("enter ");
      array[j] = sc.nextInt();   
    }
    sum(array , size);
  }
}
// leetcode 31 next permuation 
class Solution {
    public void nextPermutation(int[] arr) {
        int temp=0,i,min=Integer.MAX_VALUE,pivot=0,pos=0;
        for ( i=arr.length-1;i>=1;i--)
            if (arr[i]>arr[i-1])
            {
                pivot=i;break;
            }
        if (pivot>0)
        {
            for (i=pivot;i<arr.length;i++)
            {
                if (arr[i]>arr[pivot-1])
                    min=Math.min(min,arr[i]);
                if (min==arr[i])
                    pos=i;
            }
           
            swap(arr,pos,pivot-1);
        }

        int high=arr.length-1;
        while(pivot<=high){
            swap(arr,pivot,high);
            high--;pivot++;
        }
    }
    private void swap(int[] arr,int low,int high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
    }
}