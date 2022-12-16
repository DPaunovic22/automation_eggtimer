## Automation_eggtimer 
Project automation_eggtimer is maven project. To run project it is necessary first to clone it from this github repository or to download zip.
Next step will be import maven project in some IDE (IntellyJ IDEA is used for developing). 
All tests are located in `src/test/java` folder and grouped in separate packages depending on the page to which they refer.
To run all tests it is enough to run command:
```sh
mvn clean test
```
Or to run single test run eg.:
```sh
mvn test -Dtest="HomePageTests#testInsertTime"
```
Chrome version used during developing:
`Version 108.0.5359.125 (Official Build) (64-bit)`

