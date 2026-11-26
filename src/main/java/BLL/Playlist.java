package BLL;

import BE.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

        private int id;
        private String name;
        private List<BE.Song> songs = new ArrayList<>();

        public Playlist(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public List<Song> getSongs() { return songs; }

        @Override
        public String toString() { return name; }
    }

