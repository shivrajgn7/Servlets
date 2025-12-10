<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body style="text-align:left;background-color:white" >
<div style="display: flex; align-items: center; justify-content: center; width: 100vw; background-color: #white">
    <div style="width: 45vw; margin: 20px 0 20px 0; box-shadow: 0px 0px 20px 0px ;background-color:#white">
        <h1 style="color:#00000; text-align:center;font-family: Arial" >Donor Registration</h1>

        <h3 style="color:#220643; text-align:center;font-family: Flexport" >Your blood can give someone another heartbeat</h3>

        <form style="padding:50px" action="donar" method="post">
            <div class="mb-3"  id="formFields">
>
                <label for="exampleFormControlInput1" class="form-label">Enter your name</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" name="name" required placeholder="only 15 characters allowed">
            </div>


               <div class="mb-3">
                                     <label for="exampleFormControlInput1" class="form-label">Select your Blood Group</label>
                                    <select class="form-select" id="inputGroupSelect01" name="bgroup" required>
                                    <option selected>Choose...</option>
                                    <option value="A+ve">A+ve</option>
                                    <option value="A-ve">A-ve</option>
                                    <option value="B+ve">B+ve</option>
                                    <option value="B-ve">B-ve</option>
                                    <option value="O+ve">O+ve</option>
                                    <option value="O-ve">O-ve</option>
                                    <option value="AB+ve">AB+ve</option>
                                    <option value="AB-ve">AB-ve</option>
                                    <option value="others">Others</option>
                                        </select>
                            </div>

            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Email address</label>
                <input type="email" class="form-control" id="exampleFormControlInput2" name="email" placeholder="name@example.com" required>
            </div>
            <div class="mb-3">
                            <label for="exampleFormControlInput1" class="form-label">Enter your Age</label>
                            <input type="number" class="form-control" id="exampleFormControlInput3" name="age" placeholder="age must be min (16) , max (50)" >
                        </div>
            <div class="mb-3">
                     <label for="exampleFormControlInput1" class="form-label">Enter your Weight (KG)</label>
                  <input type="number" class="form-control" id="exampleFormControlInput7" name="weight" disabled placeholder="min weight (50)">
                         </div>
                     <div class="mb-3">
                              <label for="exampleFormControlInput1" class="form-label">Enter your Height(cm)</label>
                                <input type="number" class="form-control" id="exampleFormControlInput8" name="height" disabled required>
                                             </div>

                         <div class="mb-3">
                                  <label for="exampleFormControlInput1" class="form-label">Select your Gender</label>
                        <select class="form-select" id="inputGroupSelect01" name="gender" required>
                        <option selected>Choose...</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="others">Others</option>
                   </select>
                </div>

            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label"> Address</label>
                <input type="text" class="form-control" id="exampleFormControlInput6" name="address" placeholder="city name" required>
            </div>
             <div class="mb-3">
                 <label class="form-label">Contact Number</label>
                 <input type="number" class="form-control" id="contactNumber"  name="number" placeholder="Enter 10-digit number" required oninput="validateNumber()">
                 <small id="errorMsg" style="color:red;"></small>
             </div>

                <input type=submit name="submit" placeholder="Register">
            </form>
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
</body>
<script>
           document.getElementById("exampleFormControlInput3").addEventListener("input", function() {
               let age = this.value;

               if (age && age > 0) {
                   document.getElementById("exampleFormControlInput7").disabled = false;
                   document.getElementById("exampleFormControlInput8").disabled = false;
               } else {
                   document.getElementById("exampleFormControlInput7").disabled = true;
                   document.getElementById("exampleFormControlInput8").disabled = true;
               }
           });
           function validateNumber() {
               const input = document.getElementById("contactNumber");
               const error = document.getElementById("errorMsg");

               // Remove non-digit characters
               input.value = input.value.replace(/\D/g, '');

               if (input.value.length > 10) {
                   input.value = input.value.slice(0, 10);
               }

               if (input.value.length < 10) {
                   error.textContent = "Contact number must be 10 digits";
               } else {
                   error.textContent = "";
               }
           }


        </script>
</html>