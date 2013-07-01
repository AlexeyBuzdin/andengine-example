###Portals

####Installation
1. Download android sdk 15 through Android SDK Manager
2. Set ANDROID_HOME
3. Download [maven android sdk deployer](https://github.com/mosabua/maven-android-sdk-deployer/#readme)
4. Run mvn install in maven android sdk deployer folder
5. Udev for Ubuntu http://developer.android.com/tools/device.html


######Maven command to install a jar file to local repo
mvn install:install-file -Dfile=andengine-gles2.jar -DgroupId=com.anddev     -DartifactId=andengine -Dversion=gles2 -Dpackaging=jar -DlocalRepositoryPath=.
