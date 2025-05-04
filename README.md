# QA Assignment

## Task 1: Exploratory Testing
Exploratory testing performed on [https://qainterview.pythonanywhere.com](https://qainterview.pythonanywhere.com).  
Report: `exploratory_testing/Exploratory Testing Report_ Factorial Calculator.pdf`

## Task 2: Automated Test for IMDb
Test steps automated using **Java + Selenide + Maven + Allure + TestNG**:
1. Open imdb.com (https://www.imdb.com)
2. Search for "QA"
3. Click on the first title
4. Print the top 5 cast members

Source: `automation/imdb-test/`

##  How to Run the Automation Test
### 1. Clone the Repository
```bash
git clone https://github.com/CarolineMarkov/qa_assignment.git
cd qa_assignment/automation/imdb-test
```
### 2. run the test:
This project uses Java 17. Tests may fail to compile/run with earlier versions
If needed, set the JAVA_HOME environment variable to point to JDK 17

```bash
mvn clean test
```
### 3. (optional) view allure report :
```bash
 allure serve allure-results
```
Assuming that allure CLI is installed and added to PATH


