import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.kotlin.dsl.maven

<<<<<<< Updated upstream
fun RepositoryHandler.android(): MavenArtifactRepository = google {
  content {
    includeGroupByRegex("androidx.*")
    includeGroupByRegex("com\\.android.*")
    includeGroupByRegex("com\\.google.*")
    includeGroupByRegex("zipflinger.*")

    includeModule("org.jetbrains.kotlin", "kotlin-compiler-embeddable")
=======
val RepositoryHandler.android: MavenArtifactRepository
  get() = google {
    content {
      includeGroupByRegex("androidx.*")
      includeGroupByRegex("com\\.android.*")
      includeGroupByRegex("com\\.google.*")
      includeGroupByRegex("zipflinger.*")

      includeGroup("org.jetbrains.kotlin")
    }
>>>>>>> Stashed changes
  }
}

fun RepositoryHandler.jitpack(): MavenArtifactRepository = maven("https://jitpack.io") {
  content {
    includeGroupByRegex("com\\.github\\.ashdavies.*")
  }
}

fun RepositoryHandler.kotlin(): MavenArtifactRepository = maven("https://dl.bintray.com/kotlin/kotlin-eap") {
  content {
    includeGroup("org.jetbrains.kotlin")
  }
}

fun RepositoryHandler.trove4j(): MavenArtifactRepository = jcenter {
  content {
    includeGroup("org.jetbrains.trove4j")
  }
}
