public class Calcolatrice {
    public static void main(String[] args) {
        System.out.println(funzioneAddizione(5,7));
        System.out.println(riconoscimentoOperazione("5-7"));
    }

    public static int funzioneAddizione(int x, int y){
        return x+y;
    }

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