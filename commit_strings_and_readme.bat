@echo off
REM ---------------------------------------------------------
REM Commit each new String‑program file individually,
REM then update the README with the new table.
REM ---------------------------------------------------------

REM ----- Repository root (adjust if you move the script) -----
set REPO_ROOT=%~dp0
cd /d "%REPO_ROOT%"

REM ---------------------------------------------------------
REM 1. Add & commit each Java file in the Strings folder
REM ---------------------------------------------------------
git add "Strings\Anagram.java"
git commit -m "Add Anagram program (String utilities)"

git add "Strings\Capitalize.java"
git commit -m "Add Capitalize program (String utilities)"

git add "Strings\Frequency.java"
git commit -m "Add Frequency program (String utilities)"

git add "Strings\Length.java"
git commit -m "Add Length program (String utilities)"

git add "Strings\NonRepeating.java"
git commit -m "Add NonRepeating program (String utilities)"

git add "Strings\NumbersInString.java"
git commit -m "Add NumbersInString program (String utilities)"

git add "Strings\Palindrome.java"
git commit -m "Add Palindrome program (String utilities)"

git add "Strings\RemoveSpaces.java"
git commit -m "Add RemoveSpaces program (String utilities)"

git add "Strings\RemoveVowels.java"
git commit -m "Add RemoveVowels program (String utilities)"

git add "Strings\Reverse.java"
git commit -m "Add Reverse program (String utilities)"

git add "Strings\SortAlphabetically.java"
git commit -m "Add SortAlphabetically program (String utilities)"

git add "Strings\ToggleCharacter.java"
git commit -m "Add ToggleCharacter program (String utilities)"

git add "Strings\TwoStringsCompare.java"
git commit -m "Add TwoStringsCompare program (String utilities)"

REM ---------------------------------------------------------
REM 2. Update the README with the new String‑program table
REM ---------------------------------------------------------
powershell -Command "^
  $readme = Get-Content 'README.md' -Raw; ^
  $newTable = @'
## 📂 String Programs

| # | Program               | Description |
|---|-----------------------|-------------|
| 1 | Anagram               | Check if two strings are anagrams |
| 2 | Capitalize            | Capitalize the first letter of each word |
| 3 | Frequency             | Count frequency of each character |
| 4 | Length                | Compute the length of a string |
| 5 | NonRepeating          | Find non‑repeating characters |
| 6 | NumbersInString       | Extract numbers from a string |
| 7 | Palindrome            | Determine if a string is a palindrome |
| 8 | RemoveSpaces          | Remove all whitespace characters |
| 9 | RemoveVowels          | Strip vowels from a string |
|10 | Reverse               | Reverse the characters in a string |
|11 | SortAlphabetically    | Sort characters alphabetically |
|12 | ToggleCharacter       | Toggle case of each character |
|13 | TwoStringsCompare     | Compare two strings lexicographically |
'@; ^
  $updated = $readme -replace '(## 📂 String Programs.*?)(## 🛠️ How to Run)', "$newTable`n`$2"; ^
  Set-Content -Path 'README.md' -Value $updated -Encoding UTF8"

REM ---------------------------------------------------------
REM 3. Stage & commit the README change
REM ---------------------------------------------------------
git add README.md
git commit -m "Update README with new String program listings"

echo.
echo All programs have been committed individually.
echo README has been updated and committed.
