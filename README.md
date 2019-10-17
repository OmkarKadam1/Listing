"# Listing" 
How to use SI listing Library 

Add following code to build.gradle

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  Then add the dependency to build.gradle
  
  	dependencies {
	        implementation 'com.github.OmkarKadam1:Listing:1.4'
	}
