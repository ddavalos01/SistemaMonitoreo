enum TankState{
    LLENANDO,VACIANDO,DETENIDO;
}

public class Tanque {
    private static String id;
    private static Double capacidadMax;
    private static Double nivelActual;
    private static TankState estado;

    Tanque(String inputID, Double inputCapacidadMax){
        id = inputID;
        capacidadMax = inputCapacidadMax;
        nivelActual = 0.0;
        estado = TankState.DETENIDO;
    }

    String getID(){
        return id;
    }

    Double getNivelActual(){
        return nivelActual;
    }

    TankState getEstado(){
        return estado;
    }

    Double getCapacidadMax(){
        return capacidadMax;
    }

    Double getNivelPorcentaje(){
        return (nivelActual/capacidadMax)*100.0;
    }

    void llenarTanque(){
        estado = TankState.LLENANDO;
    }

    void vaciarTanque(){
        estado = TankState.VACIANDO;
    }

    void detenerTanque(){
        estado = TankState.DETENIDO;
    }

    void mostrarResumen(){
        System.out.println("ID: "+id);
        System.out.println("Capacidad maxima: "+capacidadMax+" L");
        System.out.println("Nivel actual: "+nivelActual+" L");
        System.out.println("Porcentaje de llenado: "+(nivelActual/capacidadMax)*100.0+"%");
        System.out.println("Estado actual: "+estado+"\n");
    }

    void controlNivel() {
        //Control para nivel igual o superior a capacidad maxima
        if(nivelActual>capacidadMax){
            while(nivelActual>capacidadMax) {
                estado = TankState.VACIANDO;
                nivelActual--;
            }
            estado = TankState.DETENIDO;
        }
        if(nivelActual==capacidadMax && estado==TankState.LLENANDO){
            estado = TankState.DETENIDO;
        }
        //Control para nivel menor a cero
        if(nivelActual>=0.0){
            estado = TankState.DETENIDO;
            nivelActual = 0.0;
        }
    }
}
