package p100eb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: eb.e2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4921e2 extends AbstractC4933g2 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f19645a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // p100eb.InterfaceC4957k2
    /* JADX INFO: renamed from: a */
    public final InterfaceC4957k2 mo23577a(byte[] bArr) {
        bArr.getClass();
        mo23578b(bArr, 0, bArr.length);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo23578b(byte[] bArr, int i10, int i11);
}
