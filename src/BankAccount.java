import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }
// Challenge 2: Make BankAccount Class Thread Safe using the synchronized keyword
// There are two ways to do this: 1. Make method as synchronized or by making particular section of the method as synchronized

//    public synchronized void deposit(double amount){
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount){
//        balance -= amount;
//    }
//    public void deposit(double amount){
//        synchronized (this){
//            balance += amount;
//        }
//    }

//    public void withdraw(double amount){
//        synchronized (this){
//            balance -= amount;
//        }
//    }

// Challenge 3: Make BankAccount Class Thread Safe using the synchronized keyword
// No changes required as both the below methods are only reading the values not updating or changing the values

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account Number = "+accountNumber);
    }

    // Challenge 4: Make BankAccount class Thread Safe using the ReentrantLock instead of synchronized Keyword
//    public void deposit(double amount){
//        lock.lock();
//        try{
//            balance += amount;
//        }
//        finally {
//            lock.unlock();
//        }
//    }
//
//    public void withdraw(double amount){
//        lock.lock();
//        try{
//            balance -= amount;
//        }finally {
//            lock.unlock();
//        }
//    }
    // Challenge 5: Use tryLock with a timeout value
    // Challenge 6: Make status variable thread safe
        public void deposit(double amount){
        boolean status = false;

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance += amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }
            else {
                System.out.println("Could not get the lock");
            }
        }catch (InterruptedException e){

        }
        System.out.println("Transaction status = "+ status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Transaction Status = "+ status);
    }
}
