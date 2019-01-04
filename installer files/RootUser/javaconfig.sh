#!/bin/bash
cd /opt/jdk8;
echo "${PWD}";
alternatives  --install /usr/bin/java   java   /opt/jdk8/bin/java    2
echo 3 | alternatives --config java
alternatives    --install    /usr/bin/jar  jar   /opt/jdk8/bin/jar   2
alternatives    --install  /usr/bin/javac  javac   /opt/jdk8/bin/javac    2
alternatives  --set  jar  /opt/jdk8/bin/jar
alternatives  --set  javac   /opt/jdk8/bin/javac 


