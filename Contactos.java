import java.util.*;
import java.lang.String;

public class Contactos{
   private String nombre;
   private String localidad;
   private String direccion;
   String[] telefono = new String[5];
   Scanner sc = new Scanner(System.in);
    
   public void listarTelefonos(){
    
    }
   
    public void modificarTelefonos(){
    
    }
    
    public void eliminarTelefono(){
    
    }
    
    public void setDireccion(String d){
        this.direccion = d.trim().toUpperCase();
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setLocalidad(String l){
        this.localidad = l.trim().toUpperCase();
    }
    
    public String getLocalidad(){
        return localidad;
    }
    
    public void setNombre(String n){
        this.nombre = n.trim().toUpperCase();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int elementoVacio(){
        for(int i = 0; i < 5 ; i++){
            if(telefono[i] != null && telefono[i].length() == 0){
                    return i;
            }
        }
        return -1;
    }
    
    public boolean validarCaracteristica(String c) {
        if (c.startsWith("0")) {
            if (c.length() >= 3 && c.length() <= 5) {
                for (int i = 0; i < c.length(); i++) {
                    if (!Character.isDigit(c.charAt(i))) {
                        return false;
                    }
                }
                    return true;
            }
        }
        return false; 
    }
    
    public boolean validarNumero(int n){
        String num = String.valueOf(n);
        if(num.startsWith("0")){
            if(num.length() < 5 || num.length() > 7){
                for(int i = 0; i < num.length(); i++){
                    if(!Character.isDigit(num.charAt(i))){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

     public void agregarTelefono(){
     if(elementoVacio() == -1){
            System.out.println("No existen más lugares para agregar números telefónicos");
        }else{
            System.out.println("Ingrese caracterstica telefónica");
            String caracteristica = sc.nextLine();
            do{
                System.out.println("¡Caracteristica no valida!");
                caracteristica = sc.nextLine();
            }while(!validarCaracteristica(caracteristica));
            System.out.println("Ingrese numero telefonico");
            int numero = sc.nextInt();
            do{
                System.out.println("¡numero no valido!");
                numero = sc.nextInt();
            }while(!validarNumero(numero));
            telefono[elementoVacio()] = caracteristica + "-" + numero;
        }
    }
    
    public void agregarTelefono(String caracteristica, int numero){
        if(elementoVacio() == -1){
            System.out.println("No existen más lugares para agregar números telefónicos");
        }else{
            telefono[elementoVacio()] = caracteristica + "-" + numero;
        }
    }
    
    public Contactos(String nombre, String localidad, String direccion, int caracteristica, String numero){
        setNombre(nombre);
        nombre = getNombre();
        setLocalidad(localidad);
        localidad = getLocalidad();
        setDireccion(direccion);
        direccion = getDireccion();
    }
}
