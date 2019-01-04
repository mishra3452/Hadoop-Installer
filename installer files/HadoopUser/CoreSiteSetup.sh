#!/bin/bash
echo '<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl" href="configuration.xsl"?>
<!--
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License. See accompanying LICENSE file.
-->

<!-- Put site-specific property overrides in this file. -->
'> /home/hadoop/hadoop/etc/hadoop/core-site.xml

echo "<configuration>" >> /home/hadoop/hadoop/etc/hadoop/core-site.xml
echo "<property>" >> /home/hadoop/hadoop/etc/hadoop/core-site.xml  
echo "<name>fs.default.name</name>" >> /home/hadoop/hadoop/etc/hadoop/core-site.xml    
echo "<value>hdfs://localhost:9000</value>" >> /home/hadoop/hadoop/etc/hadoop/core-site.xml
echo "</property>" >> /home/hadoop/hadoop/etc/hadoop/core-site.xml
echo "</configuration>" >> /home/hadoop/hadoop/etc/hadoop/core-site.xml

