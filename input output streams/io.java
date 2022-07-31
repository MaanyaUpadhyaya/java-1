import java.io.*;
public class ByteStream {
public static void main(String[] args)throws IOException {
FileInputStream f1=new FileInputStream("C:\\Users\\NELOSN\\ Desktop\\input.txt");
FileOutputStream f2=new FileOutputStream("C:\\Users\\NELSON\\ Desktop\\output.txt");
int c=f1.read(); while(c!=-1)
{
} }
input.txt");
FileReader f1=new FileReader("C:\\Users\\NELSON\\Desktop\\
FileWriter f2=new FileWriter("C:\\Users\\NELSON\\Desktop\\xyz.txt"); 
int c=f1.read();
while(c!=-1)
{
f2.write(c);
c=f1.read(); }
System.out.println("Contents copied sucessfully..."); 
f1.close();
f2.close();
} }