package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface i extends AutoCloseable {
    long a1();

    @Override // java.lang.AutoCloseable
    void close();

    MediaCodec.BufferInfo j0();

    boolean s0();

    long size();

    ByteBuffer t();
}
