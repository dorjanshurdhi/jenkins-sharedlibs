def call(name){
  if( name == "Vincenzo"){
     echo "Hey you are ${name} Disummo?"
  } 
  else {
    error="I don't know you"
    log.error(error)
  }
}
