#!/bin/bash
chmod -R 777 hadoop
mkdir -p /home/hadoop/hadoop_tmp/hdfs/namenode
mkdir -p /home/hadoop/hadoop_tmp/hdfs/datanode  
echo "hadoop" |sudo chown -R hadoop:hadoop /home/hadoop/hadoop_tmp/ --stdin
