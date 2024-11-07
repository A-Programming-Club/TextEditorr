 # Instructions
 ## The class will be named UserInput

 ### Read the entire ReadMe before you ask questions.

1. In the main method, take user input.
2. First ask for a file name.
3. Then, every time they input a line, send that string to a function from the UserOutput class named "write"
4. This function will have parameters String fileName, String text, and a boolean autosave and returns a String.
5. If buffer is true, the string it returns is the temporary file it saves the data to.
6. If buffer is false, it will return "0" as an indicator of success
7. If the user inputs "save" (case insensistive), instead call the function from the UserOutput class named "save"
8. This function will have parameters of a String fileName and a String tempFileName and returns a boolean.
9. This boolean will be indicative of whether the save was successful or not.
10. If the save was unsuccessful, tell the user "An error occurred when saving"
11. If the user inputs "autosave" (case insensitive), change autosave to true.
12. If the user inputs "manualsave" (case insensitive), change autosave to false.
