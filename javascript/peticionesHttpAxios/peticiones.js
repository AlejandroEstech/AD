
        // Realiza una solicitud GET
        axios.get('https://jsonplaceholder.typicode.com/posts')
            .then(function (response) {
                // Manipula la respuesta de la solicitud
                console.log(response.data);
            })
            .catch(function (error) {
                // Maneja errores de la solicitud
                console.log(error);
            });
