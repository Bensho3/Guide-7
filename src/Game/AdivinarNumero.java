package Game;

public class AdivinarNumero {

private Integer numeroRandom = RandomNum.getNumeroRandom();

private Integer intentos = 0;

private static boolean gano;

    public Integer getNumeroRandom() {
        return numeroRandom;
    }
    public Integer getIntentos() {
        return intentos;
    }

    public static boolean gano()
    {return gano;}

    public boolean juego(int numeroIng)
    {
    int i = this.numeroRandom.compareTo(numeroIng);
            if (i == 0)
            {
                gano = true;
            }
            else if(i==1)
            {
                gano = false;
                System.out.println("El numero ingresado es menor, segui intentando!");
            }

            else if (i==-1)
            {
                gano = false;
                System.out.println("El numero ingresado es mayor, segui intentando!");
            }
        return gano;
        }


}
