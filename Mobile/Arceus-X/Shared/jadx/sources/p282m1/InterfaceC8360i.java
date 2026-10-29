package p282m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: m1.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8360i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: f1 */
    long mo33933f1();

    /* JADX INFO: renamed from: m0 */
    MediaCodec.BufferInfo mo33934m0();

    long size();

    /* JADX INFO: renamed from: t */
    ByteBuffer mo33935t();

    /* JADX INFO: renamed from: w0 */
    boolean mo33936w0();
}
