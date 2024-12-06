import static org.junit.Assert.assertEquals;

import org.junit.Test;

import musicplaylist.MusicPlaylist;
import musicplaylist.MusicPlaylist1L;

/**
 * JUnit test fixture for {@code MusicPlaylist}'s constructor and kernel
 * methods.
 *
 * @author Melvin Vasquez.
 */
public class MusicPlaylistTest {

    /**
     * Test clear on non empty PL.
     */
    @Test
    public final void testClearOnNonEmptyPL() {
        MusicPlaylist pl = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");

        pl.clear();

        assertEquals(0, pl.numberOfSongs());
    }

    /**
     * Test clear on empty PL.
     */
    @Test
    public final void testClearOnEmptyPL() {
        MusicPlaylist pl = new MusicPlaylist1L();

        pl.clear();

        assertEquals(0, pl.numberOfSongs());
    }

    /**
     * Test new Instance.
     */
    @Test
    public final void testNewInstance() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = pl.newInstance();

        assertEquals(plCopy.numberOfSongs(), pl.numberOfSongs());
    }

    /**
     * Test transfer from when transfering to an empty playlist.
     */
    @Test
    public final void testTransferFromOnEmptyPL() {

        final int lengthNew = 3;
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");

        plCopy.transferFrom(pl);

        assertEquals(0, pl.numberOfSongs());
        assertEquals(lengthNew, plCopy.numberOfSongs());
    }

    /**
     * Test tranfer from when transfering to a non empty playlist.
     */
    @Test
    public final void testTransferFromOnNonEmptyPL() {

        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");

        pl.transferFrom(plCopy);

        assertEquals(0, pl.numberOfSongs());
        assertEquals(0, plCopy.numberOfSongs());
    }

    /**
     * Test transfer from when both playlist are non empty.
     */
    @Test
    public final void testTransferFromBothEmpty() {

        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();

        final int expLength = 3;
        pl.addSong("Defying Gravity");
        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");

        plCopy.addSong("Defying Gravity");
        plCopy.addSong("One Short Day");
        plCopy.addSong("WILDFLOWER");

        pl.transferFrom(plCopy);
        assertEquals(expLength, pl.numberOfSongs());
        assertEquals(0, plCopy.numberOfSongs());
    }

    /**
     * Test empty constructor, playlist should be size 0 when first made.
     */
    @Test
    public final void testEmptyConstructor() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();
        assertEquals(plCopy.numberOfSongs(), pl.numberOfSongs());
        assertEquals(0, pl.numberOfSongs());
    }

    /**
     * Test addSong to empty playlist.
     */
    @Test
    public final void testAddSongToEmptyPlaylist() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();
        pl.addSong("Defying Gravity");
        plCopy.addSong("Defying Gravity");
        assertEquals(1, pl.numberOfSongs());
        assertEquals(pl.numberOfSongs(), pl.numberOfSongs());
    }

    /**
     * Test addSong to nonEmpty playlist.
     */
    @Test
    public final void testAddManySongsToPlaylist() {
        final int lengthOld = 3;
        final int lengthNew = 5;

        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();
        pl.addSong("Defying Gravity");
        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");

        plCopy.addSong("Defying Gravity");
        plCopy.addSong("One Short Day");
        plCopy.addSong("WILDFLOWER");
        plCopy.addSong("Popular");
        plCopy.addSong("What Else Can I do");

        assertEquals(lengthOld, pl.numberOfSongs());

        pl.addSong("Popular");
        pl.addSong("What Else Can I do");

        assertEquals(lengthNew, pl.numberOfSongs());
        assertEquals(plCopy.numberOfSongs(), pl.numberOfSongs());
    }

    /**
     * Test remove song leaving playlist empty.
     */
    @Test
    public final void testRemoveSongLeavingPlaylistEmpty() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();
        pl.addSong("Defying Gravity");
        // call method under test
        pl.removeSong();

        assertEquals(0, pl.numberOfSongs());
        assertEquals(pl.numberOfSongs(), plCopy.numberOfSongs());
    }

    /**
     * Test remove song leaving playlist non-empty.
     */
    @Test
    public final void testRemoveSongLeavingPlaylistNonEmpty() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();
        plCopy.addSong("Defying Gravity");
        plCopy.addSong("One Short Day");

        pl.addSong("Defying Gravity");
        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");

        // call method under test
        pl.removeSong();

        assertEquals(2, pl.numberOfSongs());
        assertEquals(pl.numberOfSongs(), plCopy.numberOfSongs());
    }

    /**
     * Test number of songs with empty playlist.
     */
    @Test
    public final void testNumberOfSongs0() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();

        assertEquals(0, pl.numberOfSongs());
        assertEquals(pl.numberOfSongs(), plCopy.numberOfSongs());
    }

    /**
     * Test number of songs with non empty playlist of size 1.
     */
    @Test
    public final void testNumberOfSongs1() {
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();

        pl.addSong("Defying Gravity");
        plCopy.addSong("Defying Gravity");

        assertEquals(1, pl.numberOfSongs());
        assertEquals(pl.numberOfSongs(), plCopy.numberOfSongs());
    }

    /**
     * Test number of songs with larger playlist.
     */
    @Test
    public final void testNumberOfSongsMany() {

        final int lengthPL = 5;
        MusicPlaylist pl = new MusicPlaylist1L();
        MusicPlaylist plCopy = new MusicPlaylist1L();

        pl.addSong("One Short Day");
        pl.addSong("WILDFLOWER");
        pl.addSong("Popular");
        pl.addSong("What Else Can I do");
        pl.addSong("Defying Gravity");

        plCopy.addSong("One Short Day");
        plCopy.addSong("WILDFLOWER");
        plCopy.addSong("Popular");
        plCopy.addSong("What Else Can I do");
        plCopy.addSong("Defying Gravity");

        assertEquals(lengthPL, pl.numberOfSongs());
        assertEquals(pl.numberOfSongs(), plCopy.numberOfSongs());
    }

}
