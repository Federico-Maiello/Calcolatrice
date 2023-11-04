public class Calcolatrice { 
       public static void main(String[] args) {
            int dividendo = 18;
            int divisore = 7;
            int quoziente = 0;
            int resto = 0;
            divisioneConResto(dividendo, divisore, quoziente, resto);
    }
    
        public static void divisioneConResto(int dividendo, int divisore, int quoziente, int resto) {
            quoziente = dividendo / divisore;
            resto = dividendo % divisore;
            System.out.println("Quoziente: " + quoziente);
            System.out.println("Resto: " + resto);
    }


    }
        

















