import java.util.*;

public class ImparesPares {

    public static void main(String[] args) throws Exception {

        Random gerador = new Random();

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite um número de 1 a 1000: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int contador = 1;

        while (contador <= numero) {
            if (contador % 2 == 0) {
                pares.add(contador);
            } else {
                impares.add(contador);
            }
            contador++;
        }

        Collections.sort(pares);

        System.out.println("Lista dos números pares: ");
        for (Integer numerosPares : pares) {
            System.out.println(numerosPares);
        }

        Collections.sort(impares, Collections.reverseOrder());
        System.out.println("Lista dos números ímpares: ");
        for (Integer numerosImpares : impares) {
            System.out.println(numerosImpares);
        }
    }
}

