public class RiconoscimentoOperazioni {
    public static String riconoscimentoOperazione(String str){
        if(str.contains("+")){
            return "SOMMA";
        } else if (str.contains("-")){
            return "DIFFERENZA";
        } else if (str.contains("*")){
            return "MOLTIPLICAZIONE";
        } else if (str.contains("/")){
            return "DIVISIONE";
        } else if (str.contains("^")){
            return "POTENZA";
        } else{
            return  "ingresso di operazione non riconosciuto";
        }

    }
}
