# Calculadora de IMC (Índice de Masa Corporal)

Aplicación de escritorio en Java desarrollada con Swing y el diseñador gráfico Matisse en NetBeans IDE, adhiriéndose estrictamente al patrón de arquitectura **Modelo-Vista-Controlador (MVC)**.

## Características

- **Cálculo preciso:** Determina el valor numérico del IMC a partir del peso (kg) y la altura (m) introducidos.
- **Clasificación OMS:** Categoriza el resultado según las pautas oficiales de la Organización Mundial de la Salud (*Bajo Peso*, *Peso Normal*, *Sobrepeso* u *Obesidad*).
- **Gestión de errores:** Captura de entradas inválidas (campos vacíos o caracteres no numéricos) mediante bloques `try-catch` (`NumberFormatException`).
- **Soporte de formato regional:** Acepta automáticamente comas (`,`) y puntos (`.`) como separadores decimales.
- **Feedback visual dinámico:** Cambio automático de color del texto de los resultados (Verde, Naranja y Rojo) según la categoría de salud.
- **Compatibilidad ejecutable:** Compilado con target Java 8 (JDK 8+) para garantizar su ejecución en cualquier equipo sin conflictos de versión.

## Estructura del Proyecto (MVC)

El proyecto está dividido en cuatro paquetes principales:

```text
src/
└── com/
    └── Calculadora_IMC/
        └── imc/
            ├── model/
            │   └── CalculadoraIMC.java
            ├── view/
            │   └── CalculadoraView.java
            ├── controller/
            │   └── IMCController.java
            └── main/
                └── Main.java
```

## Requisitos e Instalación

### Prerrequisitos

- **Java JDK:** 8 o superior.
- **IDE:** Apache NetBeans IDE.

### Pasos para ejecutar desde NetBeans

1. **Clona el repositorio en tu equipo:**

    ```bash
    git clone https://github.com/SantiagoGonzalez12/Calculadora_IMC.git
    ```

2. **Abrir el proyecto:**
    - Abre NetBeans IDE
    - Ve a ``File > Open Project....`` y selecciona la carpeta clonada.
3. **Compilar y Ejecutar:**
    - Haz clic derecho sobre el proyecto y pulsa en ``Clean and Build``.
    - Haz clic derecho sobre ``Main.java`` ubicado en ``com.Calculadora_IMC.imc.main`` y selecciona ``Run File``.

### Ejecución directa (.jar)

Tras realizar el ``Clean and Build``, puedes ejecutar la aplicación sin abrir NetBeans haciendo doble clic sobre el archivo generado o desde la consola:

```bash
java -jar dist/Calculadora_IMC.jar
```

## Iconos

Los iconos han sido obtenidos de estas páginas: 

- Grasa corporal: https://www.flaticon.es/icono-gratis/grasa-corporal_5862623
- Fuerza: https://www.flaticon.es/icono-gratis/fuerza_9571346

## Autor

Santiago González
