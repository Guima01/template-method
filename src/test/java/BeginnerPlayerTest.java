import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerPlayerTest {

    @Test
     void deveRetornarDanoCritico(){
        BeginnerPlayer player = new BeginnerPlayer();
        player.setdano1(6);
        player.setDano2(6);
        assertEquals("Critico", player.verificarDano());

    }

    @Test
    void deveRetornarDanoBaixo(){
        BeginnerPlayer player = new BeginnerPlayer();
        player.setdano1(2);
        player.setDano2(2);
        assertEquals("Dano baixo", player.verificarDano());

    }

    @Test
    void deveRetornarInfo(){
        BeginnerPlayer player = new BeginnerPlayer();
        player.setdano1(2);
        player.setDano2(2);
        player.setNome("Guilherma");
        player.setIdPlayer(3);
        assertEquals("Dano baixo", player.verificarDano());

    }


}