package musicplaylist;

import components.queue.Queue1L;

/**
 ** {@code MusicPlaylist} represented as a {@code Queue1L<String>} with
 * implementations of 6 * primary methods.
 *
 * <pre>
 * @convention
 *             all entries in {@code MusicPlaylist} will hold a string that contains
 *  *  *  *  *          the name of the song. Entries must be strings!
 * </pre>
 * <pre>
 * @correspondence a entry in {@code MusicPlaylist} will take the form of strings such as
 *                 <(name of song), (name of song2), .... , (name of last song)>.
 * </pre>
 *
 * @author Melvin Vasquez
 */
public class MusicPlaylist1L extends MusicPlaylistSecondary {
    /**
     * private members------------------------------------------------.
     */

    /**
     * Representation of {@code this}.
     */
    private Queue1L<String> rep;

    /**
     * Creator of initial representation.
     */
    public void createNewRep() {
        this.rep = new Queue1L<String>();
    }

    /**
     * Constructor! --------------------------------------------------.
     */

    /**
     * No-argument constructor.
     */
    public MusicPlaylist1L() {
        this.createNewRep();
    }

    /**
     * Standard Methods ----------------------------------------------.
     */
    @Override
    public final MusicPlaylist newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(MusicPlaylist source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof MusicPlaylist1L : ""
                + "Violation of: source is of dynamic type NaturalNumberExample";

        MusicPlaylist1L localSource = (MusicPlaylist1L) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /**
     * Kernel Methods-------------------------------------------------.
     */

    @Override
    public final void addSong(String newSong) {
        assert newSong != null : "Violation of: x is not null";
        this.rep.enqueue(newSong);
    }

    @Override
    public final String removeSong() {
        assert this.numberOfSongs() > 0 : "Violation of: this /= <>";
        String currentSong = this.rep.dequeue();
        return currentSong;
    }

    @Override
    public final int numberOfSongs() {
        return this.rep.length();
    }
}
