package server;

public class Methods {

    public String suma(String num1, String num2){
        String respuesta = "";
        double suma = Double.parseDouble(num1) + Double.parseDouble(num2);
        respuesta = "El resultado de la suma de los numeros ingresados es: " + suma;
        return respuesta;
    }

    public String resta(String num1, String num2){
        String respuesta = "";
        double resta = Double.parseDouble(num1) - Double.parseDouble(num2);
        respuesta = "El resultado de la resta de los numeros ingresados es: " + resta;
        return respuesta;
    }

    public String multiplicacion(String num1, String num2){
        String respuesta = "";
        double multiplicacion = Double.parseDouble(num1) * Double.parseDouble(num2);
        respuesta = "El resultado de la multiplicación de los numeros ingresados es: " + multiplicacion;
        return respuesta;
    }

    public String division(String num1, String num2){
        String respuesta = "";
        double division = Double.parseDouble(num1) / Double.parseDouble(num2);
        if (division !=0) {
            respuesta = "El resultado de la division de los numeros ingresados es: " + division;
        } else {
            respuesta = "ERROR NO SE PUEDE DIVIDIR ENTRE 0";
        }
        return respuesta;
    }

    public String exponente(String num1, String num2){
        String respuesta = "";
        double exponente= Math.pow(Double.parseDouble(num1),Double.parseDouble(num2));
        respuesta = "El exponente de los numeros ingresados es:" + exponente;
        return respuesta;
    }

    public String raiz(String num1){
        String respuesta = "";
        double raiz = Math.sqrt(Double.parseDouble(num1));
        if (raiz >= 0) {
            respuesta = "La raiz del numero ingresados es: " + raiz;
        } else {
            respuesta = "ERROR REVISA LOS DATOS!";
        }
        return respuesta;
    }
}
