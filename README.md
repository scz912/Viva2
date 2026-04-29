# 🎬 EntertainMe

EntertainMe is a web-based entertainment recommendation system that helps users discover movies, books, and music based on trends, ratings, and personal preferences.

---

## 📌 Project Description

EntertainMe is designed to provide users with a centralized platform to explore entertainment content such as movies, books, and music. The system allows users to search, filter, review, and save their favourite content.

---

## 🎯 Project Objective

The objective of this project is to:
- Provide a platform for users to explore entertainment content
- Help users discover new movies, books, and music
- Allow users to manage their personal watchlist
- Enable users to share ratings and reviews
- Deliver a modern and user-friendly web experience

---

## 👨‍💻 Tech Stack

### Frontend
- HTML5
- CSS3 (Bootstrap 5)
- JavaScript (Vanilla JS)

### Backend
- Node.js (Express.js)
- MongoDB (MongoDB Atlas)

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

### 1. Authentication Module
- Register new account
- Login
- Logout
- Session management

### 2. Profile Management
- View profile
- Update profile
- Change password
- Delete account

### 3. Dashboard / Recommendation
- Show trending entertainment
- Recommend content based on user activity

### 4. Search & Browse
- Search by title or keyword
- Filter by:
  - Type (movie, music, book)
  - Genre
  - Year
  - Rating

### 5. Watchlist Module
- Add to watchlist
- Remove from watchlist
- View saved items

### 6. Rating & Review
- Give ratings
- Write reviews
- View other users’ reviews

---

## 🚀 Backend API Overview

### Authentication
| Method | Endpoint |
|--------|---------|
| POST | `/api/auth/register` |
| POST | `/api/auth/login` |

---

### Users
| Method | Endpoint |
|--------|---------|
| GET | `/api/users/profile` |
| PUT | `/api/users/profile` |
| PUT | `/api/users/change-password` |
| DELETE | `/api/users/profile` |

---

### Items
| Method | Endpoint |
|--------|---------|
| GET | `/api/items` |
| GET | `/api/items/:id` |

---

### Reviews
| Method | Endpoint |
|--------|---------|
| POST | `/api/reviews` |
| GET | `/api/reviews/item/:itemId` |
| GET | `/api/reviews/my-reviews` |

---

### Watchlist
| Method | Endpoint |
|--------|---------|
| POST | `/api/watchlist` |
| GET | `/api/watchlist` |
| DELETE | `/api/watchlist/:itemId` |

---

## 🔧 Installation & Setup

### 1. Clone Repository (We have done this part)

```bash
git clone <your-repo-link>
cd entertainme

### 2. Backend Setup
cd entertainme-backend
npm install

### 3. Configure Environment
Create .env file:
MONGO_URI=your_mongodb_connection_string
JWT_SECRET=your_secret_key
PORT=5000

### 4. Run Backend
npm run dev
