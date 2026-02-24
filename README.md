# cicd-demo-springboot

![CI](https://github.com/marlonyi/cicd-demo-springboot/actions/workflows/ci.yml/badge.svg)

Proyecto Spring Boot de demostración para un pipeline de CI/CD con GitHub Actions.
Incluye una calculadora web con vista Thymeleaf.

## 🖥️ Vista web

Al ejecutar la aplicación, abre **http://localhost:8080** para acceder a la calculadora interactiva.

Funcionalidades disponibles desde la interfaz:
- ➕ **Sumar** dos números
- ✖️ **Multiplicar** dos números
- 💚 **Health Check** del servicio

## 🚀 Endpoints REST disponibles

| Método | Endpoint | Descripción | Ejemplo |
|--------|----------|-------------|---------|
| GET | `/` | Vista web de la calculadora | Abrir en navegador |
| GET | `/api/sum` | Suma dos números | `/api/sum?a=3&b=4` → `7` |
| GET | `/api/multiply` | Multiplica dos números | `/api/multiply?a=3&b=4` → `12` |
| GET | `/api/health-check` | Estado del servicio | `/api/health-check` → `OK` |

## 🛠️ Tecnologías

- Java 21
- Spring Boot 4.0.3
- Thymeleaf (motor de plantillas)
- Maven
- JaCoCo (cobertura de código)
- GitHub Actions (CI/CD)

## ▶️ Ejecutar localmente

```bash
./mvnw spring-boot:run
```

Luego abre **http://localhost:8080** en tu navegador.

## 🧪 Ejecutar tests

```bash
./mvnw clean test
```

## 📊 Reporte de cobertura

```bash
./mvnw verify
# El reporte se genera en: target/site/jacoco/index.html
```

## 🔄 Pipeline CI/CD

El pipeline se ejecuta automáticamente en cada push a `main` o `develop`:

```
push / PR
   │
   ├── build  → compila el proyecto y genera el JAR
   │
   └── test   → ejecuta tests + genera reporte de cobertura JaCoCo
```

### Jobs del workflow

| Job | Descripción |
|-----|-------------|
| `build` | `mvn clean package -DskipTests` + sube el JAR como artefacto |
| `test` | `mvn verify` + sube reportes Surefire y JaCoCo |
