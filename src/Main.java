public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de monitoreo\n");

        Tanque tanque1 = new Tanque("01", 100.0);
        Tanque tanque2 = new Tanque("02", 200.0);
        Tanque tanque3 = new Tanque("03", 300.0);
        SensorNivel sensor1 = new SensorNivel("01", tanque1);
        SensorNivel sensor2 = new SensorNivel("02", tanque2);
        SensorNivel sensor3 = new SensorNivel("03", tanque3);

        //Consulta de estado inicial
        System.out.println("Estado inicial del Tanque-01");
        tanque1.mostrarResumen();

        //Llenado
        tanque2.setEstado(TankState.LLENANDO);
        for(int i=0; i<50; i++){
            tanque2.setNivelActual(tanque2.getNivelActual()+1.0);
        }
        tanque2.setEstado(TankState.DETENIDO);
        System.out.println("Estado del Tanque-02 despues del llenado");
        tanque2.mostrarResumen();

        //Lectura de nivel mediante sensor
        System.out.println("Lectura del sensor del Tanque-02: "+sensor2.getLectura()+" L\n");

        //Vaciado
        tanque2.setEstado(TankState.VACIANDO);
        for(int i=0; i<50; i++){
            tanque2.setNivelActual(tanque2.getNivelActual()-1.0);
        }
        tanque2.setEstado(TankState.DETENIDO);
        System.out.println("Estado del Tanque-02 despues del vaciado");
        tanque2.mostrarResumen();

        //Intento de superar capacidad maxima
        tanque3.setEstado(TankState.LLENANDO);
        while(tanque3.getEstado()==TankState.LLENANDO){
            tanque3.setNivelActual(tanque3.getNivelActual()+1.0);
            tanque3.controlNivel();
        }
        System.out.println("Estado del Tanque-03 despues de intentar superar capacidad maxima");
        tanque3.mostrarResumen();

        //Intendo de disminuir nivel por debajo de cero
        tanque3.setEstado(TankState.VACIANDO);
        while(tanque3.getEstado()==TankState.VACIANDO){
            tanque3.setNivelActual(tanque3.getNivelActual()-1.0);
            tanque3.controlNivel();
        }
        System.out.println("Estado del Tanque-03 despues de intentar disminuir nivel debajo de cero");
        tanque3.mostrarResumen();

    }
}