Git and GitHub Tutorials:

Version Control System is a tool that help to track the Changes in code.
Git is a Version Control system. It is:

1. Popular
2. Free and Opensource
3. Fast and scalable
4. To Track the history
5. Collaborations

GitHub:

It's a Website that allows developer to Store and manage their code by using Git.

https://gitHub.com

Use commit to final the changes.

To Setting Up Git download the below:
-------------------------------------
Visual Studio Code (VS Code): It's created by Microsft and it supports multiple language to code.
Windows (Git Bash)
Mac (Terminal)

To check whether Git already installed or not, put the below command in Terminal:
git --version : To check the version of the installed git.
ls commamnd: To display folders, files and directory.
pwd : To display working directory.
clear command : To Clear the window

Configuration in Git:
----------------------
Configuration can be happened in Gloabl or Local level.

git config --global user.name(username)
git config --global user.email "someone@email.com"
git config --list
~ : This symbol indicate that we're in Root directory/ Primary directory.

Open git Bash in sytem and write below command:
git config --global user.name "Satyapriya-kund"
git config --global user.email "satyapriyakund9439@gmail.com"
git config --list // To check the Set Up.

Basic command used in Git:
-------------------------
1.Clone and Status:
Clone - Cloning our repository in our local machine.
To copy the github Repo in our System we use git clone Command.

git clone <Copy HTTPS Link from Github Repo and Paste it here>

git status
Status - Display the state of the Code.

Two places exist:
Local: Means talking about Laptop/PC - files
Remote: Files which are exist in GitHub

cd Command: Change directory

ls -a : To display the hidden files.

Use the PowerShell command to display the hidden File:
ls -Force
Get-ChildItem -Force
dir -Force
Note: After doing any modification in the file, We've to add it and Commit.
add
commit

While using git status in Terminal Four Status will reflect:
------------------------------------------------------------
untracked : New files which created and not yet tracked by git.
modified  : Changed
Staged: File is ready to be commited.
unmodified: unchanged.

Add and Commit:
---------------
Add: Add new or Changed files in your working directory to the Git Staging area.

git add <file name>

git add. : To add Multiple file into Staging area.

commit: It is the Record of Change.
git commit -m "some message"

Push Command: git Push command used to Upload local repo content to remote Repo.

git push origin main

Init Command: Used to Create New git repo

git init
git remote add origin <- Link>
git remote -v (To verify remote)
git branch (To check branch)
git branch -M main (to rename branch)
git push origin main

git push -u origin main
-u : Upstram - If we want to push the Changes into same branch for Long period of time then no need to enter origin main.

git push

To get out of the directory:
cd ..
mkdir : To create the new directory under folder.

Developers use multiple branches so that many people can work on different features without affecting the stable main code. Only after a feature is tested and reviewed is it merged into main

Branch Commands:
----------------
git branch (To check branch)
git branch -M main(To Rename branch)
git checkout <branch name> (To navigate)
git checkout -b <new branch name> (To Create New branch)
git branch -d <branch name> (To delete branch)






