package com.example.quizing;

import java.util.ArrayList;
import java.util.Collections;

public class questionMaker {
    private String type;
    private int number;
    public questionMaker(String type,int number){
        this.type = type;
        this.number = number;
    }
    public ArrayList<question_model> makeQuestion(){
        ArrayList<question_model> questions = new ArrayList<>();
        ArrayList<question_model> selectedQuestions = new ArrayList<>();
        if (type.equals("C Programming")){
            question_model q1 = new question_model();
            q1.setQuestion("What is &&");
            q1.setOptions(new String[] {"and","or","nothing","all"});
            q1.setCorrectAnswer("and");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which data type is used to store decimal numbers in C?");
            q2.setOptions(new String[] {"int", "float", "char", "void"});
            q2.setCorrectAnswer("float");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("Which function is used to print text to the console?");
            q3.setOptions(new String[] {"printf()", "print()", "console.log()", "cout"});
            q3.setCorrectAnswer("printf()");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("What is the default return type of the `main()` function?");
            q4.setOptions(new String[] {"void", "char", "int", "float"});
            q4.setCorrectAnswer("int");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("Which operator is used to get the address of a variable?");
            q5.setOptions(new String[] {"*", "&", "#", "@"});
            q5.setCorrectAnswer("&");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("Which header file is required to use `malloc()`?");
            q6.setOptions(new String[] {"<stdlib.h>", "<stdio.h>", "<string.h>", "<malloc.h>"});
            q6.setCorrectAnswer("<stdlib.h>");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("Which loop is guaranteed to execute at least once?");
            q7.setOptions(new String[] {"for", "while", "do-while", "if"});
            q7.setCorrectAnswer("do-while");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("What is the size of `int` in a 64-bit architecture?");
            q8.setOptions(new String[] {"2 bytes", "4 bytes", "8 bytes", "16 bytes"});
            q8.setCorrectAnswer("4 bytes");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("What is the keyword to define a constant value?");
            q9.setOptions(new String[] {"const", "constant", "define", "static"});
            q9.setCorrectAnswer("const");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("Which of the following is NOT a valid storage class in C?");
            q10.setOptions(new String[] {"auto", "register", "volatile", "extern"});
            q10.setCorrectAnswer("volatile");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("What does the `sizeof` operator return?");
            q11.setOptions(new String[] {"Size in bits", "Size in bytes", "Number of elements", "Memory address"});
            q11.setCorrectAnswer("Size in bytes");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("Which keyword is used to exit a loop prematurely?");
            q12.setOptions(new String[] {"break", "exit", "return", "continue"});
            q12.setCorrectAnswer("break");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("Which function is used to read a single character from input?");
            q13.setOptions(new String[] {"scanf()", "getc()", "fgetc()", "getchar()"});
            q13.setCorrectAnswer("getchar()");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("Which symbol is used to denote a preprocessor directive?");
            q14.setOptions(new String[] {"@", "$", "#", "%"});
            q14.setCorrectAnswer("#");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("What is the purpose of the `return` statement in a function?");
            q15.setOptions(new String[] {"To terminate a function", "To output a value", "To end the program", "To allocate memory"});
            q15.setCorrectAnswer("To terminate a function");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("What is the value of an uninitialized local variable?");
            q16.setOptions(new String[] {"0", "Garbage value", "NULL", "Undefined"});
            q16.setCorrectAnswer("Garbage value");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("What does `%d` format specifier represent?");
            q17.setOptions(new String[] {"float", "char", "int", "double"});
            q17.setCorrectAnswer("int");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("Which of the following is a valid way to declare a pointer?");
            q18.setOptions(new String[] {"int *ptr;", "int ptr;", "int &ptr;", "pointer int;"});
            q18.setCorrectAnswer("int *ptr;");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("Which function is used to allocate memory dynamically?");
            q19.setOptions(new String[] {"calloc()", "malloc()", "free()", "Both calloc() and malloc()"});
            q19.setCorrectAnswer("Both calloc() and malloc()");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("What does the `continue` statement do?");
            q20.setOptions(new String[] {"Exits the program", "Skips to the next iteration", "Stops the loop", "Repeats the current iteration"});
            q20.setCorrectAnswer("Skips to the next iteration");
            questions.add(q20);
        }
        if(type.equals("Python Programming")){
            question_model q1 = new question_model();
            q1.setQuestion("What is the correct way to define a function in Python?");
            q1.setOptions(new String[] {"function myFunc():", "def myFunc():", "def myFunc[]:", "myFunc() =>"});
            q1.setCorrectAnswer("def myFunc():");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which of these is NOT a Python data type?");
            q2.setOptions(new String[] {"list", "tuple", "stack", "set"});
            q2.setCorrectAnswer("stack");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("How do you start a comment in Python?");
            q3.setOptions(new String[] {"// This is a comment", "# This is a comment", "/* This is a comment */", "-- This is a comment"});
            q3.setCorrectAnswer("# This is a comment");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("Which function is used to get user input?");
            q4.setOptions(new String[] {"input()", "get()", "scan()", "read()"});
            q4.setCorrectAnswer("input()");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("What is the output of `print(2 ** 3)`?");
            q5.setOptions(new String[] {"6", "8", "9", "Error"});
            q5.setCorrectAnswer("8");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("Which keyword is used to handle exceptions in Python?");
            q6.setOptions(new String[] {"catch", "except", "throw", "try"});
            q6.setCorrectAnswer("except");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("What is the output of `len(['a', 'b', 'c'])`?");
            q7.setOptions(new String[] {"1", "2", "3", "4"});
            q7.setCorrectAnswer("3");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("Which module in Python is used to generate random numbers?");
            q8.setOptions(new String[] {"math", "random", "os", "sys"});
            q8.setCorrectAnswer("random");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("How can you install an external Python library?");
            q9.setOptions(new String[] {"install library_name", "pip install library_name", "setup install library_name", "python add library_name"});
            q9.setCorrectAnswer("pip install library_name");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("What is the output of `print(type('Hello'))`?");
            q10.setOptions(new String[] {"<class 'string'>", "<type 'str'>", "<class 'str'>", "str"});
            q10.setCorrectAnswer("<class 'str'>");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("What will be the output of: print([1, 2, 3] + [4, 5, 6])?");
            q11.setOptions(new String[] {
                    "[1, 2, 3, 4, 5, 6]",
                    "[1, 2, 3, 4] [5, 6]",
                    "[4, 5, 6]",
                    "Error"
            });
            q11.setCorrectAnswer("[1, 2, 3, 4, 5, 6]");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("How do you define a class in Python?");
            q12.setOptions(new String[] {
                    "class MyClass: {}",
                    "class MyClass() {}",
                    "class MyClass: pass",
                    "class MyClass{}"
            });
            q12.setCorrectAnswer("class MyClass: pass");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("What is the purpose of the 'self' parameter in Python class methods?");
            q13.setOptions(new String[] {
                    "It represents the class itself.",
                    "It represents the instance of the class.",
                    "It is used to define global variables.",
                    "It is required to declare methods."
            });
            q13.setCorrectAnswer("It represents the instance of the class.");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("Which of the following can be used to handle multiple exceptions in a single 'except' block?");
            q14.setOptions(new String[] {
                    "except (Exception1, Exception2):",
                    "except Exception1, Exception2:",
                    "except (Exception1, Exception2) as e:",
                    "except (Exception1 or Exception2):"
            });
            q14.setCorrectAnswer("except (Exception1, Exception2):");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("Which method is used to check if a string contains only digits in Python?");
            q15.setOptions(new String[] {
                    "isdigit()",
                    "isnumeric()",
                    "isdecimal()",
                    "checkDigits()"
            });
            q15.setCorrectAnswer("isdigit()");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("What does the 'yield' keyword do in Python?");
            q16.setOptions(new String[] {
                    "Returns a value from a function.",
                    "Stops the function execution and returns a value.",
                    "Temporarily pauses the function and returns an iterator.",
                    "Defines a generator function."
            });
            q16.setCorrectAnswer("Temporarily pauses the function and returns an iterator.");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("What is the output of the following code: print(3 // 2)?");
            q17.setOptions(new String[] {
                    "1",
                    "1.5",
                    "2",
                    "Error"
            });
            q17.setCorrectAnswer("1");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("What does the 'map()' function do in Python?");
            q18.setOptions(new String[] {
                    "Maps a function to all elements in an iterable.",
                    "Maps key-value pairs to a dictionary.",
                    "Creates a map object.",
                    "Returns a new iterable."
            });
            q18.setCorrectAnswer("Maps a function to all elements in an iterable.");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("What is the correct way to merge two dictionaries in Python?");
            q19.setOptions(new String[] {
                    "dict1.merge(dict2)",
                    "dict1 + dict2",
                    "dict1.update(dict2)",
                    "merge(dict1, dict2)"
            });
            q19.setCorrectAnswer("dict1.update(dict2)");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("What is the output of the following code: print((2, 3) * 2)?");
            q20.setOptions(new String[] {
                    "(2, 3, 2, 3)",
                    "(2, 3) (2, 3)",
                    "Error",
                    "(2, 3, 2)"
            });
            q20.setCorrectAnswer("(2, 3, 2, 3)");
            questions.add(q20);
        }
        if(type.equals("Java Programming")){
            question_model q1 = new question_model();
            q1.setQuestion("What is the result of the following expression: `10 + 20 + \"30\"`?");
            q1.setOptions(new String[] {"1020", "3030", "30", "Error"});
            q1.setCorrectAnswer("3030");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which of the following classes is part of Java's standard library for handling serialization?");
            q2.setOptions(new String[] {"java.io.File", "java.io.Serializable", "java.io.ObjectOutputStream", "java.io.ObjectInputStream"});
            q2.setCorrectAnswer("java.io.Serializable");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("Which method is used to notify all threads waiting on an object’s monitor in Java?");
            q3.setOptions(new String[] {"notify()", "notifyAll()", "wait()", "signalAll()"});
            q3.setCorrectAnswer("notifyAll()");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("Which of the following is NOT true about Java’s garbage collection?");
            q4.setOptions(new String[] {
                    "Garbage collection is done automatically by the JVM.",
                    "Garbage collection can be controlled manually using methods like `System.gc()`.",
                    "Garbage collection can clean up objects without any reference.",
                    "Garbage collection is non-deterministic."});
            q4.setCorrectAnswer("Garbage collection can clean up objects without any reference.");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("What does the `volatile` keyword ensure when used with variables in Java?");
            q5.setOptions(new String[] {
                    "It guarantees atomicity of reads and writes.",
                    "It ensures that the variable is stored in main memory and not cached.",
                    "It prevents the variable from being garbage collected.",
                    "It allows the variable to be accessed by multiple threads simultaneously."});
            q5.setCorrectAnswer("It ensures that the variable is stored in main memory and not cached.");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("Which of the following is the correct order of method execution in the lifecycle of a Java servlet?");
            q6.setOptions(new String[] {
                    "init() -> service() -> destroy()",
                    "service() -> init() -> destroy()",
                    "destroy() -> init() -> service()",
                    "init() -> destroy() -> service()"});
            q6.setCorrectAnswer("init() -> service() -> destroy()");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("Which design pattern is used by Java’s `java.util.Collections` class to provide various utility methods?");
            q7.setOptions(new String[] {"Singleton", "Factory", "Observer", "Facade"});
            q7.setCorrectAnswer("Facade");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("Which of the following Java classes is thread-safe?");
            q8.setOptions(new String[] {"String", "ArrayList", "HashMap", "HashSet"});
            q8.setCorrectAnswer("String");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("What is the default access modifier for a class member in Java if no access modifier is specified?");
            q9.setOptions(new String[] {"public", "private", "protected", "package-private"});
            q9.setCorrectAnswer("package-private");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("Which of the following interfaces does the `java.util.ArrayList` class implement?");
            q10.setOptions(new String[] {
                    "Collection", "List", "Set", "Queue"});
            q10.setCorrectAnswer("List");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("Which of the following methods is used to start a thread in Java?");
            q11.setOptions(new String[] {
                    "startThread()",
                    "run()",
                    "init()",
                    "start()"
            });
            q11.setCorrectAnswer("start()");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("Which of these classes in Java is a direct subclass of `Thread`?");
            q12.setOptions(new String[] {
                    "Runnable",
                    "ThreadPoolExecutor",
                    "Executor",
                    "ThreadGroup"
            });
            q12.setCorrectAnswer("ThreadPoolExecutor");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("Which of the following is the correct syntax for a generic method in Java?");
            q13.setOptions(new String[] {
                    "public <T> void method(T param) {}",
                    "public void <T> method(T param) {}",
                    "public <T> method<T>(T param) {}",
                    "void <T> method(T param) {}"
            });
            q13.setCorrectAnswer("public <T> void method(T param) {}");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("Which of the following will cause a compile-time error in Java?");
            q14.setOptions(new String[] {
                    "int[] arr = new int[5];",
                    "int[] arr = new int[]{1, 2, 3};",
                    "int[] arr = {1, 2, 3};",
                    "int[] arr = new int[5]; arr[5] = 10;"
            });
            q14.setCorrectAnswer("int[] arr = new int[5]; arr[5] = 10;");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("Which of the following Java classes can be used to create a thread-safe map?");
            q15.setOptions(new String[] {
                    "HashMap",
                    "TreeMap",
                    "ConcurrentHashMap",
                    "LinkedHashMap"
            });
            q15.setCorrectAnswer("ConcurrentHashMap");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("What is the purpose of the `transient` keyword in Java?");
            q16.setOptions(new String[] {
                    "It marks a variable to be excluded from serialization.",
                    "It marks a variable to be included in the thread-safe block.",
                    "It marks a method to be executed only once.",
                    "It marks a variable as private."
            });
            q16.setCorrectAnswer("It marks a variable to be excluded from serialization.");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("Which of the following is true about the `clone()` method in Java?");
            q17.setOptions(new String[] {
                    "It creates a shallow copy of an object by default.",
                    "It creates a deep copy of an object by default.",
                    "It throws a CloneNotSupportedException by default.",
                    "It only works with primitive data types."
            });
            q17.setCorrectAnswer("It creates a shallow copy of an object by default.");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("Which of the following classes is used to read binary data in Java?");
            q18.setOptions(new String[] {
                    "BufferedReader",
                    "DataInputStream",
                    "FileReader",
                    "ObjectInputStream"
            });
            q18.setCorrectAnswer("DataInputStream");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("Which of the following keywords is used to define an interface in Java?");
            q19.setOptions(new String[] {
                    "interface",
                    "implement",
                    "abstract",
                    "class"
            });
            q19.setCorrectAnswer("interface");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("Which of the following Java classes implements the `Iterator` interface?");
            q20.setOptions(new String[] {
                    "ArrayList",
                    "LinkedList",
                    "HashMap",
                    "Vector"
            });
            q20.setCorrectAnswer("ArrayList");
            questions.add(q20);
        }
        if (type.equals("Node.js")){
            question_model q1 = new question_model();
            q1.setQuestion("What is Node.js primarily used for?");
            q1.setOptions(new String[] {"Building web servers", "Creating desktop apps", "Data analysis", "Mobile development"});
            q1.setCorrectAnswer("Building web servers");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which engine does Node.js use to execute JavaScript?");
            q2.setOptions(new String[] {"SpiderMonkey", "V8", "Chakra", "JavaScriptCore"});
            q2.setCorrectAnswer("V8");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("Which of the following is NOT a Node.js module?");
            q3.setOptions(new String[] {"http", "fs", "os", "django"});
            q3.setCorrectAnswer("django");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("Which method is used to create a server in Node.js?");
            q4.setOptions(new String[] {"http.create()", "http.createServer()", "http.init()", "server.start()"});
            q4.setCorrectAnswer("http.createServer()");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("How do you import a module in Node.js?");
            q5.setOptions(new String[] {"include 'module';", "require('module');", "import module;", "module('import');"});
            q5.setCorrectAnswer("require('module');");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("Which function is used to read a file in Node.js?");
            q6.setOptions(new String[] {"fs.readFile()", "file.read()", "readFileSync()", "file.get()"});
            q6.setCorrectAnswer("fs.readFile()");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("Which of the following is a core module in Node.js?");
            q7.setOptions(new String[] {"express", "lodash", "events", "mongoose"});
            q7.setCorrectAnswer("events");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("What does npm stand for?");
            q8.setOptions(new String[] {"Node.js Package Manager", "New Package Manager", "Node Programming Method", "None of the above"});
            q8.setCorrectAnswer("Node.js Package Manager");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("Which method is used to handle exceptions in Node.js?");
            q9.setOptions(new String[] {"catch()", "try-catch", "error-handler", "process.on('uncaughtException')"});
            q9.setCorrectAnswer("process.on('uncaughtException')");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("Which object is used to manage streams in Node.js?");
            q10.setOptions(new String[] {"Stream", "EventEmitter", "Process", "Buffer"});
            q10.setCorrectAnswer("Stream");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("Which of the following is true about Node.js?");
            q11.setOptions(new String[] {"Node.js is single-threaded", "Node.js uses blocking I/O", "Node.js cannot handle HTTP", "Node.js does not support modules"});
            q11.setCorrectAnswer("Node.js is single-threaded");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("Which command is used to initialize a Node.js project?");
            q12.setOptions(new String[] {"npm start", "node init", "npm init", "node project"});
            q12.setCorrectAnswer("npm init");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("What is the default scope of a module in Node.js?");
            q13.setOptions(new String[] {"Global", "Local", "Private", "Shared"});
            q13.setCorrectAnswer("Local");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("Which method is used to write to a file in Node.js?");
            q14.setOptions(new String[] {"fs.writeFile()", "fs.appendFile()", "file.write()", "Both fs.writeFile() and fs.appendFile()"});
            q14.setCorrectAnswer("Both fs.writeFile() and fs.appendFile()");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("Which module is used to handle HTTP requests in Node.js?");
            q15.setOptions(new String[] {"fs", "http", "net", "stream"});
            q15.setCorrectAnswer("http");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("How can you check the Node.js version installed on your system?");
            q16.setOptions(new String[] {"node -v", "node --version", "npm -v", "Both node -v and node --version"});
            q16.setCorrectAnswer("Both node -v and node --version");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("Which of the following is NOT an event in Node.js?");
            q17.setOptions(new String[] {"data", "end", "connect", "console"});
            q17.setCorrectAnswer("console");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("What is the purpose of the Buffer class in Node.js?");
            q18.setOptions(new String[] {"To handle binary data", "To store strings", "To manage memory", "To handle HTTP requests"});
            q18.setCorrectAnswer("To handle binary data");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("Which file is typically used to define a Node.js project?");
            q19.setOptions(new String[] {"project.json", "package.json", "node.json", "app.json"});
            q19.setCorrectAnswer("package.json");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("Which function is used to execute asynchronous code in Node.js?");
            q20.setOptions(new String[] {"setTimeout()", "setImmediate()", "process.nextTick()", "All of the above"});
            q20.setCorrectAnswer("All of the above");
            questions.add(q20);

        }
        if (type.equals("HTML")){
            question_model q1 = new question_model();
            q1.setQuestion("Which attribute specifies an alternate text for an image, if the image cannot be displayed?");
            q1.setOptions(new String[] {"alt", "title", "src", "placeholder"});
            q1.setCorrectAnswer("alt");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which HTML5 element is used to define a container for navigation links?");
            q2.setOptions(new String[] {"<nav>", "<header>", "<aside>", "<footer>"});
            q2.setCorrectAnswer("<nav>");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("What is the purpose of the `data-*` attribute in HTML5?");
            q3.setOptions(new String[] {"To store custom data", "To style elements", "To specify metadata", "To handle events"});
            q3.setCorrectAnswer("To store custom data");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("Which input type is used to create a slider control in HTML5?");
            q4.setOptions(new String[] {"range", "slider", "number", "text"});
            q4.setCorrectAnswer("range");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("What does the `<picture>` element in HTML5 do?");
            q5.setOptions(new String[] {"Defines multiple sources for an image", "Embeds a video", "Defines a clickable area", "Provides fallback content for an image"});
            q5.setCorrectAnswer("Defines multiple sources for an image");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("Which of the following tags is NOT valid in HTML5?");
            q6.setOptions(new String[] {"<center>", "<article>", "<section>", "<details>"});
            q6.setCorrectAnswer("<center>");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("What is the purpose of the `sandbox` attribute in the `<iframe>` tag?");
            q7.setOptions(new String[] {"To restrict actions within the iframe", "To specify a placeholder", "To preload the content", "To set dimensions of the iframe"});
            q7.setCorrectAnswer("To restrict actions within the iframe");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("Which attribute in the `<form>` tag is used to specify how form data should be encoded?");
            q8.setOptions(new String[] {"enctype", "method", "action", "target"});
            q8.setCorrectAnswer("enctype");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("What does the `rel` attribute in a `<link>` tag specify?");
            q9.setOptions(new String[] {"Relationship between the document and the linked resource", "The resource path", "The type of linked file", "The size of the linked file"});
            q9.setCorrectAnswer("Relationship between the document and the linked resource");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("What is the difference between `<b>` and `<strong>` tags?");
            q10.setOptions(new String[] {"<b> is for bold, <strong> adds semantic importance", "<b> and <strong> are identical", "<b> is deprecated, <strong> replaces it", "There is no difference"});
            q10.setCorrectAnswer("<b> is for bold, <strong> adds semantic importance");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("Which of the following elements is used to define the metadata of an HTML document?");
            q11.setOptions(new String[] {"<meta>", "<head>", "<link>", "<style>"});
            q11.setCorrectAnswer("<meta>");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("What is the purpose of the `defer` attribute in a `<script>` tag?");
            q12.setOptions(new String[] {"To delay script execution until the document is fully loaded", "To execute script immediately", "To load the script asynchronously", "To preload the script for later use"});
            q12.setCorrectAnswer("To delay script execution until the document is fully loaded");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("Which tag is used to define a description list in HTML?");
            q13.setOptions(new String[] {"<dl>", "<dd>", "<dt>", "<li>"});
            q13.setCorrectAnswer("<dl>");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("What is the primary purpose of the `<template>` tag in HTML?");
            q14.setOptions(new String[] {"To define reusable HTML fragments", "To style elements", "To create forms", "To preload images"});
            q14.setCorrectAnswer("To define reusable HTML fragments");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("Which attribute specifies whether an input field is required?");
            q15.setOptions(new String[] {"required", "mandatory", "validate", "essential"});
            q15.setCorrectAnswer("required");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("What is the purpose of the `contenteditable` attribute?");
            q16.setOptions(new String[] {"To make an element editable", "To validate content", "To embed dynamic content", "To enhance SEO"});
            q16.setCorrectAnswer("To make an element editable");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("What is the significance of the `srcset` attribute in the `<img>` tag?");
            q17.setOptions(new String[] {"To define multiple image sources for different screen resolutions", "To preload images", "To define alt text", "To specify image size"});
            q17.setCorrectAnswer("To define multiple image sources for different screen resolutions");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("Which of the following is NOT a valid HTML5 semantic element?");
            q18.setOptions(new String[] {"<header>", "<main>", "<footer>", "<blink>"});
            q18.setCorrectAnswer("<blink>");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("What does the `autofocus` attribute do in an input element?");
            q19.setOptions(new String[] {"Automatically focuses on the element", "Validates input data", "Makes the input readonly", "Centers the input field"});
            q19.setCorrectAnswer("Automatically focuses on the element");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("Which of the following attributes is used to merge table cells horizontally?");
            q20.setOptions(new String[] {"colspan", "rowspan", "merge", "span"});
            q20.setCorrectAnswer("colspan");
            questions.add(q20);
        }
        if (type.equals("Kotlin")){
            question_model q1 = new question_model();
            q1.setQuestion("What is the correct syntax to declare a nullable variable in Kotlin?");
            q1.setOptions(new String[] {
                    "val name: String = null",
                    "var name: String = null",
                    "val name: String? = null",
                    "var name? = null"
            });
            q1.setCorrectAnswer("val name: String? = null");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which keyword is used to make a class non-inheritable?");
            q2.setOptions(new String[] {"sealed", "final", "data", "object"});
            q2.setCorrectAnswer("final");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("What is the correct way to implement a `when` statement in Kotlin?");
            q3.setOptions(new String[] {
                    "switch(value) { case 1: ... }",
                    "when(value) { 1 -> ... }",
                    "case(value) { 1 -> ... }",
                    "if(value == 1) ... else ..."
            });
            q3.setCorrectAnswer("when(value) { 1 -> ... }");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("How can you create a singleton in Kotlin?");
            q4.setOptions(new String[] {
                    "class Singleton private constructor()",
                    "object Singleton",
                    "static class Singleton",
                    "val Singleton = new Singleton()"
            });
            q4.setCorrectAnswer("object Singleton");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("What does the Elvis operator (`?:`) do in Kotlin?");
            q5.setOptions(new String[] {
                    "Checks for nullability",
                    "Returns the left-hand side if not null, otherwise the right-hand side",
                    "Throws a NullPointerException",
                    "Combines two strings"
            });
            q5.setCorrectAnswer("Returns the left-hand side if not null, otherwise the right-hand side");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("What is the output of the following Kotlin code?\n\n```kotlin\nval x: Int? = null\nprintln(x ?: 10)\n```");
            q6.setOptions(new String[] {"null", "10", "0", "Throws NullPointerException"});
            q6.setCorrectAnswer("10");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("Which function is used to iterate over a range in Kotlin?");
            q7.setOptions(new String[] {"loop", "forEach", "repeat", "for"});
            q7.setCorrectAnswer("for");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("What is the difference between `==` and `===` in Kotlin?");
            q8.setOptions(new String[] {
                    "`==` checks referential equality, `===` checks structural equality",
                    "`==` checks structural equality, `===` checks referential equality",
                    "They are the same in Kotlin",
                    "`==` is not valid in Kotlin"
            });
            q8.setCorrectAnswer("`==` checks structural equality, `===` checks referential equality");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("What is the correct way to create an immutable list in Kotlin?");
            q9.setOptions(new String[] {
                    "val list = mutableListOf(1, 2, 3)",
                    "val list = listOf(1, 2, 3)",
                    "val list = arrayListOf(1, 2, 3)",
                    "val list = ArrayList(1, 2, 3)"
            });
            q9.setCorrectAnswer("val list = listOf(1, 2, 3)");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("What does the following Kotlin code do?\n\n```kotlin\ninline fun perform(operation: () -> Unit) {\n    operation()\n}\n```");
            q10.setOptions(new String[] {
                    "Declares a higher-order function",
                    "Creates a coroutine",
                    "Executes a lambda in a different thread",
                    "Performs lazy initialization"
            });
            q10.setCorrectAnswer("Declares a higher-order function");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("What will be the output of the following Kotlin code?\n\n```kotlin\nval items = listOf(1, 2, 3, 4, 5)\nval result = items.filter { it % 2 == 0 }\nprintln(result)\n```");
            q11.setOptions(new String[] {"[2, 4]", "[1, 3, 5]", "null", "Throws an error"});
            q11.setCorrectAnswer("[2, 4]");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("What is the correct way to handle null values in Kotlin?");
            q12.setOptions(new String[] {
                    "Use try-catch",
                    "Use null coalescing",
                    "Use the safe call operator (`?.`)",
                    "Use explicit null checks only"
            });
            q12.setCorrectAnswer("Use the safe call operator (`?.`)");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("Which of the following is a correct way to define an extension function in Kotlin?");
            q13.setOptions(new String[] {
                    "fun String.reverse(): String { ... }",
                    "extension fun String.reverse(): String { ... }",
                    "String extension fun reverse(): String { ... }",
                    "fun reverse(this: String): String { ... }"
            });
            q13.setCorrectAnswer("fun String.reverse(): String { ... }");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("What will the following code print?\n\n```kotlin\nval numbers = (1..5).map { it * it }\nprintln(numbers)\n```");
            q14.setOptions(new String[] {"[1, 4, 9, 16, 25]", "[1, 2, 3, 4, 5]", "[2, 4, 6, 8, 10]", "[5, 4, 3, 2, 1]"});
            q14.setCorrectAnswer("[1, 4, 9, 16, 25]");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("What is the purpose of the `lateinit` keyword in Kotlin?");
            q15.setOptions(new String[] {
                    "Declares a lazy property",
                    "Declares a property that will be initialized later",
                    "Declares a property with a default value",
                    "Marks a property as immutable"
            });
            q15.setCorrectAnswer("Declares a property that will be initialized later");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("What will the following Kotlin code print?\n\n```kotlin\nval result = listOf(1, 2, 3).all { it > 0 }\nprintln(result)\n```");
            q16.setOptions(new String[] {"true", "false", "null", "Throws an error"});
            q16.setCorrectAnswer("true");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("Which annotation in Kotlin is used to suppress compiler warnings?");
            q17.setOptions(new String[] {"@Warning", "@Suppress", "@Ignore", "@Silent"});
            q17.setCorrectAnswer("@Suppress");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("What will the following Kotlin code output?\n\n```kotlin\nval a = 5\nval b = a.takeIf { it > 3 }\nprintln(b)\n```");
            q18.setOptions(new String[] {"5", "null", "true", "Throws an error"});
            q18.setCorrectAnswer("5");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("Which of the following is a correct way to define a data class in Kotlin?");
            q19.setOptions(new String[] {
                    "data class User(name: String, age: Int)",
                    "data class User(val name: String, val age: Int)",
                    "data class User(name: String, age: Int) { ... }",
                    "class data User(val name: String, val age: Int)"
            });
            q19.setCorrectAnswer("data class User(val name: String, val age: Int)");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("What will the following Kotlin code print?\n\n```kotlin\nval numbers = listOf(1, 2, 3, 4, 5)\nval result = numbers.reduce { acc, value -> acc + value }\nprintln(result)\n```");
            q20.setOptions(new String[] {"15", "5", "null", "Throws an error"});
            q20.setCorrectAnswer("15");
            questions.add(q20);
        }
        if (type.equals("PHP")){
            question_model q1 = new question_model();
            q1.setQuestion("What is the correct way to declare a constant in PHP?");
            q1.setOptions(new String[] {
                    "const PI = 3.14;",
                    "define('PI', 3.14);",
                    "Both A and B",
                    "None of the above"
            });
            q1.setCorrectAnswer("Both A and B");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which superglobal is used to collect form data sent with both GET and POST methods?");
            q2.setOptions(new String[] {
                    "$_REQUEST",
                    "$_POST",
                    "$_GET",
                    "$_FORM"
            });
            q2.setCorrectAnswer("$_REQUEST");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("What will the following code output? var_dump('5' == 5);");
            q3.setOptions(new String[] {
                    "true",
                    "false",
                    "null",
                    "Error"
            });
            q3.setCorrectAnswer("true");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("What is the default scope of a variable declared outside any function in PHP?");
            q4.setOptions(new String[] {
                    "Global",
                    "Local",
                    "Static",
                    "Private"
            });
            q4.setCorrectAnswer("Global");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("What is the output of the following code: echo strpos('Hello, world!', 'world');");
            q5.setOptions(new String[] {
                    "7",
                    "6",
                    "5",
                    "Throws an error"
            });
            q5.setCorrectAnswer("7");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("Which function converts special characters to HTML entities?");
            q6.setOptions(new String[] {
                    "htmlspecialchars()",
                    "htmlentities()",
                    "htmlspecial()",
                    "htmlencode()"
            });
            q6.setCorrectAnswer("htmlspecialchars()");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("What is the main difference between include and require in PHP?");
            q7.setOptions(new String[] {
                    "require stops execution on failure; include does not.",
                    "include stops execution on failure; require does not.",
                    "There is no difference.",
                    "include is faster than require."
            });
            q7.setCorrectAnswer("require stops execution on failure; include does not.");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("Which keyword is used to create a class in PHP?");
            q8.setOptions(new String[] {
                    "class",
                    "new",
                    "object",
                    "create"
            });
            q8.setCorrectAnswer("class");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("What is the output of this code: $a = 0; $b = $a ?: 10; echo $b;");
            q9.setOptions(new String[] {
                    "0",
                    "10",
                    "null",
                    "Error"
            });
            q9.setCorrectAnswer("10");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("Which function is used to check if a variable is set in PHP?");
            q10.setOptions(new String[] {
                    "isset()",
                    "empty()",
                    "is_null()",
                    "defined()"
            });
            q10.setCorrectAnswer("isset()");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("What is the difference between == and === in PHP?");
            q11.setOptions(new String[] {
                    "== checks value equality; === checks value and type equality.",
                    "== checks value and type equality; === checks value equality.",
                    "Both are the same.",
                    "=== is not valid in PHP."
            });
            q11.setCorrectAnswer("== checks value equality; === checks value and type equality.");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("What does the explode() function do in PHP?");
            q12.setOptions(new String[] {
                    "Splits a string into an array.",
                    "Joins an array into a string.",
                    "Converts an array to a JSON string.",
                    "Converts a JSON string to an array."
            });
            q12.setCorrectAnswer("Splits a string into an array.");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("Which function in PHP can be used to filter and validate data?");
            q13.setOptions(new String[] {
                    "filter_var()",
                    "validate_var()",
                    "sanitize_var()",
                    "check_var()"
            });
            q13.setCorrectAnswer("filter_var()");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("What is the purpose of the final keyword in PHP?");
            q14.setOptions(new String[] {
                    "To prevent method overriding or class inheritance.",
                    "To declare a constant.",
                    "To mark a function for garbage collection.",
                    "To terminate a loop."
            });
            q14.setCorrectAnswer("To prevent method overriding or class inheritance.");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("Which PHP function is used to generate a unique ID?");
            q15.setOptions(new String[] {
                    "uniqid()",
                    "generate_id()",
                    "unique()",
                    "id_gen()"
            });
            q15.setCorrectAnswer("uniqid()");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("Which of the following is NOT a valid magic method in PHP?");
            q16.setOptions(new String[] {
                    "__get",
                    "__set",
                    "__magic",
                    "__construct"
            });
            q16.setCorrectAnswer("__magic");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("What does the PDO class in PHP represent?");
            q17.setOptions(new String[] {
                    "PHP Data Object",
                    "PHP Database Object",
                    "PHP Driver Object",
                    "PHP Development Object"
            });
            q17.setCorrectAnswer("PHP Data Object");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("Which of the following functions is used to start a session in PHP?");
            q18.setOptions(new String[] {
                    "session_start()",
                    "session_init()",
                    "start_session()",
                    "begin_session()"
            });
            q18.setCorrectAnswer("session_start()");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("Which function is used to include and evaluate a PHP file?");
            q19.setOptions(new String[] {
                    "include()",
                    "require()",
                    "require_once()",
                    "include_once()"
            });
            q19.setCorrectAnswer("include()");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("What does the isset() function return if the variable is NOT set?");
            q20.setOptions(new String[] {
                    "false",
                    "true",
                    "null",
                    "Throws an error"
            });
            q20.setCorrectAnswer("false");
            questions.add(q20);
        }
        if (type.equals("JavaScript")){
            question_model q1 = new question_model();
            q1.setQuestion("What is the output of: console.log(typeof null);");
            q1.setOptions(new String[] {
                    "'object'",
                    "'null'",
                    "'undefined'",
                    "'error'"
            });
            q1.setCorrectAnswer("'object'");
            questions.add(q1);

            question_model q2 = new question_model();
            q2.setQuestion("Which method is used to serialize an object into a JSON string?");
            q2.setOptions(new String[] {
                    "JSON.stringify()",
                    "JSON.parse()",
                    "JSON.serialize()",
                    "Object.toJSON()"
            });
            q2.setCorrectAnswer("JSON.stringify()");
            questions.add(q2);

            question_model q3 = new question_model();
            q3.setQuestion("What is the output of: console.log(0.1 + 0.2 === 0.3);");
            q3.setOptions(new String[] {
                    "true",
                    "false",
                    "undefined",
                    "error"
            });
            q3.setCorrectAnswer("false");
            questions.add(q3);

            question_model q4 = new question_model();
            q4.setQuestion("Which of the following is NOT a primitive data type in JavaScript?");
            q4.setOptions(new String[] {
                    "String",
                    "Boolean",
                    "Object",
                    "Number"
            });
            q4.setCorrectAnswer("Object");
            questions.add(q4);

            question_model q5 = new question_model();
            q5.setQuestion("What will be the output of: console.log([] + []);");
            q5.setOptions(new String[] {
                    "'' (empty string)",
                    "[] (empty array)",
                    "null",
                    "'undefined'"
            });
            q5.setCorrectAnswer("'' (empty string)");
            questions.add(q5);

            question_model q6 = new question_model();
            q6.setQuestion("What is the difference between '==' and '===' in JavaScript?");
            q6.setOptions(new String[] {
                    "'==' checks for value equality; '===' checks for value and type equality.",
                    "'==' checks for value and type equality; '===' checks for value equality.",
                    "Both are the same.",
                    "'===' is not a valid operator."
            });
            q6.setCorrectAnswer("'==' checks for value equality; '===' checks for value and type equality.");
            questions.add(q6);

            question_model q7 = new question_model();
            q7.setQuestion("How do you create a function in JavaScript?");
            q7.setOptions(new String[] {
                    "function myFunction() {}",
                    "function = myFunction() {}",
                    "create myFunction() {}",
                    "def myFunction() {}"
            });
            q7.setCorrectAnswer("function myFunction() {}");
            questions.add(q7);

            question_model q8 = new question_model();
            q8.setQuestion("Which method is used to add an element to the end of an array?");
            q8.setOptions(new String[] {
                    "push()",
                    "pop()",
                    "unshift()",
                    "concat()"
            });
            q8.setCorrectAnswer("push()");
            questions.add(q8);

            question_model q9 = new question_model();
            q9.setQuestion("What will be the output of: console.log(typeof NaN);");
            q9.setOptions(new String[] {
                    "'number'",
                    "'NaN'",
                    "'undefined'",
                    "'object'"
            });
            q9.setCorrectAnswer("'number'");
            questions.add(q9);

            question_model q10 = new question_model();
            q10.setQuestion("What does 'use strict' do in JavaScript?");
            q10.setOptions(new String[] {
                    "Enforces stricter parsing and error handling.",
                    "Defines strict variable scope.",
                    "Converts code to strict type checking.",
                    "Restricts the use of global variables."
            });
            q10.setCorrectAnswer("Enforces stricter parsing and error handling.");
            questions.add(q10);

            question_model q11 = new question_model();
            q11.setQuestion("What is the output of: console.log(!!false);");
            q11.setOptions(new String[] {
                    "false",
                    "true",
                    "undefined",
                    "'error'"
            });
            q11.setCorrectAnswer("false");
            questions.add(q11);

            question_model q12 = new question_model();
            q12.setQuestion("Which keyword is used to define a constant in JavaScript?");
            q12.setOptions(new String[] {
                    "const",
                    "let",
                    "var",
                    "constant"
            });
            q12.setCorrectAnswer("const");
            questions.add(q12);

            question_model q13 = new question_model();
            q13.setQuestion("How can you create an immediately invoked function expression (IIFE)?");
            q13.setOptions(new String[] {
                    "(function() {})();",
                    "function() {};",
                    "function() {}();",
                    "(() => {});"
            });
            q13.setCorrectAnswer("(function() {})();");
            questions.add(q13);

            question_model q14 = new question_model();
            q14.setQuestion("What is the purpose of the 'this' keyword in JavaScript?");
            q14.setOptions(new String[] {
                    "Refers to the object it belongs to.",
                    "Refers to the global scope always.",
                    "Is a placeholder for a variable.",
                    "Does not exist in JavaScript."
            });
            q14.setCorrectAnswer("Refers to the object it belongs to.");
            questions.add(q14);

            question_model q15 = new question_model();
            q15.setQuestion("What is the output of: console.log([] == false);");
            q15.setOptions(new String[] {
                    "true",
                    "false",
                    "undefined",
                    "Throws an error"
            });
            q15.setCorrectAnswer("true");
            questions.add(q15);

            question_model q16 = new question_model();
            q16.setQuestion("Which method is used to bind a function to an object?");
            q16.setOptions(new String[] {
                    "bind()",
                    "call()",
                    "apply()",
                    "link()"
            });
            q16.setCorrectAnswer("bind()");
            questions.add(q16);

            question_model q17 = new question_model();
            q17.setQuestion("Which JavaScript feature allows functions to be assigned to variables?");
            q17.setOptions(new String[] {
                    "First-class functions",
                    "Function pointers",
                    "Higher-order functions",
                    "Anonymous functions"
            });
            q17.setCorrectAnswer("First-class functions");
            questions.add(q17);

            question_model q18 = new question_model();
            q18.setQuestion("Which method is used to check if an object has a specific property?");
            q18.setOptions(new String[] {
                    "hasOwnProperty()",
                    "propertyExists()",
                    "inProperty()",
                    "getProperty()"
            });
            q18.setCorrectAnswer("hasOwnProperty()");
            questions.add(q18);

            question_model q19 = new question_model();
            q19.setQuestion("What will be the output of: console.log(1 + '2' + 3);");
            q19.setOptions(new String[] {
                    "'123'",
                    "'6'",
                    "'15'",
                    "'TypeError'"
            });
            q19.setCorrectAnswer("'123'");
            questions.add(q19);

            question_model q20 = new question_model();
            q20.setQuestion("How can you copy an object in JavaScript?");
            q20.setOptions(new String[] {
                    "Object.assign({}, obj);",
                    "obj.copy();",
                    "clone(obj);",
                    "Object.copy(obj);"
            });
            q20.setCorrectAnswer("Object.assign({}, obj);");
            questions.add(q20);
        }
        Collections.shuffle(questions);

        for (int i=0;i<number;i++){
            selectedQuestions.add(questions.get(i));
        }
        Collections.shuffle(selectedQuestions);
        return selectedQuestions;
    }



}
