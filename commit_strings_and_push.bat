@echo off
REM ---------------------------------------------------------
REM Commit each new String program file individually, then update README
REM and push all commits to the remote repository.
REM ---------------------------------------------------------

set "REPO_ROOT=%~dp0"
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
REM 2. Commit the updated README (the table has already been replaced)
REM ---------------------------------------------------------
git add README.md
git commit -m "Update README with new String program listings"

REM ---------------------------------------------------------
REM 3. Push all commits to the remote repository
REM ---------------------------------------------------------
git push

echo.
echo All String programs have been committed and pushed.
