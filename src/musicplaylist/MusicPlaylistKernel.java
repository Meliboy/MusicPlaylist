package musicplaylist;

import components.standard.Standard;

/**
 * @author Melvin Vasquez
 */
public interface MusicPlaylistKernel extends Standard<MusicPlaylist> {

    /**
     * Adds {code @song} to the end of {@code this}.
     *
     * @param song
     *            song to be added to playlist
     * @aliases reference {@code song}
     * @updates this
     * @ensures {@code this = #this * <x>}
     */
    void addSong(String song);

    /**
     * Removes and returns the song at the front of {@code this}.
     *
     * @return the song removed
     * @updates this
     * @requires {@code this /= <>}
     * @ensures {@code #this = <removeSong> * this}
     */
    String removeSong();

    /**
     * Reports the length of {@code this}.
     *
     * @return the length of {@code this}
     * @ensures numberOfSongs = |this|
     */
    int numberOfSongs();
}
