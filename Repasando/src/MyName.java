public class MyName {
    public static void main(String[] args) {

        String saludo="Pato";  //variables
        System.out.println("Hola mi nombre es:"+saludo);  //imprimir + variable
        System.out.println("Hola mi nombre es: " + saludo.toUpperCase());

        int numero=10;

        boolean valor = true;
        int numero2=5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2=10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 15 ;
        var numero4 = "15";

        String nombre;

        nombre = "Andy";

        if (numero >10){
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);

        int edad = 5;
    }
}