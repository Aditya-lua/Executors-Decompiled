package p102ef;

import java.util.Arrays;
import p076df.C4594p;

/* JADX INFO: renamed from: ef.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5109a {

    /* JADX INFO: renamed from: a */
    public final byte[] f19928a;

    public C5109a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f19928a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C5109a m23847a(byte[] bArr) {
        if (bArr != null) {
            return m23848b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* JADX INFO: renamed from: b */
    public static C5109a m23848b(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i10 + i11 > bArr.length) {
            i11 = bArr.length - i10;
        }
        return new C5109a(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public int m23849c() {
        return this.f19928a.length;
    }

    /* JADX INFO: renamed from: d */
    public byte[] m23850d() {
        byte[] bArr = this.f19928a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5109a) {
            return Arrays.equals(((C5109a) obj).f19928a, this.f19928a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19928a);
    }

    public String toString() {
        return "Bytes(" + C4594p.m22710b(this.f19928a) + ")";
    }
}
