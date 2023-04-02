def call(String name = 'blabla') {
  echo "Hello, ${name}."
  sh "pwd" 
  sh "echo the path of ${name}"
}

