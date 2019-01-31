# Reports using Surefire Reports
After downloading this file to your machine you will need to run the following commands to create the surefire report.

`mvn clean`

`mvn site` 
This produces the main information for templates for the reports as well as the html/css components

`mvn surefire-report:report`
This generates the surefire report

The report can be read at target/site/surefire-report.html
