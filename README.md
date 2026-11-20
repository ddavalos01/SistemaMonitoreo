# Práctica 4 - Sistema orientado a objetos para monitoreo de nivel en tanques

## 1. Nombre del proyecto
SistemaMonitoreo

## 2. Integrantes
- **Diego Alberto Dávalos Salinas** (ddavalos01) — Estudiante A
- **Fernando Rafael López Vázquez** (flopez48) — Estudiante B

## 3. Descripción breve del sistema
Aplicación de consola desarrollada en Java bajo programación orientada a objetos para modelar y simular el funcionamiento de tanques de almacenamiento industrial y sus sensores de nivel. El sistema permite administrar el identificador, capacidad máxima, nivel actual, porcentaje de llenado y estado de operación (`DETENIDO`, `LLENANDO`, `VACIANDO`) de cada tanque, así como consultar la medición mediante un `SensorNivel` vinculado, respetando las restricciones donde el nivel de líquido jamás sea menor a 0.0 ni supere la `capacidadMax`.

## 4. Clases implementadas
- `TankState` (enum): Define los estados válidos de operación de un tanque (`LLENANDO`, `VACIANDO`, `DETENIDO`).
- `Tanque`: Representa un tanque de almacenamiento con su información, estado operativo, porcentaje de llenado y control de límites de nivel.
- `SensorNivel`: Representa el sensor asociado a un tanque para obtener la lectura de su nivel actual.
- `Main`: Clase principal de ejecución en consola para demostrar el comportamiento de los objetos.

## 5. Responsabilidades de cada clase
- `TankState`: Restringir los estados operativos a valores definidos (`LLENANDO`, `VACIANDO`, `DETENIDO`), evitando estados ambiguos.
- `Tanque`: Conservar y proteger sus datos (`id`, `capacidadMax`, `nivelActual`, `estado`), consultar su información y porcentaje de ocupación, cambiar su estado de operación y ejecutar `controlNivel()` para mantener el nivel dentro del rango válido (`0.0` a `capacidadMax`).
- `SensorNivel`: Conservar su identificador (`id`) y lectura (`lectura`), mantener la referencia al objeto `Tanque` vinculado y devolver la lectura actualizada mediante `getLectura()`.
- `Main`: Instanciar tanques y sensores, simular operaciones de llenado, vaciado, detención y validación de límites, mostrando los resultados en consola.

## 6. Instrucciones para ejecutar el programa
1. Clonar el repositorio en tu equipo:
   git clone https://github.com/ddavalos01/SistemaMonitoreo/tree/master
2. Abrir el proyecto SistemaMonitoreo en IntelliJ IDEA.
3. Verificar que las clases (`TankState`, `Tanque`, `SensorNivel` y `Main`) estén dentro del directorio `src/`.
4. Ejecutar la clase `Main` desde IntelliJ IDEA.

## 7. Pruebas realizadas
- Crear tanque con datos válidos: El objeto conserva correctamente su ID, capacidad y nivel inicial.
- Llenar tanque: Aumenta su nivel y cambia su estado a `LLENANDO`.
- Intentar superar la capacidad máxima: `controlNivel()` detiene el llenado y evita sobrepasar la `capacidadMax`.
- Vaciar tanque: Disminuye su nivel y cambia su estado a `VACIANDO`.
- Intentar obtener un nivel negativo: `controlNivel()` detiene el vaciado y evita niveles menores a `0.0`.
- Consultar porcentaje de llenado: Se calcula correctamente con `(nivelActual / capacidadMax) * 100.0`.
- Cambiar estado de operación: El estado refleja correctamente la operación actual (`LLENANDO`, `VACIANDO`, `DETENIDO`).
- Detener tanque: El estado cambia a `DETENIDO`.
- Consultar sensor: `getLectura()` proporciona una lectura coherente leyendo el nivel actual del tanque vinculado.

## 8. Responsabilidades de cada integrante
- Diego Alberto Davalos (`ddavalos01`): Análisis compartido, desarrollo principal del modelo `Tanque` y `TankState` en la rama `modelo-tanque`, revisión de Pull Request, integración y documentación.
- Fernando Rafael Lopez Vazquez (`flopez48`): Análisis compartido, desarrollo principal del modelo `SensorNivel` en la rama `modelo-sensor`, revisión de Pull Request, pruebas e integración.

## 9. Enlace al documento de análisis y diseño
- https://github.com/ddavalos01/SistemaMonitoreo/blob/master/docs/01-analisis-diseno.md

## 10. Conclusiones individuales

### Diego Alberto Dávalos Salinas (ddavalos01)
1. ¿Qué diferencia existe entre una clase y un objeto?
   [Responder aquí]
2. Mencione tres objetos creados durante la ejecución del programa.
   [Responder aquí]
3. ¿Por qué los atributos principales fueron declarados private?
   [Responder aquí]
4. ¿Qué responsabilidad tiene la clase que representa al tanque?
   [Responder aquí]
5. ¿Qué responsabilidad tiene la clase que representa al sensor?
   [Responder aquí]
6. ¿Qué cambio realizaron al UML después de implementar el programa?
   [Responder aquí]
7. ¿Qué observación técnica realizó durante el Pull Request de su compañero?
   [Responder aquí]
8. ¿Qué corrección realizó a partir de una observación recibida?
   [Responder aquí]
9. ¿Qué aportó personalmente al proyecto?
   [Responder aquí]
10. ¿Qué decisión de diseño le pareció más importante y por qué?
    [Responder aquí]

### Fernando Rafael López Vázquez (flopez48)
1. ¿Qué diferencia existe entre una clase y un objeto?
   [Responder aquí]
2. Mencione tres objetos creados durante la ejecución del programa.
   [Responder aquí]
3. ¿Por qué los atributos principales fueron declarados private?
   [Responder aquí]
4. ¿Qué responsabilidad tiene la clase que representa al tanque?
   [Responder aquí]
5. ¿Qué responsabilidad tiene la clase que representa al sensor?
   [Responder aquí]
6. ¿Qué cambio realizaron al UML después de implementar el programa?
   [Responder aquí]
7. ¿Qué observación técnica realizó durante el Pull Request de su compañero?
   [Responder aquí]
8. ¿Qué corrección realizó a partir de una observación recibida?
   [Responder aquí]
9. ¿Qué aportó personalmente al proyecto?
   [Responder aquí]
10. ¿Qué decisión de diseño le pareció más importante y por qué?
    [Responder aquí]
