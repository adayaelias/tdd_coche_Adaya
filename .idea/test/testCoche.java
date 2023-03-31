import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCoche {
    @Test
    public void test_crear_coche_velocidad_cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
