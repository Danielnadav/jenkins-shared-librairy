def call(String name = 'blabla') {
  echo "Hello, ${name}."
  sh "pwd" "echo the path of ${name}"
}

