// Create a Cuenta class
public class Cuentas{
    private int balance;  // Create a class attribute
    private int numeroCuenta;
  
    // Create a class constructor for the Cuenta class
    public Cuentas(int balance, int numeroCuenta) {
        this.balance=balance;  // Set the initial value for the class attribute balance, numeroCuenta
        this.numeroCuenta=numeroCuenta;
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
        balance-=cantidad;
    }

    public String toString(){
        return "this is the Balance/Saldo: " + balance + " para el numero de cuenta: "+ numeroCuenta;
    }
  
}
  
  