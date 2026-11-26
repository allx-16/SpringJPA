# Pruebas – Spring Boot con JPA

Pasos 2 a 6 aplicados: dependencias en `pom.xml`, conexión en `application.properties`
(host `db`), entidad `Producto`, `ProductoRepository` y `ProductoController`.

Paso 8: el ejemplo se adaptó a la tabla `alumno` (entidad `Alumno`, `AlumnoRepository`
y `AlumnoController` en `/alumnos`).

## Antes de ejecutar (una sola vez, en la terminal del Dev Container)

```bash
psql -h db -U postgres -d postgres   # contraseña: postgres
```

```sql
CREATE USER chochos WITH PASSWORD 'chochos';
CREATE DATABASE chochos OWNER chochos;
```

## Ejecutar

```bash
cd demo
./mvnw spring-boot:run
```

## Probar productos (paso 7)

```bash
curl -X POST http://localhost:8080/productos \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Creatina","descripcion":"Creatina de 500 g","lote":"12345","precioUnitario":500.50,"fechaCaducidad":"2027-05-04"}'

curl http://localhost:8080/productos
```

## Probar alumnos (paso 8)

```bash
curl -X POST http://localhost:8080/alumnos \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Ana","apellidoPaterno":"López","apellidoMaterno":"García","correo":"ana@correo.com","fechaNacimiento":"2004-03-15"}'

curl http://localhost:8080/alumnos
```
