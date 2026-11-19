package k9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z {
    public final byte[] b;

    public a0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // k9.z
    public final byte[] t2() {
        return this.b;
    }
}
