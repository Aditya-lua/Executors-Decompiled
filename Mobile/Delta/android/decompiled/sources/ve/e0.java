package ve;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f32930a = df.a.a(new byte[0]);

    public static final df.a a(int i10) {
        return df.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final df.a b(int i10) {
        return df.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
