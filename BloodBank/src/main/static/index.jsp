<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body style="background-image: url('https://img.freepik.com/free-vector/medical-blood-donation-testing-vector-illustration_1308-182435.jpg?semt=ais_hybrid&w=740&q=80');
             background-size: cover;
             background-repeat: no-repeat;
             background-attachment: fixed;">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Blood Bank</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Register.jsp">Register</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Dropdown
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="SearchDonor.jsp" tabindex="1" >SearchDonor</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<!-- Left Side Register Box -->
<div class="container-fluid mt-4">
    <div class="row">
        <!-- Left Box -->
        <div class="col-md-3">
            <div class="card shadow-lg p-3" style="border-radius:15px;">
                <h4 class="text-center mb-3">Blood Bank</h4>

                <a href="Register.jsp" class="btn btn-danger w-100">
                    Click to Register
                </a>
            </div>
        </div>
    </div>
</div>
<div class="container d-flex justify-content-center align-items-center" style="height:70vh;">
    <div class="text-center p-4" style="background: rgba(255,255,255,0.9); border-radius: 15px;">
        <h2 style="color:#dc3545; font-weight:bold;">
            Donate blood, give someone another chance at life
        </h2>
        <p style="color:#555; font-size:18px; margin-top:10px;">
            One small act. One big impact.
        </p>
    </div>
</div>

</body>
</html>