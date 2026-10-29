package p100eb;

/* JADX INFO: renamed from: eb.i2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4945i2 {

    /* JADX INFO: renamed from: a */
    public static final char[] f19669a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public abstract int mo23613a();

    /* JADX INFO: renamed from: b */
    public abstract int mo23614b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo23615c(AbstractC4945i2 abstractC4945i2);

    /* JADX INFO: renamed from: d */
    public abstract byte[] mo23616d();

    /* JADX INFO: renamed from: e */
    public abstract byte[] mo23617e();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC4945i2) {
            AbstractC4945i2 abstractC4945i2 = (AbstractC4945i2) obj;
            if (mo23614b() == abstractC4945i2.mo23614b() && mo23615c(abstractC4945i2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (mo23614b() >= 32) {
            return mo23613a();
        }
        byte[] bArrMo23617e = mo23617e();
        int i10 = bArrMo23617e[0] & 255;
        for (int i11 = 1; i11 < bArrMo23617e.length; i11++) {
            i10 |= (bArrMo23617e[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArrMo23617e = mo23617e();
        int length = bArrMo23617e.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b : bArrMo23617e) {
            char[] cArr = f19669a;
            sb2.append(cArr[(b >> 4) & 15]);
            sb2.append(cArr[b & 15]);
        }
        return sb2.toString();
    }
}
