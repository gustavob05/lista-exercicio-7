import java.util.Scanner;
public class ExercicioDoisMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ExercicioDoisFuncao ExercicioDoisFuncao = new ExercicioDoisFuncao();

        System.out.println("Informe seu nome:");
        ExercicioDoisFuncao.setNome(ExercicioDoisFuncao.inverterNome( scanner.nextLine()));

        ExercicioDoisFuncao.setNome(ExercicioDoisFuncao.converterMaiscula(ExercicioDoisFuncao.getNome()));

        System.out.printf("O nome invertido é: %s", ExercicioDoisFuncao.getNome());

        scanner.close();
    }
}