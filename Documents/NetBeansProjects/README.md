
# EcoHotel - Sistema de Gestión Hotelera

**EcoHotel** es una aplicación de escritorio desarrollada en **Java Swing** utilizando **NetBeans** y **Maven**, diseñada para gestionar huéspedes, habitaciones y reservas de un hotel. El sistema incorpora una interfaz amigable con validaciones básicas y almacenamiento temporal en memoria mediante `ArrayList`.

---

## **Características principales**

### **Gestión de Huéspedes**
- Registro de huéspedes con los campos:
  - **Nombre**
  - **Documento**
  - **Correo electrónico** (con validación de `@`)
  - **Teléfono** (número mínimo de 7 dígitos)
- Visualización de huéspedes en una `JTable`.
- Funciones de **Guardar** y **Limpiar** datos.

### **Gestión de Habitaciones**
- Registro con campos:
  - **Número de habitación** (único, validación contra duplicados).
  - **Tipo**: estándar, suite ecológica, familiar (usando `JComboBox`).
  - **Capacidad**: número de personas (con `JSpinner`).
  - **Estado**: libre, ocupada o en mantenimiento (`JComboBox`).
- Visualización de habitaciones en una tabla (`JTable`).
- Funciones de **Guardar** y **Limpiar** datos.

### **Gestión de Reservas**
- Selección de huésped y habitación disponibles.
- Fechas de **entrada** y **salida** (usando `LocalDate`).
- Validación de disponibilidad de la habitación (no permitir reservas con conflictos).
- Visualización de reservas en una tabla (`JTable`).

### **Interfaz principal**
- Ventana `EcoHotel` con:
  - **JMenuBar** para navegar entre Huéspedes, Habitaciones y Reservas.
  - Formularios embebidos en `JInternalFrame` para modularidad.
  - Botón de **Salir**.

---

## **Estructura del proyecto**

```
TallerEvaluativo_2/
│
├── src/main/java/
│   ├── Model/           # Clases del modelo: Huesped, Habitacion, Reserva
│   ├── DAO/             # DAOs: DAOHuesped, DAOHabitacion, DAOReserva
│   ├── Controller/      # Controladores: ControllerHuesped, ControllerHabitacion, ControllerReserva
│   └── View/            # Vistas Swing: EcoHotel, VentanaRegistro, etc.
│
├── src/main/resources/  # Recursos (si aplica)
└── pom.xml              # Configuración Maven
```

---

## **Requisitos**

- **Java JDK 17** o superior.
- **NetBeans 15** o superior (proyecto creado con GUI Builder).
- **Maven 3.8+**.

---

## **Ejecución del proyecto**

1. Clonar o descargar el proyecto.
2. Abrir en **NetBeans**.
3. Realizar un **Clean and Build**.
4. Ejecutar la clase principal:

   ```
   View.EcoHotel.java
   ```

---

## **Validaciones implementadas**

- **Correo:** Debe contener un `@` y no estar vacío.
- **Teléfono:** Solo números y con longitud mayor o igual a 7.
- **Habitaciones:** No se permite registrar números duplicados.
- **Reservas:** Verifica que la habitación no esté ocupada en el rango de fechas seleccionado.

---

## **Tecnologías usadas**
- **Java Swing** (GUI)
- **Maven**
- **POO (Programación Orientada a Objetos)**: Controladores, DAOs y Modelos.
- **LocalDate** para manejo de fechas.
- **ArrayList** para almacenamiento en memoria.

---

## **Posibles mejoras**
- Persistencia con base de datos **MySQL**.
- Uso de `JDatePicker` para selección de fechas.
- Generación de reportes en **PDF**.
- Funciones de **editar** y **eliminar** registros.

---

## **Autor**
**Jean Pool Alejandro**  
Proyecto evaluativo - Ingeniería de Software (EAM).
