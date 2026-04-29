# 🎬 EntertainMe

EntertainMe is a web-based entertainment recommendation system that helps users discover movies, books, and music based on trends, ratings, and personal preferences.

---

## 📌 Project Description

EntertainMe provides a centralized platform where users can:
- Search and explore entertainment content
- Get recommendations
- Save favourites into watchlist
- Write and view reviews

---

## 🎯 Project Objective

The objective of this project is to:
- Help users discover new entertainment content
- Provide personalized recommendations
- Allow users to manage their watchlist
- Enable user interaction through ratings and reviews
- Build a full-stack web application using modern technologies

---

## 👨‍💻 Tech Stack

### Frontend
- HTML5
- CSS3 (Bootstrap 5)
- JavaScript (Vanilla JS)

### Backend
- Node.js
- Express.js
- MongoDB Atlas
- Mongoose

---

## 📁 Project Structure


entertainme/
│
├── css/
├── img/
├── js/
│ ├── api.js
│ ├── auth.js
│ ├── search.js
│ ├── review.js
│ ├── watchlist.js
│ ├── profile.js
│
├── entertainme-backend/
│ ├── models/
│ ├── routes/
│ ├── middleware/
│ ├── server.js
│ ├── .env
│
├── *.html
└── README.md


---

## ⚙️ System Modules

### 1. Authentication
- Register
- Login
- Logout
- Session management

### 2. Profile Management
- View profile
- Update profile
- Change password
- Delete account

### 3. Recommendation / Dashboard
- Show trending content
- Suggest content

### 4. Search & Filter
- Search by title / keyword
- Filter by:
  - Type
  - Genre
  - Year
  - Rating

### 5. Watchlist
- Add to watchlist
- Remove from watchlist
- View saved items

### 6. Rating & Review
- Add rating
- Write review
- View reviews

---

## 🚀 Backend API

### Auth
- POST `/api/auth/register`
- POST `/api/auth/login`

### Users
- GET `/api/users/profile`
- PUT `/api/users/profile`
- PUT `/api/users/change-password`
- DELETE `/api/users/profile`

### Items
- GET `/api/items`
- GET `/api/items/:id`

### Reviews
- POST `/api/reviews`
- GET `/api/reviews/item/:itemId`
- GET `/api/reviews/my-reviews`

### Watchlist
- POST `/api/watchlist`
- GET `/api/watchlist`
- DELETE `/api/watchlist/:itemId`

---

## 🔧 Installation

### 1. Clone project

git clone <your-repo-link>
cd entertainme


---

### 2. Backend setup

cd entertainme-backend
npm install


---

### 3. Create `.env`

MONGO_URI=your_mongodb_connection
JWT_SECRET=your_secret_key
PORT=5000


---

### 4. Run backend

npm run dev


Backend URL:

http://localhost:5000


---

### 5. Run frontend
Open:

login.html


---

## 🔗 Frontend API Integration Guide

### API Base
```js
const API_BASE_URL = "http://localhost:5000/api";
Auth Header
function authHeaders() {
  return {
    "Content-Type": "application/json",
    "Authorization": `Bearer ${localStorage.getItem("token")}`
  };
}
🔐 Login Example
fetch(`${API_BASE_URL}/auth/login`, {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({ email, password })
});
🔍 Get Items
fetch(`${API_BASE_URL}/items`);
⭐ Add Review
fetch(`${API_BASE_URL}/reviews`, {
  method: "POST",
  headers: authHeaders(),
  body: JSON.stringify({
    itemId,
    rating,
    comment
  })
});
📌 Watchlist
Add
fetch(`${API_BASE_URL}/watchlist`, {
  method: "POST",
  headers: authHeaders(),
  body: JSON.stringify({ itemId })
});
Remove
fetch(`${API_BASE_URL}/watchlist/${itemId}`, {
  method: "DELETE",
  headers: authHeaders()
});
Get
fetch(`${API_BASE_URL}/watchlist`, {
  headers: authHeaders()
});
⚠️ Important Rules
❗ Do NOT use mock data anymore
❗ Always call backend API
❗ Use _id from MongoDB
❗ Include token for protected routes
❗ Test API using Postman first
👥 Team Members
Name	Role
Soh Chang Zheng (Leader)	Backend + Search
Tiew Yi Xu	Dashboard
Tay Yi Lin	Review
Kwong Jia Yee	Watchlist
Boo Ee Vone	Authentication
See Chan Sing	Profile
📌 Current Status
✅ Frontend UI completed
✅ Backend API almost completed
🔄 API integration ongoing
🎯 What You Need To Do

Each member must:

Replace mock data with API
Connect frontend with backend
Use fetch() to call API
Test using Postman first
Ensure dynamic data from database
🐞 Common Errors
Error	Cause
401 Unauthorized	Token missing
404 Not Found	Wrong endpoint
500 Server Error	Backend issue
Buffer timeout	MongoDB connection
🚀 Final Goal
Full-stack working system
Real data from MongoDB
No static/mock data
Fully integrated frontend + backend
📌 Author

Soh Chang Zheng
Team Leader – EntertainMe

✨ Good luck team!


---

## ✅ You can now:
- Copy ALL in one go ✔
- Paste into `README.md` ✔
- Push to GitHub ✔

---

If you want next:
👉 I can help you **write instructions for each teammate (separate tasks)**  
👉 Or help you **prepare demo presentation script**

Just tell me 👍
