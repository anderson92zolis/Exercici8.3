import java.util.ArrayList;

// Create a Cliente class
public class Cliente {
    private String nombre;  // Create a class attribute
    private String apellido;
    private ArrayList<Cuentas> arrayListNumerosDeCuentas;
  
    // Create a class constructor for the Cuenta class
    public Cliente(String nombre, String apellido) {
        this.nombre=nombre;  // Set the initial value for the class attribute nombre, apellido
        this.apellido=apellido;
        arrayListNumerosDeCuentas= new ArrayList<Cuentas>();
    }

    // getter 

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public ArrayList<Cuentas> getNumeroCuentas(){
        return arrayListNumerosDeCuentas;
    }

    //setter

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setAñadeNumeroCuenta(Cuentas añadirCuenta){
        arrayListNumerosDeCuentas.add(añadirCuenta);
    }

    //Methods

    public int verificaCuenta(int cuenta){
        int indexCuenta=0;
        int encuentraIndexCuenta= -1;
        while (indexCuenta < arrayListNumerosDeCuentas.size() && encuentraIndexCuenta ==-1 ){
            if (arrayListNumerosDeCuentas.get(indexCuenta).getNumeroCuenta() == cuenta){
                encuentraIndexCuenta=indexCuenta;
            };
            indexCuenta++;
        };
        return encuentraIndexCuenta;
    }


    public String toString(){
        return "this is the Names: " + nombre + " "+ apellido + " with numbers accouts "+ arrayListNumerosDeCuentas;
    }
  
}
  
  