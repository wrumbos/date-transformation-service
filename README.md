# date transformacion service

REST API for date transformacion

## TΓ³picos
*  **[π Requerimientos / tecnologias](#-requerimientos)**
*  **[π Solucion](#-Solucion)**
*  **[π Estructura de Directorios](#-estructura-de-directorios)**

## π Requerimientos / Tecnologias
```
Java 11
Spring boot 2.5.0
lombok
```
## π Solucion

El proyecto se compone de un servicio rest POST que al ser invocado se le envia una hora con una zona horaria, 
y el mismo devuelve la hora UTC.

## π Estructura de Directorios
```
π¦ resume-api 
β
β  
ββπ src                  CΓ³digo fuente
β β
β ββπ java               MΓ³dulos raΓ­ces para el software
β β
β ββπ test               Pruebas funcionales del software
β
ββπ README.md            Documentacion del software

```
## π Pruebas
* Caso de exito
![](resources/images/1.png)
* Caso fallido
![](resources/images/2.png)