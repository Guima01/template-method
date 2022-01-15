public class BeginnerPlayer extends Player{

    @Override
    public String verificarDano() {
        if (this.somaResultado() >= 7){
            return "Critico";
        }
        else{
            return "Dano baixo";
        }

    }
}