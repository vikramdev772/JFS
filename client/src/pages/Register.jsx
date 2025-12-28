import React, { useState } from "react";

function Register() {
  // 1️⃣ Single object to store all form data
  const [user, setUser] = useState({
    name: "",
    email: "",
    password: "",
  });

  // 2️⃣ onChange handler (uses spread operator)
  const handleChange = (e) => {
    const { name, value } = e.target;

    setUser({
      ...user, // spread operator → keeps old data
      [name]: value, // updates only the changed field
    });
  };

  // 3️⃣ onClick / onSubmit handler
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("User Data:", user);

    
  };

  return (
    <>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="name"
          placeholder="name"
          onChange={handleChange}
        />
        <br />

        <input
          type="email"
          name="email"
          placeholder="email"
          onChange={handleChange}
        />
        <br />

        <input
          type="password"
          name="password"
          placeholder="password"
          onChange={handleChange}
        />
        <br />

        <button type="submit">Submit</button>
      </form>
    </>
  );
}

export default Register;
