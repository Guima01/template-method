public class ProPlayer extends Player{

    @Override
    public String verificarDano() {
        if (this.somaResultado() >= 12){
            return "Critico";
        }
        else{
            return "Dano baixo";
        }

    }
}