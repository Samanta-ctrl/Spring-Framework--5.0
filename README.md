# Spring-Framework--5.0
Dependency Injection with XML Configuration

Q.) What is Dependency Injection?
--> Dependency:- An object usually requires objects of other classes to perform its operations. We call these objects dependencies.
--> Injection:- The process of providing the required dependencies to an object.

    Thus dependency injection helps in implementing inversion of control (IoC). This means that the responsibility of object creation and injecting the dependencies 
is given to the framework (i.e. Spring) instead of the class creating the dependency objects by itself.

We can implement dependency injection with:---

1. constructor-based injection,
2. setter-based injection

#Constructor Injection
In constructor-based injection, the dependencies required for the class are provided as arguments to the constructor.
