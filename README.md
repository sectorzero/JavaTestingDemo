# JavaTestingDemo
Demo of testing frameworks and methodologies in Java

## Categorization of run targets for different types of tests
Usually one needs different types of tests and targets for running these sets during development or CI lifecycle. The easiest and framework supported way of doing this is to use Categories in JUnit. There is similar support provided by TestNG which is more powerful. And there is a easy way to build targets using Gradle based on this. See https://blog.safaribooksonline.com/2013/08/22/gradle-test-organization/

In the demo package, categories have been setup for unit tests and integration test.
  + $> gradle test ( executes only unit tests )
  + $> gradle integrationTest ( executes only integration tests )
