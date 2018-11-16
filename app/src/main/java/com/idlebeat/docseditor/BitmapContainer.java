package com.idlebeat.docseditor;

import android.graphics.Bitmap;

interface BitmapContainer {
    Bitmap get(int position);

    void remove(int position);

    void clear();
}

