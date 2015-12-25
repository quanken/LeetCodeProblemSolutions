# README

This is a solution collection project for LeetCode Problems

https://oj.leetcode.com/problems/

# Requirement

* JDK 1.7 or above ( Oracle JDK / OpenJDK )
* Gradle 2.1 or above ( latest release version suggested )
* *NIX Shell

# Project Structure

The whole project structure look like :

```
src
├── main
│   └── java
│       └── com
│           └── quanken
│               └── leetcode
│                   ├── problem1
│                   │   └── Solution.java
│                   └── problem*
│                       └── Solution.java
├── test
│   └── java
│       └── com
│           └── quanken
│               └── leetcode
│                   ├── problem1
│                   │   └── Tester.java
│                   └── problem*
│                       └── Tester.java
├── test.sh
├── build.gradle
├── README.md

```

* src/main/java 

dir to store problem solution, all solution class name is same and diff by the package name which contain the number of the problem in `Lettcode`

* src/test/java 

dir to store solution testcase help to prove the solution is correct

* test.sh

a shell script help to run test case for a specified problem

* build.gradle

this project build by using gradle

# Usage

* Gradle

exec `gradle build` to build and test all solutions

* Single Unit Test

exec

```
$ ./test.sh problem-number
```

to specify which solution testcase to run

