import javax.swing.JOptionPane;

public class Unidad_3{
    public static void main(String[] args) {
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
        }while(opcion<5);
        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");   
    }
    public static void szodiaco()
    {
        String mes; 
        int dia;
        mes=JOptionPane.showInputDialog("Digite el mes de su nacimiento");
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el día de su nacimiento"));
        if(mes.equalsIgnoreCase("Enero") && dia>=21 && dia<=31 || mes.equalsIgnoreCase("Febrero") && dia<=19)
        {
            JOptionPane.showMessageDialog(null, "Su signo es: ACUARIO ");
        }
    }
    
    public static void eperro()
    {
        
    }
    public static void numero()
    {

    }
}
