import java.util.Scanner;
    public class ExercicioTresMain{
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            ExercicioTresFuncao ExercicioTresFuncao= new ExercicioTresFuncao();

            System.out.println("Digite o cpf no formato xxx.xxx.xxx-xx:");
            ExercicioTresFuncao.setCpf(scanner.nextLine());

            if(ExercicioTresFuncao.getCpf().charAt(3)== '.' && ExercicioTresFuncao.getCpf().charAt(7)== '.' && ExercicioTresFuncao.getCpf().charAt(11)== '-' && ExercicioTresFuncao.getCpf().length()==14){
            System.out.println("Cpf cadastrado com sucesso.");
        }else
        System.out.println("O Cpf informado está inválido");
        scanner.close();
        }
    }