# OO2

Este repositorio al igual que todos los comenzados en POO_ estan hechos con el proposito de mostrar 
ejercicios hechos durante la materia OO2.
En esta materia enseñan y realizan ejercicios relacionados a los patrones de diseño.
Practica 1: Patron **Adapter** 

# Practica 1 Ejercicio 1: Red social

Se quiere programar en objetos una versión simplificada de una red social parecida a Twitter. 
Este servicio debe permitir a los usuarios registrados postear y leer mensajes de hasta 140 
caracteres. Ud. debe modelar e implementar parte del sistema donde nos interesa que quede claro 
lo siguiente:

- Cada usuario conoce todos los Tweets que hizo.
- Un tweet puede ser re-tweet de otro, y este tweet debe conocer a su tweet de origen.
- Twitter debe conocer a todos los usuarios del sistema.
- Los tweets de un usuario se deben eliminar cuando el usuario es eliminado. No existen tweets no
  referenciados por un usuario.
- Los usuarios se identifican por su screenName.
- No se pueden agregar dos usuarios con el mismo screenName.
- Los tweets deben tener un texto de 1 carácter como mínimo y 140 caracteres como máximo.

## Tareas

Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes 
descrita. Se espera que entregue los siguientes productos.

1. Diagrama de clases UML.
2. Implementación en Java de la funcionalidad requerida.
3. Implementar los tests (JUnit) que considere necesarios.

1. ![UML_twitter](/TwitterLikeUML.png)
2. ![Implementacion_java](/main/java/ar/edu/unlp/info/oo2/practica1_ejercicio1/)
3. ![Implementacion_tests](/test/java/ar/edu/unlp/info/oo2/practica1_ejercicio1/)