public class Coche {
    public int velocidad;

    public void acelerarAdayaElias(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerarAadayaElias(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0)
            velocidad = 0;
    }
}
