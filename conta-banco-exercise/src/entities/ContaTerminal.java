package entities;

public class ContaTerminal {

    private Integer account;
    private String agency;
    private String holder;
    private Double balance;


    public ContaTerminal(Integer account, String agency, String holder, Double balance) {
        this.account = account;
        this.agency = agency;
        this.holder = holder;
        this.balance = balance;
    }

    public ContaTerminal() {
    }

    public Integer getAccount() {
        return account;
    }

    public String getAgency() {
        return agency;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Olá " + holder +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agency +
                ", conta " + account +
                " e seu saldo de " + balance +
                " já está disponível para saque.";
    }
}
