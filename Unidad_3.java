import javax.swing.JOptionPane;

public class Unidad_3{
    public static void main(String[] args) {
        int opcion; 
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(
        "Menú Principal\n\n"
        +"1. Signos de Zodiaco\n"
        +"2. Calcular edad de humano en años de perro\n"
        +"3. Calcular número de días vividos\n"
        +"4. Numerología\n" 
        +"5. Salir"));
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
            diasV();
        }
        if(opcion==4)
        {
            numero();
        }       
        }while(opcion<6);
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
        if(mes.equalsIgnoreCase("Febrero") && dia>=21 && dia<=31 || mes.equalsIgnoreCase("Febrero") && dia<=19)
        {
            JOptionPane.showMessageDialog(null, "Su signo es: ACUARIO ");
        }
        if(mes.equalsIgnoreCase("Enero") && dia>=21 && dia<=31 || mes.equalsIgnoreCase("Febrero") && dia<=19)
        {
            JOptionPane.showMessageDialog(null, "Su signo es: ACUARIO ");
        }
        if(mes.equalsIgnoreCase("Enero") && dia>=21 && dia<=31 || mes.equalsIgnoreCase("Febrero") && dia<=19)
        {
            JOptionPane.showMessageDialog(null, "Su signo es: ACUARIO ");
        }
    }
    public static void diasV()
    {


    }
    public static void eperro()
    {
        double edad, edadper; 
        edad=Double.parseDouble(JOptionPane.showInputDialog("Digite su edad"));
        edadper=edad/7;
        JOptionPane.showMessageDialog(null, "Usted tiene "+edadper+" años en edad de perro");
    }
    public static void numero()
    {

    }
}
