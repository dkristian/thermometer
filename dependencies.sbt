libraryDependencies ++= Seq(
  "com.twitter"             %% "scalding-core"      % "0.9.0rc4"
, "org.apache.hadoop"       %  "hadoop-client"      % "2.0.0-mr1-cdh4.3.0"  % "provided"
, "org.apache.hadoop"       %  "hadoop-core"        % "2.0.0-mr1-cdh4.3.0"  % "provided"
, "org.scalaz"              %% "scalaz-core"        % "7.0.5"
, "org.specs2"              %% "specs2"             % "2.2.2"
, "org.scalacheck"          %% "scalacheck"         % "1.10.1"
)

libraryDependencies ++= Seq(
  "org.scalaz"              %% "scalaz-scalacheck-binding"      % "7.0.5"   % "test"
)

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"
, "releases" at "http://oss.sonatype.org/content/repositories/releases"
, "Concurrent Maven Repo" at "http://conjars.org/repo"
, "Clojars Repository" at "http://clojars.org/repo"
, "Twitter Maven" at "http://maven.twttr.com"
, "Hadoop Releases" at "https://repository.cloudera.com/content/repositories/releases/"
, "cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
)
