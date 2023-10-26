class bankAcc{
    String name ;
    final int minBalance = 2000;
    int balance = 0 ;
    String accNum ;
    public bankAcc(int balance){
        this.balance = balance;
    }
    private checkMinBalance(int amount){
        return balance - amount<= minBalance ? false :  true;
    }
    public int getBalance(){
        retrun balance;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withDraw(int amount){
        if(checkMinBalance(amount))
            balance-=amount;
        else
            System.out.println("Transaction failed");
    }
}
public class bank{
    public static void main(String args[]){
        bankAcc ob = new bankAcc();
    }
}