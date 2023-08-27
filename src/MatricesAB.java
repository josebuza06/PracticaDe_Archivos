import java.io.*;

public class MatricesAB {
    public static void main(String[] args) {
        String inputFileA = "C:\\Users\\Jose Buzani\\IdeaProjects\\a.mat";
        String inputFileB = "C:\\Users\\Jose Buzani\\IdeaProjects\\b.mat";
        String outputFileC = "C:\\Users\\Jose Buzani\\IdeaProjects\\c.mat";

        try {
            // Leer matriz A
            DataInputStream inputA = new DataInputStream(new FileInputStream(inputFileA));
            int rowsA = inputA.readByte();
            int colsA = inputA.readByte();
            double[][] matrixA = new double[rowsA][colsA];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    matrixA[i][j] = inputA.readDouble();
                }
            }
            inputA.close();

            // Leer matriz B
            DataInputStream inputB = new DataInputStream(new FileInputStream(inputFileB));
            int rowsB = inputB.readByte();
            int colsB = inputB.readByte();
            double[][] matrixB = new double[rowsB][colsB];
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    matrixB[i][j] = inputB.readDouble();
                }
            }
            inputB.close();

            // Calcular el producto de las matrices
            double[][] matrixC = new double[rowsA][colsB];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    double sum = 0;
                    for (int k = 0; k < colsA; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                    matrixC[i][j] = sum;
                }
            }

            // Escribir matriz C en el archivo de salida
            DataOutputStream outputC = new DataOutputStream(new FileOutputStream(outputFileC));
            outputC.writeByte(rowsA);
            outputC.writeByte(colsB);
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    outputC.writeDouble(matrixC[i][j]);
                }
            }
            outputC.close();

            System.out.println("Producto de matrices calculado y almacenado en " + outputFileC);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
