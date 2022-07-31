import java.util.Scanner;
class Student{
Scanner sc=new Scanner(System.in); String rollno;
int sub1;
int sub2;
void getNumber() {
System.out.print("Enter the Roll number: "); rollno=sc.next();
}
void putNumber() {
System.out.println("Roll Number is: "+rollno);
}
void getMarks() {
System.out.print("Enter the subject 1 marks: "); sub1=sc.nextInt();
System.out.print("Enter the subject 2 marks: "); sub2=sc.nextInt();
}
void putMarks() {
System.out.println("Subject 1 mark is: "+sub1); System.out.println("Subject 2 mark is: "+sub2); System.out.println("Total Marks is: "+(sub1+sub2));
} }
interface sports{
String grade="A+";
void putGrade(); }
public class Result extends Student implements sports {
public void putGrade() {
System.out.println("Sports Grade is: "+grade);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of students: "); int n=sc.nextInt();
Result a[]=new Result[n];
for(int i=0;i<n;i++)
{
a[i]=new Result();
a[i].getNumber();
a[i].getMarks(); }

for(int i=0;i<n;i++) {
System.out.println("\nResult of Student "+(i+1)+" is:"); a[i].putNumber();
a[i].putMarks();
a[i].putGrade();
}
sc.close(); }
}