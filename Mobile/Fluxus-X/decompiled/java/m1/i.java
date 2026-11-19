package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    long d1();

    MediaCodec.BufferInfo o0();

    long size();

    ByteBuffer v();

    boolean v0();
}
