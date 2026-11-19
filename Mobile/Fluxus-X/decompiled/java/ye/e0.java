package ye;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f37741a = gf.a.a(new byte[0]);

    public static final gf.a a(int i10) {
        return gf.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final gf.a b(int i10) {
        return gf.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
