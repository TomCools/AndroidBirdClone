package com.example.tomco.floppybirdclone.framework.gameloop;

import android.content.SharedPreferences;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by tomco on 6/12/2016.
 */
public interface FileIO {
    InputStream readFile(String file) throws IOException;

    OutputStream writeFile(String file) throws IOException;

    InputStream readAsset(String file) throws IOException;

    SharedPreferences getSharedPref();
}