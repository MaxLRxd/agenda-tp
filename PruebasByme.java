import java.util.*;
public class PruebasByme{
   String[] telefono = new String[5];
   Scanner key = new Scanner(System.in);
    public void PruebasByme(){
        for(int i = 0; i < 5; i++){
            System.out.println("introduce el number :v");
            telefono[i] = key.nextLine();
            System.out.println("-----------------------------------------------------");
            if(telefono[i] == "EXIT"){
                break;
            }
        }

        System.out.println(elementoVacio());
        
    }
    public int elementoVacio(){
        for(int i = 0; i < 5 ; i++){
            if(telefono[i] != null && telefono[i].length() == 0){
                    return i;
            }
        }
        return -1;
    }
}