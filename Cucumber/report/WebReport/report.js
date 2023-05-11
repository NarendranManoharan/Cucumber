$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Background.feature");
formatter.feature({
  "line": 2,
  "name": "Background scenario",
  "description": "",
  "id": "background-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Background"
    }
  ]
});
formatter.before({
  "duration": 245200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Too execute before all scenarios",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Completed the high school",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Completed the higher sec school",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDef.completed_the_high_school()"
});
formatter.result({
  "duration": 174025200,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDef.completed_the_higher_sec_school()"
});
formatter.result({
  "duration": 78000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "To study medicine",
  "description": "",
  "id": "background-scenario;to-study-medicine",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Student applied for the medical course",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "clear the entrance exam",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Joinig the medical institute",
  "keyword": "And "
});
formatter.match({
  "location": "BackgroundDef.student_applied_for_the_medical_course()"
});
formatter.result({
  "duration": 58200,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDef.clear_the_entrance_exam()"
});
formatter.result({
  "duration": 56300,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDef.joinig_the_medical_institute()"
});
formatter.result({
  "duration": 59200,
  "status": "passed"
});
formatter.after({
  "duration": 58800,
  "status": "passed"
});
formatter.before({
  "duration": 65200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Too execute before all scenarios",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Completed the high school",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Completed the higher sec school",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDef.completed_the_high_school()"
});
formatter.result({
  "duration": 76100,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDef.completed_the_higher_sec_school()"
});
formatter.result({
  "duration": 46400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To study engineering",
  "description": "",
  "id": "background-scenario;to-study-engineering",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Student applied for the engineering course",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Attended the counselling",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Joining the engineering college",
  "keyword": "And "
});
formatter.match({
  "location": "BackgroundDef.student_applied_for_the_engineering_course()"
});
formatter.result({
  "duration": 65700,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDef.attended_the_counselling()"
});
formatter.result({
  "duration": 55700,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDef.joining_the_engineering_college()"
});
formatter.result({
  "duration": 49600,
  "status": "passed"
});
formatter.after({
  "duration": 40900,
  "status": "passed"
});
});