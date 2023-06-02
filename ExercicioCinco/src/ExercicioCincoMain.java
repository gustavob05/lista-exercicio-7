import java.util.Scanner;
public class ExercicioCincoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExercicioCincoFuncao exercicioCincoFuncao = new ExercicioCincoFuncao();

        System.out.println("Digite seu telefone:");
        exercicioCincoFuncao.setNumero(scanner.nextLine());

        exercicioCincoFuncao.validarCorrigirNumero();
    }
}