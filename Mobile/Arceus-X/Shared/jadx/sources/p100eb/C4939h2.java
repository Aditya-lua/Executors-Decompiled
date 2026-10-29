package p100eb;

import java.io.Serializable;

/* JADX INFO: renamed from: eb.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4939h2 extends AbstractC4945i2 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final byte[] f19659b;

    public C4939h2(byte[] bArr) {
        bArr.getClass();
        this.f19659b = bArr;
    }

    @Override // p100eb.AbstractC4945i2
    /* JADX INFO: renamed from: a */
    public final int mo23613a() {
        byte[] bArr = this.f19659b;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(C4985p0.m23687a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        int i11 = bArr[1] & 255;
        int i12 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i10 | (i11 << 8) | (i12 << 16);
    }

    @Override // p100eb.AbstractC4945i2
    /* JADX INFO: renamed from: b */
    public final int mo23614b() {
        return this.f19659b.length * 8;
    }

    @Override // p100eb.AbstractC4945i2
    /* JADX INFO: renamed from: c */
    public final boolean mo23615c(AbstractC4945i2 abstractC4945i2) {
        if (this.f19659b.length != abstractC4945i2.mo23617e().length) {
            return false;
        }
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f19659b;
            if (i10 >= bArr.length) {
                return z10;
            }
            z10 &= bArr[i10] == abstractC4945i2.mo23617e()[i10];
            i10++;
        }
    }

    @Override // p100eb.AbstractC4945i2
    /* JADX INFO: renamed from: d */
    public final byte[] mo23616d() {
        return (byte[]) this.f19659b.clone();
    }

    @Override // p100eb.AbstractC4945i2
    /* JADX INFO: renamed from: e */
    public final byte[] mo23617e() {
        return this.f19659b;
    }
}
