public class SensorNivel {
    private String id;
    private Double lectura;
    private Tanque tanque;

    SensorNivel(String inputID, Tanque tanque){
        id = inputID;
        this.tanque = tanque;
        lectura = 0.0;
    }

    String getID(){
        return id;
    }

    Double getLectura(){
        lectura = tanque.getNivelActual();
        return lectura; }
}
