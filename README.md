# poc_for_mvc
This is a poc to use MVC framework to implements euq. I did select springMVC + myBatis, and try to use bootstrap to implements the view.



#Deployment on Web Container
Here I just deploy this application in Tomcat 7.0.67
$TOMCAT_HOME/webapps
             |
	     |--poc_eumm
                |
	        |--css
	        |--fonts
	        |--images
	        |--js
	        |--WEB-INF
	           |
	           |--classes
		      |
		      |--(All class files)
		      |--mybatis-conf.xml
		      |
		      
		   |--conf
		      |
		      |--log4j.properties
		      
		   |--lib
		      |
		      |--(All lib files that this web app needed)
		      
		   |--POC-servlet.xml
		   |--tld
		      |
		      |--c.tld

		   |--view
		      |
		      |--index.jsp
		      |--main.jsp
		      
		   |--web.xml
		   |--xml
		   
		|--index.html

