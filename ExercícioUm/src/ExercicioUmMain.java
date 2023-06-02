import java.util.Scanner;
public class ExercicioUmMain {
    public static void main(String[] args) {
        ExercicioUmFuncao ExercicioUmFuncao = new ExercicioUmFuncao();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite a primeira frase:");
        ExercicioUmFuncao.setStringUm(scanner.nextLine());
        System.out.println("Digite a segunda frase:");
        ExercicioUmFuncao.setStringDois(scanner.nextLine());

        System.out.println("A primeira frase foi: "+ ExercicioUmFuncao.getStringUm());
        System.out.println("A segunda frase foi: "+ ExercicioUmFuncao.getStringDois());
        System.out.printf("Primeira String: %s: %d caracteres", ExercicioUmFuncao.getStringUm(), ExercicioUmFuncao.gettamanhoFraseUm());
        System.out.printf("\n Segunda String: %s: %d caracteres", ExercicioUmFuncao.getStringUm(), ExercicioUmFuncao.gettamanhoFraseUm());

        if(ExercicioUmFuncao.gettamanhoFraseUm()!= ExercicioUmFuncao.gettamanhoFraseDois()){
            System.out.println("\nAs duas frases são de tamanhos diferentes");
        }else{
            System.out.println("\nAs duas frases são de tamanhos iguais.");
        }
        if(!ExercicioUmFuncao.getStringDois().equalsIgnoreCase(ExercicioUmFuncao.getStringUm())){
            System.out.println("\nAs duas frases possuem conteúdo diferente.");
        }else{
            System.out.println("As duas frases tem conteúdos iguais.");
        }
        scanner.close();

}
}