enum TankState{
    LLENANDO,VACIANDO,DETENIDO;
}

public class Tanque {
    private String id;
    private Double capacidadMax;
    private Double nivelActual;
    private TankState estado;

    Tanque(String inputID, Double inputCapacidadMax){
        id = inputID;
        capacidadMax = inputCapacidadMax;
        nivelActual = 0.0;
        estado = TankState.DETENIDO;
    }

    public String getID(){
        return id;
    }

    public Double getNivelActual(){
        return nivelActual;
    }

    public TankState getEstado(){
        return estado;
    }

    public Double getCapacidadMax(){
        return capacidadMax;
    }

    public Double getNivelPorcentaje(){
        return (nivelActual/capacidadMax)*100.0;
    }

    public void llenarTanque(){
        estado = TankState.LLENANDO;
    }

    public void vaciarTanque(){
        estado = TankState.VACIANDO;
    }

    public void detenerTanque(){
        estado = TankState.DETENIDO;
    }

    public void mostrarResumen(){
        System.out.println("ID: "+id);
        System.out.println("Capacidad maxima: "+capacidadMax+" L");
        System.out.println("Nivel actual: "+nivelActual+" L");
        System.out.println("Porcentaje de llenado: "+(nivelActual/capacidadMax)*100.0+"%");
        System.out.println("Estado actual: "+estado+"\n");
    }

    public void controlNivel() {
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
        if(nivelActual<=0.0){
            estado = TankState.DETENIDO;
            nivelActual = 0.0;
        }
    }
}
