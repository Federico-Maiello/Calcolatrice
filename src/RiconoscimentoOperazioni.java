public class RiconoscimentoOperazioni {
    public static String riconoscimentoOperazione(String str){
        if(str.contains("+")){
            return "Somma";
        } else if (str.contains("-")){
            return "Sottrazione";
        } else if (str.contains("*")){
            return "Moltiplicazione";
        } else if (str.contains("/")){
            return "Divisione";
        } else if (str.contains("^")){
            return "Potenza";
        } else{
            return  "ingresso di operazione non riconosciuto";
        }

    }
}
