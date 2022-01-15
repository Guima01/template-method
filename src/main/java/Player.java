public abstract class Player {

    private int idPlayer;
    protected String nome;
    private int dano1;
    private int dano2;

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getdano1() {
        return dano1;
    }

    public void setdano1(int dano1) {
        this.dano1 = dano1;
    }

    public int getdano2() {
        return dano2;
    }

    public void setDano2(int dano2) {
        this.dano2 = dano2;
    }

    public float somaResultado(){
        return (this.dano2 + this.dano2);
    }

    public abstract String verificarDano();

    public String getTipo(){
        return "Player";
    }

    public String getInfo() {
        return getTipo() + "Player:" + this.idPlayer +
                "Nome:" + this.nome +
                "Resultado de Dano:" + this.verificarDano();

    }

}