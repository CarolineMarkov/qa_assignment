# QA Assignment

## Task 1: Exploratory Testing
Exploratory testing performed on [https://qainterview.pythonanywhere.com](https://qainterview.pythonanywhere.com).  
Report: `exploratory_testing/Exploratory Testing Report_ Factorial Calculator.pdf`

## Task 2: Automated Test for IMDb
Test steps automated using Java + Selenide + Maven + Allure:
1. Open imdb.com
2. Search for "QA"
3. Click on the first title
4. Print the top 5 cast members

Source: `automation/imdb-test/`

##  How to Run the Automation Test
```bash
cd automation/imdb-test
mvn clean test
