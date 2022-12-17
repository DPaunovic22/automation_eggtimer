## Automation_eggtimer 
Project automation_eggtimer is maven project. To run project it is necessary first to clone it from this github repository or to download zip.
Next step will be import maven project in some IDE (IntellyJ IDEA is used for developing). 
All tests are located in `src/test/java` folder and grouped in separate packages depending on the page to which they refer.
To run all tests it is enough to run command in terminal:
```sh
mvn clean test
```
Or to run single test run command eg.:
```sh
mvn test -Dtest="HomePageTests#testInsertTime"
```
Chrome version used during developing:
`Version 108.0.5359.125 (Official Build) (64-bit)`

## API tests
API tests are written in Postman. In folder `documentation` there is file `CRUD Users.postman_collection` which can be imported in Postman. When collection is successfully imported it can be run:
 - Right click on collection 'CRUD Users'
 - Click on 'Run Collection'
 - Select which test you want to run (or select all)
 - Click on button 'Run CRUD Users'

## Documentation
In folder `documentation` there are also documents:
- 1_software_testing_theory_task.docx
- test_plan_Dijana_Paunovic.docx
- manual_testing_Dijana_Paunovic.docx
- bugs_Dijana_Paunovic.docx


 
