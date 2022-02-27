def loadColors(){
  
  NC='\033[0m'       
  BIBlack='\033[1;90m'
  BIRed='\033[1;91m'
  BIGreen='\033[1;92m'
  BIYellow='\033[1;93m'
  BIBlue='\033[1;94m'
  BIPurple='\033[1;95m'
  BICyan='\033[1;96m'
  BIWhite='\033[1;97m'
  Blink='\033[5m'
}

def info(message){
  loadColors()
  sh """ set +x; echo -e "${BICyan}[INFO] - $message  ${NC}" """
}

def error(message){
  loadColors()
  sh """ set +x; echo -e "${BIRed}[ERROR] - $message  ${NC}" """
}

def success(message){
  loadColors()
  blinkMessage=blinkSuccess($message) 
  echo -e "blinkSuccess($message)"
  sh """ set +x; echo -e "${BIGreen}[SUCCESS] - $blinkMessage  ${NC}" """
}

def debug(message){
  loadColors()
  sh """ set +x; echo -e "${BIBlue}[DEBUG] - $message  ${NC}" """
}

def blinkSuccess(message){
  loadColors()
  sh """ echo -e "${Blink} $message  ${NC}" """
}
