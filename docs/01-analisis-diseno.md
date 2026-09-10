# Fase 1
## NOMBRES DE ESTUDIANTES
| Nombre                         | Usuario Github                | Rol       |
|--------------------------------|-------------------------------|-----------|
| Diego Alberto Davalos          | ddavalos01                    | Estudiante A |
| Fernando Rafael Lopez Vazquez  | flopez48                      | Estudiante B |
| Fecha : 03 / Septiembre / 2027 |

# Fase 2

## 1-Descripcion del problema
El sistema que se pretende representar corresponde a una instalacion industrial que cuenta con varios tanques de almacenamiento. La aplicacion tendra como objetivo modelar el funcionamiento de estos tanques, permitiendo representar su situacion actual y simular algunas de las operaciones que pueden realizarse durante su funcionamiento.
Para representar cada tanque, el sistema necesita manejar informacion como un identificador, la capacidad maxima, el nivel actual y su estado de operacion. El estado de cada tanque podra ser detenido, llenando o vaciando. Ademas, el sistema debera contar con la informacion necesaria para obtener una lectura del sensor de nivel y determinar el porcentaje de llenado del tanque.
Debera permitir consultar la informacion de un tanque y modificar su estado de operacion.
El nivel actual de liquido no puede ser menor que cero ni superar la capacidad maxima del tanque.

## 2-Identificacion de objetos
**Tanque:** Representa a cada uno de los tanques, incluyendo capacidad maxima, estado de operacion, identificador y nivel actual. Debe almacenar la informacion relevante del tanque y poder mostrarla, y debe permitir modificar su estado. Ademas, cada tanque debe estar relacionado con su respectivo sensor y poder obtener su medicion de nivel.

**Sensor:** Mide y almacena informacion sobre el nivel actual del tanque. Debe estar enlazado con el tanque del cual mide el nivel, y poder mandarle esta informacion.

## 3-Estado y comportamiento
| Objeto propuesto | Responsabilidad                                                         | Informacion a conservar                                                                          | Comportamiento a realizar                                                                                                                             |
|------------------|-------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| Tanque           | El tanque debe de permitir conocer el nivel actual                      | +Identificador del tanque <br/> +Capacidad máxima <br/> +Nivel actual <br/> +Estado de operación | +Consultar el nivel actual <br> +Consultar el porcentaje de llenado <br> +Consultar el estado <br> +Llenar y vaciar el tanque <br> +Detener el tanque |
| Sensor           | Los sesnores deben ser capaces de realizar las mediciones correctamente | +Identificador del sensor <br> +Lectura del nivel                                                | +Realizar la medición del nivel <br> +Proporcionar la lectura obtenida                                                                                |

## 4-Relaciones entre los objetos
El objeto Tanque se relaciona con el objeto Sensor, ya que cada sensor se encuentra asociado a un 
tanque para medir su nivel. El tanque puede contener uno o varios sensores, mientras que cada 
sensor registra y proporciona la información correspondiente al tanque al que está asociado.
# Fase 3

## 5-Diseño de clases
| Clase  | Atributos propuestos                                                     | Tipo de dato                                    | Metodos propuetos            | Responsabilidad     |
|--------|--------------------------------------------------------------------------|-------------------------------------------------|-----------------|---------------|
| Tanque | -Identidicador <br/> -Capacidad maxima <br/> -Estado <br/> -Nivel actual | -private String <br/> -private Float <br/> -private Entero <br/> -private Float | getID() <br/> getLevel() <br/> getState() <br/> changeState() <br/> getCapacidadMax() <br/> getNivelPorcentaje() <br/> getResumen() | -Mostrar identificador <br/> -Mostrar nivel actual <br/> -Mostrar estado actual <br/> -Cambiar estado actual <br/> -Mostrar capacidad maxima <br/> -Mostrar porcentaje de llenado <br/> -Mostrar resumen del tanque |
| Sensor | -Identificador <br/> -Lectura de nivel                                   | -private String <br/> -private Float                            | getID() <br/> getLectura() | -Mostrar identificador <br/> -Mostrar lectura actual |
