# (A7) Cross-Site Scripting (XSS)

## Cross Site Scripting

### Lesson 2: What is XSS?

- Open a second tab and use the same url as this page you are currently on (or any url within this instance of WebGoat)

- Then, on that second that open the browser developer tools and open the javascript console. And type: `alert(document.cookie);`

- Type `yes`

### Lesson 7: Try It! Reflected XSS

The goal of the assignment is to identify which field is susceptible to XSS.

We can see that credit card number is passed to the purchase confirmation. This is our way in. Put `<script>console.log('XSS')</script>` or `<script>alert('XSS')</script>` into credit card number input.

### Lesson 10: Identify potential for DOM-Based XSS

The goal is to find route.

- Go to `Dev Tools`
- Go to `Sources`
- Open `localhost:8081/WebGoat/js/goatApp/view/GoatRouter.js`, line 52 there is test route.
- Combine it with base route which is `start.mvc` it is done.
The answer is `start.mvc#test/`.

### Lesson 11: Try It! DOM-Based XSS

- Open new tab and go to `http://localhost:8081/WebGoat/start.mvc#test/%3Cscript%3Ewebgoat.customjs.phoneHome()%3C%2Fscript%3E` then copy the number and paste in on challange page.

### Lesson 12: The Quiz

1. Solution 4: No because the browser trusts the website if it is acknowledged trusted, then the browser does not know that the script is malicious.
2. Solution 3: The data is included in dynamic content that is sent to a web user without being validated for malicious content.
3. Solution 1: The script is permanently stored on the server and the victim gets the malicious script when requesting information from the server.
4. Solution 2: They reflect the injected script off the web server. That occurs when input sent to the web server is part of the request.
5. Solution 4: No there are many other ways. Like HTML, Flash or any other type of code that the browser executes.
