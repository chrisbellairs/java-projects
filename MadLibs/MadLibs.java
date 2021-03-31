public class MadLibs {
  /*
  This is a mad libs game that uses variables to replace words in the story.
  */
    public static void main(String[] args){
      String name1 = "Chris";
      String name2 = "Bob";
      String adjective1 = "fantastic";
      String adjective2 = "perfect";
      String adjective3 = "nervous";
      String verb1 = "rock";
      String noun1 = "idiots";
      String noun2 = "guns";
      String noun3 = "music";
      String noun4 = "onlookers";
      String noun5 = "dog crap";
      String noun6 = "dinosaur";
      String place1 = "England";
      int number = 2100;




      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }
}
