# Reports using Surefire Reports
For when we connect surefire reports into Jenkins, we want to use a headless browser. 

This way it eliminates the need to open up a GUI browser which needs to be interacted with - this way we can set up jenkins on a CLI server and have it run our tests

The headless browser used for this example is PhantomJS

After downloading this file to your machine you will need to run the following commands to create the surefire report.

`mvn clean`

`mvn site` 
This produces the main information for templates for the reports as well as the html/css components

`mvn surefire-report:report`
This generates the surefire report

The report can be read at target/site/surefire-report.html


## If using with jenkins

Apply the following command at the end to have jenkins build fail if any tests come back as failed.

`mvn install`