package eb;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends i2 implements Serializable {
    public final byte[] b;

    public h2(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    @Override // eb.i2
    public final int a() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(p0.a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        int i11 = bArr[1] & 255;
        int i12 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i10 | (i11 << 8) | (i12 << 16);
    }

    @Override // eb.i2
    public final int b() {
        return this.b.length * 8;
    }

    @Override // eb.i2
    public final boolean c(i2 i2Var) {
        if (this.b.length != i2Var.e().length) {
            return false;
        }
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i10 >= bArr.length) {
                return z10;
            }
            z10 &= bArr[i10] == i2Var.e()[i10];
            i10++;
        }
    }

    @Override // eb.i2
    public final byte[] d() {
        return (byte[]) this.b.clone();
    }

    @Override // eb.i2
    public final byte[] e() {
        return this.b;
    }
}
