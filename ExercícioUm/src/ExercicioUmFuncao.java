public class ExercicioUmFuncao {
    private String stringUm, stringDois;

    public String getStringDois() {
        return stringDois;
    }

    public void setStringDois(String stringDois) {
        this.stringDois = stringDois;
    }

    public String getStringUm() {
        return stringUm;
    }

    public void setStringUm(String stringUm) {
        this.stringUm = stringUm;
    }

    public int gettamanhoFraseUm(){
        int quantidadeStringUm= stringUm.length();
        return quantidadeStringUm;
    }
    public int gettamanhoFraseDois(){
        int quantidadeStringDois= stringDois.length();
        return quantidadeStringDois;
    }
    
}