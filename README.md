# Práctica de JPA e Hibernate

Ejemplo en Java 17 para explorar la persistencia de una entidad `Cliente` en MySQL mediante JPA e Hibernate. El repositorio contiene ejemplos separados para crear, consultar, listar y eliminar registros.

## Estructura

- `src/main/java/org/example/Cliente.java`: entidad de ejemplo.
- `src/main/java/org/example/JpaUtil.java`: creación del contexto de persistencia.
- `src/main/java/org/example/Hibernate*.java`: operaciones de consulta y escritura.
- `src/main/resources/META-INF/persistence.xml`: configuración de conexión local.

## Antes de ejecutar

1. Crea una base de datos MySQL de prueba.
2. Ajusta la URL, el usuario y la contraseña de desarrollo en `persistence.xml` para tu entorno. No uses credenciales de producción.
3. Abre el proyecto Maven con Java 17 y ejecuta la clase del ejemplo que quieras revisar.

Este repositorio es una práctica de aprendizaje, no una aplicación desplegada.
