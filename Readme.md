 # Instructions
 ## The class will be named UserOutput
 1. You will create a function named "write" that has parameters of a String fileName, String text, and a boolean buffer and returns a String.
 2. If buffer is true:
 3. This function will write the variable text into a temp file with a name that uses the current time (System.currentTimeMillis or Instant.now), the fileName, and a randomly generated series of characters.
 4. This function will return the temp file name.
 5. If buffer is false:
 6. This function will write the variable text directly into the fileName.
 7. This function will return "0"
 8. You will create a function named "save" that has parameters of a String fileName and a String tempFileName.
 9. This function will move everything from the temp file into the file named fileName
 10. This function will return true or false depending on whether the write succeeded or not.
