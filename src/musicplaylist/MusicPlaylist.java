package musicplaylist;

/**
 * @author Melvin Vasquez
 */
public interface MusicPlaylist extends MusicPlaylistKernel {

    /**
     * Reports the song at the front of {@code this}.
     *
     * @return the song at the front of {@code this}
     * @requires this /= <>
     * @ensures nextSong = prefix of {@code this}
     */
    String nextSong();

    /**
     * Appends playlist to the end of {@code this}.
     *
     * @param playlist
     *            playlist to be added to the end of {@code this}
     * @updates this
     * @clears playlist'
     * @ensures {@code this = #this * playlist}
     */
    void addPlaylist(MusicPlaylist playlist);

    /**
     * Appends the front entry in {@code this} according to numberOftimes,
     * replays next song x number of times in addition to the one time next song
     * was going to be played.
     *
     * @param numberOfTimes
     *            the number of times a song is to be replayed
     * @requires this /= <> and numberOfTimes > 0
     * @ensures this = [prefix of {@code this}] * #this (straight brackets can
     *          repr number of times song is replayed)
     */
    void loop(int numberOfTimes);

    /**
     * Shuffles (psedo-randomly) entries in {@code this}.
     *
     * @requires |this| > 3
     * @ensures this /= #this
     */
    void shuffle();

}
