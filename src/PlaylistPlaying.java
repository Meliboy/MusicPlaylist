import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import musicplaylist.MusicPlaylist;
import musicplaylist.MusicPlaylist1L;

/**
 * Another Demonstration of MusicPLaylist being used to play the songs. Prints
 * out songs to be played. In a future iteration of this component I would be
 * able to take the string and search it up online and play it somehow.
 */
public class PlaylistPlaying {

    /**
     * Given playlist play the songs.
     *
     * @param playlist
     *            pllaylist given
     * @param out
     *            prints out songs and played
     */
    private static void playSongs(MusicPlaylist playlist, SimpleWriter out) {
        MusicPlaylist sub = playlist.newInstance();
        while (playlist.numberOfSongs() > 0) {
            String song = playlist.removeSong();
            out.println(song);
            sub.addSong(song);
        }
    }

    /**
     * Shuffle Playlist and play the songs.
     *
     * @param playlist
     *            playlist given
     * @param out
     *            prints out song to be played
     */
    private static void shuffleAndPlay(MusicPlaylist playlist,
            SimpleWriter out) {
        MusicPlaylist sub = playlist.newInstance();

        playlist.shuffle();

        while (playlist.numberOfSongs() > 0) {
            String song = playlist.removeSong();
            out.println(song);
            sub.addSong(song);
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        SimpleWriter out = new SimpleWriter1L();

        //you have a playlist and want to play the songs
        MusicPlaylist pl1 = new MusicPlaylist1L();
        pl1.addSong("PROVENZA");
        pl1.addSong("X");
        pl1.addSong("Me Gustas Tu");
        pl1.addSong("Yo Voy");
        pl1.addSong("Lovesick");
        pl1.addSong("California and Me");
        pl1.addSong("From the Start");
        pl1.addSong("All I Really Want is You");
        pl1.addSong("Be More");
        pl1.addSong("Dope Lovers");
        pl1.addSong("Contrail");

        playSongs(pl1, out);
        out.println();

        //play songs shuffled
        MusicPlaylist pl2 = new MusicPlaylist1L();
        pl2.addSong("Rush");
        pl2.addSong("Calm Down");
        pl2.addSong("Spinnin");
        pl2.addSong("What Was I Made For?");
        pl2.addSong("Spinnin");
        pl2.addSong("Reckless & Sweet");
        pl2.addSong("Angels in Tibet");

        shuffleAndPlay(pl2, out);
        out.println();

    }
}
