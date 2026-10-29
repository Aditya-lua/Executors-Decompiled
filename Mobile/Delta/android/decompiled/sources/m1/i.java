package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    long e1();

    MediaCodec.BufferInfo m0();

    long size();

    ByteBuffer t();

    boolean w0();
}
