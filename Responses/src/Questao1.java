public class Questao1 {
 
    public static void inverterDiagonais(int[][] matriz) {
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho / 2; i++) {
            int aux = matriz[i][i];
            matriz[i][i] = matriz[tamanho - 1 - i][tamanho - 1 - i];
            matriz[tamanho - 1 - i][tamanho - 1 - i] = aux;

            aux = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = matriz[tamanho - 1 - i][i];
            matriz[tamanho - 1 - i][i] = aux;
        }
    }

    public static void printMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
