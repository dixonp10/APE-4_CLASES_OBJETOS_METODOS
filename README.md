# APE 4: Clases, objetos y métodos

**Universidad Técnica de Ambato**
Facultad de Ingeniería en Sistemas, Electrónica e Industrial · Carrera de Software
Ciclo académico: julio – diciembre 2026

- **Asignatura:** Algoritmos y Lógica de Programación
- **Nivel y paralelo:** Primero "B"
- **Docente:** Ing. José Rubén Caiza, Mg.
- **Grupo:** 7

## Integrantes

| N.º | Integrante |
|-----|------------|
| 1 | Sebastián Navas |
| 2 | Dixon Prado |
| 3 | Kevin Punina |
| 4 | Francis Bonifaz |

## Descripción

Repositorio único con las tres fases (avances) de la APE 4. Cada fase contiene su código fuente, las pruebas de ejecución y su propio README.

| Fase | Tema | Carpeta |
|------|------|---------|
| 1 | Introducción a la POO en Java | [`Fase1`](Fase1) |
| 2 | Métodos en Java | [`Fase2`](Fase2) |
| 3 | Integración de clases, objetos y métodos | [`Fase3`](Fase3) |

## Estructura del repositorio

```
APE-4_CLASES_OBJETOS_METODOS/
├── Fase1/
│   ├── src/
│   ├── pruebas/
│   └── README.md
├── Fase2/
│   ├── src/
│   ├── pruebas/
│   └── README.md
├── Fase3/
│   ├── src/
│   ├── pruebas/
│   └── README.md
├── README.md      (general)
└── Informe.pdf
```

## Distribución de responsabilidades

### Fase 1: Introducción a la POO en Java

| Ejercicio | Clases | Responsable |
|-----------|--------|-------------|
| 1 | `Estudiante`, `Main` | Francis Bonifaz |
| 2 | `Producto`, `Main` | Kevin Punina |
| 3 | `Mascota`, `Main` | Sebastián Navas |
| 4 | `Cuenta`, `Main` | Dixon Prado |
| 5 | `Libro`, `Socio`, `Main` | Francis Bonifaz |
| README de la fase | | Kevin Punina |

### Fase 2: Métodos en Java

| Ejercicio | Responsable |
|-----------|-------------|
| 1 | Sebastián Navas |
| 2 | Dixon Prado |
| 3 | Francis Bonifaz |
| 4 | Kevin Punina |
| 5 | Sebastián Navas |
| 6 | Dixon Prado |
| 7 | Francis Bonifaz |
| 8 | Kevin Punina |
| README de la fase | Sebastián Navas |

### Fase 3: Integración de clases, objetos y métodos

| Ejercicio | Clases | Responsable |
|-----------|--------|-------------|
| 1 | `Autor`, `Libro`, `Main` y pruebas de ejecución | Dixon Prado |
| 2 | `Rectangulo`, `Main` | Francis Bonifaz |
| 3 | `Producto`, `Venta`, `Main` | Kevin Punina |
| 4 | `Cuenta`, `Main` | Sebastián Navas |
| 5 | `Libro`, `Prestamo`, `Usuario`, `Main` | Dixon Prado |
| README de la fase | | Francis Bonifaz |

### Resumen por integrante

| Integrante | Fase 1 | Fase 2 | Fase 3 |
|------------|--------|--------|--------|
| Sebastián Navas | Ej. 3 | Ej. 1, 5 y README | Ej. 4 |
| Dixon Prado | Ej. 4 | Ej. 2, 6 | Ej. 1, 5 |
| Kevin Punina | Ej. 2 y README | Ej. 4, 8 | Ej. 3 |
| Francis Bonifaz | Ej. 1, 5 | Ej. 3, 7 | Ej. 2 y README |

## Compilación y ejecución

Requisitos: JDK 11 o superior. Desde la raíz del repositorio (ejemplo con la Fase 3):

```bash
javac -encoding UTF-8 -d out $(find Fase3/src -name "*.java")
java -cp out ejercicio1.Main
```

Cambiar `Fase3` por `Fase1` o `Fase2`, y `ejercicio1` por el ejercicio que se quiera ejecutar. También se puede abrir la carpeta en Visual Studio Code y ejecutar la clase `Main` de cada ejercicio con el botón *Run*.

## Pruebas

La salida de cada ejecución está en la carpeta `pruebas` de su fase.

## Informe

El documento [`Informe.pdf`](Informe.pdf) reúne las tres fases con el código, las pruebas de ejecución y el formato de Guías APE.
