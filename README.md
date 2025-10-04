# MULTITHREADED-CHAT-APPLICATION

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: SUGALI MAHESH NAIK

*INTERN ID*: CT04DY1974

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# Description of Task 3:

For this task, I used Java socket programming to create a multithreaded client-server chat application.  Enabling simultaneous connections to a server and real-time communication between users was the aim.  I created a system that uses multithreading to allow the server to manage several client connections at once.  This enables seamless and continuous message exchange between all connected users since each client has its own dedicated thread.

A server application that monitors incoming connections on a designated port makes up the architecture.  The server accepts connections from new clients and launches a new thread to handle all correspondence with them.  In the meantime, the server keeps track of every client that is currently active, which enables it to broadcast messages from one client to every other client.  Users can send messages on the client side by entering their username, and those messages are sent to every chat participant.

For this task, I decided to use only the essential Java libraries, like java.net for networking and java.io for handling input/output streams.  With this method, the application can run on any platform that supports Java without the need for external dependencies.  My knowledge of Java concurrency and thread management also increased as a result of my implementation of Runnable and use of the Thread class to manage concurrent client connections.

# Tools and Technologies Used:

Java Standard Library: I made use of java.net and other built-in Java packages. Java.net and ServerSocket. Java.io classes are used to handle data streams between clients and the server, and a socket is used for network communication.

Multithreading: For every client connection, I made a separate thread so that the server could handle several conversations at once without stuttering.

Development Environment: For development, I mostly used IntelliJ IDEA, which has great project management and debugging capabilities.  I also tested the code in Eclipse and Visual Studio Code with Java extensions to make sure it worked.

Command Line Compilation: I used the command line to compile and run the programs using the Java and Java commands in order to verify platform independence.

No External Dependencies: In order to keep the application portable, lightweight, and simple to maintain, I purposefully avoided using third-party libraries.

Used resources like GOOGLE, QUICKREF, YOUTUBE AND CHATGPT for quick reference and to know some info, they helped me complete tasks efficiently.

# Editor and Compiler Platforms:

During development, I mainly used several environments to ensure broad compatibility:

IntelliJ IDEA was my main IDE for coding, debugging, and running multiple clients and server instances simultaneously.

Visual Studio Code (VS Code) with Java extensions allowed me to test the program in a lightweight editor.

Eclipse IDE served as an additional testing environment to verify that the code runs smoothly on different platforms.

# Practical Applications and Learning Outcomes:

This chat program is a simple illustration of a real-time communication system.  It can serve as the basis for more intricate chat platforms or be utilized for group projects and team messaging.  Working on this project gave me hands-on experience with network communication protocols, thread synchronization, and socket programming.

 Additionally, this project emphasizes how crucial resource management and thread safety are when managing multiple client connections at once.  Numerous networked applications, such as distributed computing platforms, live chat support systems, and multiplayer games, can benefit from the design concepts employed here.
 
# How the Program Works:

Server Initialization: The server waits for clients to connect after opening a ServerSocket on a specified port.

Client Connection and Thread Creation: The server initiates a new thread to manage communication with the client on its own after accepting the connection.

Broadcast Mechanism: Any client's messages are first received by the server thread in charge of that client, after which they are sent to each connected client via their individual output streams.

User Interaction: Every client application asks the user to provide their username before enabling message sending.  Real-time display of incoming messages from other clients is available.

Concurrency Handling: The server can concurrently manage all connected clients without any delays or blocking thanks to multithreading.

Graceful Disconnection: In order to properly handle client disconnections, the program notifies other users and removes the client's output stream from the broadcast list.

# Outputs:

## ChatServer Output:

Chat server started on port 12345

New client connected: /127.0.0.1

New client connected: /127.0.0.1

Nobita has joined the chat.

Shizuka has joined the chat.

Shizuka: Hello, This is Shizuka

Nobita: Hello, Glad to meet you

Nobita: Btw, this is Nobita

## ChatClient - Client1 Output:

Connected to the target VM, address: '127.0.0.1:14602', transport: 'socket'

Enter your name:

Nobita

Shizuka has joined the chat.

Shizuka: Hello, This is Shizuka

Hello, Glad to meet you

Btw, this is Nobita

## ChatClient - Client2 Output:

Enter your name:

Nobita has joined the chat.

Shizuka

Hello, This is Shizuka

Nobita: Hello, Glad to meet you

Nobita: Btw, this is Nobita

![Image](https://github.com/user-attachments/assets/be546930-a407-4d57-83ec-9d2e38a57e67)

![Image](https://github.com/user-attachments/assets/4ba41145-0bda-44df-b464-406f6e528a7b)

![Image](https://github.com/user-attachments/assets/aca72842-e356-4a4d-80f8-62ef8429e1bf)
