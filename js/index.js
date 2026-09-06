
const imprimir = ((mensaje) => {
    return console.log(mensaje);

})
// Ejercicio 1 (Básico):
// Escribe una función que reciba un número y devuelva si es par o impar.
const esParOimpar = ((numero, esPar) => {

    return numero % 2 == 0 ? esPar && imprimir("El número es par") : !esPar && imprimir("El número es impar");

});


// Ejercicio 2 (Intermedio):
// Escribe una función que reciba un array de números y devuelva
// un nuevo array solo con los números primos que contiene.
// generate a random integer in [0,9]


const esPrimo = (n) => {
    if (n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
};
const fuNarrayAleatorio = (() => {
    const arrayAleatorio = [];
    for (let i = 0; i < 10; i++) {
        arrayAleatorio.push(Math.floor(Math.random() * 100));
    }
    return arrayAleatorio;
});


const numerosPrimos = ((array = fuNarrayAleatorio()) => {  
    const numeros = array.filter(esPrimo);
    console.log(numeros);
    return numeros;
});




numerosPrimos();






// Ejercicio 3 (Avanzado):
// Escribe una función que reciba una cadena de texto y determine
// si es un palíndromo válido, ignorando espacios, mayúsculas/minúsculas
// y signos de puntuación.

// Ejercicio 4 (Intermedio):
// Escribe una función que reciba un array de números y devuelva
// un objeto con dos arrays: uno con los números pares y otro con los impares.

const separarParesEimpares = ((array=[8,7,5,4,2,2,3,3,7]) => {

const numeros ={
    pares: array.filter((n)=> n % 2 === 0),
    impares: array.filter((n)=> n % 2 !== 0)
}
console.log(numeros.pares);
console.log(numeros.impares);

}
)

separarParesEimpares();


// Ejercicio 5 (Intermedio):
// Escribe una función que reciba un array de strings y devuelva
// un objeto que cuente cuántas veces aparece cada string en el array.


const arrayDeStrings = ((array=['js', 'python', 'java'])=>{

    const contador={
        numero: array.length
    }
    
    console.log(contador.numero);


})
arrayDeStrings();


// Ejercicio 6 (Básico):
// Escribe una función que reciba un array de números y devuelva
// el número mayor y el número menor del array.



const numeroMayor =((numero=[n])=>{

    return numero.filter((n)=> n === Math.max(...numero));

})

const numeroMenor =((numero=[n])=>{

    return numero.filter((n)=> n === Math.min(...numero));

})


let aleatorioNum = fuNarrayAleatorio();
const mayorYMenor = ((array = [aleatorioNum]) => {


console.log(`Array aleatorio: ${aleatorioNum}`);
console.log(`El número mayor es: ${numeroMayor(aleatorioNum)}`);
console.log(`El número menor es: ${numeroMenor(aleatorioNum)}`);

});
mayorYMenor();


// Ejercicio 7 (Intermedio):
// Escribe una función que reciba un array de objetos representando
// productos (cada uno con "nombre" y "precio") y devuelva el precio
// total de la compra, aplicando un 10% de descuento si el total
// supera los 100.



const totalDeCompra = ((productos) => {

    productos.forEach((p) => console.log(p.nombre, p.precio));

    const total = productos.reduce((acc, p) => acc + p.precio, 0);

    return total > 100 ? total * 0.9 : total;

});

const productos = [
    {
        nombre: 'productoUno',
        precio: 4
    },
    {
        nombre: 'productoDos',
        precio: 10
    },
    {
        nombre: 'productoTres',
        precio: 200
    }
];

console.log(`Total de la compra: ${totalDeCompra(productos)}`);