# cicd-demo-springboot

![CI](https://github.com/marlonyi/cicd-demo-springboot/actions/workflows/ci.yml/badge.svg)

Proyecto Spring Boot de demostración para un pipeline de CI/CD con GitHub Actions.

## 🚀 Endpoints disponibles

| Método | Endpoint | Descripción | Ejemplo |
|--------|----------|-------------|---------|
| GET | `/api/sum` | Suma dos números | `/api/sum?a=3&b=4` → `7` |
| GET | `/api/multiply` | Multiplica dos números | `/api/multiply?a=3&b=4` → `12` |
| GET | `/api/health-check` | Estado del servicio | `/api/health-check` → `OK` |

## 🛠️ Tecnologías

- Java 21
- Spring Boot 4.0.3
- Maven
- JaCoCo (cobertura de código)
- GitHub Actions (CI/CD)

## ▶️ Ejecutar localmente

```bash
./mvnw spring-boot:run
```

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
push/PR → build (compilar JAR) → test (ejecutar tests + cobertura)
```

