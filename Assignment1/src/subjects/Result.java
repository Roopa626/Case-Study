package subjects;
import java.util.Scanner;
class Result
{
public static void main(String[]args){
int s1,s2,s3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of s1:");
s1=sc.nextInt();
System.out.println("Enter marks of s2:");
s2=sc.nextInt();
System.out.println("Enter marks of s3:");
s3=sc.nextInt();
if((s1>60 && s1<=100)&&(s2>60 && s2<=100)&&(s3>60 && s3<=100));
{
System.out.println("Passed");
}
if((s1<60 && s1<=100)&&(s2<60 && s2<=100)&&(s3<60 && s3<=100));
{
System.out.println("Failed");
if(s1>60 && s1<=100)&&(s2>60 && s2<=100)&&(s3<60 && s3<=100));
{
System.out.println("Promoted");
}
}
}
}







