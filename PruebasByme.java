import java.util.*;
public class PruebasByme{
   String[] telefono = new String[5];
   Scanner key = new Scanner(System.in);
    public void PruebasByme(){
        for(int i = 0; i < 5; i++){
            System.out.println("introduce el number :v");
            telefono[i] = key.nextLine();
        }

        elementoVacio();
        
    }
    public int elementoVacio(){
        if(telefono[0] == null){
            return 0;
        }
        else{
            for(int i = 1; i < telefono.length ; i++){
                if(telefono[i] != null && telefono[i].length() == 0){
                    return i;
                }
            }
        }
        return -1;
    }
}