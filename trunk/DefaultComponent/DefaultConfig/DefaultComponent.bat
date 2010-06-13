echo off

set RHAP_JARS_DIR=C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rational/Rhapsody/7.5.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=None   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist Building\Call.class del Building\Call.class
if exist Building\Button.class del Building\Button.class
if exist Building\Door.class del Building\Door.class
if exist Building\Person_outside_elevator.class del Building\Person_outside_elevator.class
if exist Building\CarPositionControl.class del Building\CarPositionControl.class
if exist Building\CarButtonsControl.class del Building\CarButtonsControl.class
if exist Building\Floor.class del Building\Floor.class
if exist Building\Operator.class del Building\Operator.class
if exist Building\Dispatcher.class del Building\Dispatcher.class
if exist Building\FloorButtonsControl.class del Building\FloorButtonsControl.class
if exist Building\Car.class del Building\Car.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Building\Passenger.class del Building\Passenger.class
if exist Building\SafetyControl.class del Building\SafetyControl.class
if exist Building\Engine.class del Building\Engine.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


