public class Calcolatrice {
    public static void main(String[] args) {
        Integer primoNumero = 5;
        Integer secondoNumero = null;
        char operazioneDaeseguire = '+';

        String risultatoOperazione = RiconoscimentoOperazioni.riconoscimentoOperazione(operazioneDaeseguire, primoNumero, secondoNumero);
        System.out.println(risultatoOperazione);


        int numero = 6;
        String risultatoPariDispari = PariDispari.checkPariDispari(numero);
        System.out.println(numero + " è un numero " + risultatoPariDispari + ".");


        int risultatoPotenza = Potenza.calcolaPotenza(2, 3);
        System.out.println("La potenza è: " + risultatoPotenza);

        String operazione = "3 - 4";


        int risultatoSottrazione = Sottrazione.sottrazione(10, 4);
        System.out.println("La sottrazione è: " + risultatoSottrazione);

        int dividendo = 18;
        int divisore = 7;
        int quoziente = 0;
        int resto = 0;
        divisione.divisioneConResto(dividendo, divisore, quoziente, resto);

        int risultatoMoltiplicazione = moltiplicazione.molt(4, 6);
        System.out.println("La moltiplicazione è: " + risultatoMoltiplicazione);
    }
}
        

















