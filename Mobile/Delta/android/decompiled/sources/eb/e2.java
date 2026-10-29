package eb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f15264a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // eb.k2
    public final k2 a(byte[] bArr) {
        bArr.getClass();
        b(bArr, 0, bArr.length);
        return this;
    }

    public abstract void b(byte[] bArr, int i10, int i11);
}
