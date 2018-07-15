$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("firstTest.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Get Employee and Salary details",
  "description": "",
  "id": "title-of-your-feature;get-employee-and-salary-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I get an Employee",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I get employes address",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I link employee salary with address",
  "keyword": "Then "
});
formatter.match({
  "location": "FirstStepDefinition.i_get_an_Employee()"
});
formatter.result({
  "duration": 726684161,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.i_get_employes_salary()"
});
formatter.result({
  "duration": 234443,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.i_link_employee_salary_with_employee()"
});
formatter.result({
  "duration": 123704,
  "status": "passed"
});
});