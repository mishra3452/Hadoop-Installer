#!/bin/bash
for a in $(ls -1 /home/hadoop/Desktop/hadoop-2.6.0.tar.gz); 
do 
tar -zxvf $a; 
mv /home/hadoop/Desktop/HadoopUser/hadoop-2.6.0 /home/hadoop/hadoop;
done

