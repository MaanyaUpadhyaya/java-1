public class Bank {
    int balance=10000;
    synchronized void withdraw(int amount)throws Exception { if(amount>balance) {
     "+balance);
    System.out.println("Waiting for Deposite...Current balance is: wait();
    }
    balance-=amount;
    System.out.println(amount+" withdrawn successfully...Current balance
    is: "+balance); }
    synchronized void deposite(int amount)throws Exception{ balance+=amount;
    System.out.println(amount+" deposited successfully...Current balance is: "+balance);
    notify();
    } }
    }
    public static void main(String[] args){ Bank ob=new Bank();
    new Thread() {
    public void run() {
    } }.start();
    } }.start();
    try {
    ob.withdraw(12000);
    }
    catch(Exception e) {
    System.out.println(e); }
    new Thread() {
    public void run() {
    try {
    ob.deposite(15000);
    }
    catch(Exception e) {
    System.out.println(e); }
    