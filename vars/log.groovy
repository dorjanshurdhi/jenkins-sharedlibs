def loadColors(){
  
  NC='\033[0m'       # Text Reset

  # Bold High Intensity
  BIBlack='\033[1;90m'      # Black
  BIRed='\033[1;91m'        # Red
  BIGreen='\033[1;92m'      # Green
  BIYellow='\033[1;93m'     # Yellow
  BIBlue='\033[1;94m'       # Blue
  BIPurple='\033[1;95m'     # Purple
  BICyan='\033[1;96m'       # Cyan
  BIWhite='\033[1;97m'      # White
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
