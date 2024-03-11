************************************************PROJECT DESCRIPTION*****************************************************************
 
Problem Statement : Identify New Bikes
1. Display "Upcoming" bikes details like bike name, price and expected launch date in India, for manufacturer 'Honda' & Bike price should be less than 4Lac.
2. For Used cars in Chennai, extract all the popular models in a List; Display the same
3. Try to 'Login' with google, give invalid account details & capture the error message

Detailed Description: Hackathon Project
1.Launch the browser.
2.Go to "https://zigwheels.com".
3.Cick on upcoming bikes.
4.Select manufacturer Honda.
5.Display upcoming bikes with price less than 4 lakhs.
6.Click on used cars and select city Chennai.
7.Display all popular models in a list.
8.Click on each popular model and display the details of the car.
9.Click on Signin/Register button
10.Select google and give invalid email.
11.Capture the error message.
12.Navigate back to homepage.
13.Close the browser.

 
Key Automation Scope:
 
Capturing the screenshot
Navigation to new page
Printing all the values in console and excel sheet

 
 
**********************************************************STEPS TO EXECUTE*************************************************************
 
-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute and we get the expected output as shown below.
 
*******************************************************FILES DESCRIPTION**************************************************************
 
1.src/test/java- There are five packages in this folder.

-> com.Factory   :In this package there is one class Baseclass.

->com.PageObjects : In this file, the BasePage,BikesDataObjects,SignUpObjects and UsedCarsObjects classes are defined.

->com.StepDefinitions : In this file, the Hooks,NewBikeData,OldCarsData and SignUp classes are defined.

->TestRunner  : In this file, TestRunner class is defined.

->com.Utilies   : In this file, Excelsheet class is defined.
 
2.src/test/resources- There are two folders in this folder.

-> Features  : In this folder, there are Regression,Zigwheels and smoke feature files are defined.

->Excel  : In this folder, there are Book1.xlsx, config.properties, extent.properties and log4j2.xml are defined.


3.JRE System Library: In this File we have all dependencies of JAR.files.         
 
4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed,
Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.
 
5.reports: In this folder the myreport.html is present which is the report of the project
 
6.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder
 
7.target: It is an empty folder

8.test-output:In this spark report is present. 

9.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

10.testng.xml : In this file, xml code is there.
 

***************************************************************************************************************************************
 
                                                        OUTPUT ON CONSOLE
 
***************************************************************************************************************************************
 
[RemoteTestNG] detected TestNG version 7.9.0
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.

Scenario: Display UpComing Bikes details which should be lessthan 4Lakhs        # Features/NewBikesIdentify.feature:3
  Given The user should be on the zigwheels.com website Home page               # StepDefinitions.NewBikeData.the_user_should_be_on_the_zigwheels_com_website_home_page()
  When user moving over NewBikes                                                # StepDefinitions.NewBikeData.user_moving_over_new_bikes()
  And User clicking the Upcoming Bikes                                          # StepDefinitions.NewBikeData.user_clicking_the_upcoming_bikes()
  And user selects BikeType in Manfactures                                      # StepDefinitions.NewBikeData.user_selects_bike_type_in_manfactures()
************Upcoming Bikes of Honda Lessthan 4Lakhs*****************
Honda CRF300L
Rs. 3.30 Lakh
Launch Date : 30 Mar 2024
------------------------------
Honda Activa Electric
Rs. 1.10 Lakh
Launch Date : Mar 2024
------------------------------
Honda Forza 350
Rs. 3.70 Lakh
Launch Date : Mar 2024
------------------------------
Honda CB350 Cruiser
Rs. 2.30 Lakh
Launch Date : Mar 2024
------------------------------
Honda Activa 7G
Rs. 79,000
Launch Date : Apr 2024
------------------------------
Honda PCX160
Rs. 1.20 Lakh
Launch Date : Jun 2024
------------------------------
Honda CBR150R
Rs. 1.70 Lakh
Launch Date : Unrevealed
------------------------------
Honda Rebel 300
Rs. 2.30 Lakh
Launch Date : Unrevealed
------------------------------
  Then User get Bike Details like BikeNames,BikePrice,LauncDates lesstha 4Lakhs # StepDefinitions.NewBikeData.user_get_bike_details_like_bike_names_bike_price_launc_dates_lesstha_4lakhs()

    Embedding Display UpComing Bikes details which should be lessthan 4Lakhs [image/png 1074155 bytes]


Scenario: Extract and Display Used Car Details By Selecting Each Car Model from Popular Models List # Features/NewBikesIdentify.feature:10
  Given user should be on the zigwheels.com website Home page                                       # StepDefinitions.OldCarsData.user_should_be_on_the_zigwheels_com_website_Home_page()
  When User moveover to Used Cars and Click Chennai Location                                        # StepDefinitions.OldCarsData.user_moveover_to_used_cars_and_click_chennai_location()
*******************Popular Models List********************
------------------
1:Maruti 800
***********************
1:Maruti 800 Maruti 800 AC
Rs. 1.00 Lakh
--------
2:Maruti 800 Maruti 800 Std
Rs. 70,000
--------
3:Maruti 800 Maruti 800 AC
Rs. 30,000
--------
4:Maruti 800 Maruti 800 AC
Rs. 55,000
--------
5:Maruti 800 Maruti 800 AC
Rs. 80,000
--------
6:Maruti 800 Maruti 800 AC
Rs. 30,000
--------
7:Maruti 800 Maruti 800 Std
Rs. 1.40 Lakh
--------
2:Maruti Swift Dzire
***********************
1:Mercedes-Benz GLE 2020-2023 Mercedes-Benz GLE 300d BSVI
Nungambakkam
Rs. 75.00 Lakh
--------
2:Maruti Alto K10 Maruti Alto K10 VXI Plus
Thiruverkadu
Rs. 5.48 Lakh
--------
3:Nissan Magnite Nissan Magnite Turbo XV Premium BSVI
Kottivakkam
Rs. 7.50 Lakh
--------
4:Renault Triber Renault Triber RXL BSIV
Thiruverkadu
Rs. 6.24 Lakh
--------
5:Maruti Celerio 2017-2021 Maruti Celerio ZXI MT BSIV
Thygaraya Nagar
Rs. 4.65 Lakh
--------
6:Mercedes-Benz AMG A 35 Mercedes-Benz AMG A 35 4MATIC BSVI
Nungambakkam
Rs. 56.00 Lakh
--------
7:Tata Tiago 2015-2019 Tata Tiago 1.2 Revotron XZA
Thygaraya Nagar
Rs. 5.10 Lakh
--------
8:Hyundai i10 Hyundai i10 Magna
Nungambakkam
Rs. 2.15 Lakh
--------
9:Mercedes-Benz GLS 2021-2024 Mercedes-Benz GLS 400d 4MATIC BSVI
Nungambakkam
Rs. 1.13 Crore
--------
10:Renault Kiger 2021-2023 Renault Kiger RXL
Kolathur
Rs. 5.95 Lakh
--------
11:Hyundai i10 Hyundai i10 Magna
Nungambakkam
Rs. 2.50 Lakh
--------
12:Hyundai EON Hyundai EON D Lite
Thygaraya Nagar
Rs. 2.15 Lakh
--------
13:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Nungambakkam
Rs. 5.50 Lakh
--------
14:Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZDI
Medavakkam
Rs. 7.50 Lakh
--------
15:Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2 BS IV
Medavakkam
Rs. 5.76 Lakh
--------
16:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Anna Nagar
Rs. 3.10 Lakh
--------
17:Maruti Swift Dzire Maruti Swift Dzire ZXI AT BSVI
Porur
Rs. 8.25 Lakh
--------
18:Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI BS IV
Rs. 7.45 Lakh
--------
19:Maruti Swift Dzire Maruti Swift Dzire ZXI Plus BSVI
Rs. 8.75 Lakh
--------
20:Maruti Swift Dzire 2015-2017 Maruti Swift Dzire LDI
Rs. 4.20 Lakh
--------
21:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire LDI
Rs. 3.18 Lakh
--------
22:Maruti Swift Dzire Maruti Swift Dzire ZXI AT BSVI
Rs. 7.30 Lakh
--------
23:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 3.55 Lakh
--------
24:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 2.97 Lakh
--------
25:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZXI
Rs. 7.50 Lakh
--------
26:Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZXI Plus
Rs. 6.50 Lakh
--------
27:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VXI
Rs. 4.00 Lakh
--------
28:Maruti Dzire 2017-2020 Maruti Swift Dzire ZXI 1.2 BS IV
Rs. 6.00 Lakh
--------
29:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZDI
Rs. 5.00 Lakh
--------
30:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Rs. 5.00 Lakh
--------
31:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire LDI
Rs. 4.00 Lakh
--------
32:Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZXI BS IV
Rs. 7.04 Lakh
--------
33:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.00 Lakh
--------
34:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 2.50 Lakh
--------
35:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VXI
Rs. 3.50 Lakh
--------
36:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.50 Lakh
--------
37:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Rs. 5.00 Lakh
--------
38:Maruti Swift Dzire Tour 2012-2018 Maruti Swift Dzire S
Rs. 4.00 Lakh
--------
39:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZDI
Rs. 4.50 Lakh
--------
40:Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2
Rs. 6.20 Lakh
--------
41:Maruti Swift Dzire 2015-2017 Maruti Swift Dzire LDI
Rs. 3.95 Lakh
--------
42:Maruti Swift Dzire Maruti Swift Dzire VXI CNG BSVI
Rs. 7.66 Lakh
--------
43:Maruti Swift Dzire Maruti Swift Dzire VXI BSVI
Rs. 7.00 Lakh
--------
44:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire LXi
Rs. 3.20 Lakh
--------
45:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.50 Lakh
--------
46:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.50 Lakh
--------
47:Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 5.00 Lakh
--------
48:Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZXI
Rs. 4.50 Lakh
--------
49:Maruti Swift Dzire Maruti Swift Dzire VXI AT BSVI
Rs. 8.00 Lakh
--------
50:Maruti Swift Dzire Maruti Swift Dzire VXI AT
Rs. 8.25 Lakh
--------
51:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZDI
Rs. 5.50 Lakh
--------
52:Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 4.50 Lakh
--------
53:Maruti Swift Dzire 2008-2012 Maruti Swift Dzire 1.2 Lxi BSIV
Rs. 3.50 Lakh
--------
54:Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI Optional
Rs. 5.00 Lakh
--------
55:Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VDI
Rs. 6.00 Lakh
--------
56:Maruti Dzire 2017-2020 Maruti Swift Dzire ZDI Plus
Rs. 6.00 Lakh
--------
57:Maruti Swift Dzire Maruti Swift Dzire VXI AT BSVI
Rs. 7.50 Lakh
--------
58:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire LXI
Rs. 4.50 Lakh
--------
59:Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI
Rs. 7.00 Lakh
--------
60:Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VXi AT
Rs. 4.75 Lakh
--------
3:Maruti Swift
***********************
1:Maruti Swift 2014-2021 Maruti Swift VVT VXI
Chromepet
Rs. 5.95 Lakh
--------
2:Maruti Swift 2010-2014 Maruti Swift VXI
Meenambakkam
Rs. 3.75 Lakh
--------
3:Maruti Swift 2004-2010 Maruti Swift 1.3 VXi
Thygaraya Nagar
Rs. 3.95 Lakh
--------
4:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.94 Lakh
--------
5:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 5.18 Lakh
--------
6:Maruti Swift 2014-2021 Maruti Swift VXI BSIV
Anna Nagar
Rs. 6.05 Lakh
--------
7:Maruti Swift 2014-2021 Maruti Swift DDiS VDI
Kottivakkam
Rs. 5.95 Lakh
--------
8:Maruti Swift 2014-2021 Maruti Swift VVT ZXI
Nandanam
Rs. 6.10 Lakh
--------
9:Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Thygaraya Nagar
Rs. 6.25 Lakh
--------
10:Maruti Swift 2010-2014 Maruti Swift VXI
Anna Nagar
Rs. 7.25 Lakh
--------
11:Maruti Swift 2018 Maruti Swift AMT VXI
Kottivakkam
Rs. 6.50 Lakh
--------
12:Maruti Swift 2014-2021 Maruti Swift ZXI
Anna Nagar
Rs. 6.50 Lakh
--------
13:Maruti Swift 2014-2021 Maruti Swift VXI Optional
Thiruverkadu
Rs. 4.94 Lakh
--------
14:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 7.07 Lakh
--------
15:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 3.99 Lakh
--------
16:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.37 Lakh
--------
17:Maruti Swift Maruti Swift VXI
Ganapathipuram
Rs. 4.98 Lakh
--------
18:Maruti Swift Maruti Swift ZXI Plus DT AMT BSVI
Ganapathipuram
Rs. 7.76 Lakh
--------
19:Maruti Swift 2014-2021 Maruti Swift AMT VXI
Kottivakkam
Rs. 6.50 Lakh
--------
20:Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Thiruverkadu
Rs. 4.51 Lakh
--------
21:Maruti Swift 2018 Maruti Swift VXI
Anna Nagar
Rs. 4.80 Lakh
--------
22:Maruti Swift 2014-2021 Maruti Swift VXI 2018
Nandanam
Rs. 5.60 Lakh
--------
23:Maruti Swift 2014-2021 Maruti Swift VXI
Nandanam
Rs. 5.30 Lakh
--------
24:Maruti Swift 2014-2021 Maruti Swift AMT VXI
Meenambakkam
Rs. 6.40 Lakh
--------
25:Maruti Swift 2014-2021 Maruti Swift ZXI BSIV
Meenambakkam
Rs. 5.00 Lakh
--------
26:Maruti Swift 2010-2014 Maruti Swift ZXI
Thiruverkadu
Rs. 5.00 Lakh
--------
27:Maruti Swift Maruti Swift VXI
Kottivakkam
Rs. 4.51 Lakh
--------
28:Maruti Swift 2014-2021 Maruti Swift VVT VXI
Ganapathipuram
Rs. 4.75 Lakh
--------
29:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 6.88 Lakh
--------
30:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.65 Lakh
--------
31:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.57 Lakh
--------
32:Maruti Swift Maruti Swift ZXI
Thiruverkadu
Rs. 4.83 Lakh
--------
33:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.79 Lakh
--------
34:Maruti Swift Maruti Swift ZXI
Thiruverkadu
Rs. 4.43 Lakh
--------
35:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.28 Lakh
--------
36:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.14 Lakh
--------
37:Maruti Swift Maruti Swift VXI
Meenambakkam
Rs. 4.24 Lakh
--------
38:Maruti Swift 2014-2021 Maruti Swift AMT VXI
Anna Nagar
Rs. 6.25 Lakh
--------
39:Maruti Swift 2010-2014 Maruti Swift VXI
Thiruverkadu
Rs. 3.85 Lakh
--------
40:Maruti Swift Maruti Swift ZXI Plus
Thiruverkadu
Rs. 6.67 Lakh
--------
41:Maruti Swift Maruti Swift ZXI
Ganapathipuram
Rs. 5.12 Lakh
--------
42:Maruti Swift Maruti Swift VXI
Porur
Rs. 6.41 Lakh
--------
43:Maruti Swift 2010-2014 Maruti Swift VXI
Anna Nagar
Rs. 4.60 Lakh
--------
44:Maruti Swift 2010-2014 Maruti Swift VXI
MEENAMBAKKAM
Rs. 4.95 Lakh
--------
45:Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Thiruverkadu
Rs. 6.00 Lakh
--------
46:Maruti Swift 2010-2014 Maruti Swift LXI
Thiruverkadu
Rs. 4.75 Lakh
--------
47:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 3.84 Lakh
--------
48:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.62 Lakh
--------
49:Maruti Swift Maruti Swift VXI
Thiruverkadu
Rs. 4.75 Lakh
--------
50:Maruti Swift Maruti Swift VXI
Nungambakkam
Rs. 6.75 Lakh
--------
51:Maruti Swift Maruti Swift ZXI
Ambattur
Rs. 4.79 Lakh
--------
52:Maruti Swift 2014-2021 Maruti Swift ZXI
Ambattur
Rs. 6.40 Lakh
--------
53:Maruti Swift 2014-2021 Maruti Swift LXI Option SP Limited Edition
Thygaraya Nagar
Rs. 3.25 Lakh
--------
54:Maruti Swift 2004-2010 Maruti Swift 1.3 VXi
Anna Nagar
Rs. 2.80 Lakh
--------
55:Maruti Swift 2014-2021 Maruti Swift VDI BSIV
MEENAMBAKKAM
Rs. 4.99 Lakh
--------
56:Maruti Swift 2014-2021 Maruti Swift VDI BSIV
MEENAMBAKKAM
Rs. 5.95 Lakh
--------
57:Maruti Swift Maruti Swift VXI BSVI
Ganapathipuram
Rs. 7.00 Lakh
--------
58:Maruti Swift 2014-2021 Maruti Swift LXI
Ambattur
Rs. 6.15 Lakh
--------
59:Maruti Swift 2010-2014 Maruti Swift VXI
Anna Nagar
Rs. 4.60 Lakh
--------
60:Maruti Swift 2010-2014 Maruti Swift RS VXI
Rs. 4.00 Lakh
--------
61:Maruti Swift 2018 Maruti Swift VXI
Rs. 5.30 Lakh
--------
62:Maruti Swift 2004-2010 Maruti Swift 1.2 VXi BSII
Rs. 1.90 Lakh
--------
63:Maruti Swift 2004-2010 Maruti Swift VXI with ABS
Rs. 2.50 Lakh
--------
64:Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 6.60 Lakh
--------
65:Maruti Swift 2004-2010 Maruti Swift 1.3 VXI ABS
Rs. 2.50 Lakh
--------
66:Maruti Swift 2004-2010 Maruti Swift 1.3 VXI ABS
Rs. 2.75 Lakh
--------
67:Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 5.25 Lakh
--------
68:Maruti Swift 2014-2021 Maruti Swift LXI
Rs. 6.45 Lakh
--------
69:Maruti Swift 2014-2021 Maruti Swift ZXI Plus
Rs. 8.25 Lakh
--------
70:Maruti Swift 2011-2014 Maruti Swift VXI
Rs. 7.60 Lakh
--------
71:Maruti Swift 2011-2014 Maruti Swift VXI
Rs. 4.75 Lakh
--------
72:Maruti Swift 2011-2014 Maruti Swift ZDi
Rs. 4.55 Lakh
--------
73:Maruti Swift 2014-2021 Maruti Swift VXI Optional
Rs. 5.45 Lakh
--------
74:Maruti Swift 2004-2010 Maruti Swift 1.2 Ldi BSIII
Rs. 2.35 Lakh
--------
75:Maruti Swift 2014-2021 Maruti Swift VDI Optional
Rs. 6.00 Lakh
--------
76:Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 7.00 Lakh
--------
77:Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII
Rs. 2.70 Lakh
--------
78:Maruti Swift 2004-2010 Maruti Swift VXI BSII
Rs. 3.00 Lakh
--------
79:Maruti Swift 2014-2021 Maruti Swift VDI Optional
Rs. 5.20 Lakh
--------
80:Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 4.50 Lakh
--------
81:Maruti Swift Maruti Swift VXI
Rs. 7.50 Lakh
--------
82:Maruti Swift 2010-2014 Maruti Swift VDI
Rs. 3.50 Lakh
--------
83:Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.70 Lakh
--------
84:Maruti Swift 2010-2014 Maruti Swift ZXI
Rs. 3.25 Lakh
--------
85:Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 6.75 Lakh
--------
86:Maruti Swift 2010-2014 Maruti Swift RS VDI
Rs. 4.50 Lakh
--------
87:Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 3.85 Lakh
--------
88:Maruti Swift 2018 Maruti Swift ZXI Plus
Rs. 6.50 Lakh
--------
89:Maruti Swift 2010-2014 Maruti Swift ZDi
Rs. 5.50 Lakh
--------
90:Maruti Swift 2014-2021 Maruti Swift AMT VDI
Rs. 6.00 Lakh
--------
91:Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.80 Lakh
--------
92:Maruti Swift 2014-2021 Maruti Swift LXI Option
Rs. 4.90 Lakh
--------
93:Maruti Swift 2004-2010 Maruti Swift 1.3 VXi
Rs. 3.00 Lakh
--------
94:Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII
Rs. 4.50 Lakh
--------
95:Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII W ABS
Rs. 1.50 Lakh
--------
96:Maruti Swift 2014-2021 Maruti Swift ZXI
Rs. 6.90 Lakh
--------
97:Maruti Swift 2010-2014 Maruti Swift RS VXI
Rs. 4.80 Lakh
--------
98:Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.00 Lakh
--------
99:Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 6.00 Lakh
--------
100:Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII
Rs. 2.00 Lakh
--------
101:Maruti Swift Maruti Swift LXI BSVI
Rs. 5.50 Lakh
--------
102:Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 4.50 Lakh
--------
103:Maruti Swift Maruti Swift ZXI BSVI
Rs. 5.40 Lakh
--------
104:Maruti Swift 2018 Maruti Swift VDI
Rs. 4.50 Lakh
--------
4:Hyundai I10
***********************
1:Hyundai i10 Hyundai i10 Magna
Nungambakkam
Rs. 2.15 Lakh
--------
2:Hyundai i10 Hyundai i10 Magna
Kolathur
Rs. 2.50 Lakh
--------
3:Hyundai i10 Hyundai i10 Magna
Thygaraya Nagar
Rs. 2.88 Lakh
--------
4:Hyundai i10 Hyundai i10 Sportz
Ambattur
Rs. 2.90 Lakh
--------
5:Hyundai i10 Hyundai i10 Magna
Thygaraya Nagar
Rs. 2.75 Lakh
--------
6:Hyundai i10 Hyundai i10 Magna
Kottivakkam
Rs. 3.25 Lakh
--------
7:Hyundai i10 Hyundai i10 Sportz
Kilpauk
Rs. 3.65 Lakh
--------
8:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2 AT
Anna Nagar
Rs. 2.75 Lakh
--------
9:Hyundai i10 Hyundai i10 Magna 1.1L
Thiruverkadu
Rs. 3.37 Lakh
--------
10:Hyundai i10 Hyundai i10 Sportz 1.1L
Nandanam
Rs. 3.10 Lakh
--------
11:Hyundai i10 Hyundai i10 Magna
Chromepet
Rs. 3.70 Lakh
--------
12:Hyundai i10 Hyundai i10 Asta
Ambattur
Rs. 2.70 Lakh
--------
13:Hyundai i10 2007-2010 Hyundai i10 Magna 1.2
Anna Nagar
Rs. 2.60 Lakh
--------
14:Hyundai i10 Hyundai i10 Magna 1.1L
Thiruverkadu
Rs. 3.13 Lakh
--------
15:Hyundai i10 Hyundai i10 Magna
Ambattur
Rs. 3.20 Lakh
--------
16:Hyundai i10 2007-2010 Hyundai i10 Asta 1.2
MEENAMBAKKAM
Rs. 2.90 Lakh
--------
17:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Ambattur
Rs. 2.35 Lakh
--------
18:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Meenambakkam
Rs. 2.10 Lakh
--------
19:Hyundai i10 Hyundai i10 Magna
Thiruverkadu
Rs. 2.50 Lakh
--------
20:Hyundai i10 Hyundai i10 Asta
Ganapathipuram
Rs. 2.70 Lakh
--------
21:Hyundai i10 Hyundai i10 Sportz
Anna Nagar
Rs. 3.11 Lakh
--------
22:Hyundai i10 Hyundai i10 Magna
Thiruverkadu
Rs. 2.77 Lakh
--------
23:Hyundai i10 Hyundai i10 Sportz
Thiruverkadu
Rs. 2.85 Lakh
--------
24:Hyundai i10 Hyundai i10 Magna 1.1L
Thiruverkadu
Rs. 3.03 Lakh
--------
25:Hyundai i10 Hyundai i10 Magna
Meenambakkam
Rs. 2.80 Lakh
--------
26:Hyundai i10 Hyundai i10 Magna
Nungambakkam
Rs. 2.71 Lakh
--------
27:Hyundai i10 Hyundai i10 Magna
Thygaraya Nagar
Rs. 1.70 Lakh
--------
28:Hyundai i10 Hyundai i10 Magna
Thygaraya Nagar
Rs. 3.10 Lakh
--------
29:Hyundai i10 2007-2010 Hyundai i10 Magna AT
MEENAMBAKKAM
Rs. 3.15 Lakh
--------
30:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
MEENAMBAKKAM
Rs. 2.80 Lakh
--------
31:Hyundai i10 Hyundai i10 Asta
MEENAMBAKKAM
Rs. 2.20 Lakh
--------
32:Hyundai i10 2007-2010 Hyundai i10 Magna AT
Ambattur
Rs. 2.50 Lakh
--------
33:Hyundai i10 Hyundai i10 Sportz AT
Rs. 2.75 Lakh
--------
34:Hyundai i10 2007-2010 Hyundai i10 Magna 1.2
Rs. 2.40 Lakh
--------
35:Hyundai i10 2007-2010 Hyundai i10 Magna AT
Rs. 2.60 Lakh
--------
36:Hyundai i10 Hyundai i10 Magna
Rs. 2.80 Lakh
--------
37:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 1.65 Lakh
--------
38:Hyundai i10 Hyundai i10 Era
Rs. 2.40 Lakh
--------
39:Hyundai i10 Hyundai i10 Era
Rs. 2.40 Lakh
--------
40:Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 3.40 Lakh
--------
41:Hyundai i10 Hyundai i10 Magna
Rs. 2.70 Lakh
--------
42:Hyundai i10 Hyundai i10 Era
Rs. 2.25 Lakh
--------
43:Hyundai i10 Hyundai i10 Magna
Rs. 3.20 Lakh
--------
44:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.10 Lakh
--------
45:Hyundai i10 Hyundai i10 Era
Rs. 2.00 Lakh
--------
46:Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
--------
47:Hyundai i10 Hyundai i10 Magna 1.2 iTech SE
Rs. 3.00 Lakh
--------
48:Hyundai i10 Hyundai i10 Sportz
Rs. 3.25 Lakh
--------
49:Hyundai i10 Hyundai i10 Magna 1.1 iTech SE
Rs. 3.50 Lakh
--------
50:Hyundai i10 Hyundai i10 Sportz
Rs. 2.10 Lakh
--------
51:Hyundai i10 Hyundai i10 Era
Rs. 2.00 Lakh
--------
52:Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 1.80 Lakh
--------
53:Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
--------
54:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.30 Lakh
--------
55:Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
--------
56:Hyundai i10 Hyundai i10 Magna
Rs. 2.80 Lakh
--------
57:Hyundai i10 Hyundai i10 Magna
Rs. 3.00 Lakh
--------
58:Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.02 Lakh
--------
59:Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
--------
60:Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 1.80 Lakh
--------
5:Hyundai Santro Xing
***********************
1:Hyundai Santro Xing Hyundai Santro Xing GL Plus
Anna Nagar
Rs. 2.50 Lakh
--------
2:Hyundai Santro Xing Hyundai Santro Xing XL
MEENAMBAKKAM
Rs. 1.10 Lakh
--------
3:Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 1.50 Lakh
--------
4:Hyundai Santro Xing Hyundai Santro Xing XO eRLX Euro II
Rs. 1.85 Lakh
--------
5:Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 1.20 Lakh
--------
6:Hyundai Santro Xing Hyundai Santro Xing XO
Rs. 1.30 Lakh
--------
7:Hyundai Santro Xing Hyundai Santro Xing GLS
Rs. 2.00 Lakh
--------
8:Hyundai Santro Xing Hyundai Santro Xing GL
Rs. 3.00 Lakh
--------
9:Hyundai Santro Xing Hyundai Santro Xing GL
Rs. 1.00 Lakh
--------
10:Hyundai Santro Xing Hyundai Santro Xing XG eRLX Euro II
Rs. 1.30 Lakh
--------
11:Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 60,000
--------
12:Hyundai Santro Xing Hyundai Santro Xing GLS LPG
Rs. 75,000
--------
13:Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 50,000
--------
6:Honda City
***********************
1:Honda City 2014-2015 Honda City i VTEC VX
Meenambakkam
Rs. 5.60 Lakh
--------
2:Honda City 4th Generation Honda City i-VTEC CVT ZX
Nungambakkam
Rs. 13.60 Lakh
--------
3:Honda City 2014-2015 Honda City i VTEC V
Meenambakkam
Rs. 5.90 Lakh
--------
4:Honda City 2015-2017 Honda City i VTEC V
Chromepet
Rs. 6.80 Lakh
--------
5:Honda City 2014-2015 Honda City i VTEC VX
Kottivakkam
Rs. 5.60 Lakh
--------
6:Honda City 4th Generation Honda City SV MT
Kolathur
Rs. 7.80 Lakh
--------
7:Honda City 4th Generation Honda City Anniversary i-VTEC CVT ZX
Ganapathipuram
Rs. 11.00 Lakh
--------
8:Honda City 2014-2015 Honda City i VTEC SV
Kottivakkam
Rs. 5.30 Lakh
--------
9:Honda City 4th Generation Honda City i-VTEC V
Kottivakkam
Rs. 6.96 Lakh
--------
10:Honda City 2014-2015 Honda City i DTEC V
Ganapathipuram
Rs. 5.90 Lakh
--------
11:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 6.31 Lakh
--------
12:Honda City 2014-2015 Honda City i VTEC S
Ganapathipuram
Rs. 5.96 Lakh
--------
13:Honda City 2015-2017 Honda City i VTEC CVT VX
Kilpauk
Rs. 7.36 Lakh
--------
14:Honda City 2015-2017 Honda City i VTEC VX Option BL
Kottivakkam
Rs. 6.95 Lakh
--------
15:Honda City 4th Generation Honda City i-VTEC ZX
Nandanam
Rs. 7.40 Lakh
--------
16:Honda City 2015-2017 Honda City i VTEC VX
Thiruverkadu
Rs. 6.85 Lakh
--------
17:Honda City 2014-2015 Honda City i DTEC V
Thygaraya Nagar
Rs. 6.19 Lakh
--------
18:Honda City 2020-2023 Honda City ZX CVT
Anna Nagar
Rs. 13.25 Lakh
--------
19:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Meenambakkam
Rs. 6.00 Lakh
--------
20:Honda City 2014-2015 Honda City i VTEC CVT SV
Anna Nagar
Rs. 5.25 Lakh
--------
21:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Anna Nagar
Rs. 5.55 Lakh
--------
22:Honda City 4th Generation Honda City VX MT
Thiruverkadu
Rs. 6.00 Lakh
--------
23:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 7.81 Lakh
--------
24:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 5.59 Lakh
--------
25:Honda City 2014-2015 Honda City i VTEC CVT SV
Ambattur
Rs. 5.73 Lakh
--------
26:Honda City 2014-2015 Honda City i VTEC V
Thiruverkadu
Rs. 7.10 Lakh
--------
27:Honda City 2015-2017 Honda City i VTEC V
Ganapathipuram
Rs. 7.29 Lakh
--------
28:Honda City 2020-2023 Honda City ZX MT
Anna Nagar
Rs. 12.94 Lakh
--------
29:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Anna Nagar
Rs. 5.80 Lakh
--------
30:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Nungambakkam
Rs. 6.90 Lakh
--------
31:Honda City 4th Generation Honda City i-VTEC CVT ZX
Kottivakkam
Rs. 14.40 Lakh
--------
32:Honda City 2014-2015 Honda City i VTEC CVT SV
Anna Nagar
Rs. 6.35 Lakh
--------
33:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Anna Nagar
Rs. 8.50 Lakh
--------
34:Honda City 4th Generation Honda City i-VTEC VX
Meenambakkam
Rs. 10.25 Lakh
--------
35:Honda City 2015-2017 Honda City i VTEC V
Ganapathipuram
Rs. 6.90 Lakh
--------
36:Honda City 2015-2017 Honda City i VTEC V
Ganapathipuram
Rs. 5.78 Lakh
--------
37:Honda City 4th Generation Honda City i-VTEC CVT ZX
Anna Nagar
Rs. 7.69 Lakh
--------
38:Honda City 2014-2015 Honda City i VTEC CVT SV
Thiruverkadu
Rs. 7.00 Lakh
--------
39:Honda City 2015-2017 Honda City i VTEC CVT VX
Ganapathipuram
Rs. 7.18 Lakh
--------
40:Honda City 2015-2017 Honda City i VTEC CVT VX
Thiruverkadu
Rs. 8.26 Lakh
--------
41:Honda City 2020-2023 Honda City ZX MT
Kottivakkam
Rs. 11.81 Lakh
--------
42:Honda City 2014-2015 Honda City i VTEC VX
Thiruverkadu
Rs. 5.95 Lakh
--------
43:Honda City 2015-2017 Honda City i VTEC V
Anna Nagar
Rs. 6.60 Lakh
--------
44:Honda City 2008-2011 Honda City 1.5 S MT
Anna Nagar
Rs. 6.10 Lakh
--------
45:Honda City 4th Generation Honda City SV MT
Ganapathipuram
Rs. 7.72 Lakh
--------
46:Honda City 2015-2017 Honda City i VTEC VX
Ganapathipuram
Rs. 7.26 Lakh
--------
47:Honda City 2015-2017 Honda City i VTEC SV
MEENAMBAKKAM
Rs. 5.23 Lakh
--------
48:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Thiruverkadu
Rs. 6.90 Lakh
--------
49:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 8.10 Lakh
--------
50:Honda City 2014-2015 Honda City i VTEC CVT SV
Thiruverkadu
Rs. 5.71 Lakh
--------
51:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 7.43 Lakh
--------
52:Honda City 2014-2015 Honda City i VTEC CVT SV
Thiruverkadu
Rs. 5.69 Lakh
--------
53:Honda City 2011-2013 Honda City V MT
Ganapathipuram
Rs. 4.73 Lakh
--------
54:Honda City 4th Generation Honda City i-VTEC CVT ZX
Ganapathipuram
Rs. 10.88 Lakh
--------
55:Honda City 2014-2015 Honda City i VTEC CVT VX
Ganapathipuram
Rs. 6.46 Lakh
--------
56:Honda City 4th Generation Honda City i-VTEC CVT ZX
Thiruverkadu
Rs. 10.75 Lakh
--------
57:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 5.51 Lakh
--------
58:Honda City 2008-2011 Honda City 1.5 V MT
Anna Nagar
Rs. 4.07 Lakh
--------
59:Honda City 4th Generation Honda City SV MT
Thiruverkadu
Rs. 5.20 Lakh
--------
60:Honda City 2014-2015 Honda City V AT
Thiruverkadu
Rs. 3.96 Lakh
--------
61:Honda City 2020-2023 Honda City ZX CVT
Nungambakkam
Rs. 12.08 Lakh
--------
62:Honda City 2015-2017 Honda City i VTEC CVT VX
Ambattur
Rs. 6.50 Lakh
--------
63:Honda City 2014-2015 Honda City i VTEC CVT VX
Thiruverkadu
Rs. 7.50 Lakh
--------
64:Honda City 2014-2015 Honda City i VTEC CVT VX
Ganapathipuram
Rs. 7.35 Lakh
--------
65:Honda City 2015-2017 Honda City i VTEC SV
Thiruverkadu
Rs. 5.51 Lakh
--------
66:Honda City 2015-2017 Honda City i VTEC S
Thiruverkadu
Rs. 5.41 Lakh
--------
67:Honda City 2020-2023 Honda City V MT
Ganapathipuram
Rs. 8.85 Lakh
--------
68:Honda City 4th Generation Honda City V MT
Thiruverkadu
Rs. 9.40 Lakh
--------
69:Honda City 2015-2017 Honda City i VTEC V
Thiruverkadu
Rs. 6.75 Lakh
--------
70:Honda City 4th Generation Honda City ZX CVT
Thiruverkadu
Rs. 10.88 Lakh
--------
71:Honda City 4th Generation Honda City i-DTEC ZX
Thiruverkadu
Rs. 8.17 Lakh
--------
72:Honda City 2014-2015 Honda City i VTEC V
Nungambakkam
Rs. 6.21 Lakh
--------
73:Honda City 2020-2023 Honda City VX MT
Meenambakkam
Rs. 9.82 Lakh
--------
74:Honda City 2014-2015 Honda City i VTEC VX
Anna Nagar West Extension
Rs. 6.80 Lakh
--------
75:Honda City 2000-2003 Honda City 1.5 EXI S
Meenambakkam
Rs. 2.50 Lakh
--------
76:Honda City 2015-2017 Honda City i VTEC CVT SV
Medavakkam
Rs. 5.25 Lakh
--------
77:Honda City 2015-2017 Honda City i VTEC SV
Chromepet
Rs. 5.65 Lakh
--------
78:Honda City 2003-2005 Honda City 1.5 GXI
Thygaraya Nagar
Rs. 1.30 Lakh
--------
79:Honda City 4th Generation Honda City i-VTEC ZX
Thygaraya Nagar
Rs. 12.90 Lakh
--------
80:Honda City 2014-2015 Honda City i VTEC SV
Anna Nagar West Extension
Rs. 5.90 Lakh
--------
81:Honda City 2015-2017 Honda City i DTec VX
Kottivakkam
Rs. 8.75 Lakh
--------
82:Honda City 2011-2013 Honda City V AT
Meenambakkam
Rs. 4.75 Lakh
--------
83:Honda City 4th Generation Honda City ZX MT
Anna Nagar
Rs. 12.30 Lakh
--------
84:Honda City 4th Generation Honda City Anniversary i-VTEC CVT ZX
MEENAMBAKKAM
Rs. 9.80 Lakh
--------
85:Honda City 2014-2015 Honda City i VTEC E
Anna Nagar
Rs. 6.05 Lakh
--------
86:Honda City 2020-2023 Honda City V MT
Medavakkam
Rs. 10.00 Lakh
--------
87:Honda City 2015-2017 Honda City i DTec SV
Anna Nagar
Rs. 7.60 Lakh
--------
88:Honda City Honda City V CVT
Anna Nagar
Rs. 11.75 Lakh
--------
89:Honda City 4th Generation Honda City VX MT
Anna Nagar
Rs. 9.90 Lakh
--------
90:Honda City 2008-2011 Honda City 1.5 V MT
Anna Nagar
Rs. 3.70 Lakh
--------
91:Honda City 4th Generation Honda City VX MT
MEENAMBAKKAM
Rs. 8.70 Lakh
--------
92:Honda City 2015-2017 Honda City i VTEC CVT SV
Porur
Rs. 5.99 Lakh
--------
93:Honda City 2014-2015 Honda City i VTEC SV
Porur
Rs. 5.90 Lakh
--------
94:Honda City 2020-2023 Honda City V CVT
Porur
Rs. 12.00 Lakh
--------
95:Honda City 2014-2015 Honda City i VTEC SV
Anna Nagar
Rs. 5.90 Lakh
--------
96:Honda City 2015-2017 Honda City i VTEC V
Porur
Rs. 7.00 Lakh
--------
97:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Anna Nagar
Rs. 5.60 Lakh
--------
98:Honda City 4th Generation Honda City VX MT
Chromepet
Rs. 5.70 Lakh
--------
99:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Ambattur
Rs. 9.80 Lakh
--------
100:Honda City 4th Generation Honda City i-VTEC VX
Rs. 8.30 Lakh
--------
101:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 9.00 Lakh
--------
102:Honda City 2015-2017 Honda City i VTEC CVT SV
Rs. 5.65 Lakh
--------
103:Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 7.00 Lakh
--------
104:Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.80 Lakh
--------
105:Honda City 4th Generation Honda City SV MT
Rs. 5.30 Lakh
--------
106:Honda City 4th Generation Honda City VX MT
Rs. 8.00 Lakh
--------
107:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 7.50 Lakh
--------
108:Honda City 4th Generation Honda City ZX MT
Rs. 9.75 Lakh
--------
109:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 5.70 Lakh
--------
110:Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 4.55 Lakh
--------
111:Honda City 4th Generation Honda City SV MT
Rs. 7.55 Lakh
--------
112:Honda City 2015-2017 Honda City i VTEC V
Rs. 6.60 Lakh
--------
113:Honda City 2015-2017 Honda City i VTEC CVT VX
Rs. 7.00 Lakh
--------
114:Honda City 4th Generation Honda City i-VTEC CVT V
Rs. 10.00 Lakh
--------
115:Honda City 2014-2015 Honda City i VTEC S
Rs. 5.50 Lakh
--------
116:Honda City 2008-2011 Honda City 1.5 S MT
Rs. 3.00 Lakh
--------
117:Honda City 2008-2011 Honda City 1.5 S MT
Rs. 4.00 Lakh
--------
118:Honda City 2011-2013 Honda City S
Rs. 2.76 Lakh
--------
119:Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 7.00 Lakh
--------
120:Honda City 4th Generation Honda City i-VTEC V
Rs. 7.55 Lakh
--------
121:Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 6.50 Lakh
--------
122:Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.00 Lakh
--------
123:Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.83 Lakh
--------
124:Honda City 2011-2013 Honda City 1.5 S AT
Rs. 4.15 Lakh
--------
125:Honda City 2014-2015 Honda City i DTEC SV
Rs. 5.00 Lakh
--------
126:Honda City ZX 2005-2008 Honda City EXi
Rs. 1.50 Lakh
--------
127:Honda City 2014-2015 Honda City i VTEC V
Rs. 5.90 Lakh
--------
128:Honda City 2020-2023 Honda City ZX MT
Rs. 9.00 Lakh
--------
7:Toyota Innova
***********************
1:Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 7 Seater
Kolathur
Rs. 8.25 Lakh
--------
2:Toyota Innova Toyota Innova 2.5 G (Diesel) 7 Seater
Kottivakkam
Rs. 11.75 Lakh
--------
3:Toyota Innova 2004-2011 Toyota Innova 2.5 G4 Diesel 8-seater
Rs. 4.65 Lakh
--------
4:Toyota Innova Toyota Innova 2.5 VX (Diesel) 7 Seater BS IV
Rs. 12.69 Lakh
--------
5:Toyota Innova 2009-2012 Toyota Innova 2.5 VX 7 STR
Rs. 11.15 Lakh
--------
6:Toyota Innova 2004-2011 Toyota Innova 2.5 V Diesel 7-seater
Rs. 5.40 Lakh
--------
7:Toyota Innova 2004-2011 Toyota Innova 2.5 G (Diesel) 8 Seater BS III
Rs. 8.50 Lakh
--------
8:Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 8 Seater BS IV
Rs. 12.00 Lakh
--------
9:Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 8 Seater BS IV
Rs. 12.00 Lakh
--------
10:Toyota Innova 2004-2011 Toyota Innova 2.5 G4 Diesel 8-seater
Rs. 7.00 Lakh
--------
11:Toyota Innova Toyota Innova 2.5 G (Diesel) 8 Seater
Rs. 15.00 Lakh
--------
12:Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 8 Seater
Rs. 7.50 Lakh
--------
13:Toyota Innova Toyota Innova 2.5 VX (Diesel) 8 Seater BS IV
Rs. 15.00 Lakh
--------
14:Toyota Innova 2004-2011 Toyota Innova 2.5 E
Rs. 6.99 Lakh
--------
15:Toyota Innova 2004-2011 Toyota Innova 2.5 G4 Diesel 8-seater
Rs. 6.50 Lakh
--------
8:Toyota Fortuner
***********************
1:Toyota Fortuner 2016-2021 Toyota Fortuner TRD 4X4 AT
Nungambakkam
Rs. 31.90 Lakh
--------
2:Toyota Fortuner 2016-2021 Toyota Fortuner 2.8 4WD AT
Kottivakkam
Rs. 31.00 Lakh
--------
3:Toyota Fortuner 2011-2016 Toyota Fortuner 4x4 MT
Nungambakkam
Rs. 15.75 Lakh
--------
4:Toyota Fortuner 2009-2011 Toyota Fortuner 3.0 Diesel
Nungambakkam
Rs. 10.75 Lakh
--------
5:Toyota Fortuner Toyota Fortuner 4X4 Diesel
Thygaraya Nagar
Rs. 38.00 Lakh
--------
6:Toyota Fortuner Toyota Fortuner 4X2 Diesel BSVI
Rs. 37.00 Lakh
--------
7:Toyota Fortuner Toyota Fortuner 4X2 Diesel AT
Rs. 41.00 Lakh
--------
9:Mahindra XUV500
***********************
1:Mahindra XUV500 Mahindra XUV500 AT W6 2WD
Nungambakkam
Rs. 14.00 Lakh
--------
2:Mahindra XUV500 Mahindra XUV500 AT W9 2WD
Anna Nagar
Rs. 13.85 Lakh
--------
3:Mahindra XUV500 Mahindra XUV500 W9 1.99
Ashoknagar
Rs. 17.50 Lakh
--------
4:Mahindra XUV500 2011-2015 Mahindra XUV500 W6 2WD
Thiruverkadu
Rs. 5.65 Lakh
--------
5:Mahindra XUV500 Mahindra XUV500 W9
Ganapathipuram
Rs. 16.35 Lakh
--------
6:Mahindra XUV500 Mahindra XUV500 W7
Ganapathipuram
Rs. 12.29 Lakh
--------
7:Mahindra XUV500 2011-2015 Mahindra XUV500 W6 2WD
Porur
Rs. 6.80 Lakh
--------
8:Mahindra XUV500 Mahindra XUV500 W11 Option AT BSIV
Thygaraya Nagar
Rs. 15.45 Lakh
--------
9:Mahindra XUV500 2011-2015 Mahindra XUV500 W4
Thygaraya Nagar
Rs. 8.75 Lakh
--------
10:Mahindra XUV500 Mahindra XUV500 W4
Rs. 6.30 Lakh
--------
11:Mahindra XUV500 2011-2015 Mahindra XUV500 W6 2WD
Rs. 7.95 Lakh
--------
12:Mahindra XUV500 2011-2015 Mahindra XUV500 W8 2WD
Rs. 8.50 Lakh
--------
13:Mahindra XUV500 Mahindra XUV500 W4 1.99 mHawk
Rs. 5.75 Lakh
--------
14:Mahindra XUV500 Mahindra XUV500 W7 AT
Rs. 14.50 Lakh
--------
15:Mahindra XUV500 Mahindra XUV500 AT W6 2WD
Rs. 14.50 Lakh
--------
16:Mahindra XUV500 Mahindra XUV500 W11 Option BSIV
Rs. 18.00 Lakh
--------
17:Mahindra XUV500 Mahindra XUV500 W10 AWD
Rs. 9.50 Lakh
--------
18:Mahindra XUV500 2011-2015 Mahindra XUV500 W8 FWD
Rs. 8.00 Lakh
--------
19:Mahindra XUV500 Mahindra XUV500 W6 2WD
Rs. 9.50 Lakh
--------
20:Mahindra XUV500 Mahindra XUV500 W5 BSIV
Rs. 11.00 Lakh
--------
21:Mahindra XUV500 Mahindra XUV500 W6 2WD
Rs. 9.50 Lakh
--------
  Then Extracting used Car Details by selecting each car model from popular models list             # StepDefinitions.OldCarsData.extracting_used_car_details_by_selecting_each_car_model_from_popular_models_list()

    Embedding Extract and Display Used Car Details By Selecting Each Car Model from Popular Models List [image/png 1098125 bytes]


Scenario: User Capture Error Message By Entering Invalid User Details # Features/NewBikesIdentify.feature:15
  Given user should on the zigwheels.com website Home page            # StepDefinitions.SignUp.user_should_on_the_zigwheels_com_website_Home_page()
  When User clicks the Login/SignUp button                            # StepDefinitions.SignUp.user_clicks_the_login_sign_up_button()
  And User click on Google button to SignUp                           # StepDefinitions.SignUp.user_click_on_google_button_to_sign_up()
  And User enter invalid emailId in Email/Phone field                 # StepDefinitions.SignUp.user_enter_invalid_email_id_in_email_phone_field()
************Error Message after entering Invalid credentials*************
Enter an email or phone number
  Then User capture Error message after entering invalid email        # StepDefinitions.SignUp.user_capture_error_message_after_entering_invalid_email()

    Embedding User Capture Error Message By Entering Invalid User Details [image/png 57762 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/a32e5400-6986-401b-91dd-ebc2ce40a2c6 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Extract and Display Used Car Details By Selecting Each Car Model from Popular Models List", "Identify New Bikes")
        Runs Cucumber Scenarios
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("User Capture Error Message By Entering Invalid User Details", "Identify New Bikes")
        Runs Cucumber Scenarios
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Display UpComing Bikes details which should be lessthan 4Lakhs", "Identify New Bikes")
        Runs Cucumber Scenarios

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================


