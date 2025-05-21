# Usamos una imagen base
FROM openjdk:17-jdk-slim


# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR desde tu máquina host al contenedor.
# Asegúrate de que el JAR exista en esa ruta (target/...) antes de construir la imagen.
COPY target/deeptraslate-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080, que normalmente es usado por aplicaciones Spring Boot.
EXPOSE 8080

# Esto ejecuta el archivo JAR usando Java cuando el contenedor se inicia.
ENTRYPOINT ["java", "-jar", "app.jar"]

