function submitForm() {
    // Get form values
    var firstName = document.getElementById('firstName').value;
    var lastName = document.getElementById('lastName').value;
    var dob = document.getElementById('dob').value;
    var country = document.getElementById('country').value;
    var gender = Array.from(document.querySelectorAll('input[name="gender"]:checked')).map(e => e.value);
    var profession = document.getElementById('profession').value;
    var email = document.getElementById('email').value;
    var mobileNumber = document.getElementById('mobileNumber').value;

    // Validate form values (add more validation as needed)
    if (!firstName || !lastName || !dob || !country || gender.length === 0 || !profession || !email || !mobileNumber) {
    alert('Please fill out all fields.');
    return;
    }

    // Display values in a popup
    var message = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dob}\nCountry: ${country}\nGender: ${gender.join(', ')}\nProfession: ${profession}\nEmail: ${email}\nMobile Number: ${mobileNumber}`;

    alert(message);

    // Reset form
    document.getElementById('surveyForm').reset();
  }
