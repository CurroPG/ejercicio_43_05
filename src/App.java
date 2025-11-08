public class App {
    public static void main(String[] args) throws Exception {
        long numero = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
        int posicion = Integer.parseInt(System.console().readLine("Por favor, introduzca la posición a partir de la cual quiere partir el número: "));
        long aux = numero;
        aux = numero * 10 + 1;
        int digito = 0;
        int contador = 0;
        long invertido = 0;
        int numero1 = 0;
        int numero2 = 0;

        do{
            digito = (int)aux % 10;
            invertido = invertido * 10 + digito;
            aux/=10;
        }while(aux != 0);
        digito = 0;
        aux = invertido;
        do{
            digito = (int)aux % 10;
            if(aux != 1){
                contador++;
                if (contador >= posicion)
                    numero2 = numero2 * 10 + digito;
                    else
                        numero1 = numero1 * 10 + digito;
                aux/=10;
            }
        }while(aux != 1);
        System.out.printf("Los números partidos son el %d y el %d", numero1, numero2);
    }
}
