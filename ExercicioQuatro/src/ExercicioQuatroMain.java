import java.util.Scanner;
public class ExercicioQuatroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExercicioQuatroFuncao ExercicioQuatroFuncao = new ExercicioQuatroFuncao();

        System.out.println("Digite um número:");
        ExercicioQuatroFuncao.setNumero(scanner.nextInt());
        ExercicioQuatroFuncao.numeroExtenso();
        scanner.close();
    }
}