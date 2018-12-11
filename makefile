default: clean build
	cd main/java && java application.Application

build:
# 	javac *.java
	cd main/java && javac -Xlint:all application/Application.java

clean:

	find main/java -name "*.class" -type f -delete
# 	rm -f *.class
