package eb;

/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f15280a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public abstract int b();

    public abstract boolean c(i2 i2Var);

    public abstract byte[] d();

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            if (b() == i2Var.b() && c(i2Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrE = e();
        int i10 = bArrE[0] & 255;
        for (int i11 = 1; i11 < bArrE.length; i11++) {
            i10 |= (bArrE[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArrE = e();
        int length = bArrE.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b : bArrE) {
            char[] cArr = f15280a;
            sb2.append(cArr[(b >> 4) & 15]);
            sb2.append(cArr[b & 15]);
        }
        return sb2.toString();
    }
}
