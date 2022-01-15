import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProPlayerTest {



    @Test
    void deveRetornarDanoCritico(){
        ProPlayer player = new ProPlayer();
        player.setdano1(7);
        player.setDano2(7);
        assertEquals("Critico", player.verificarDano());

    }

    @Test
    void deveRetornarDanoBaixo(){
        ProPlayer player = new ProPlayer();
        player.setdano1(2);
        player.setDano2(2);
        assertEquals("Dano baixo", player.verificarDano());

    }

    @Test
    void deveRetornarInfo(){
        ProPlayer player = new ProPlayer();
        player.setdano1(7);
        player.setDano2(7);
        player.setNome("Jão");
        player.setIdPlayer(4);
        assertEquals("Critico", player.verificarDano());

    }

}