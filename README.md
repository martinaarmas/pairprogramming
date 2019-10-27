# Sorting dictionary
![dictionaryimage](https://upload.wikimedia.org/wikipedia/commons/4/4c/Collegiate_Dictionary.jpg)

### Summarizing this repository
This repository contains the answer to a challenge in which given an unsorted txt file of words you needed to place them in alphabetical order creating a sorting algorithm to then store them in a new txt file. Once done, the user is able to look for words with their index and viceversa. To do this you need to run our program in Run Configuration and input the desired index or word.

### Instructions
* Project correctly formated in Github should contain: (15 points)
  * A decent README.md file with instructions and description of the project
  * A proper .gitignore file
  * The source files ready to be cloned and compiled
* Project on GitHub should contain at least 3 commits from each of the team member’s Github accounts (5 points)
* Proper handling of the files: open, read and close statements (5 points)
* “sorteddict.txt” is created correctly (5 points)
* Create several classes and methods to modularize properly the code (5 points)
* A Linked list should be used to hold the information of the sorted dictionary (15 points)
* Arguments accepted as input when executing the app from the command line should generate the correct answers which will be printed out (10 points)
* Bonus (extra points): For creating a faster way to search for words leveraging Linked list together with other structure, algorithm or variables: Up to 15 points

### Our Solution
We created a [LinkedDictionary class](https://github.com/martinaarmas/pairprogramming/blob/master/src/LinkDictionary.java) in Java:
* This class sorts the words of the given txt file and creates a new file in which they are displayed in alphabetical order.
* This class allows users to input an index and receive the corresponding word.
* This class allows users to input an word and receive the corresponding index.
In order to run the last mentioned functions the user must enter to run configurations.

### If you want to collaborate
You are more than welcome to fork and clone this project to improve it.

>By [Martina Armas](https://github.com/martinaarmas) and [Marie Gruenhagen](https://github.com/mariegruenhagen)

We started working on IntelliJ, but some problems were presented, therefore we finished it on Eclipse.
