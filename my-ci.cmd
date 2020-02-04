call echo=
call echo ---------------   Compiling   ---------------
call echo=
call echo=
call echo=
call mvn clean compile
call echo=
call echo=
call echo=
call echo ---------------  Testing  ---------------
call echo=
call echo=
call echo=
call mvn test
call echo=
call echo=
call echo=
call echo ---------------  Packaging artifacts  ---------------
call echo=
call echo=
call echo=
call mvn package