# EmpresaSoft – Ejemplo de Patrones de Diseño en Java  

Este proyecto implementa una aplicación de ejemplo que combina tres patrones de diseño fundamentales en Java: **Composite**, **Builder** y **Prototype**. Además, se mantiene la flexibilidad de permitir que el usuario seleccione el modo de entrada y salida de datos (consola o interfaz gráfica).  

---

## 🎯 Objetivo  
El objetivo del proyecto es modelar una empresa de desarrollo de software (**EmpresaSoft**) en la que se construyen aplicaciones a partir de distintos departamentos (frontend, backend, bases de datos y hardware).  

Cada aplicación está compuesta de **departamentos**, y cada departamento contiene **desarrolladores (developers)** con tareas específicas.  

---

## 🛠️ Patrones de Diseño Implementados  

### 1. **Composite**  
Permite representar la estructura jerárquica de la empresa:  
- Una **Aplicación** está compuesta por **Departamentos**.  
- Los **Departamentos** están compuestos por **Developers**.  
- Tanto `Aplicacion`, `Departamento` como `Developer` implementan la interfaz **Composite**, lo que permite recorrer toda la estructura de manera uniforme usando `getInfo()`.  

### 2. **Builder**  
Facilita la creación de diferentes tipos de aplicaciones de manera flexible:  
- `BuilderAppWeb`: construye aplicaciones web.  
- `BuilderAppEsc`: construye aplicaciones de escritorio.  
- `Director`: coordina el proceso de construcción.  
- `Aplicacion`: es el producto final que se construye.  

### 3. **Prototype**  
Permite clonar objetos `Developer` para añadir múltiples empleados de manera eficiente sin necesidad de instanciarlos manualmente cada vez.  
- `Developer` implementa el prototipo mediante el método `clonar()`.  

---

## 📂 Diagrama del Proyecto  

<img width="1512" height="760" alt="ClasesComposite" src="https://github.com/user-attachments/assets/0cec5d81-2075-4418-a63d-3c0bd58ad8e7" />
