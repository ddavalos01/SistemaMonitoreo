public class Sensor {
    private static String id;
    private static Double lectura;

    Sensor(String inputID){
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