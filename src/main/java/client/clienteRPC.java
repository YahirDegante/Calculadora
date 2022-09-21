package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class clienteRPC {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        String opcion = "", num1 = "", num2 = "";
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Object[] data;
        String response;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Exponente");
            System.out.println("6. Raiz");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = teclado.next();
            if (isNumber(opcion)){
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        System.out.println("SUMA");
                        do {
                            System.out.print("Ingrese el primer numero: ");
                            num1 = teclado.next();
                            if (!isDouble(num1)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num1));
                        do {
                            System.out.print("Ingrese el segundo numero: ");
                             num2 = teclado.next();
                            if (!isDouble(num2)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num2));
                        data = new Object[]{num1, num2};
                        response = (String) client.execute("Methods.suma", data);
                        System.out.println("Result -> "+response);
                        break;
                    case 2:
                        System.out.println("RESTA");
                        do {
                            System.out.print("Ingrese el primer numero: ");
                            num1 = teclado.next();
                            if (!isDouble(num1)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num1));
                        do {
                            System.out.print("Ingrese el segundo numero: ");
                            num2 = teclado.next();
                            if (!isDouble(num2)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num2));
                        data = new Object[]{num1, num2};
                        response = (String) client.execute("Methods.resta", data);
                        System.out.println("Result -> "+response);
                        break;
                    case 3:
                        System.out.println("MULTIPLICACION");
                        do {
                            System.out.print("Ingrese el primer numero: ");
                            num1 = teclado.next();
                            if (!isDouble(num1)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num1));
                        do {
                            System.out.print("Ingrese el segundo numero: ");
                            num2 = teclado.next();
                            if (!isDouble(num2)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num2));
                        data = new Object[]{num1, num2};
                        response = (String) client.execute("Methods.multiplicacion", data);
                        System.out.println("Result -> "+response);
                        break;
                    case 4:
                        System.out.println("DIVISION");
                        do {
                            System.out.print("Ingrese el primer numero: ");
                            num1 = teclado.next();
                            if (!isDouble(num1)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num1));
                        do {
                            System.out.print("Ingrese el segundo numero: ");
                            num2 = teclado.next();
                            if (!isDouble(num2)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num2));
                        data = new Object[]{num1, num2};
                        response = (String) client.execute("Methods.division", data);
                        System.out.println("Result -> "+response);
                        break;
                    case 5:
                        System.out.println("EXPONENTE");
                        do {
                            System.out.print("Ingrese el primer numero: ");
                            num1 = teclado.next();
                            if (!isDouble(num1)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num1));
                        do {
                            System.out.print("Ingrese el segundo numero: ");
                            num2 = teclado.next();
                            if (!isDouble(num2)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num2));
                        data = new Object[]{num1, num2};
                        response = (String) client.execute("Methods.exponente", data);
                        System.out.println("Result -> "+response);
                        break;
                    case 6:
                        System.out.println("RAIZ");
                        do {
                            System.out.print("Ingrese el primer numero: ");
                            num1 = teclado.next();
                            if (!isDouble(num1)) {
                                System.out.println("Ingrese un numero valido!");
                            }
                        } while (!isDouble(num1));
                        data = new Object[]{num1};
                        response = (String) client.execute("Methods.raiz", data);
                        System.out.println("Result -> "+response);
                        break;
                    default:
                        System.out.println("Ingresa una opcion valida!");
                }
            } else {
                System.out.println("La opcion es incorrecta. Intente nuevamente!!!!1");
            }
        } while (!opcion.equals("7"));
        System.out.println("Has salido del programa");
    }
    public static boolean isNumber(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDouble(String number){
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
