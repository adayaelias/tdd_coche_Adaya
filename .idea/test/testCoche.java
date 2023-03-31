import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCoche {
    @Test
    public void test_crear_coche_velocidad_cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_acelerar_coche_velocidad_aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_decelerar_coche_velocidad_disminuye(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
}
