# Java Programming Lab Record

A structured collection of Java laboratory experiments, case studies, source programs, and example outputs. The repository follows the experiment-wise format used for lab submission, with the case-study programs kept alongside the relevant concepts.

<p>
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Lab%20Experiments-10-2563EB?style=flat-square" alt="10 experiments"/>
  <img src="https://img.shields.io/badge/Includes-Case%20Studies%20%26%20Outputs-0F766E?style=flat-square" alt="Case studies and outputs"/>
</p>

## Contents

| Experiment | Concepts | Programs / case-study examples |
|---|---|---|
| [Experiment 01](Experiment-01/) | Classes, objects, methods, arrays, control statements, strings | `StudentDemo`, `MarksArray`, `StringDemo`, `MessBill` |
| [Experiment 02](Experiment-02/) | Packages and modular programming | `MathUtil`, `UseMath`, `FeeApp`, fee-rule classes |
| [Experiment 03](Experiment-03/) | Interfaces and polymorphism | `ShapeDemo`, `SortDemo`, `PaymentDemo` |
| [Experiment 04](Experiment-04/) | Inheritance and abstraction | `InheritDemo`, `RoleDemo`, `SalarySlip` |
| [Experiment 05](Experiment-05/) | Threads and synchronization | `ThreadDemo`, `SyncDemo`, `Booking` |
| [Experiment 06](Experiment-06/) | Built-in and user-defined exceptions | `PredefinedDemo`, `UserDefinedDemo`, `Atm` |
| [Experiment 07](Experiment-07/) | File reading and writing | `WriteFile`, `ReadFile`, `ResultReport` |
| [Experiment 08](Experiment-08/) | Applet examples and lifecycle | `HelloApplet`, `LifeCycle`, `Palette` |
| [Experiment 09](Experiment-09/) | AWT/Swing layouts and forms | `BorderDemo`, `GridDemo`, `FlowDemo`, `LoginForm`, `RegisterForm` |
| [Experiment 10](Experiment-10/) | JDBC and database operations | `Db`, `FetchData`, `InsertData`, `StudentApp`, `database.sql` |

## Case studies

The applied programs are not limited to the basic demonstration classes. Examples include:

- Mess-bill calculation using an array of objects.
- Course-fee calculation using packages and fee rules.
- Payment methods and transaction charges using an interface.
- Salary calculation for different employee types using inheritance.
- A synchronized ticket-booking counter to prevent overbooking.
- ATM withdrawal validation with custom exceptions.
- Student result processing through file input and output.
- Student registration and login forms using Swing.
- Student record operations using JDBC and SQL.

See the [Case Study Index](CASE-STUDIES/README.md) for the scenario, related experiment, expected deliverables, and completion checklist. Use the linked source files in the experiment folders rather than maintaining duplicate copies.

## Requirements

- JDK installed and available from the terminal (`java -version` and `javac -version`).
- A Java IDE or a terminal editor.
- For Experiment 10: a compatible database server, JDBC driver, and credentials configured in `Db.java`.
- Applet programs are legacy coursework: modern browsers no longer run Java applets. Use a compatible teaching environment or explain the lifecycle through an appropriate demonstration.

## Compile and run

For a standalone class, open a terminal in the folder containing the source file:

```bash
javac StudentDemo.java
java StudentDemo
```

Use the matching public class name for each program. Some examples require multiple source files to be compiled together; packaged programs must be compiled from the correct parent directory. For JDBC, configure the database and driver before running the program. For GUI programs, run in a desktop environment with graphical support.

## Lab-submission checklist

- [ ] Every prescribed experiment is present and numbered correctly.
- [ ] Each program has a clear purpose and readable source code.
- [ ] Case-study scenarios are documented and linked to their implementation.
- [ ] Outputs are recorded for deterministic programs; GUI programs include a screenshot or a short description of the visible result.
- [ ] File-based programs include the required input file and explain generated output files.
- [ ] JDBC programs document database/table setup, driver configuration, and example records.
- [ ] Code has been compiled and tested in the actual lab environment.
- [ ] Names, experiment numbers, and required headings match the faculty's lab manual.

> **Important:** This repository is a study and submission aid. Confirm the exact experiment list and case-study requirements against your faculty's lab manual before submission; a repository README cannot guarantee that it matches every instructor's rubric.

## Academic context

Java Programming Laboratory coursework — SCSVMV University, Computer Science and Engineering (AI & Data Science).

## Related repositories

- [DSA in C](https://github.com/surya-scsvmv/DSA)
- [C++ Programming Lab](https://github.com/surya-scsvmv/CPP)
- [Design and Analysis of Algorithms](https://github.com/surya-scsvmv/DAA)
- [DBMS Laboratory](https://github.com/surya-scsvmv/DBMS)

---

<p align="center">Understand the problem. Run the program. Verify the output.</p>
