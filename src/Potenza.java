public static int calcolaPotenza(int base, int esponente) {
        int risultato = 1;

        for (int i = 0; i < esponente; i++) {
        risultato *= base;
        }

        return risultato;
        }