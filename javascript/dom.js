
let botonGuardar = document.getElementById('btnGuardar')
let botonConsultar = document.getElementById('btnConsultar')
let botonModificadr = document.getElementById('btnModificar')
let botonEliminar = document.getElementById('btnBorrar')


let nombre = document.getElementById('nombre')
let busqueda = document.getElementById('resultadoBusqueda')

// Evento click
botonGuardar.addEventListener('click' , function(){
    alert('Guardando ...')
})

botonConsultar.addEventListener('click' , function(){
    alert('Consultando ...')
})

botonModificadr.addEventListener('click' , function(){
    alert('Modificando ...')
})


botonEliminar.addEventListener('click' , function(){
    alert('Eliminando ...')
})



// Buscador
nombre.addEventListener('keyup' , () => {
    console.log(nombre.value)

    if(nombre.value == 'pepe')
        busqueda.innerHTML = 'Pepe'
    else
        busqueda.innerHTML = 'Sin resultados ...' 
    
})

//  ================================================================


// Formulario de registro

let marca = document.getElementById('marca')
let modelo = document.getElementById('modelo')

let datosFormulario = document.getElementById('datosCoches')

let form = document.getElementById('form')


form.addEventListener('submit', function(e){
    e.preventDefault()
    datosFormulario.innerHTML = marca.value + ' ' + modelo.value
})

//  ================================================================


// Desplegable de paises

let paises = document.querySelector('select')
let paisesForm = document.getElementById('paisesForm')


const getForm = () => {
    paisesForm.addEventListener('submit', (e) => {
        e.preventDefault()
       
        switch(paises.value){
            case '1':
                console.log("España")
                break;
            case '2':
                console.log("Ingalterra")
                break;

            case '3':
                console.log("Holanda")
                break;

            default:
                console.log('Opción inválida')
                break;
        }
    })
}

getForm()

const getCountry = () => {
    paises.addEventListener('change' , () => {
       
        //console.log(paises.value)

        switch(paises.value){
            case '1':
                console.log("España")
                break;
            case '2':
                console.log("Ingalterra")
                break;

            case '3':
                console.log("Holanda")
                break;


            default:
                console.log('Opción inválida')
                break;
        }
    })
}


//getCountry()
















