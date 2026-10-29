package ie;

/* JADX INFO: renamed from: ie.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C6788p {
    /* JADX INFO: renamed from: a */
    public static int m29028a(int i10, double d10) {
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d10 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i11 = iHighestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    public static int m29029b(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: c */
    public static int m29030c(Object obj) {
        return m29029b(obj == null ? 0 : obj.hashCode());
    }
}
