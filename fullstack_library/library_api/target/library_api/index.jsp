<!DOCTYPE html>
<html>

<head>
    <title>Library Management System</title>
    <style>
        /* Modern, centered layout */
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
        }

        h1 {
            color: #2c3e50;
            margin-bottom: 20px;
            text-align: center;
        }

        /* Input form styling */
        .input-form {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
            margin-bottom: 20px;
        }

        input {
            width: calc(100% - 22px);
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
        }

        button {
            background-color: #3498db;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
            margin-top: 10px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #2980b9;
        }

        /* Book list styling */
        #book-list {
            width: 100%;
            max-width: 500px;
        }

        .book {
            background: white;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin-bottom: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .book-info {
            flex-grow: 1;
        }

        .book-title {
            font-weight: bold;
            color: #2c3e50;
        }

        .book-author {
            color: #7f8c8d;
            font-size: 14px;
        }

        .delete-btn {
            background-color: #e74c3c;
            padding: 5px 10px;
            font-size: 14px;
        }

        .delete-btn:hover {
            background-color: #c0392b;
        }
    </style>
</head>

<body>
    <h1>📚 Library Management System</h1>

    <div class="input-form">
        <input id="title" placeholder="Book Title (e.g., Clean Code)">
        <input id="author" placeholder="Author (e.g., Robert Martin)">
        <button onclick="addBook()">Add Book</button>
        <input type="submit" value="Submit">
    </div>

    <div id="book-list"></div>

    <script type="text/javascript" src="js/app.js" defer></script>
</body>

</html>