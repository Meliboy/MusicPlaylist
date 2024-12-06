package musicplaylist;

import components.utilities.Reporter;

/**
 * Layered implementations of secondary methods for {@code MusicPlaylist}.
 *
 * @author Melvin Vasquez
 */
public abstract class MusicPlaylistSecondary implements MusicPlaylist {

    @Override
    public final String nextSong() {

        if (this.numberOfSongs() == 0) {
            Reporter.fatalErrorToConsole(
                    "Requires clause was not met: |this| /= 0");
        }

        String nextSong = this.removeSong();
        this.addSong(nextSong);

        if (this.numberOfSongs() != 1) {

            int playlistSize = this.numberOfSongs() - 1;
            for (int i = 0; i < playlistSize; i++) {
                String song = this.removeSong();
                this.addSong(song);
            }

        }

        return nextSong;
    }

    @Override
    public final void addPlaylist(MusicPlaylist playlist) {

        while (playlist.numberOfSongs() != 0) {
            String song = playlist.removeSong();
            this.addSong(song);
        }
    }

    @Override
    public final void loop(int numberOfTimes) {

        if (this.numberOfSongs() > 0 && numberOfTimes > 0) {

            MusicPlaylist sub = this.newInstance();

            String nextSong = this.removeSong();

            for (int i = 0; i < numberOfTimes; i++) {
                sub.addSong(nextSong);
            }

            sub.addSong(nextSong);

            while (this.numberOfSongs() > 0) {
                sub.addSong(this.removeSong());
            }

            this.transferFrom(sub);
        }

    }

    @Override
    public final void shuffle() {

        final int subPlaylistsToShuffle = 3;

        if (this.numberOfSongs() > subPlaylistsToShuffle) {

            MusicPlaylist sub1 = this.newInstance();
            MusicPlaylist sub2 = this.newInstance();
            MusicPlaylist sub3 = this.newInstance();

            int playlistSize = this.numberOfSongs();

            for (int i = 0; i < playlistSize; i++) {

                if (i % subPlaylistsToShuffle == 2) {
                    sub1.addSong(this.removeSong());
                } else if (i % subPlaylistsToShuffle == 1) {
                    sub2.addSong(this.removeSong());
                } else if (i % subPlaylistsToShuffle == 0) { //i%3 = 0
                    sub3.addSong(this.removeSong());
                }
            }

            while (sub1.numberOfSongs() > 0) {
                this.addSong(sub1.removeSong());
            }
            while (sub2.numberOfSongs() > 0) {
                this.addSong(sub2.removeSong());
            }
            while (sub3.numberOfSongs() > 0) {
                this.addSong(sub3.removeSong());
            }
        }
    }

    @Override
    public final String toString() {

        MusicPlaylist sub = this.newInstance();

        String stringPlaylist = "<";

        while (this.numberOfSongs() > 0) {

            String song = this.removeSong();

            if (this.numberOfSongs() == 0) {
                stringPlaylist = stringPlaylist + song;
            } else {
                stringPlaylist = stringPlaylist + song + ", ";
            }

            sub.addSong(song);

        }

        stringPlaylist = stringPlaylist + ">";

        this.transferFrom(sub);

        return stringPlaylist;
    }

    @Override
    public final boolean equals(Object o) {
        Reporter.fatalErrorToConsole(
                "Equals is not supported by this component!");
        return false;
    }

    @Override
    public final int hashCode() {
        Reporter.fatalErrorToConsole(
                "HashCode is not supported by this component!");
        return 0;
    }

}
