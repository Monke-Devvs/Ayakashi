###  Credits: `Ramzei#0944`

---

### Now you can create your own version of `Ayakashi` client

---

> Java version: AdoptJDK 8
---

### Running client through intellij idea
- Main: `Start`
- JVM args: `-Djava.library.path=$ProjectFileDir$/natives/`
- Working directory: `$ProjectFileDir$/work`

> Clean `target` before running

> Some things can be fucked due to minecraft working dir (for example resourcepack button crashes the game xd)


![](https://i.imgur.com/1ttvVCZ.png)

--- 

### Building
- Terminal -> `mvn clean package` in working dir (dir with fucking pom.xml lol)
- Jar file output:  `target/Ayakashi-1.0.5.jar`
- Rename file from `Ayakashi-1.0.5.jar` to `Ayakashi.jar`  
- Move `Ayakashi.jar` to `versions/Ayakashi`
- You must add class-path from `libs`
- Copy folder `Ayakashi` to `.minecraft/versions`

> JSON File: `versions/Ayakashi/Ayakashi.json`
---