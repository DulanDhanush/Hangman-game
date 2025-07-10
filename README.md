# 🎯 Hangman Game in Java

This is a simple and interactive **Hangman game** built in Java. The game selects a random word from a text file and allows the player to guess letters one at a time. You have only six chances to guess wrong—so choose wisely!

---

## 📌 Features

- ✅ Random word selection from file
- ✅ Case-insensitive input handling
- ✅ Basic ASCII hangman drawing for each wrong guess
- ✅ Win/loss detection and result display
- ✅ Input validation and error messages
- ✅ Easy-to-understand code structure (great for beginners)

---

## 🛠 How to Run

1. **Make sure you have Java installed.**
2. Clone or download this repository.
3. Place your word list in a text file named `resource.txt` (or any filename you choose).
4. Ensure the file contains one word per line, for example:
java
code
hangman
programming


5. Open `Hangman.java` and update the path to match your file location:

String filepath = "resource.txt"; // ✅ Recommended: use relative path

6.Compile and run the program:

javac Hangman.java
java Hangman

⚠️ Important Warning

📂 Make sure the file path in the code matches the actual location of your word file.
If you use an absolute path like:

String filepath = "D:\\Projects\\hangman\\src\\resource.txt";

✅ It will work only on your machine.
To make your code portable, use a relative path like:

String filepath = "resource.txt";

🖥 Example Output

****************************
Welcome to Hangman Game!
****************************

Word: _ _ _ _ _

Guess a letter: a
Correct!

Guess a letter: z
Wrong!

📁 Project Structure

Hangman/
├── Hangman.java
├── resource.txt
└── README.md

👨‍💻 Author

Dulan Dhanush
📌 Aspiring Software Engineer · Tech Enthusiast
🔗 LinkedIn:https://www.linkedin.com/in/dulandhanush
📂 GitHub:https://github.com/DulanDhanush

📃 License
This project is licensed under the MIT License — feel free to use, modify, or share it with credit.






