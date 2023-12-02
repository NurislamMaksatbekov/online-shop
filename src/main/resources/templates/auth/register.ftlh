<#import "../layout.ftlh" as main>
<@main.layout>
    <section class="vh-100">
        <div class="container py-5 h-100">
            <div class="row d-flex align-items-center justify-content-center h-100">
                <div class="col-md-8 col-lg-7 col-xl-4">
                    <img src="https://www.pngitem.com/pimgs/m/77-771530_customer-icon-png-new-user-registration-icon-transparent.png"
                         class="img-fluid" alt="Phone image">
                </div>
                <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                    <form action="/auth/register" method="post">
                        <div class="form-outline mb-4">
                            <input type="text" name="name" id="form1Example13"
                                   class="form-control form-control-lg" required/>
                            <label class="form-label" for="form1Example13">Name</label>
                        </div>
                        <div class="form-outline mb-4">
                            <input type="email" name="email" id="form1Example13"
                                   class="form-control form-control-lg" required/>
                            <label class="form-label" for="form1Example13">Email address</label>
                        </div>
                        <div class="form-outline">
                            <input type="password" name="password" id="form1Example23"
                                   class="form-control form-control-lg" required/>
                            <label class="form-label" for="form1Example23">Password</label>
                        </div>
                        <div class="form-outline mb-4">
                            <p>Who are you?</p>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="role" id="exampleRadios1" value="BUYER" checked>
                                <label class="form-check-label" for="exampleRadios1">
                                    BUYER
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="role" id="exampleRadios2" value="SELLER">
                                <label class="form-check-label" for="exampleRadios2">
                                    SELLER
                                </label>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary btn-lg btn-block">Sign up</button>
                    </form>
                </div>
            </div>
        </div>

        <script>
            document.getElementById('login-form').addEventListener('submit', onLoginHandler)

            function onLoginHandler(event) {
                let form = event.target
                let userFormData = new FormData(form)
                let user = Object.fromEntries(userFormData)
                saveUser(user)
            }
        </script>
    </section>
</@main.layout>