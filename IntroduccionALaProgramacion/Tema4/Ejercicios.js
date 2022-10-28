// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

const numeroIf = 5;

if (numeroIf < 0) {
  console.log("La variable es Negativa");
} else if (numeroIf === 0) {
  console.log("La variable es 0");
} else {
  console.log("La variable es Positiva");
}

// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
// Incrementar el valor de la variable en uno cada vez que se ejecute.
// Mostrarlo por pantalla cada vez que se ejecute.

let numeroWhile = 0;

while (numeroWhile < 3) {
  console.log("Variable: ", numeroWhile);
  numeroWhile++;
}

// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

let numeroDoWhile = 0;

do {
  console.log("Variable: ", numeroDoWhile);
  numeroDoWhile++;
  break;
} while (numeroDoWhile < 3);

// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

let i = 0;

for (i; i <= 3; i++) {
  console.log(i);
}

// Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

const estacion = "primavera";

switch (estacion) {
  case "primavera":
    return console.log("Estamos en primavera");
  case "verano":
    return console.log("Estamos en verano");
  case "otoño":
    return console.log("Estamos en otoño");
  case "invierno":
    return console.log("Estamos en invierno");
  default:
    return console.log("Estacion Random");
}
