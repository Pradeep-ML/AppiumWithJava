# AppiumWithJava
Appium scripts with Java for deviceConnect integration!

## Pre-requisites
### Setup on Windows system:
* Download Java and set Java_Home in environmental variables.
```sh
JAVA_HOME : C:\Program Files\Java\jdk1.8.0_171\bin
```
* Download standalone SDK or alternatively install Android STUDIO from "https://developer.android.com/studio/index.html".
* Set Android_Home Environmental variable path to SDK location and include bin folder paths in PATH variable.
```sh
ANDROID_HOME: C:\Users\user\AppData\Local\Android\Sdk
PATH: C:\Users\user\AppData\Local\Android\Sdk\tools\bin;C:\Users\user\AppData\Local\Android\Sdk\tools;C:\Users\user\AppData\Local\Android\Sdk\platform-tools;
```
### Setup on MacOSX:
* Download & install java and set it to the Mac OSX PATH Variable.
```sh
In, Terminal use following to edit bash_profile:
    sudo nano ~/.bash_profile
Add following into the bash_profile:
    export PATH="/usr/bin"
Use CTRL+O to save changes and CTRL+X to exit. CTRL+O->Enter->CTRL+X
```
* Download and install Android STUDIO from "https://developer.android.com/studio/index.html" OR install standalone SDK.
* Set Android_Home variables path to SDK location and include bin folder paths in PATH variable.
```sh
In, Terminal use following to edit bash_profile:
    sudo nano ~/.bash_profile
Add following into the bash_profile:
    export ANDROID_HOME="/Users/user/Library/Android/sdk"
    export PATH=$ANDROID_HOME/platform-tools:$PATH
    export PATH=$ANDROID_HOME/tools:$PATH
    export PATH=$ANDROID_HOME/tools/bin:$PATH
Use CTRL+O to save changes and CTRL+X to exit. CTRL+O->Enter->CTRL+X
```
### Further steps:
* Download and Install Eclipse IDE. It is the most widely used Java IDE. https://www.eclipse.org/downloads/.
* Download Appium & Selenium Java client library and extract them in a separate location.
** Appium Java Client library: http://appium.io/downloads.html
** Selenium Java Clicnt library: https://www.seleniumhq.org/download/
*** selenium-server-standalone-<Version No>.jar
*** selenium-java-<Version No>.zip
