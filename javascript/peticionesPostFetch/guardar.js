let form = document.querySelector('form')



form.addEventListener('submit', function(e){
    e.preventDefault()

    let producto = document.getElementById('producto').value
    let precio = document.getElementById('precio').value

    saveProduct(producto, precio)

})

function saveProduct(producto, precio){

    const data = {
        nombreProducto : producto,
        precio : precio
    }

    fetch('http://localhost:8080/api/producto' ,{ 
        method: 'POST',
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(function(res){
        if(res.ok) console.log(res)
    })
    .catch(function(error){
        console.log(error)
    })


}