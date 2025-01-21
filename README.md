# Prueba de ingreso para Banco de Chile.

# Descripcion y Contexto
Este proyecto tiene la intención de demostrar los conocimientos de creación de microservicio API REST para la prueba de ingreso a Banco de Chile.
Es una prueba que contiene la funcionalidad de consultar por un usuario mediante su id, guardar un nuevo y realizar el login mediante sus credenciales con seguridad JWT

# Requisitos del Entorno de Desarrollo

Para ambientar un equipo y comenzar a desarrollar de la aplicación, es necesario contar con las siguientes herramientas y tecnologias:

1. Java 17
2. Maven embebido en el proyecto.
4. IDE para el desarrollo con java, Visual Studio code + extensiones, IntelliJ, Springtool suit o eclipse

# Endpoints

http://localhost:8080/cliente/consulta/{id} | Endpoint encargado de las consultas de un usuario mediante su id, devolviendo los datos de este mediante json.

http://localhost:8080/cliente/guardar | Endpoint encargado de guardar los datos de un nuevo usuario enviando los siguientes datos en el cuerpo de la petición para que este se guarde en el archivo json.
       {
        "rut": String,
        "first_name": String,
        "last_name": String,
        "date_birth": "String,
        "mobile_phone": String,
        "email": String,
        "address": String,
        "city_id": Number
        "session_active": boolean
        "password": String
       }

http://localhost:8080/cliente/login | Endpoint encargado de realizar inicio de sesión del usuario con token de seguridad JWT.


# Dependencias usadas

spring-boot-starter-web, para la creación y uso de Api RestFul en la aplicación.
spring-boot-devtools, para el refresco en caliente de la aplicación.
lombok, para anotaciones Getter, Setter y constructores de las clases.

# Mejoras a futuro

Añadir clase Enviroment para obtener valores desde properties

