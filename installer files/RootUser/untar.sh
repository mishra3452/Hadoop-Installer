#!/bin/bash
for a in $(ls -1 /root/Desktop/jdk-8u91-linux-x64.tar.gz); 
do 
tar -zxvf $a; 
mv /root/Desktop/HadoopInstaller/jdk1.8.0_91 /opt/jdk8;
done

