public class ExercicioDoisFuncao {
    private String nome;
    public String inverterNome(String nomeContrario){
        StringBuilder stringbuilder = new StringBuilder(nomeContrario);
        return stringbuilder.reverse().toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String converterMaiscula(String nomeLimpo){
        return nomeLimpo.toUpperCase();
    }
}