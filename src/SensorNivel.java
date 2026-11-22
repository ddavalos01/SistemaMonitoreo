public class SensorNivel {
    private String id;
    private Double lectura;

    SensorNivel(String inputID){
        id = inputID;
        lectura = 0.0;
    }

    String getID(){
        return id;
    }

    Double getLectura(){
        return lectura;
    }
}
