// Create a Cuenta class
public class Cuentas{
    private int balance;  // Create a class attribute
    private int numeroCuenta;
    private static int cuentaSiguiente=1000;
  
    // Create a class constructor for the Cuenta class
    public Cuentas() {
        balance=0;  // Set the initial value for the class attribute balance, numeroCuenta
        numeroCuenta=cuentaSiguiente;
        cuentaSiguiente++;
    }

    // getter 

    public int getBalance(){
        return balance;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    //setter

    public void setBalance(int balance){
        this.balance=balance;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    //Methods

    public void ingresar(int cantidad){
        balance+=cantidad;
    }

    public void retirar(int cantidad){
        if (balance>cantidad){
            balance-=cantidad;
            System.out.println("The new BALANCE IS: "+ balance);
        } else {
            System.out.println("The amount of money to withdrawals is suporior to balance: "+ balance);
        }
    }

    public String toString(){
        return "this is the Balance/Saldo: " + balance + " para el numero de cuenta: "+ numeroCuenta;
    }
  
}
  
  