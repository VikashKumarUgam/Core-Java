import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        if(this.songs.findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        Song song = this.songs.findSong(trackNumber);
        if(song != null){
            playlist.add(song);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = this.songs.findSong(title);
        if( song != null){
            playlist.add(song);
            return true;
        }
        return false;
    }

    public static class SongList{
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }
        private boolean add(Song song){
            if(this.songs.contains(song))
                return false;
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for(Song song: this.songs){
                System.out.println(song.getTitle());
                if(song.getTitle().equals(title))
                    return song;
            }
            return null;
        }
        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if(index >=0 && index < this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }
    }
}
