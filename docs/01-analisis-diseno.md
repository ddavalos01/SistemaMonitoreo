# Fase 1
## NOMBRES DE ESTUDIANTES
| Nombre                         | Usuario Github                | Rol       |
|--------------------------------|-------------------------------|-----------|
| Diego Alberto Davalos          | ddavalos01                    | Estudiante A |
| Fernando Rafael Lopez Vazquez  | flopez48                      | Estudiante B |
| Fecha : 03 / Septiembre / 2027 |


# Fase 2

## 1-Descripcion del problema
El sistema que se pretende representar corresponde a una pequena instalacion industrial que cuenta con varios tanques de almacenamiento. La aplicacion tendra como objetivo modelar el funcionamiento de estos tanques, permitiendo representar su situacion actual y simular algunas de las operaciones que pueden realizarse durante su funcionamiento.
Para representar cada tanque, el sistema necesita manejar informacion como un identificador, la capacidad maxima, el nivel actual y su estado de operacion. El estado de cada tanque podra ser detenido, llenando o vaciando. Ademas, el sistema debera contar con la informacion necesaria para obtener una lectura del sensor de nivel y determinar el porcentaje de llenado del tanque.
Debera permitir consultar la informacion de un tanque y modificar su estado de operacion.
El nivel actual de liquido no puede ser menor que cero ni superar la capacidad maxima del tanque.

## 2-Identificacion de objetos
**Tanque:** Representa a cada uno de los tanques, incluyendo capacidad maxima, estado de operacion, etc. Debe almacenar la informacion relevante del tanque y poder mostrarla, y debe permitir modificar su estado.

**Sensor:** Mide y almacena informacion sobre el nivel actual del tanque. Debe poder mandar esta informacion.
