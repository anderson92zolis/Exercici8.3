import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Cliente> arrayListCliente= new  ArrayList<Cliente>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
       System.out.println(
        "\n "+ "0.- Sortir de l'aplicació."
       +"\n "+ "1.- Crear client/a."
       +"\n "+ "2.- Eliminar client/a."
       +"\n "+ "3.- Crear compta d'un client/a."
       +"\n "+ "4.- Ingressar euros en un compte d'un client/a."
       +"\n "+ "5.- Retirar euros en un compte d'un client/a.");
       int  option = returnInteger("choose a choice of the program; ");

       while (option!=0){
        if(option==1){
            ;
            }
        }



    }

    public static void verificaCliente(String nombre, String apellido){
        ;}

    public static void addCliente(String nom, String apellido){
        Cliente nuevoCliente= new Cliente(nom, apellido);
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
  \*crea  una cuienta estatica y verificar el cliente a travez del apellido y nombre. *\