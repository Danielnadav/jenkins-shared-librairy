def call(Map config=[:]) {
  return currentBuild.getBuildCauses()
}