A Basic Setup for using ProGuard with the javafx-gradle-plugin
======================================================

This is a basic JavaFx gradle template project . This works in Intelli j idea.
Its a template created with ProGuard .Its empty it has one controller and one fxml file with a Application file that you can put all your code or start from.
.
This code in the project was deducted from https://github.com/FibreFoX/javafx-gradle-plugin , so all the credit goes to them.
This template was created beause its very hard to create a gradle based javafx project in intelli j idea , i dont know about
 others but i had a hard time searching for this on the internet, 
hence i felt the need to puyt it on GitHub for other developers to try it out just like i did.

**Below** is the full documentation or details  from which i got the original project .


Calling `gradle jfxNative` will generate some executable jar-file with javafx-support and will
generate some executable file able to run on your machine/achitecture, which is called native launcher.
Depending on the tools you have installed, there will be some installers generated too.

You need to set some `vendor`-name which is required for generating installers.

For having ProGuard to work on your jar-file, you have to make sure that the gradle-task ProGuardTask
will run before the `jfxJar`-task provided with the javafx-gradle-plugin is executed. This projects shows
the needed manual stitching to have all tasks being in the right order including some cleanup.

You can call `gradle jfxJar` and `gradle jfxNative` which will all produce some ProGuard obfruscated outcome.

For every system you target, you need some working system of that targeted one, because the generated result
is generated for each architecture and the operating system using the local installed tool-sets. The used
java(fx)packager is just a wrapper around these tools and the javafx-gradle-plugin is just a wrapper of that
provided by the OpenJDK/OracleJDK.

You can find the JavaFX-JAR-file at `build/jfx/app/javafx-proguard-gradle-jfx.jar` and your native launcher can be
found at `build/jfx/native/javafx-proguard-gradle/` while the installers reside below the`build/jfx/native/`-folder.

Please read the official documentation of Oracle about the tools you are required to install for having
installers be generated.

Please read the official documentation of ProGuard about the setup of the contents inside the `proguard.conf`-file,
this is not part of the scope of this example-project.
