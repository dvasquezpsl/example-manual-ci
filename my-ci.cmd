call echo=
call echo ---------------   Compiling   ---------------
call echo=
call echo=
call echo=
call mvn clean compile
call echo=
call echo=
call echo=
call echo=
call echo=
if errorlevel 1 (
    call echo ---------------  You code is not compiling!  ---------------
		exit /B 1
)






call echo ---------------  Testing  ---------------
call echo=
call echo=
call echo=
call echo=
call echo=
call mvn test
call echo=
call echo=
call echo=
call echo=
call echo=
if errorlevel 1 (
    call echo ---------------  You tests are failing  ---------------
		exit /B 1
)






call echo ---------------  Packaging artifacts  ---------------
call echo=
call echo=
call echo=
call echo=
call echo=
call mvn package -DskipTests
call echo=
call echo=
call echo=
call echo=
call echo=
if errorlevel 1 (
    call echo ---------------  Couln't generate artifacts  ---------------
		exit /B 1
)





call echo ________$$$$_________________________
call echo _______$$__$_________________________
call echo _______$___$$________________________
call echo _______$___$$________________________
call echo _______$$___$$_______________________
call echo ________$____$$______________________
call echo ________$$____$$$____________________
call echo _________$$_____$$___________________
call echo _________$$______$$__________________
call echo __________$_______$$_________________
call echo ____$$$$$$$________$$________________
call echo __$$$_______________$$$$$$___________
call echo _$$____$$$$____________$$$___________
call echo _$___$$$__$$$____________$$__________
call echo _$$________$$$____________$__________
call echo __$$____$$$$$$____________$__________
call echo __$$$$$$$____$$___________$__________
call echo __$$_______$$$$___________$__________
call echo ___$$$$$$$$$__$$_________$$__________
call echo ____$________$$$$_____$$$$___________
call echo ____$$____$$$$$$____$$$$$$___________
call echo _____$$$$$$____$$__$$________________
call echo _______$_____$$$_$$$_________________
call echo ________$$$$$$$$$$___________________
