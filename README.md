# focusServicesTest
focusServicesTest
#=================================================
Focus Services Test by Luis Hernandez 24/10/2019
#=================================================
- The project include a short navigation in the Focus Web Site, start with a simple search from Google.com

---------------
Getting Started
---------------
- You have to download the project "focusservices", follow the next instrucctions please.
1. Download the project how a ZIP:
      - Click in the botton "Clone or Download"
      - Click in Download ZIP
      - The file is downloader in your PC on the Download Folder with the name "focusServicesTest-master"	
2. Create a new folder directly on the unit C with the name "focusServicesTest"
3. Extract the project on the folder was create in the previously step

-------------
Prerequisites
-------------
- What things you need to execute the project and how to install them
1. Create the nexts Environment variable in your system
JAVA_HOME   - C:\Program Files\Java\jdk1.8.0_221 
M2_HOME     - C:\Program Files\NetBeans 8.2\java\maven
M2          - %M2_HOME%\bin
PATH        - %M2%;%JAVA_HOME%\bin

--Please, don't forget that the path could be different because it's depends your installation

2. if you don't have the JDK or Maven in yor PC, you must to install both.
Download and install JDK for Windows from the next site::  https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Download Maven for windows from the next site:: https://maven.apache.org/download.cgi

the Environment variable can be configurate as follows
  - Press the key Windows+E
  - On the Windws you have to right-click on My PC Icon and select the properties option
  - Click in the System Advanced Setting 
  - Click on the botton Environment variable button
  - Add the variables

-----------------
Running the tests
-----------------
1. Press the key Windows+R
2. Write cmd in the run window
3. Go to the correct folder, for example C:\focusServicesTest\focusServicesTest-master\focusservices>
4. Use the next command to compilate the feature:  mvn clean test -Dcucumber.options="src/test/java/features"

For example: should be as follows
C:\focusServicesTest\focusServicesTest-master\focusservices>mvn clean test -Dcucumber.options="src/test/java/features"

when the execution finish in the command prompt must show the next results

Results :
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 46.491s
[INFO] Finished at: Thu Oct 24 01:50:24 CST 2019
[INFO] Final Memory: 16M/131M
[INFO] ------------------------------------------------------------------------
C:\focusServicesTest\focusServicesTest-master\focusservices>


---------------
Project content
---------------
1. Setting Pom.xml file
2. Java Classes to Step Definitions, Features, RunClass, DriverInitializer,DriverMethodsTest,TestValues .etc
3. Cucumber Report, you can check this in your local path, focusservices\target\cucumber-html-report
4. application.properties

----------
Built With
----------
Netbeans- IDE Java
Maven - Dependency Management
Selenium - API's to interact whit web site
Cucumber - Behaviour Driven Development

#======
Authors
#======
Luis Hernandez - Initial work 
