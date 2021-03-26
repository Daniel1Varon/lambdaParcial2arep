# Parcial Segundo tercio arep

## Daniel Alejandro Varón Rojas

Primero se crea el servicio que contiene el metodo a usar, se genera el jar y lo subimos a el servicio de lambda AWS

![Lambda conf](https://github.com/Daniel1Varon/lambdaParcial2arep/blob/master/img/Configuraci%C3%B3n%20lambda.JPG)

Ahora pasamos a probar el jar que ingresamos dandole un valor a ese metodo.

![Lambda test](https://github.com/Daniel1Varon/lambdaParcial2arep/blob/master/img/Prueba%20lambda.JPG)

Creamos un api gateway al cual le asignamos el lambda creado y configuramos todo para poder hacer pruebas.

![Gateway test](https://github.com/Daniel1Varon/lambdaParcial2arep/blob/master/img/Prueba%20Api%20gateway.JPG)

Creamos una etapa para poderle pasar un query.

![Gateway test](https://github.com/Daniel1Varon/lambdaParcial2arep/blob/master/img/Creaci%C3%B3n%20etapa.JPG)

y por ultimo se prueba en el navegador pasandole el valor.

![Gateway test](https://github.com/Daniel1Varon/lambdaParcial2arep/blob/master/img/Prueba%20navegador.JPG)