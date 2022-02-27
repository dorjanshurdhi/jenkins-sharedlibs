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
}

def info(message){
  loadColors()
  sh """ set +x; echo -e "${BICyan}[INFO] - $message  ${NC}" """
}

def error(message){
  loadColors()
  sh """ set +x; echo -e "${BIRed}[INFO] - $message  ${NC}" """
}

def success(message){
  loadColors()
  sh """ set +x; echo -e "${BIGreen}[INFO] - $message  ${NC}" """
}

def debug(message){
  loadColors()
  sh """ set +x; echo -e "${BIBlue}[INFO] - $message  ${NC}" """
}
