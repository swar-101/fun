package com.mp3ditor;

import com.mpatric.mp3agic.*;

import java.io.*;
import java.nio.file.*;

public class Mp3Util {

    public static String getArtist(Path path) {
        try {
            Mp3File mp3File = new Mp3File(path);
            ID3v2 id3v2Tag = mp3File.getId3v2Tag();
            return id3v2Tag != null ? id3v2Tag.getArtist() : null;
            /*
            * if `id3v2Tag` is not null, it calls the `getArtist()` method on the
            * `id3v2Tag` object and returns the result.
            * if `id3v2Tag` is null, it returns null
            */

        } catch(IOException | UnsupportedTagException | InvalidDataException e) {
            return null;
        }
    }
}
