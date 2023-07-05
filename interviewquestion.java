// question -1 // max and min in min swaps

import java.util.*;
class Main
{
  static void maxandmin(int array[] , int size)
  {
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j <size ; j++)
          {
            if(array[i]>array[j])
            {
              int temp = array[i] ;
              array[i]= array[j] ;
              array[j]= temp ;
            }
          }
      }
    System.out.println("maxx:  "+array[size-1]);
     System.out.println("minn:  "+array[0]);
    
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[]  = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" enter : ");
        array[i] = sc.nextInt();
        
      }
    maxandmin(array, size );
  }
}

// reverse a array question 2 
import java.util.*;
class Main
{
  static void reverse(int array[] , int size)
  {
    for(int i = size-1 ; i>=0 ; i--)
      {
        System.out.print("  "+array[i]);
      }
    
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[]  = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print(" enter : ");
        array[i] = sc.nextInt();
        
      }
    reverse(array , size);
  }
}


// leetcode problem number -53 maximum subarray // problem # not getting after removing the numbers

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

// leetcode  question 217 
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
// CHOCOLATE DISTRIBUTIONN PROBLEMM 
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

// roatate a soretd array leetcode 33 
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

// LEETCODE 121 MAXX PROFIT 
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

// interview bit question 1 // incomplete 
import java.util.*;
class Main 
{
  static void missandrepeat(int array[] , int size)
  {
    int count[] =new int [size];
    int min = array[0] ;
    for(int i = 0 ; i<size  ; i++)
      {
        if(array[i]<min)
        {
          min = array[i] ;
        }
      }
    System.out.print("min is  :"+min);
     System.out.print("\n");
    int max = array[0] ;
    
    for(int i = 0 ; i<size  ; i++)
      {
        if(array[i]>max)
        {
          max = array[i] ;
        }
      }
     System.out.print("max  :"+max);
     System.out.print("\n");
    for(int i = min ; i<=max ; i++ )
      {
        count[i] = i ;
        
      }
     for(int i = min ; i<=max+1 ; i++ )
      {
        System.out.print(" "+count[i]) ;
        
      }
    
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt() ;
    int array[] =new int[size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt();
        
      }
    missandrepeat(array, size);
  }
}
// code 20 miss number and repeated numebr // error in ther missing part 

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
// KTH TERM IN THE ARRAY 
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
// LEETCODE QUESTION 42 TRAPPIGN WATER 
// doubt 

// leet code 238 product // error printing the grabage values 

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

// leetcode 153 
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
        System.out.print("min element  "+array[0]);
      
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
// geek for geeks question pair of sum in a rotated array
import java.util.*;
class Main
{
  static void sum(int array[] , int size , int target)
  {
    int sum = 0 ;
   // int sum[] = new int[size];
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j<size ; j++)
          {
             sum =array[i]+array[j] ;
            if(sum==target)
            {
              System.out.print("Yes sum is possible  "+target);
            }
           
          }
      }
    
  }
  public static void main(String[] agrs)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter tagret");
    int target = sc.nextInt() ;
     System.out.print("enter size ");
    int size = sc.nextInt();
    int array[] = new int [size];
    
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt();
      }
    sum(array ,size , target);
  }
}
// leetcode 15 3sum 
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
// leetocde next permuation 
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
// leet code 31 alternative 
class prob31
{
public void nextPermutation(int[] nums) {
        
        
        int t=0,min=Integer.MAX_VALUE,pivot=0,pos=0;
        int i;
        for(i=nums.length-1;i>=1;i--)
        {
            if(nums[i]>nums[i-1])
            {
                pivot=i;
                break;
            }
        }
            if(pivot>0) //if there is decreasing element before pivot
            {
                
                for(i=pivot;i<nums.length;i++)
                {
                    if(nums[i]>nums[pivot-1])
                    {
                        min=Math.min(min,nums[i]);
                    }
                    if(min==nums[i])
                    {
                        pos=i;
                    }
                }
                swap(nums,pos,pivot-1);

            }


            
        

        //reverse from pivot to end

        int h=nums.length-1;
        while(pivot<=h)
        {
            swap(nums,pivot,h);
            h--;
            pivot++;
        }


    }

    void swap(int ar[],int l,int h)
    {
        int t=ar[l];
        ar[l]=ar[h];
        ar[h]=t;
    }

    public static void main(String args[])
    {
      int ar[]={1,1,5};
      prob31 ob=new prob31();
      ob.nextPermutation(ar);

      for(int i=0;i<ar.length;i++)
      {
         System.out.print(ar[i]+" ");
      }
    }
}