package j9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y extends x {
    public final byte[] b;

    public y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // j9.x
    public final byte[] t2() {
        return this.b;
    }
}
