import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("please insert the number");
    int x = sc.nextInt();
   int store=x;
   int y;
   char c;
   String str="";
   if(x==0){
     y=x+48;
     c=(char)y;
     System.out.println("string is "+c);
     System. exit(0);
     
     }
   if(store<0){
       x=-1*x;}
     while(x!=0){
       y=x%10;
       y+=48;
       c=(char)y;
       str+=c;
       x=x/10;
     }
    
     if(store<0){
         str+='-';}
     
    String reversed="";
    
     
     for(int j=str.length()-1;j>=0;j--){
      
       reversed+=str.charAt(j);
     
     }
     System.out.println("string is "+reversed);
   
      }
 }