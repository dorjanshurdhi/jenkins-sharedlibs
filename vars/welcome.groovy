def call(name){
  if( name == "Vincenzo"){
      message="Hey you are ${name} Disummo?"
      log.success(message)
  } 
  else {
    timestamps{
      ansiColor('xterm'){
        error="I don't know you"
        log.error(error)
      }
    }
  }
}
