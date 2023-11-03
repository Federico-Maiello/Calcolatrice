public class PariDispari {
    public static String checkPariDispari(int valore) {
        if (valore % 2 == 0) {
            return "Pari";
        } else {
            return "Dispari";
        }
    }

    public static void main(String[] args) {
        int numero = 6;
        String risultato = checkPariDispari(numero);
        System.out.println(numero + " è un numero " + risultato + ".");
    }
}
