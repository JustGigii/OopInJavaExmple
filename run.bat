@echo off
echo Batch Script to upload to git app.
set /p name= Type your name
set /p project= Type your project
git pull
git add .
git commit -m " %project% by %name%"
git checkout -b %name%
git push --set-upstream origin %name%
echo done...
pause