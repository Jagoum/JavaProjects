const API_BASE_URL = 'http://localhost:8081';

/**
 *  Load  a books 
 */
async function loadBooks() {
    const response = await fetch(`${API_BASE_URL}/api/books`);
    const books = await response.json();
    const bookList = document.getElementById('book-list');
    bookList.innerHTML = books.map(book => `
        <div class="book">
            <strong>${book.title}</strong> by ${book.author}
            <button onclick="deleteBook(${book.id})">Delete</button>
        </div>
    `).join('');
}


/**
 *  Add a new book
 */
async function addBook() {
    const title = document.getElementById('title').value;
    const author = document.getElementById('author').value;
    await fetch(`${API_BASE_URL}/api/books`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: `title=${title}&author=${author}`
    });
    loadBooks(); // Refresh the list
}

// Delete a book
async function deleteBook(id) {
    await fetch(`${API_BASE_URL}/api/books?id=${id}`, { method: 'DELETE' });
    loadBooks();
}

// Initialize
loadBooks();
