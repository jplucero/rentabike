
# Rent-A-Bike

This project has as objective the management of a bike rental bussiness.

## Getting Started

### Prerequisites

- Java JDK 1.8

http://www.oracle.com/technetwork/java/javase/downloads

- Maven 3.X.X

https://maven.apache.org/download.cgi

- Git 

https://git-scm.com/downloads

- Any java IDE (IntelliJ recommended)

https://www.jetbrains.com/idea/

## Practices

 The chosen design was a REST development for future implementations as microservices. 
Exceptions are controlled to avoid any undesirable response for the client.  
 This project counts with a strict division of layers that can compose a separate bundle in a future in order to deploy components avoiding unnecesary deploys
of working and unmodified bundles.
 The configuration should be migrated as part of a pure configuration and not as part of a deploy. For example set environment variables at an EAP instance or part of
a jbossfuse profile properties. 
 
## Tests 

Developed in JUint, those test validate the apropiate behaviour of the bussiness class. Having a coverage of 3 main entities, the tests have exception and successfull cases for a rent operation and 
a small coverage for data as bikes and customers.

## Running the tests

The test can be executed with any IDE just be sure that you have junit dependencies downloaded, in IntelliJ case just right click on the test folder and run all tests.

## Authors

Juan pablo Lucero




