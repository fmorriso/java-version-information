# Java Version Information Display
A small Java console application that displays the key/value pairs of any System Property that has __both__ a String-type key __and__ a String-type value.
## Background
The author wanted a way to display the Java version being used at run-time during a period of time when various Java versions were available, raning from 8 to 12.0.2.

```
Date written: September 8, 2019
```
## How To Use
Althought the program was originally developed in Eclipse (2019-06), I deliberately set up the project 
so that it could be easily run in other java IDEs such as
* Microsoft Visual Studio Code
* jGrasp - 
That is why there is no `src` folder in the project.

One thing that I do that you may or may not agree with is how/where I install the JDK on my Windows computers.

Normally, the JDK installer for Windows wants to install into `c:\program files\java\` or `c:\program files (x86)\java` which I do not like, so I overrride it to point to c:\java.

The advantage of this approach is that the resulting `PATH` environment variable is shorter and does not approach the maximum limit of 256 or 1024 total characters, depending on which version of Windows is being used.

Another thing I do is to __not__ use version-specific numbering of the directory where the JDK is installed.
For example, instead of `c:\java\jdk-8\` or `c:\java\jdk-12.0.2\` my (one and only) JDK is installed in `c:\java\jdk\`.

Feel free to disagree, but you need to know this if you are cloning this project from GitHub.

## Example output
Here is some sample output as seen on September 8, 2019 (minus some information I'd rather keep private), which is indicated by `...snip...` below
```
key=sun.desktop, value=windows
key=awt.toolkit, value=sun.awt.windows.WToolkit
key=java.specification.version, value=12
key=sun.cpu.isalist, value=amd64
key=sun.jnu.encoding, value=Cp1252
key=java.class.path, value=C:\projects\JSSforAPCS\java-version-information
key=java.vm.vendor, value=Oracle Corporation
key=sun.arch.data.model, value=64
key=java.vendor.url, value=https://java.oracle.com/
key=java.vm.specification.version, value=12
key=os.name, value=Windows 10
key=sun.java.launcher, value=SUN_STANDARD
key=user.country, value=US
key=sun.boot.library.path, value=C:\java\jdk\bin
key=sun.java.command, value=JavaVersionInformation
key=jdk.debug, value=release
key=sun.cpu.endian, value=little
key=user.home, value=C:\Users\...snip...
key=user.language, value=en
key=java.specification.vendor, value=Oracle Corporation
key=java.version.date, value=2019-07-16
key=java.home, value=C:\java\jdk
key=file.separator, value=\
key=java.vm.compressedOopsMode, value=Zero based
key=java.vm.specification.vendor, value=Oracle Corporation
key=java.specification.name, value=Java Platform API Specification
key=java.awt.graphicsenv, value=sun.awt.Win32GraphicsEnvironment
key=sun.management.compiler, value=HotSpot 64-Bit Tiered Compilers
key=java.runtime.version, value=12.0.2+10
key=user.name, value=...snip...
key=path.separator, value=;
key=os.version, value=10.0
key=java.runtime.name, value=Java(TM) SE Runtime Environment
key=file.encoding, value=UTF-8
key=java.vm.name, value=Java HotSpot(TM) 64-Bit Server VM
key=java.vendor.url.bug, value=https://bugreport.java.com/bugreport/
key=java.io.tmpdir, value=C:\Users\...snip...\AppData\Local\Temp\
key=java.version, value=12.0.2
key=user.dir, value=C:\projects\JSSforAPCS\java-version-information
key=os.arch, value=amd64
key=java.vm.specification.name, value=Java Virtual Machine Specification
key=java.library.path, value=C:\java\jdk\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/java/jdk/bin/server;C:/java/jdk/bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\PowerShell\6\; ...snip ...
key=java.vm.info, value=mixed mode, sharing
key=java.vendor, value=Oracle Corporation
key=java.vm.version, value=12.0.2+10
key=sun.io.unicode.encoding, value=UnicodeLittle
key=java.class.version, value=56.0

``` 