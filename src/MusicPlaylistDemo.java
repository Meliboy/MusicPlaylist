import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import musicplaylist.MusicPlaylist;
import musicplaylist.MusicPlaylist1L;

/**
 * Demo Use of MusicPlaylist Component.
 *
 * @author Melvin Vasquez.
 */
public class MusicPlaylistDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        SimpleWriter out = new SimpleWriter1L();

        //create a new playlist to store user's favorite songs currently
        //perhaps December 24 Playlist
        MusicPlaylist dec24 = new MusicPlaylist1L();

        //add songs that user was into this month
        dec24.addSong("PROVENZA");
        dec24.addSong("X");
        dec24.addSong("Me Gustas Tu");
        dec24.addSong("Yo Voy");
        dec24.addSong("Lovesick");
        dec24.addSong("California and Me");
        dec24.addSong("From the Start");
        dec24.addSong("All I Really Want is You");
        dec24.addSong("Be More");
        dec24.addSong("Dope Lovers");
        dec24.addSong("Contrail");

        out.print("Current playlist at the middle of the month: ");
        out.println(dec24.toString());
        out.println();

        //user can use this to store their music as well as shuffle it
        dec24.shuffle();

        out.print("Shuffled Playlist: ");

        //a shuffled playlist allows user to hear their favorite songs in different ways!
        //more exciting since they wont know whats next
        out.println(dec24.toString());
        out.println();

        //not feeling the next song, remove it!

        String nextSong = dec24.nextSong();

        out.println("Not wanting to listen to the next song, " + nextSong);
        out.println();

        dec24.removeSong();

        //playlist with not so fave song removed
        out.print("Next Song removed from Playlist: ");
        out.println(dec24.toString());
        out.println();

        //found a playlist that you love, want to add them all to your DEC playlist?!
        //You can!!!

        MusicPlaylist beats24 = new MusicPlaylist1L();
        beats24.addSong("Rush");
        beats24.addSong("Calm Down");
        beats24.addSong("Spinnin");
        beats24.addSong("What Was I Made For?");
        beats24.addSong("Spinnin");
        beats24.addSong("Reckless & Sweet");
        beats24.addSong("Angels in Tibet");

        //add songs from beats24 into your DEC 24 playlist
        dec24.addPlaylist(beats24);

        //dec24 after adding the songs from beats24 to it
        out.print("December playlist after putting beats24 songs into it: ");
        out.println(dec24.toString());
        out.println();

        /**
         * IN LOVE WITH A SONG?!!! Loop it as many additional times as you want
         * next song is the user's favorite, loop it so it will play an x number
         * of times extra
         **/
        final int loopTimes = 10;
        dec24.loop(loopTimes);

        //playlist with song being loop'd!
        out.print("Loop'd Next Song in Playlist: ");
        out.println(dec24.toString());
        out.println();

        //want to empty your playlist to let for some fresh new songs?! YOU CAN TOO
        dec24.clear();

        out.print("Emptied Playlist: ");
        out.println(dec24.toString());
        out.println("Time to add some more amazing songs!");

        out.close();
    }
}
