import static org.junit.Assert.assertEquals;

import org.junit.Test;

import musicplaylist.MusicPlaylist;
import musicplaylist.MusicPlaylist1L;

/**
 * Customized JUnit test fixture for {@code MusicPlaylist1} using default
 * constructor.
 *
 * @author Melvin Vasquez
 */
public class MusicPlaylist1Test {

    /**
     * Testing nextSong on a playlist of size > 1.
     */
    @Test
    public final void testNextSong3() {
        MusicPlaylist pl = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("Lost Between the Gates");
        pl.addSong("Kiss the Sky");

        String nextSong = pl.nextSong();

        assertEquals(nextSong, "Defying Gravity");

    }

    /**
     * Testing nextSong on a playlist of size = 1.
     */
    @Test
    public final void testNextSong1() {
        MusicPlaylist pl = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("Lost Between the Gates");

        String nextSong = pl.nextSong();

        assertEquals(nextSong, "Defying Gravity");

    }

    /**
     * Testing add playlist with a playlist of size 1 and when this is not
     * empty.
     */
    @Test
    public final void testAddPlaylistSingleSong() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        final int newNumOfSongs = 3;

        pl.addSong("Defying Gravity");
        pl.addSong("Lost Between the Gates");

        pl2.addSong("fantasmas");

        pl.addPlaylist(pl2);

        assertEquals(newNumOfSongs, pl.numberOfSongs());
        assertEquals(0, pl2.numberOfSongs());
    }

    /**
     * Testing addPlaylist with a longer playlist (size 3) and this is not
     * empty.
     */
    @Test
    public final void testAddPlaylistLongPL() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        final int newNumOfSongs = 5;

        pl.addSong("Defying Gravity");
        pl.addSong("Lost Between the Gates");

        pl2.addSong("fantasmas");
        pl2.addSong("Escapism");
        pl2.addSong("Ice Cream Man");

        pl.addPlaylist(pl2);

        assertEquals(newNumOfSongs, pl.numberOfSongs());
        assertEquals(0, pl2.numberOfSongs());

    }

    /**
     * Testing addPlaylist with given playlist is empty and this is not empty.
     */
    @Test
    public final void testAddEmptyPlaylist() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("Lost Between the Gates");

        pl.addPlaylist(pl2);

        assertEquals(2, pl.numberOfSongs());
        assertEquals(0, pl2.numberOfSongs());

    }

    /**
     * Testing add playlist with a playlist of size 1 and when this is empty.
     */
    @Test
    public final void testAddPlaylistSingleSongToEmptyPL() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl2.addSong("fantasmas");

        pl.addPlaylist(pl2);

        assertEquals(1, pl.numberOfSongs());
        assertEquals(0, pl2.numberOfSongs());
    }

    /**
     * Testing addPlaylist with a longer playlist (size 3) and this is empty.
     */
    @Test
    public final void testAddLongPlaylistToEmptyPL() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        final int newNumOfSongs = 3;

        pl2.addSong("fantasmas");
        pl2.addSong("Escapism");
        pl2.addSong("Ice Cream Man");

        pl.addPlaylist(pl2);

        assertEquals(newNumOfSongs, pl.numberOfSongs());
        assertEquals(0, pl2.numberOfSongs());

    }

    /**
     * Testing addPlaylist with given playlist is empty and this is empty.
     */
    @Test
    public final void testAddEmptyPlaylistToEmptyPL() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addPlaylist(pl2);

        assertEquals(0, pl.numberOfSongs());
        assertEquals(0, pl2.numberOfSongs());

    }

    /**
     * Testing loop with a playlist of size 1 and looping next song 1 time.
     */
    @Test
    public final void testLoop1TimeWithPlaylistSize1() {
        MusicPlaylist pl = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");

        pl.loop(1);

        assertEquals(2, pl.numberOfSongs());

        int numOfTimesSOngIsFound = 0;
        while (pl.numberOfSongs() > 0) {
            if (pl.removeSong().equals("Defying Gravity")) {
                numOfTimesSOngIsFound++;
            }
        }
        /**
         * check that song was added into playlist the correct number of times,
         * should be loops + 1
         */
        assertEquals(numOfTimesSOngIsFound, 2);
    }

    /**
     * Testing loop with a playlist of size 1 and looping next song 3 times.
     */
    @Test
    public final void testLoop3TimeWithPlaylistSize1() {

        MusicPlaylist pl = new MusicPlaylist1L();
        final int expLength = 4;
        final int loops = 3;

        pl.addSong("Defying Gravity");

        pl.loop(loops);

        assertEquals(expLength, pl.numberOfSongs());

        int numOfTimesSOngIsFound = 0;
        while (pl.numberOfSongs() > 0) {
            if (pl.removeSong().equals("Defying Gravity")) {
                numOfTimesSOngIsFound++;
            }
        }
        /**
         * check that song was added into playlist the correct number of times,
         * should be loops + 1
         */
        assertEquals(numOfTimesSOngIsFound, loops + 1);
    }

    /**
     * Testing loop with a playlist of size 3 and looping next song 1 time.
     */
    @Test
    public final void testLoop1TimeWithPlaylistSize3() {
        MusicPlaylist pl = new MusicPlaylist1L();
        final int expLength = 4;

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");
        pl.addSong("Billie Bossa Nova");

        pl.loop(1);

        assertEquals(expLength, pl.numberOfSongs());

        int numOfTimesSOngIsFound = 0;
        while (pl.numberOfSongs() > 0) {
            if (pl.removeSong().equals("Defying Gravity")) {
                numOfTimesSOngIsFound++;
            }
        }
        /**
         * check that song was added into playlist the correct number of times,
         * should be loops + 1
         */
        assertEquals(numOfTimesSOngIsFound, 2);
    }

    /**
     * Testing loop with a playlist of size 3 and looping next song 3 times.
     */
    @Test
    public final void testLoop3TimeWithPlaylistSize3() {
        MusicPlaylist pl = new MusicPlaylist1L();
        final int expLength = 6;
        final int loops = 3;

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");
        pl.addSong("Billie Bossa Nova");

        pl.loop(loops);

        assertEquals(expLength, pl.numberOfSongs()); // check exp length change

        int numOfTimesSOngIsFound = 0;
        while (pl.numberOfSongs() > 0) {
            if (pl.removeSong().equals("Defying Gravity")) {
                numOfTimesSOngIsFound++;
            }
        }
        /**
         * check that song was added into playlist the correct number of times,
         * should be loops + 1
         */
        assertEquals(numOfTimesSOngIsFound, loops + 1);
    }

    /**
     * Test shuffle with playlist of size 3.
     */
    @Test
    public final void testShufflePLSize3() {
        final int expLength = 3;
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");
        pl.addSong("Billie Bossa Nova");

        pl2.addSong("Defying Gravity");
        pl2.addSong("WILDFLOWER");
        pl2.addSong("Billie Bossa Nova");

        pl.shuffle();

        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
        assertEquals(expLength, pl.numberOfSongs());

        boolean changed = false; // check to see that playlist order changed

        while (pl.numberOfSongs() > 0 && pl2.numberOfSongs() > 0) {
            if (pl.removeSong().equals(pl2.removeSong())) {
                changed = true;
            }

        }
        assertEquals(true, changed);
    }

    /**
     * Test shuffle with playlist size > 3.
     */
    @Test
    public final void testShufflePLSizeLarge() {
        final int expLength = 9;
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");
        pl.addSong("Billie Bossa Nova");
        pl.addSong("One Short Day");
        pl.addSong("we can't be friends");
        pl.addSong("Good Luck, Babe!");
        pl.addSong("Popular");
        pl.addSong("Elastic Heart");
        pl.addSong("Selfish");

        pl2.addSong("Defying Gravity");
        pl2.addSong("WILDFLOWER");
        pl2.addSong("Billie Bossa Nova");
        pl2.addSong("One Short Day");
        pl2.addSong("we can't be friends");
        pl2.addSong("Good Luck, Babe!");
        pl2.addSong("Popular");
        pl2.addSong("Elastic Heart");
        pl2.addSong("Selfish");

        pl.shuffle();

        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
        assertEquals(expLength, pl.numberOfSongs());

        boolean changed = false; // check to see that playlist order changed

        while (pl.numberOfSongs() > 0 && pl2.numberOfSongs() > 0) {
            if (pl.removeSong().equals(pl2.removeSong())) {
                changed = true;
            }

        }
        assertEquals(true, changed);
    }

    /**
     * Test shuffle with playlist size = 4.
     */
    @Test
    public final void testShufflePLSizeEven() {
        final int expLength = 4;
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");
        pl.addSong("Billie Bossa Nova");
        pl.addSong("One Short Day");

        pl2.addSong("Defying Gravity");
        pl2.addSong("WILDFLOWER");
        pl2.addSong("Billie Bossa Nova");
        pl2.addSong("One Short Day");

        pl.shuffle();

        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
        assertEquals(expLength, pl.numberOfSongs());

        boolean changed = false; // check to see that playlist order changed

        while (pl.numberOfSongs() > 0 && pl2.numberOfSongs() > 0) {
            if (pl.removeSong().equals(pl2.removeSong())) {
                changed = true;
            }

        }
        assertEquals(true, changed);

    }

    /**
     * Testing toString on an empty playlist.
     */
    @Test
    public final void testToStringOnEmptyPL() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        String playlist = pl.toString();

        assertEquals("<>", playlist);
        // check that playlist is restore by checking length
        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
    }

    /**
     * Testing toString on a playlist with 1 entry.
     */
    @Test
    public final void testToStringOnPLSize1() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");

        pl2.addSong("Defying Gravity");

        String playlist = pl.toString();

        assertEquals("<Defying Gravity>", playlist);
        // check that playlist is restore by checking length
        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
    }

    /**
     * Testing toString with a playlist of even size.
     */
    @Test
    public final void testToStringOnPLSizeEven() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");

        pl2.addSong("Defying Gravity");
        pl2.addSong("WILDFLOWER");

        String playlist = pl.toString();

        assertEquals("<Defying Gravity, WILDFLOWER>", playlist);
        // check that playlist is restore by checking length
        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
    }

    /**
     * Testing toString with a playlist of odd size greater than 1 (3).
     */
    @Test
    public final void testToStringOnPLSizeOdd3() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist pl2 = new MusicPlaylist1L();

        pl2.addSong("Defying Gravity");
        pl2.addSong("WILDFLOWER");
        pl2.addSong("One Short Day");

        pl.addSong("Defying Gravity");
        pl.addSong("WILDFLOWER");
        pl.addSong("One Short Day");

        String playlist = pl.toString();

        assertEquals("<Defying Gravity, WILDFLOWER, One Short Day>", playlist);
        // check that playlist is restore by checking length
        assertEquals(pl2.numberOfSongs(), pl.numberOfSongs());
    }
}
