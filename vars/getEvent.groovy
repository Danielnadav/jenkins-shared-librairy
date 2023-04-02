def call(String name = 'blabla') {
  echo "Hello, ${name}."
  sh "pwd" 
  sh "echo the path of ${name}"
  call(String name1 = 'plan')
  echo "${plan}"
  System.exit(0)
}

