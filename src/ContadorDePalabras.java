import java.io.*;
import java.util.Scanner;

public class ContadorDePalabras {
    public static void main(String[] args) throws IOException {
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        int siete = 0;
        int ocho = 0;
        int nueve = 0;
        int diez = 0;
        int once = 0;
        int doce = 0;
        int trece = 0;
        int catorce = 0;
        int quince = 0;
        int dieciseis = 0;
        int diecisiete = 0;
        int dieciocho = 0;
        int diecinueve = 0;
        int veinte = 0;
        int veintiuno = 0;
        int veintidos = 0;
        int veintitres = 0;
        int veinticuatro = 0;
        int veinticinco = 0;
        int veintiseis = 0;
        int veintisiete = 0;
        int veintiocho = 0;
        int contador = 0;
        int comprobacion = 1;
        String palabra;


        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Jose Buzani\\divina_comedia_sp.txt")));
            while (comprobacion == 1) {
                palabra = s.next();
                contador = palabra.length();
                if (contador == 2) dos++;
                if (contador == 3) tres++;
                if (contador == 4) cuatro++;
                if (contador == 5) cinco++;
                if (contador == 6) seis++;
                if (contador == 7) siete++;
                if (contador == 8) ocho++;
                if (contador == 9) nueve++;
                if (contador == 10) diez++;
                if (contador == 11) once++;
                if (contador == 12) doce++;
                if (contador == 13) trece++;
                if (contador == 14) catorce++;
                if (contador == 15) quince++;
                if (contador == 16) dieciseis++;
                if (contador == 17) diecisiete++;
                if (contador == 18) dieciocho++;
                if (contador == 19) diecinueve++;
                if (contador == 20) veinte++;
                if (contador == 21) veintiuno++;
                if (contador == 22) veintidos++;
                if (contador == 23) veintitres++;
                if (contador == 24) veinticuatro++;
                if (contador == 25) veinticinco++;
                if (contador == 26) veintiseis++;
                if (contador == 27) veintisiete++;
                if (s.hasNext()) {
                    comprobacion = 1;
                } else {
                    comprobacion = 0;
                }

            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
        System.out.println("Hay " + dos + " palabras de 2 caracteres");
        System.out.println("Hay " + tres + " palabras de 3 caracteres");
        System.out.println("Hay " + cuatro + " palabras de 4 caracteres");
        System.out.println("Hay " + cinco + " palabras de 5 caracteres");
        System.out.println("Hay " + seis + " palabras de 6 caracteres");
        System.out.println("Hay " + siete + " palabras de 7 caracteres");
        System.out.println("Hay " + ocho + " palabras de 8 caracteres");
        System.out.println("Hay " + nueve + " palabras de 9 caracteres");
        System.out.println("Hay " + diez + " palabras de 10 caracteres");
        System.out.println("Hay " + once + " palabras de 11 caracteres");
        System.out.println("Hay " + doce + " palabras de 12 caracteres");
        System.out.println("Hay " + trece + " palabras de 13 caracteres");
        System.out.println("Hay " + catorce + " palabras de 14 caracteres");
        System.out.println("Hay " + quince + " palabras de 15 caracteres");
        System.out.println("Hay " + dieciseis + " palabras de 16 caracteres");
        System.out.println("Hay " + diecisiete + " palabras de 17 caracteres");
        System.out.println("Hay " + dieciocho + " palabras de 18 caracteres");
        System.out.println("Hay " + diecinueve + " palabras de 19 caracteres");
        System.out.println("Hay " + veinte + " palabras de 20 caracteres");
        System.out.println("Hay " + veintiuno + " palabras de 21 caracteres");
        System.out.println("Hay " + veintidos + " palabras de 22 caracteres");
        System.out.println("Hay " + veintitres + " palabras de 23 caracteres");
        System.out.println("Hay " + veinticuatro + " palabras de 24 caracteres");
        System.out.println("Hay " + veinticinco + " palabras de 25 caracteres");
        System.out.println("Hay " + veintiseis + " palabras de 26 caracteres");
        System.out.println("Hay " + veintisiete + " palabras de 27 caracteres");


        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter("PalabrasEnDivinaComedia.txt"));
            outputStream.println("Hay " + uno + " palabras de 1 caracter");
            outputStream.println("Hay " + dos + " palabras de 2 caracteres");
            outputStream.println("Hay " + tres + " palabras de 3 caracter");
            outputStream.println("Hay " + cuatro + " palabras de 4 caracter");
            outputStream.println("Hay " + cinco + " palabras de 5 caracter");
            outputStream.println("Hay " + seis + " palabras de 6 caracter");
            outputStream.println("Hay " + siete + " palabras de 7 caracter");
            outputStream.println("Hay " + ocho + " palabras de 8 caracter");
            outputStream.println("Hay " + nueve + " palabras de 9 caracter");
            outputStream.println("Hay " + diez + " palabras de 10 caracter");
            outputStream.println("Hay " + once + " palabras de 11 caracter");
            outputStream.println("Hay " + doce + " palabras de 12 caracter");
            outputStream.println("Hay " + trece + " palabras de 13 caracter");
            outputStream.println("Hay " + catorce + " palabras de 14 caracter");
            outputStream.println("Hay " + quince + " palabras de 15 caracter");
            outputStream.println("Hay " + dieciseis + " palabras de 16 caracter");
            outputStream.println("Hay " + diecisiete + " palabras de 17 caracter");
            outputStream.println("Hay " + dieciocho + " palabras de 18 caracter");
            outputStream.println("Hay " + diecinueve + " palabras de 19 caracter");
            outputStream.println("Hay " + veinte + " palabras de 20 caracter");
            outputStream.println("Hay " + veintiuno + " palabras de 21 caracter");
            outputStream.println("Hay " + veintidos + " palabras de 22 caracter");
            outputStream.println("Hay " + veintitres + " palabras de 23 caracter");
            outputStream.println("Hay " + veinticuatro + " palabras de 24 caracter");
            outputStream.println("Hay " + veinticinco + " palabras de 25 caracter");
            outputStream.println("Hay " + veintiseis + " palabras de 26 caracter");
            outputStream.println("Hay " + veintisiete + " palabras de 27 caracter");


        } finally {
            if (outputStream != null) outputStream.close();
        }

    }
}
