# Crime Records Management System

#####Java | Hibernate | MySQL | Maven

A backend-driven console application for managing crime records, FIRs, victims, and criminal data using Hibernate ORM and MySQL. Built with clean layered architecture (Model → DAO → Service → Controller).


---

##Overview

The Crime Records Management System (CRMS) digitizes crime record management by enabling Admins and Officers to securely manage crimes, victims, criminals, and FIRs.
Hibernate ORM handles object–relational mapping, while MySQL ensures reliable data storage.

The project demonstrates real-world backend development using modular design, authentication, CRUD operations, and relational mapping.


---

 ##Features

### Admin Features

    Login & authentication

    Register Admin / Officer

    Add / View / Delete:
 
    Crimes

    Victims
 
    Criminals

    FIRs

 ###Officer Features

    Login

    View Crimes, Victims, Criminals

    File FIR

    View all FIRs


### System Features

    Hibernate ORM for DB operations

    MySQL relational schema

    Log4j logging

    Automatic sample data insertion


---
##Technologies Used

    Java 8

    Hibernate 5.6 (ORM)

    MySQL 8.0

    Maven (Build Tool)

    Eclipse / IntelliJ IDEA

    Log4j



---

##Database Tables

    users

    crimes

    victims

    criminals

    firs


###Each FIR links:

    Crime

    Victim

    Criminal

---
##Sample Output

=== Crime Records Management System ===
1. Login
2. Register Admin
3. Exit
Enter choice: 1
Username: admin
Password: admin123
 Login successful. Welcome admin!


---

##Project Flow

User → Controller → Service → DAO → Hibernate ORM → MySQL

    Controllers handle input
    Services apply business logic
    DAO handles DB
    Hibernate maps objects to tables
    MySQL stores data

---

 ##Modules Summary

🔹 User Module

Role-based login
Admin/Officer management

🔹 Crime Module

CRUD for crimes

🔹 Victim Module

Victim record management

🔹 Criminal Module

Criminal profiles + history

🔹 FIR Module

File FIR linked to victim, crime & criminal


---

##Future Enhancements

Convert to Spring Boot Web App

Add JWT authentication

Search & filter module

Generate PDF reports

Add station-specific admin roles

Cloud storage integration



---
