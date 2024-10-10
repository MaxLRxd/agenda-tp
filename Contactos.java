import java.util.*;
import java.lang.String;

public class Contactos{
   private String nombre;
   private String localidad;
   private String direccion;
   String[] telefono = new String[5];
   Scanner sc = new Scanner(System.in);
   public void Contactos(){
        /*setNombre(nombre);
        setLocalidad(localidad);
        setDireccion(direccion);*/
        agregarTelefono();
  }
    
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
    
   public int elementoVacio() {
        for (int i = 0; i < 5; i++) {
            if (telefono[i] == null || telefono[i].isEmpty()) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean validarCaracteristica(String caracteristica) {
        if (caracteristica.startsWith("0")) {
            if (caracteristica.length() >= 3 && caracteristica.length() <= 5) {
                for (int i = 0; i < caracteristica.length(); i++) {
                    if (!Character.isDigit(caracteristica.charAt(i))) {
                        return false;
                    }
                }
                    return true;
            }
        }
        return false; 
    }
    
    public boolean validarNumero(int numero){
            if(String.valueOf(numero).length()>= 5 && String.valueOf(numero).length() <= 7 ){
                return true;
            }
            return false;
    }
    
    public void agregarTelefono(String caracteristica, int numero){
        if(caracteristica.length() > 0){
            if(String.valueOf(numero).length() > 0){
                
            }
        }
    }
    
     public void agregarTelefono(){
            System.out.println("Ingrese caracterstica telefónica");
            String caracteristica = sc.nextLine();
            if(!validarCaracteristica(caracteristica)){
                do{
                    System.out.println("¡Caracteristica no valida!");
                    caracteristica = sc.nextLine();
                }while(!validarCaracteristica(caracteristica));
            }
            System.out.println("Ingrese numero telefonico");
            int numero = sc.nextInt();
            if(!validarNumero(numero)){
                do{
                    System.out.println("¡numero no valido!");
                    numero = sc.nextInt();
                }while(!validarNumero(numero));
            }
            for (int i = 0; i < 5; i++) {
                if (telefono[i] == null || telefono[i].isEmpty()) {
                    telefono[i] = caracteristica+"-"+numero;
                    break;
                }
            }
    }
}
