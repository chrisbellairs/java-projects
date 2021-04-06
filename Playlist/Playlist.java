import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Queen - We Will Rock You");
    desertIslandPlaylist.add("Elton John - Your Song");
    desertIslandPlaylist.add("Kings of Leon - Milk");
    desertIslandPlaylist.add("The Killers - Mr Brightside");
    desertIslandPlaylist.add("Tash Sultana - Jungle");
    desertIslandPlaylist.add("Christine and the Queens - Tilted");

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(2);

    System.out.println(desertIslandPlaylist.size());

    String a = desertIslandPlaylist.get(0);
    String b = desertIslandPlaylist.get(1);
    desertIslandPlaylist.set(0, b);
    desertIslandPlaylist.set(1, a);

    System.out.println(desertIslandPlaylist);
  }
}
