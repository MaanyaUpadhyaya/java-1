import java.io.File;
import java.io.FilenameFilter; import java.util.Scanner;
public class FileDemo implements FilenameFilter{ String pattern;
FileDemo(String pattern){ this.pattern=pattern;
}
public boolean accept(File dir, String name) { return name.endsWith(pattern);
}
public static void main(String[] args) { Scanner sc=new Scanner(System.in); System.out.print("Enter the filename: "); String file=sc.next();
File f1=new File("C:\\Users\\NELSON\\Desktop\\JAVA",file); System.out.println("File name is: "+f1.getName()); System.out.println("File path is: "+f1.getPath());
int i=f1.getName().lastIndexOf(".");
System.out.println("File type is: "+f1.getName().substring(i));
System.out.println(f1.exists()?"Exists":"Does not exist"); System.out.println(f1.canRead()?"Readable":"Not Readable");
System.out.println(f1.canWrite()?"Writable":"Not writable");
}
}
System.out.println("File sie is: "+f1.length()+" Bytes"); System.out.println("\nPrinting .pdf files...."); FilenameFilter f2=new FileDemo(".pdf");
f1=new File("C:\\Users\\NELSON\\Desktop\\JAVA"); String s[]=f1.list(f2);
for(int j=0;j<s.length;j++) System.out.println(s[j]);