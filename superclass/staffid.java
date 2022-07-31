import java.util.Scanner; abstract class Staff{
    String StaffId; String Name; long Phone; int Salary;
    Staff(String StaffId,String Name,long Phone,int Salary) {
    this.StaffId=StaffId; this.Name=Name; this.Phone=Phone; this.Salary=Salary;
    }
    abstract void display(); }
    class Teaching extends Staff{ String domain;
    String publications;
    Teaching(String StaffId,String Name,long Phone,int Salary,String domain,String publications){
    super(StaffId,Name,Phone,Salary); this.domain=domain; this.publications=publications;
    }
    void display() {
    System.out.println(StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary+"\ t"+domain+"\t"+publications);
    } }
    class Technical extends Staff{ String Skills;
    Technical(String StaffId,String Name,long Phone,int Salary,String Skills){ super(StaffId,Name,Phone,Salary);
    this.Skills=Skills;
    }
    void display() {
    System.out.println(StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary+"\ }
    t"+Skills); }
    class Contract extends Staff{ double period;
    Contract(String StaffId,String Name,long Phone,int Salary,double period){ super(StaffId,Name,Phone,Salary);
    this.period=period;
    }
    void display() {
    
    System.out.println(StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary+"\ }
    }
    public class StaffDemo {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,ch;
    System.out.println("1.Teaching 2.Technical 3.Contract 4.Exit"); while(true) {
    t"+period);
    (i+1));
    System.out.print("Enter your choice: ");
    ch=sc.nextInt();
    switch(ch) {
    case 1:System.out.print("Enter number of Teaching Staff: "); n=sc.nextInt();
    Teaching s1[]=new Teaching[n]; for(int i=0;i<n;i++) {
    System.out.println("\nEnter Details of Teaching Staff "+
    System.out.print("Enter StaffId: "); String StaffId=sc.next(); System.out.print("Enter Name: "); String Name=sc.next(); System.out.print("Enter Phone: ");
    long Phone=sc.nextLong(); System.out.print("Enter salary: ");
    int Salary=sc.nextInt(); System.out.print("Enter domain: "); String domain=sc.next(); System.out.print("Enter publications: "); String publications=sc.next(); s1[i]=new
    Teaching(StaffId,Name,Phone,Salary,domain,publications); }
    System.out.println("\n*********Teaching Staff Details*********"); System.out.println("StaffId\tName\tPhone\t\tsalary\tdomain\
    tpublications");
    }
    (i+1));
    break;
    case 2:System.out.print("Enter number of Technical Staff: "); n=sc.nextInt();
    Technical s2[]=new Technical[n];
    for(int i=0;i<n;i++) {
    System.out.println("\nEnter Details of Technical Staff "+
    System.out.print("Enter StaffId: "); String StaffId=sc.next();
    for(int i=0;i<n;i++) { s1[i].display();
    
    (i+1));
    System.out.print("Enter Name: "); String Name=sc.next(); System.out.print("Enter Phone: "); long Phone=sc.nextLong(); System.out.print("Enter salary: "); int Salary=sc.nextInt(); System.out.print("Enter Skills: "); String skills=sc.next();
    s2[i]=new Technical(StaffId,Name,Phone,Salary,skills); }
    System.out.println("\n*********Technical Staff Details*********"); System.out.println("StaffId\tName\tPhone\t\tsalary\tskills"); for(int i=0;i<n;i++) {
    s2[i].display(); }
    break;
    case 3:System.out.print("Enter number of Contract Staff: "); n=sc.nextInt();
    Contract s3[]=new Contract[n];
    for(int i=0;i<n;i++) {
    System.out.println("\nEnter Details of Contract Staff "+
    System.out.print("Enter StaffId: ");
    String StaffId=sc.next();
    System.out.print("Enter Name: ");
    String Name=sc.next();
    System.out.print("Enter Phone: ");
    long Phone=sc.nextLong();
    System.out.print("Enter salary: ");
    int Salary=sc.nextInt();
    System.out.print("Enter period: ");
    double period=sc.nextDouble();
    s3[i]=new Contract(StaffId,Name,Phone,Salary,period);
    }
    System.out.println("\n*********contract Staff Details*********"); System.out.println("StaffId\tName\tPhone\t\tsalary\tPeriod"); for(int i=0;i<n;i++) {
    s3[i].display(); }
    break;
    case 4:sc.close();
    System.exit(0); }
    } }
    }