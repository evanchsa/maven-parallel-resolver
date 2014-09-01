maven-parallel-resolver
=======================

A concurrent safe ProjectDependenciesResolver (Fixes MNG-5315)

Place the resulting JAR in the $MAVEN_HOME/lib/ext . Alternatively the mvn
script can be patched to point to a custom m2.conf:

  -Dclassworlds.conf=/path/to/custom/m2.conf

with the content:

  main is org.apache.maven.cli.MavenCli from plexus.core

  set maven.home default ${user.home}/m2

  [plexus.core]
  optionally /path/to/other/ext/*.jar
  optionally ${maven.home}/lib/ext/*.jar
  load       ${maven.home}/lib/*.jar

License
=======================

  Licensed to the Apache Software Foundation (ASF) under one
  or more contributor license agreements. See the NOTICE file
  distributed with this work for additional information
  regarding copyright ownership. The ASF licenses this file
  to you under the Apache License, Version 2.0 (the
  "License"); you may not use this file except in compliance
  with the License. You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied. See the License for the
  specific language governing permissions and limitations
  under the License.

