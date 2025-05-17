// Fetch and display books
async function loadBooks() {
    const response = await fetch('<http://localhost:8081/api/books>');
    const books = await response.json();
    const bookList = document.getElementById('book-list');
    bookList.innerHTML = books.map(book => `
        <div class="book">
            <strong>${book.title}</strong> by ${book.author}
            <button onclick="deleteBook(${book.id})">Delete</button>
        </div>
    `).join('');
}

// Add a new book
async function addBook() {
    const title = document.getElementById('title').value;
    const author = document.getElementById('author').value;
    await fetch('/api/books', {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: `title=${title}&author=${author}`
    });
    loadBooks(); // Refresh the list
}

// Delete a book
async function deleteBook(id) {
    await fetch(`/books?id=${id}`, { method: 'DELETE' });
    loadBooks();
}

// Initialize
loadBooks();
