class bankAcc{
    String name ;
    final int minBalance = 2000;
    int balance = 0 ;
    String accNum;
    public bankAcc(String accnum,String name){
        this.name = name;
        this.accNum = accnum;
    }
    /**
     * returns the balance
     * @param amount
     * @return
     */
    private boolean checkMinBalance(int amount){
        return balance - amount <= minBalance ? false :  true;
    }
    public int getBalance(){
        return balance;
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
        bankAcc ob = new bankAcc("Bdvl200026","Phani");
        ob.deposit(100000000);
        System.out.println(ob.getBalance());
    }
}