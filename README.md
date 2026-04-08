# 📖 Mom's Diary

A simple and beautiful Android diary app where Mom can write poetry, articles, and personal entries — all stored privately on the device.

---

## 📱 Features

- Write diary entries with a title, author name, and content
- Entries are saved locally on the device using `localStorage`
- View all saved entries, newest first
- Delete any entry with a confirmation prompt
- Every entry is timestamped automatically
- Input validation — empty entries cannot be saved
- Keyboard shortcut: **Ctrl + Enter** to save an entry

---

## 🛠 Tech Stack

| Layer      | Technology                  |
|------------|-----------------------------|
| Android    | Java (AppCompatActivity)    |
| UI         | WebView + HTML/CSS/JS       |
| Storage    | localStorage (DOM Storage)  |
| Fonts      | Google Fonts (Playfair Display, Lora) |

---

## 🚀 How to Run

1. Clone this repository
2. Open in **Android Studio**
3. Place `index.html` inside `app/src/main/assets/`
4. Build and run on an emulator or physical device (Android 5.0+)

---

## 📁 Project Structure

```
MomsDiary/
├── app/
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/example/momsdiary/
│           │   └── MainActivity.java
│           └── assets/
│               └── index.html
```

---

## 🔒 Security Notes

- All user input is rendered using `textContent` (not `innerHTML`) to prevent XSS attacks
- No data is sent to any server — everything stays on the device

---

## 🙋‍♀️ Author

Made with ❤️ by Aaditi Kale
