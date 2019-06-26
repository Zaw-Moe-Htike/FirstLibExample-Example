# FirstLibExample-Example
Toast Library to show toast / Re-inventing the wheel

Code Sample
-----------
ColorfulToast.show(this, "Hello, I'm Colorful Toast");

Installation
------------
Android Gradle
--------------
Add the following code to build.gradle(root)

repositories {
    google()
    jcenter()

    maven { url 'https://jitpack.io' }
}

Add the following code to build.gradle(app)

dependencies {
    implementation 'com.github.Zaw-Moe-Htike:FirstLibExample-Example:1.1'
}
