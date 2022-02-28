def showFile(file){
  timestamps{
        ansiColor('xterm'){
           sh cat file
         } 
      }
    }
}
