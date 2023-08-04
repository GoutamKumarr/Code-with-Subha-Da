import java.util.*;
public class arrays{
   /* 
        int [] marks =new int[3];
        marks[0]=98;
        marks[1]=97;
        marks[2]=99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


    }*/

//****************************************************************************
    

//print array
/*public static void main (String[]args){
    int size,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter the size of array");
    size=sc.nextInt();
    int a[]=new int [size];
    for(i=0;i<size;i++){
        a[i]=sc.nextInt();

    }
    System.out.println("Print array element");
    for(i=0;i<size;i++){
        System.out.println(a[i]+" ");
    }

    }*/


//search element in array


/*public static void main(String[]args){
    int Count=0,Size,n,i ;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the arrray");
    Size=sc.nextInt();
    int a[]=new int[Size];
    System.out.println("enter the array element");
    for( i=0;i<Size;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Print array");
    for( i=0;i<Size;i++){
        System.out.println(a[i]+" ");
    }
    System.out.println("enter search element");
    n=sc.nextInt();
    for(i=0;i<Size;i++){
    if(n==a[i]){
        Count++;
        }
    }
    if(Count>0)
        System.out.println("Item found" +" " +Count+" "+"times");
    
    else
        System.out.println("Item not found");
    
    }*/



    //average of array

/*public static void main(String[]args){
    int newarray[]={1,2,3,4,5};
    int sum=0;
    for(int num:newarray){
        sum=sum+num;  
    }
    int average=sum/newarray.length;
    System.out.println("the average of array" +" "+ average);
}*/



   //accending array
    /*public static void main (String[]args){
    int a[]=new int[5];
    int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter element");
    for(int i=0;i<5;i++){
        a[i]=sc.nextInt();

    }
    for(int i=0;i<5;i++){
    for(int j=i+1;j<5;j++){
        if(a[i]<a[j]){      //for dencending a[i]<a[j]*******************
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
for(int i=0;i<5;i++){
    System.out.println(a[i]+" ");
    }
    }*/



    //largest element
public static void main (String[]args){
    int a[]=new int[5]; 
    int max;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter element");
    for(int i=0;i<5;i++){
        a[i]=sc.nextInt();
    }
    max=a[0];
    for(int i=1;i<=4;i++){
        if(a[i]>max){   // for smallest value a[i]<max
            max=a[i];
            
        }
    
    }
    System.out.println("array max value");
    System.out.println(max+" ");
    
    }
    
}








    
















     
    


