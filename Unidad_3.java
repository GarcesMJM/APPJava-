import javax.swing.JOptionPane;

public class Unidad_3{
    public static void main(String[] args) {
        szodiaco();
        eperro();
        numero();
        int opcion; 
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(
        "Menú Principal\n\n"
        +"1. Signos de Zodiaco\n"
        +"2. Calcular edad de humano en edad de perro\n"
        +"3. Numerología\n" 
        +"4. Salir"));
        if(opcion==1)
        {
            szodiaco();
        }
        if(opcion==2)
        {
            eperro();
        }
        if(opcion==3)
        {
            numero();
        } 
        if(opcion>=5)  
        {
            JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");
        } 
        
        }while(opcion<5);
      
      
        
    }
    public static void szodiaco()
    {

    }
    public static void eperro()
    {

    }
    public static void numero()
    {

    }
}
