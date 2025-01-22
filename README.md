
# ForoHubAlura

**ForoHubAlura** es una API REST diseñada para gestionar las operaciones básicas de un foro en línea, permitiendo realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en diferentes endpoints, así como registrar y listar usuarios. Este proyecto forma parte de los desafíos propuestos en el curso de Java Back-end de Alura.

## Características

- **Gestión de Temas:** Crear, visualizar, actualizar y eliminar temas del foro.
- **Gestión de Respuestas:** Añadir, editar y eliminar respuestas en los temas.
- **Gestión de Usuarios:** Registro y listado de usuarios del foro.
- **Seguridad:** Implementación de autenticación y autorización para proteger los endpoints de la API.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación principal utilizado para el desarrollo de la API.
- **Spring Boot:** Framework que facilita la creación de aplicaciones Java basadas en Spring.
- **Spring Security:** Módulo de Spring utilizado para manejar la seguridad de la aplicación.
- **JWT (JSON Web Tokens):** Utilizado para la autenticación y autorización de usuarios.
- **PostgreSQL:** Sistema de gestión de bases de datos relacional utilizado para almacenar la información del foro.
- **Flyway:** Herramienta para el versionado y migración de la base de datos.
- **OpenAPI:** Especificación para describir y documentar la API.

## Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/JuanMA0190/ForoHubAlura.git
   ```
2. **Navegar al directorio del proyecto:**
   ```bash
   cd ForoHubAlura
   ```
3. **Configurar la base de datos:**
   - Asegurarse de tener PostgreSQL instalado y en funcionamiento.
   - Crear una base de datos llamada `foro_hub_alura`.
   - Configurar las credenciales de la base de datos en el archivo `application.properties` o `application.yml`.
4. **Ejecutar las migraciones de Flyway:**
   - Al iniciar la aplicación, Flyway aplicará automáticamente las migraciones necesarias para crear las tablas y esquemas requeridos.
5. **Construir y ejecutar la aplicación:**
   ```bash
   ./mvnw spring-boot:run
   ```
   La aplicación estará disponible en `http://localhost:8080`.

## Documentación de la API

La documentación de la API está disponible a través de OpenAPI. Una vez que la aplicación esté en funcionamiento, puedes acceder a la documentación en `http://localhost:8080/swagger-ui.html`.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad o corrección de errores (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Agrega nueva funcionalidad'`).
4. Sube tus cambios a tu repositorio fork (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request en este repositorio.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE` en el repositorio.

---

Para más información sobre el curso y los desafíos, visita [Alura Cursos](https://www.aluracursos.com/).

---

**Nota:** Este proyecto es una implementación de referencia basada en los desafíos propuestos por Alura y puede no estar completamente funcional o libre de errores. Se recomienda su uso con fines educativos y de aprendizaje.
