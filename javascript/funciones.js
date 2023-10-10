
// FUNCIONES ===============================================================================


// a) Sin parámetros y sin retorno
function suma(){
    console.log(5+5)
}

// const sumaDos = () => {
//     console.log(5+6)
// }

const sumaDos = () => console.log(5+6)
   
//suma()
//sumaDos()


// b ) Sin parámetros y con retorno
function multiplicacion(){
    return 5*5
}

// const multiplicacionDos = () => {
//     return 5*6
// }

const multiplicacionDos = () => 5*10


let resultadoMultiplicacion = multiplicacion()
//console.log(resultadoMultiplicacion)

let resultadoMultiplicacionDos = multiplicacionDos()
//console.log(resultadoMultiplicacionDos)


// c ) Sin parámetros y sin retorno

function division(num1,num2){
    console.log(num1 / num2)
}

// const divisionDos = (num1,num2) => {
//     console.log(num1 / num2)
// }

const divisionDos = (num1,num2) => console.log(num1 / num2)
   
//division(10,5)
//divisionDos(20,2)


// c ) Con parámetros y con retorno

function resto(num1,num2){
    return num1%num2
}

let resultadoResto = resto(10,3)
console.log(resultadoResto)

// const restoDos = (num1,num2) =>{
//     return num1%num2
// }

const restoDos = (num1,num2) => num1num2

let resultadoRestoDos = resto(11,3)
console.log(resultadoRestoDos)




