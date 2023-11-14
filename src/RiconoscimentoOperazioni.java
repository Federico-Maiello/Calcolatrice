public class RiconoscimentoOperazioni {
    public static String riconoscimentoOperazione(char str, Integer primoNumero, Integer secondoNumero){
         switch (str) {
            case '+' -> {
                if (Addizione.checkIfNumberIsertedarenotnull(primoNumero, secondoNumero)) {
                    int risultatoAddizione = Addizione.funzioneAddizione(primoNumero, secondoNumero);
                    String s = "La somma è: " + risultatoAddizione;
                    return s;
                }else{
                    return "Errore!";
                }

            }
            case '-' -> {
                return "Sottrazione";
            }
            case '*' -> {
                 return "Moltiplicazione";
             }
            case '/' -> {
                 return "Divisione";
             }
            case '^' -> {
                 return "Potenza";
             }

             case 'd' -> {
                return PariDispari.checkPariDispari(primoNumero);
             }
            default -> {
                 return "Ingresso di operazione non riconosciuto";
             }
        }
    }
}
