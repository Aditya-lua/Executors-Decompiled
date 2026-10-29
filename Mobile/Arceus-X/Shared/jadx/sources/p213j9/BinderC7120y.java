package p213j9;

import java.util.Arrays;

/* JADX INFO: renamed from: j9.y */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7120y extends AbstractBinderC7119x {

    /* JADX INFO: renamed from: b */
    public final byte[] f27738b;

    public BinderC7120y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f27738b = bArr;
    }

    @Override // p213j9.AbstractBinderC7119x
    /* JADX INFO: renamed from: t2 */
    public final byte[] mo29846t2() {
        return this.f27738b;
    }
}
