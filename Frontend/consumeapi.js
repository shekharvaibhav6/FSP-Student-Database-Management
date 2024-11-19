const apiUrl = "http://localhost:8080/api/std/all";

function fetchData() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const tableBody = document.querySelector('#studentTable tbody');
            tableBody.innerHTML = ''; // Clear existing rows in tbody

            data.forEach(user => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.age}</td>
                `;
                tableBody.appendChild(row); // Append row to tbody
            });
        })
        .catch(error => {
            console.error("Error fetching data:", error);
        });
}

// Fetch data when the page loads
window.onload = fetchData;
