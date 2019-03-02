# Reading to and from Excel Sheets

By itself the examples are bad practice within this project

The reason being is that multiple sets of data are entered for the same @Test

So for example, if we had 100 lines of tests, and 99% passed, due to the 1% which failed, the entire @Test method would come back as a single failed test.

Therefore after understanding how to use Excel and parameterisation, they should be combined together