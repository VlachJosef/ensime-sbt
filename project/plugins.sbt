addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

// org.scalariform is old, use com.danieltrinh's version
// this only affects the formatting of sbt itself
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.0.1" excludeAll ExclusionRule("org.scalariform"))

libraryDependencies += "com.danieltrinh" %% "scalariform" % "0.1.5"
