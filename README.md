# stripe4S

[![Latest version](https://index.scala-lang.org/charlesahunt/proteus/proteus/latest.svg)](https://index.scala-lang.org/charlesahunt/stripe4s)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.charlesahunt/proteus_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.charlesahunt/stripe4s_2.13)
[![Proteus](https://circleci.com/gh/CharlesAHunt/stripe4s.svg?style=svg)](https://circleci.com/gh/CharlesAHunt/stripe4s)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/be829fed3c134f8cbf14c60290651d63)](https://www.codacy.com/app/charlesahunt/stripe4s?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=charlesahunt/stripe4s&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/be829fed3c134f8cbf14c60290651d63)](https://www.codacy.com/app/charlesahunt/stripe4s?utm_source=github.com&utm_medium=referral&utm_content=charlesahunt/stripe4s&utm_campaign=Badge_Coverage)

Stripe driver for Scala.

This client is compatible with Stripe API v1

## Getting Started

You may need to add the Sonatype nexus to your resolvers:
``` 
     resolvers ++= Seq("OSS" at "http://oss.sonatype.org/content/repositories/releases")
```

sbt:
```
    libraryDependencies += "com.charlesahunt" % "stripe4s_2.13" % "0.1.0"
```

maven:
```
    <dependency>
      <groupId>com.charlesahunt</groupId>
      <artifactId>stripe4s_2.13</artifactId>
      <version>0.1.0</version>
    </dependency>
```

## Configuration

To configure your application with Stripe4S, you will need to create a Stripe4SConfig configuration object to initialize
  client.  You will most likely want to materialize the configuration case class from an application.conf
  that looks like the following to a case class using `Config.configuration` in your code:
```
    stripe4S {
...
    }
```

You can also create the Stripe4SConfig manually in your source like so:

```
    Stripe4SConfig(
....
    )
```

## Usage

//TODO: Coming soon!
