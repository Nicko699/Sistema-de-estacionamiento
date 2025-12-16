# 🚗 Sistema de Administración de Estacionamiento

> Sistema de gestión para estacionamientos con múltiples tarifas y generación de reportes diarios

## 📋 Descripción

Aplicación de consola en Java que administra el ingreso de vehículos a un estacionamiento, calcula las tarifas según el tipo de servicio y genera un reporte de ingresos del día.

## 🎯 Funcionalidades

- 📝 Registro de vehículos por placa
- 💵 Cálculo automático de tarifas
- 📊 Reporte de ingresos diarios
- ✅ Validación de entrada de datos
- 🔄 Procesamiento de múltiples vehículos hasta escribir "Fin"

## 💰 Tarifas de Estacionamiento

| Tipo de Servicio | Duración | Tarifa Base | Descuento | Total |
|------------------|----------|-------------|-----------|-------|
| **Por Hora** | 1-4 horas | $3/hora | - | $3 - $12 |
| **Media Jornada** | 5 horas | $15 | 5% | $14.25 |
| **Jornada Completa** | Hasta 10 horas | $30 | 10% | $27 |

## 🚀 Cómo usar

### Requisitos
- Java JDK 8 o superior

### Ejecución

```bash
# Compilar
javac admestacionamiento/AdmEstacionamiento.java

# Ejecutar
java admestacionamiento.AdmEstacionamiento
```

### Ejemplo de uso

```
Ingrese la placa del vehículo
> ABC123

Ingrese el tipo de estacionamiento:
1. Por Hora
2. Media Jornada (5 horas)
3. Jornada Completa (Hasta 10 horas)
> 1

Ingrese la cantidad de horas (1-4)
> 3
El total a pagar es de 9.0USD

Ingrese la placa del vehículo
> XYZ789

Ingrese el tipo de estacionamiento:
1. Por Hora
2. Media Jornada (5 horas)
3. Jornada Completa (Hasta 10 horas)
> 2
Con un descuento del 5%. El total a pagar es de 14.25USD

Ingrese la placa del vehículo
> Fin

**************** Total del Dia ********************
Cantidad total de estacionamientos por hora: 1
Cantidad total de estacionamientos por Media Jornada: 1
Cantidad total de estacionamientos por Jornada Completa: 0
Total de ingresos en el dia: 23.25
```

## 📊 Reporte del Día

Al finalizar el día (escribiendo "Fin"), el sistema genera un reporte con:

- 🔢 Cantidad de vehículos por cada tipo de servicio
- 💵 Total de ingresos generados
- 📈 Resumen completo de operaciones

## 🛠️ Tecnologías

- Java SE
- Scanner para entrada de datos
- Manejo de excepciones
- Estructuras de control (switch, while)

## 👤 Autor

**Nicko699**
- GitHub: [@Nicko699](https://github.com/Nicko699)

---

💡 **Proyecto educativo para practicar estructuras de control y acumuladores en Java**
