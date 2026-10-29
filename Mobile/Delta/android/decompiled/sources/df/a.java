package df;

import cf.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14613a;

    public a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f14613a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i10 + i11 > bArr.length) {
            i11 = bArr.length - i10;
        }
        return new a(bArr, i10, i11);
    }

    public int c() {
        return this.f14613a.length;
    }

    public byte[] d() {
        byte[] bArr = this.f14613a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f14613a, this.f14613a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14613a);
    }

    public String toString() {
        return "Bytes(" + p.b(this.f14613a) + ")";
    }
}
