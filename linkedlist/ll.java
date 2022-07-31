import java.util.*;
class Student{ String usn;
String name; int age;
Student(String usn,String name,int age){ this.usn=usn;
this.name=name;
this.age=age; }
public String toString() {
return this.usn+"\t"+this.name+"\t"+this.age;
} }
class SortByAge implements Comparator<Student>{ public int compare(Student ob1, Student ob2) {
return ob1.age-ob2.age; 
} }
public class CollectionDemo {
public static void main(String[] args) {
Set<String> s1=new HashSet<String>(); System.out.println("SET INTERFACE"); s1.add("rvce");
s1.add("mit");
s1.add("nmamit"); System.out.println("s1 is: "+s1);

Set<String> s2=new HashSet<String>(); s2.add("nmamit");
s2.add("nitk");
s2.add("nmit");
System.out.println("s2 is: "+s2);
Set<String> s3;
s3=new HashSet<String>(s1);
s3.addAll(s2);
System.out.println("Union of s1 and s2 is: "+s3); 
s3=new HashSet<String>(s1);
s3.retainAll(s2);
System.out.println("Intersection of s1 and s2 is: "+s3); 
s3=new HashSet<String>(s1);
s3.removeAll(s2);
System.out.println("Difference between s1 and s2 is: "+s3); 
s1.remove("rvce");
System.out.println("After deletion s1 is: "+s1);
System.out.println("\nLINKED LIST CLASS"); LinkedList<String> l1=new LinkedList<>(); l1.add("b");
l1.add("a");
l1.add("e");
System.out.println("l1 is: "+l1); LinkedList<String> l2=new LinkedList<>();

l2.add("e");
l2.add("g");
l2.add("f"); System.out.println("l2 is: "+l2); LinkedList<String> l3;
//To find union of l1 and l2
l3=new LinkedList<String>(l1);
l3.addAll(l2);
System.out.println("Union of l1 and l2 is: "+l3); 
l3=new LinkedList<String>(l1);
l3.retainAll(l2);
System.out.println("Intersection of l1 and l2 is: "+l3); 
l3=new LinkedList<String>(l1);
l3.removeAll(l2);
System.out.println("Difference between l1 and l2 is: "+l3); 
l1.addLast("z");
System.out.println("After inserting z l1 is: "+l1); 
l1.addFirst("a");
System.out.println("After inserting a l1 is: "+l1); 
l1.remove("b");
System.out.println("After deletion l1 is: "+l1);
ArrayList<Student> a=new ArrayList<>(); a.add(new Student("4NM20IS088","NELSON",18)); a.add(new Student("4NM20IS073","SHASHANK",19));

} }
