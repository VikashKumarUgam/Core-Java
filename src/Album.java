import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        System.out.println(title);
        for(Song song: this.songs){
            System.out.println(song.getTitle());
            if(song.getTitle().equals(title))
                return song;
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if(index >=0 && index < this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        if( song != null){
            playlist.add(song);
            return true;
        }
        return false;
    }
}
