# Appium setup in Linux Environment
https://developer.android.com/studio/
Download the Android Studio and extract it to your HOME folder.
Open Terminal and go to Folder '/home/(USERNAME)/android-studio/bin'
Enter Command --> ./studio.sh

# Download appium-desktop-1.6.2-x86_64.AppImage and use command.
https://github.com/appium/appium-desktop/releases
cd Desktop/SOFTWARE/
chmod a+x appium-desktop-1.6.2-x86_64.AppImage
./appium-desktop-1.6.2-x86_64.AppImage

Home-->.bashrc  (Paste below line at the bottom)
# Android and Appium Environment path 
export ANDROID_HOME=$HOME/Android/Sdk
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/platform-tools

# Commands
which android
adb devices

# TO OPEN ANDROID STUDIO
cd ~/android-studio/bin
./studio.sh

# TO UPDATE SDK MANAGER
1. Open the Android Studio using above Command
2. Click on 'Configure' bottom right 'Welcome to Android Studio'
3. Click on 'SDK Manager'

# TO OPEN UIAUTOMATOR VIEWER
cd /home/(USERNAME)/Android/Sdk/tools/bin
./uiautomatorviewer

# RUNNING APPIUM SERVER
cd Desktop/SOFTWARE/
./appium-desktop-1.6.2-x86_64.AppImage


