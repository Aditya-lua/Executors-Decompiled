package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import g0.i1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface d extends AutoCloseable {

    public interface a {
        ByteBuffer k();

        int l();

        int m();
    }

    @SuppressLint({"ArrayReturn"})
    a[] E1();

    void I0(Rect rect);

    i1 I2();

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int getWidth();

    Image p();
}
