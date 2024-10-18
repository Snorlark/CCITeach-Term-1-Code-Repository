class Relational_operator {
    public static void main(String[] args) {
        
      String mypassword = "PasswordQ";
      String attempt    = "passwordq";
      
      boolean passwordCorrect;
      
      if(mypassword == attempt){
          passwordCorrect = true;
      } else {
          passwordCorrect = false;
      }
      
      System.out.println(passwordCorrect);
      
    }
}


