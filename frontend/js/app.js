document.getElementById('conversor-form').addEventListener('submit', function(event) {
    event.preventDefault();

    var from = document.getElementById('from').value;
    var to = document.getElementById('to').value;
    var cantidad = document.getElementById('cantidad').value;

    fetch('http://localhost:8080/convert', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            from: from,
            to: to,
            cantidad: cantidad
        }),
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });
});