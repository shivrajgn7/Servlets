<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<body style="text-align:left;background-color:c0c0c0" >
<div style="display: flex; align-items: center; justify-content: center; width: 100vw; background-color: #c0c0c0">
    <div style="width: 65vw; margin: 20px 0 20px 0; box-shadow: 0px 0px 20px 0px ;background-color:#808080">
        <h1 style="color:#00000; text-align:center;font-family: Impact" >Register for Fitness Club</h1>

        <h3 style="color:#220643; text-align:center;font-family: Flexport" >Get Ready to chase your goal</h3>

        <form style="padding:50px" action="success" method="post">
            <div class="mb-3"  id="formFields">
>
                <label for="exampleFormControlInput1" class="form-label">Enter your name</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" name="name" required>
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Email address</label>
                <input type="email" class="form-control" id="exampleFormControlInput2" name="email" placeholder="name@example.com" required>
            </div>
            <div class="mb-3">
                            <label for="exampleFormControlInput1" class="form-label">Enter your Age</label>
                            <input type="number" class="form-control" id="exampleFormControlInput3" name="age" >
                        </div>
            <div class="mb-3">
                     <label for="exampleFormControlInput1" class="form-label">Enter your Weight (KG)</label>
                  <input type="number" class="form-control" id="exampleFormControlInput7" name="weight" disabled >
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


                <input type=submit name="submit" placeholder="Register">
            </form>
            </div>
            </div>

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
           </script>




</body>
</html>