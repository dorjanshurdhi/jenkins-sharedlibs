def add(x,y){
  //echo "Sum of ${x} and ${y} is ${x+y}"
  timestamps{
        ansiColor('xterm'){ 
           def output="Sum of ${x} and ${y} is ${x+y}"
            log.debug(output)
        }
  }
}

def mul(x,y){
  echo "Multiplication of ${x} and ${y} is ${x*y}"
}
