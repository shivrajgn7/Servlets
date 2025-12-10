<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Donor</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }
        .form-container {
            background: rgba(255, 255, 255, 0.95);
            padding: 30px;
            border-radius: 15px;
            max-width: 600px;
            margin: 50px auto;
            box-shadow: 0 8px 16px rgba(0,0,0,0.3);
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
        }
        .result-box {
            margin-top: 15px;
            padding: 10px;
            background: #f8f9fa;
            border-radius: 10px;
        }
    </style>
</head>

<body>
<div class="form-container">
    <h2>Search Donor Using Mobile Number</h2>

    <form action="donar" method="get" onsubmit="return validateNumber()">
        <div class="mb-3">
            <label for="number" class="form-label">Phone:</label>
            <input type="text"
                   class="form-control"
                   name="number"
                   id="number"
                   placeholder="Enter 10-digit phone number"
                   required>
            <small id="errorMsg" style="color:red;"></small>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary btn-lg">Search</button>
        </div>
    </form>

    <div class="result-box">
        <p><strong>Result:</strong> ${dto}</p>
    <c:if test="${not empty dto}">
    <p><strong>Owner:</strong> ${dto.name}</p>
    <p><strong>Phone:</strong> ${dto.number}</p>
    </c:if>


        <c:if test="${not empty message}">
            <p style="color:red;">${message}</p>
        </c:if>
    </div>
</div>
<!-- Return Button -->
<div style="margin-top:20px; text-align:center;">
    <a href="index.jsp"
       style="display:inline-block;
              text-decoration:none;
              background:#0d6efd;
              color:white;
              padding:10px 20px;
              border-radius:6px;
              font-size:16px;">
           Return to Home
    </a>

<script>
    function validateNumber() {
        const input = document.getElementById("number");
        const error = document.getElementById("errorMsg");

        const value = input.value.trim();

        if (!/^\d{10}$/.test(value)) {
            error.textContent = "Please enter a valid 10-digit phone number";
            return false;
        } else {
            error.textContent = "";
            return true;
        }
    }
</script>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
