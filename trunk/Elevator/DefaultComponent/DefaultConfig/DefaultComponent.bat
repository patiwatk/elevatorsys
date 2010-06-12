echo off

set RHAP_JARS_DIR=C:/Rhapsody/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Rhapsody/Share\LangJava\lib\oxf.jar;C:/Rhapsody/Share\LangJava\lib\anim.jar;C:/Rhapsody/Share\LangJava\lib\animcom.jar;C:/Rhapsody/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Rhapsody/Share\LangJava\lib\oxf.jar;C:/Rhapsody/Share\LangJava\lib\anim.jar;C:/Rhapsody/Share\LangJava\lib\animcom.jar;C:/Rhapsody/Share\LangJava\lib\oxfInst.jar;
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
if exist Building\CarButton.class del Building\CarButton.class
if exist Building\Door.class del Building\Door.class
if exist Building\Floor.class del Building\Floor.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Building\Dispatcher.class del Building\Dispatcher.class
if exist Building\FloorButton.class del Building\FloorButton.class
if exist Building\CarPositionControl.class del Building\CarPositionControl.class
if exist Building\CarButtonControl.class del Building\CarButtonControl.class
if exist Building\Engine.class del Building\Engine.class
if exist Building\ButtonControl.class del Building\ButtonControl.class
if exist Building\Button.class del Building\Button.class
if exist Building\SensorsControl.class del Building\SensorsControl.class
if exist Building\Car.class del Building\Car.class

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


