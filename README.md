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
