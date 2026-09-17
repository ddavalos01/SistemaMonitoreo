public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de monitoreo\n");

        Tanque yeet = new Tanque("ayy1", 515.0);

        yeet.mostrarResumen();
    }
}
/*
enum TankState{
    LLENANDO, VACIANDO, DETENIDO
}

public class Main{
    public static final int LLENADO=1;

    public static void main(String[] args){

        System.out.println(LLENANDO);

        TankState estado=TankState.DETENIDO;

        System.out.println(estado);

    }

}
 */