

// VARIABLES ========================================================================

// TIPO CADENA DE TEXTO (String)
let nombre = 'Ana'
console.log(nombre,'Tipo de la variable:' + typeof(nombre))

// TIPO ENTERO (Integer)
let numero = 10
console.log(numero,'Tipo de la variable:' + typeof(numero))

let decimal = 10.10
console.log(decimal,'Tipo de la variable:' + typeof(decimal))



// TIPO BOOLEANO (Boolean)
let pagado = true
console.log(pagado,'Tipo de la variable:' + typeof(pagado))


// TIPO ARREGLO (Array) - Object
let numeros = [23, 'Ana', true, 30.88]
console.log(numeros,'Tipo de la variable:' + typeof(numeros))
console.log('Primer elemento del array' , numeros[0])
console.log('Segundo elemento del array' , numeros[1])
console.log('Tercero elemento del array' , numeros[2])
console.log('Cuarto elemento del array' , numeros[3])

// TIPO ARREGLO Objeto - Object
let persona = {
    'nombre': 'Pepe',
    'email' : 'pepe@es.es',
    'edad': 32
}

console.log(persona,'Tipo de la variable:' + typeof(persona))
console.log('Nombre:', persona.nombre)
console.log('Email:', persona.email)
console.log('Edad:', persona.edad)


// TIPO NULO (null) - Object   // Valor desconocido 
let valorDesconocido = null;
console.log(valorDesconocido,'Tipo de la variable:' + typeof(valorDesconocido))


// TIPO INDEFINIDO (undefined)  // Varible sin asignación
let valorVariable
console.log(valorVariable,'Tipo de la variable:' + typeof(valorVariable))


// Resignación del valor de las variables

let nombrePersona = 'Pepe'


console.log('Nombre de lapersona ' ,nombrePersona)


nombrePersona = 'Juan'

console.log('Nombre de lapersona ' ,nombrePersona)


// no puedo Redeclarar variables

//let nombrePersona = 'Emilio'



// CONSTANTES ========================================================================

// Valores fijos (inmutables)

const email = 'juan@es.es'

console.log(email)

//email = 'juna@es.es'

console.log(email)


// no puedo Redeclarar variables

//const email =  'juana@es.es'






   



