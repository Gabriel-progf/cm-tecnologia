public class App {
    public static void main(String[] args) throws Exception {

        // Qestão 1


        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Matriz original:");
        Questao1.printMatriz(matriz);

        Questao1.inverterDiagonais(matriz);

        System.out.println("Matriz com diagonais invertidas:");
        Questao1.printMatriz(matriz);


        // Questão 2

        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 1, 2, 3 }
        };

        int[][] B = {
                { 1, 2 },
                { 4, 5 }
        };

        int ocorrencias = Questao2.contarOcorrenciasSubmatriz(A, B);
        System.out.println("A submatriz B pode ser encontrada em A: " + ocorrencias + " vezes.");
    }

}
