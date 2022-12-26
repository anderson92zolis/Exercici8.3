import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Cliente> arrayListCliente= new  ArrayList<Cliente>();

    public static void main(String[] args) {
        menu();
    }
 
    public static void menu(){
        int  option=1;
        while (option!=0) {
            
            option = returnInteger(
            "\n " + "0.- Sortir de l'aplicació."
            +"\n "+ "1.- Crear client/a."
            +"\n "+ "2.- Eliminar client/a."
            +"\n "+ "3.- Crear compta d'un client/a."
            +"\n "+ "4.- Ingressar euros en un compte d'un client/a."
            +"\n "+ "5.- Retirar euros en un compte d'un client/a."
            +"\n\t "+ "choose a choice of the program: "+"\n");
            String name= returnString("Write a Name: ");
            String surname= returnString("Write a Surname: ");
            switch(option){
                case 1:
                    addCliente(name,surname);
                    break;
                case 2:
                    removeCliente(name, surname);
                    break;
                case 3:
                    crearCuenta(name, surname);
                    break;
                case 4:
                    ingresarEurosCuenta(name, surname);
                    break;
                case 5:
                    retirarEurosCuenta(name,surname);
                    break;
            }
        System.out.println(arrayListCliente);
        //System.out.println(verificaCliente(name,surname));
        //option = returnInteger("choose a choice of the program: ");
        }
        System.out.println("Exit the application.!  Thanks !");
    }

    public static void addCliente(String nom, String apellido){
        if (verificaCliente(nom,apellido)==-1){
            Cliente nuevoCliente= new Cliente(nom, apellido);
            arrayListCliente.add(nuevoCliente);
            System.out.println("The Client is added: "+nom+" "+apellido);
        } else{
            System.out.println("The Client is already register: "+nom+" "+apellido);
        }
        
    }

    public static void removeCliente(String nom, String apellido){
        if (verificaCliente(nom,apellido) !=-1){
            arrayListCliente.remove(verificaCliente(nom,apellido));
            System.out.println("The Client is being removed: "+nom+" "+apellido);
        } else{
            System.out.println("The Client doesn't exits: "+nom+" "+apellido);
        }
        
    }

    public static void crearCuenta(String nom, String apellido){
        if (verificaCliente(nom,apellido) !=-1){
            int cuenta = returnInteger("Write the number account: ");
            if (arrayListCliente.get(verificaCliente(nom,apellido)).verificaCuenta(cuenta)==-1){
                Cuentas añadirCuentas= new Cuentas();
                arrayListCliente.get(verificaCliente(nom,apellido)).setAñadeNumeroCuenta(añadirCuentas);
                System.out.println("The Count is being added: "+arrayListCliente.get(verificaCliente(nom,apellido)).toString());
            } else {
                System.out.println("The Count is already registered: "+arrayListCliente.get(verificaCliente(nom,apellido)).toString());;
            }
        } else{
            System.out.println("The Client doesn't exits: "+nom+" "+apellido);
        } 
    }

    public static void ingresarEurosCuenta(String nom, String apellido){
        if (verificaCliente(nom,apellido) !=-1){
            int cuenta = returnInteger("Write the number account: ");
            int indexOfCuenta= arrayListCliente.get(verificaCliente(nom,apellido)).verificaCuenta(cuenta);
            if (indexOfCuenta !=-1){
                int dineroIngresar = returnInteger("Enter the amount of money to deposit: ");
                arrayListCliente.get(verificaCliente(nom,apellido)).getNumeroCuentas().get(indexOfCuenta).ingresar(dineroIngresar);
                System.out.println("The money is being deposited: "+arrayListCliente.get(verificaCliente(nom,apellido)).toString());
            } else {
                System.out.println("The Count doen't exits: "+arrayListCliente.get(verificaCliente(nom,apellido)).toString());;
            }
        } else{
            System.out.println("The Client doesn't exits: "+nom+" "+apellido);
        } 
    }

    public static void retirarEurosCuenta(String nom, String apellido){
        if (verificaCliente(nom,apellido) !=-1){
            int cuenta = returnInteger("Write the number account: ");
            int indexOfCuenta= arrayListCliente.get(verificaCliente(nom,apellido)).verificaCuenta(cuenta);
            if (indexOfCuenta !=-1){
                int retirarDinero = returnInteger("Enter the amount of money to withdrawals: ");
                arrayListCliente.get(verificaCliente(nom,apellido)).getNumeroCuentas().get(indexOfCuenta).retirar(retirarDinero);
                System.out.println("The money is being deposited: "+arrayListCliente.get(verificaCliente(nom,apellido)).toString());
            } else {
                System.out.println("The Count doen't exits: "+arrayListCliente.get(verificaCliente(nom,apellido)).toString());;
            }
        } else{
            System.out.println("The Client doesn't exits: "+nom+" "+apellido);
        } 
    } 

    public static int verificaCliente(String nombre, String apellido){
        int indexDelNomInArrayL= 0;
        int BuscarindexDelNomInArrayL=-1;
        while (indexDelNomInArrayL < arrayListCliente.size() && BuscarindexDelNomInArrayL==-1){
            if (arrayListCliente.get(indexDelNomInArrayL).getNombre().equalsIgnoreCase(nombre) && arrayListCliente.get(indexDelNomInArrayL).getApellido().equalsIgnoreCase(apellido)){
                BuscarindexDelNomInArrayL=indexDelNomInArrayL;
            }
        indexDelNomInArrayL++;
        }
        return  BuscarindexDelNomInArrayL;
    }

    public static int returnInteger(String msm){
        Scanner myObj= new Scanner(System.in);
        System.out.println(msm);
        int preguntaNumero= myObj.nextInt();
        return preguntaNumero;
    }

    public static String returnString(String msm){
        Scanner myObj= new Scanner(System.in);
        System.out.println(msm);
        String preguntaString= myObj.nextLine();
        return preguntaString;
    }
}
  //*crea  una cuienta estatica y verificar el cliente a travez del apellido y nombre. *\