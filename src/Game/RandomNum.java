package Game;

import java.util.Random;

public class RandomNum {

private static final Integer Maximo = 500;

private static final Integer Minimo = 0;

public static Integer getNumeroRandom()
{
    Random random = new Random();
    return random.nextInt((Maximo - Minimo)+1) + Minimo;
}
}
