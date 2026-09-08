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
| Objeto propuesto | Responsabilidad                                                         | Informacion a conservar             | Comportamiento a realizar                         |
|------------------|-------------------------------------------------------------------------|-------------------------------------|---------------------------------------------------|
| Tanque           | El tanque debe de permitir conocer el nivel actual                      | Las mediciones de llenado o vaciado | Debe ser capaz de mandar la informacion requerida |
| Sensor           | Los sesnores deben ser capaces de realizar las mediciones correctamente | Los limites de llenado y vaciado    | Compartir las mediciones que realizo              |

## 4-Relaciones entre los objetos
Para que el sistema pueda colaborar entre si debe de haber una buena comunicacion entre nuestros objetos, los cuales serian el tanque y los sesnores.
Estos mismos dependen uno del otro ya que los sensores se encargan de medir los niveles del tanque, pero los sensores tambien necesitan estar en alguna posicion estrategica en el tanque para lograr
una medicion correcta. Hay que tener en cuenta que en esta relacion depende uno del otro por el simple hecho que sin sensores no hay medicion y sin tanque no hay
nada que medir por lo que las operaciones no deberian duplicarse si cada uno deberia de estar cumpliendo su funcion correctamente.

# Fase 3

## 5-Diseño de clases
| Clase  | Atributos propuestos                                                     | Tipo de dato                                    | Metodos propuetos            | Responsabilidad     |
|--------|--------------------------------------------------------------------------|-------------------------------------------------|-----------------|---------------|
| Tanque | -Identidicador <br/> -Capacidad maxima <br/> -Estado <br/> -Nivel actual | -String <br/> -Float <br/> -Entero <br/> -Float |
| Sensor | -Identificador <br/> -Lectura de nivel                                   | -String <br/> -FLoat                            |
