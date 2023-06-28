# Concert Management System

This is a Java program for managing concert events. The program allows you to input and store information about various concert events, such as concert IDs, venues, dates, main singers, costs, backup singer information, and main sponsor names.

## Getting Started

To run this program, follow the steps below:

1. Ensure that you have Java Development Kit (JDK) installed on your system.
2. Open the Java file (`Concert.java`) using your preferred Java development environment (e.g., IntelliJ IDEA, Eclipse, or any text editor).
3. Compile and run the `Concert.java` file.
4. The program will prompt you to enter information about each concert event, such as concert IDs, venues, dates, main singers, costs, backup singer information, and main sponsor names. Follow the prompts and provide the required information.
5. Once all the information is entered, the program will display the details of each concert event.

## Features

This concert management system provides the following features:

- Input and storage of concert information, including concert IDs, venues, dates, main singers, costs, backup singer information, and main sponsor names.
- Ability to set a specific main singer for a concert event.
- Display of all entered concert information.

## Code Structure

The code is organized into the following main sections:

- `initializeLists()`: Initializes the ArrayLists to hold the concert data.
- `setDataConcert()`: Sets the data for the concerts and displays the concert information.
- Methods for getting input for each concert attribute:
  - `getCrtID()`
  - `getCrtVenue()`
  - `getCrtDate()`
  - `getSCrtMnSinger()`
  - `getApproximateDCost()`
  - `getBBckpSinger()`
  - `getMainSponsorName()`
- `main()`: Entry point of the program.

## Dependencies

This program does not have any external dependencies. It uses standard Java libraries for user input (`javax.swing.JOptionPane`) and ArrayList data structure (`java.util.ArrayList`).

## Contribution

Contributions to this concert management system are welcome. If you find any issues or have suggestions for improvement, please feel free to contribute by creating a pull request.

## License

This project is licensed under the [MIT License](LICENSE).