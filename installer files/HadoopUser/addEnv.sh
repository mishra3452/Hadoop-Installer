#!/bin/bash
echo "export JAVA_HOME=/opt/jdk8" >> ~/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME" >> ~/.bashrc
echo "export HADOOP_HOME=/home/hadoop/hadoop" >> ~/.bashrc
echo "export HADOOP_INSTALL=\$HADOOP_HOME" >> ~/.bashrc
echo "export HADOOP_MAPRED_HOME=\$HADOOP_HOME" >> ~/.bashrc
echo "export HADOOP_COMMON_HOME=\$HADOOP_HOME" >> ~/.bashrc
echo "export HADOOP_HDFS_HOME=\$HADOOP_HOME" >> ~/.bashrc
echo "export YARN_HOME=\$HADOOP_HOME" >> ~/.bashrc
echo "export HADOOP_COMMON_LIB_NATIVE_DIR=\$HADOOP_HOME/lib/native" >> ~/.bashrc
echo "export PATH=\$PATH:\$HADOOP_HOME/sbin:\$HADOOP_HOME/bin" >> ~/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> ~/.bashrc
echo "export LD_LIBRARY_PATH=\$HADOOP_HOME/lib/native" >> ~/.bashrc
reboot -f
