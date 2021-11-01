import javax.swing.JOptionPane;

public class Unidad_3 {
    public static void main(String[] args) {
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(
        " _______________________________________________________"
        +"|  Menú Principal\n\n                                 |"
        +"|  1. Signos de Zodiaco\n                             |"
        +"|  2. Calcular edad de humano en años de perro\n      |"
        +"|  3. Calcular número de días vividos\n               |"
        +"|  4. Numerología\n                                   |" 
        +"|  5. Salir                                           |"
        +"|_____________________________________________________|"));
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
        }while(opcion<5);
        }

    public static void szodiaco() {
        String mes;
        int dia;
        mes = JOptionPane.showInputDialog("Digite el mes de su nacimiento");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día de su nacimiento"));
        if (mes.equalsIgnoreCase("Enero") && dia >= 21 && dia <= 31 || mes.equalsIgnoreCase("Febrero") && dia <= 19) {
            JOptionPane.showMessageDialog(null, "Su signo es: ACUARIO ");
        }
        if (mes.equalsIgnoreCase("Febrero") && dia >= 20 && dia <= 28 || mes.equalsIgnoreCase("Marzo") && dia <= 20) {
            JOptionPane.showMessageDialog(null, "Su signo es: PISCIS ");
        }
        if (mes.equalsIgnoreCase("Marzo") && dia >= 21 && dia <= 31 || mes.equalsIgnoreCase("Abril") && dia <= 20) {
            JOptionPane.showMessageDialog(null, "Su signo es: ARIES ");
        }
        if (mes.equalsIgnoreCase("Abril") && dia >= 21 && dia <= 30 || mes.equalsIgnoreCase("Mayo") && dia <= 21) {
            JOptionPane.showMessageDialog(null, "Su signo es: TAURO ");
        }
        if (mes.equalsIgnoreCase("Mayo") && dia >= 22 && dia <= 31 || mes.equalsIgnoreCase("Junio") && dia <= 21) {
            JOptionPane.showMessageDialog(null, "Su signo es: GÉMINIS ");
        }
        if (mes.equalsIgnoreCase("Junio") && dia >= 22 && dia <= 30 || mes.equalsIgnoreCase("Julio") && dia <= 22) {
            JOptionPane.showMessageDialog(null, "Su signo es: CÁNCER ");
        }
        if (mes.equalsIgnoreCase("Julio") && dia >= 23 && dia <= 31 || mes.equalsIgnoreCase("Agosto") && dia <= 23) {
            JOptionPane.showMessageDialog(null, "Su signo es: LEO ");
        }
        if (mes.equalsIgnoreCase("Agosto") && dia >= 24 && dia <= 31
                || mes.equalsIgnoreCase("Septiembre") && dia <= 23) {
            JOptionPane.showMessageDialog(null, "Su signo es: VIRGO ");
        }
        if (mes.equalsIgnoreCase("Septiembre") && dia >= 24 && dia <= 30
                || mes.equalsIgnoreCase("Octubre") && dia <= 23) {
            JOptionPane.showMessageDialog(null, "Su signo es: LIBRA ");
        }
        if (mes.equalsIgnoreCase("Octubre") && dia >= 24 && dia <= 31
                || mes.equalsIgnoreCase("Noviembre") && dia <= 22) {
            JOptionPane.showMessageDialog(null, "Su signo es: SCORPIO ");
        }
        if (mes.equalsIgnoreCase("Noviembre") && dia >= 23 && dia <= 30
                || mes.equalsIgnoreCase("Diciembre") && dia <= 21) {
            JOptionPane.showMessageDialog(null, "Su signo es: SAGITARIO ");
        }
        if (mes.equalsIgnoreCase("Diciembre") && dia >= 22 && dia <= 31 || mes.equalsIgnoreCase("Enero") && dia <= 20) {
            JOptionPane.showMessageDialog(null, "Su signo es: CAPRICORNIO ");
        }
    }

    public static void diasV() {

        int Dia, Mes, Año, Dias, Meses, Años, Diasvividos;

        Dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese su día de nacimiento"));
        Mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese su mes de nacimiento"));
        Año = Integer.parseInt(JOptionPane.showInputDialog("ingrese su año de nacimiento"));

        Años = (2020 - Año) * 365;
        Meses = (12 - Mes) * 30;
       

    }

    public static void eperro() {
        double edad, edadper, perroedad;
        edad = Double.parseDouble(JOptionPane.showInputDialog("Digite su edad"));
        edadper = edad * 7;
        perroedad = (Math.log(edad) * 16) + 31;
        JOptionPane.showMessageDialog(null, "Usted tiene " + edadper + " años en edad de perro");
        JOptionPane.showMessageDialog(null, "Usted tiene " + perroedad + "años en edad de perro con la nueva formula");

    }

    public static void numero() {
        int diaN, n1;
        int n2 = 0;
        diaN = Integer.parseInt(JOptionPane.showInputDialog("Digite su dia de nacimiento"));
        if (diaN < 32 || diaN > 0) 
        {
            n1 = (diaN / 10) + (diaN % 10);
            n2 = (n1 / 10) + (n1 % 10);
        }

        JOptionPane.showMessageDialog("Numerología");

    }
}
