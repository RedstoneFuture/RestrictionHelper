plugins {
  `java-library`
  id("net.kyori.indra")
  id("net.kyori.indra.checkstyle")
  id("net.kyori.indra.publishing")
}

group = rootProject.group
version = rootProject.version
description = rootProject.description

indra {
  javaVersions {
    target(17)
  }

  github("TehBrian", "RestrictionHelper")

  mitLicense()

  publishReleasesTo("thbn", "https://repo.thbn.me/releases")
  publishSnapshotsTo("thbn", "https://repo.thbn.me/snapshots")

  configurePublications {
    pom {
      developers {
        developer {
          name.set("TehBrian")
          url.set("https://tehbrian.xyz")
          email.set("tehbrian@proton.me")
        }
      }
    }
  }
}
