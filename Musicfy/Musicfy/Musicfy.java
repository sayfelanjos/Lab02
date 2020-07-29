public class Musicfy {
    public static void main(String[] args) {
        User user1 = new User("Marcos Paulo", "777.777.777-77");
        User user2 = new User("Cookiezi", "111.111.11-11");
        Song song1 = new Song("Seven Nation Army", "Rock", "The White", "Stripes");
        Song song2 = new Song("Crazy Train", "Rock", "Ozzy Osbourne");
        Song song3 = new Song("Feels", "Pop", "Calvin Harris");
        Song song4 = new Song("Roar", "Pop", "Katy Perry");
        Song song5 = new Song("Anima", "Hardcore", "Xi");
        Song song6 = new Song("Freedom Dive", "Hardcore", "Xi");
        Song song7 = new Song("Teo", "Hardcore", "Omoi");
        Playlist rockPlaylist = new Playlist("Awesome Rock Songs", "Rock");
        rockPlaylist.addSong(song1);
        rockPlaylist.addSong(song2);
        Playlist osuPlaylist = new Playlist("Osu Memories", "hardcore");
        osuPlaylist.addSong(song5);
        osuPlaylist.addSong(song6);
        osuPlaylist.addSong(song7);
        user1.addPlaylist(rockPlaylist);
        user2.addPlaylist(osuPlaylist);
        System.out.println(user1.getPlaylists()[0].getDetails());
        System.out.println("");
        System.out.println(user2.getDetails());
        osuPlaylist.play();
        osuPlaylist.play();
        osuPlaylist.play(true);
    }
}
