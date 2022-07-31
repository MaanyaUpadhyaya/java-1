package myPackage1;
 
public class MyClass1 {
protected static void print(String s) {
System.out.println(s); }
public static void printf(String s) {
System.out.println(s); }
}
package myPackage2;
import myPackage1.MyClass1;
public class MyClass2 { //accessing public method public static void main(String[] args) {
MyClass1.printf("NMAMIT"); MyClass3 ob=new MyClass3(); ob.show();
} }
class MyClass3 extends MyClass1{ //accessing protected method void show() {
MyClass1.print("NITTE"); }
}