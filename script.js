// Function to generate a unique Customer ID
function generateCustomerId() {
    return 'CUST' + Math.floor(Math.random() * 1000000);
}

// Registration form submission handler
document.getElementById('registerForm')?.addEventListener('submit', function (e) {
    e.preventDefault();

    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const address = document.getElementById('address').value;

    // Check if the user is already registered
    if (localStorage.getItem(email)) {
        alert('User already registered. Redirecting to the login page.');
        window.location.href = 'login.html';
        return;
    }

    // Password confirmation check
    if (password !== confirmPassword) {
        alert('Passwords do not match!');
        return;
    }

    const customerId = generateCustomerId();
    const user = {
        customerId,
        firstName,
        lastName,
        email,
        phone,
        password,
        address,
    };

    // Save user data in Local Storage
    localStorage.setItem(email, JSON.stringify(user));
    alert('User registration successful!');
    window.location.href = 'login.html';
});

// Login form submission handler
document.getElementById('loginForm')?.addEventListener('submit', function (e) {
    e.preventDefault();

    const email = document.getElementById('loginEmail').value;
    const password = document.getElementById('loginPassword').value;
    const user = JSON.parse(localStorage.getItem(email));

    // Validate login credentials
    if (user && user.password === password) {
        sessionStorage.setItem('loggedInUser', email);
        window.location.href = 'profile.html';
    } else {
        alert('Invalid email or password!');
    }
});

// Display user profile information on profile page
window.onload = function () {
    const loggedInUser = sessionStorage.getItem('loggedInUser');
    if (loggedInUser) {
        const user = JSON.parse(localStorage.getItem(loggedInUser));
        document.getElementById('customerId').textContent = user.customerId;
        document.getElementById('profileFirstName').textContent = user.firstName;
        document.getElementById('profileLastName').textContent = user.lastName;
        document.getElementById('profileEmail').textContent = user.email;
        document.getElementById('profilePhone').textContent = user.phone;
        document.getElementById('profileAddress').textContent = user.address;
    }
};

