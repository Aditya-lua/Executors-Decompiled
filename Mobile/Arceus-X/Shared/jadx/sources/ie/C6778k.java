package ie;

import java.util.Arrays;
import p169he.C6380j;

/* JADX INFO: renamed from: ie.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C6778k {
    /* JADX INFO: renamed from: a */
    public static Object m28997a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    public static int m28998b(int i10, int i11) {
        return i10 & (~i11);
    }

    /* JADX INFO: renamed from: c */
    public static int m28999c(int i10, int i11) {
        return i10 & i11;
    }

    /* JADX INFO: renamed from: d */
    public static int m29000d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    /* JADX INFO: renamed from: e */
    public static int m29001e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static int m29002f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM29030c = C6788p.m29030c(obj);
        int i11 = iM29030c & i10;
        int iM29004h = m29004h(obj3, i11);
        if (iM29004h == 0) {
            return -1;
        }
        int iM28998b = m28998b(iM29030c, i10);
        int i12 = -1;
        while (true) {
            int i13 = iM29004h - 1;
            int i14 = iArr[i13];
            if (m28998b(i14, i10) == iM28998b && C6380j.m27910a(obj, objArr[i13]) && (objArr2 == null || C6380j.m27910a(obj2, objArr2[i13]))) {
                int iM28999c = m28999c(i14, i10);
                if (i12 == -1) {
                    m29005i(obj3, i11, iM28999c);
                    return i13;
                }
                iArr[i12] = m29000d(iArr[i12], iM28999c, i10);
                return i13;
            }
            int iM28999c2 = m28999c(i14, i10);
            if (iM28999c2 == 0) {
                return -1;
            }
            i12 = i13;
            iM29004h = iM28999c2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m29003g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m29004h(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    /* JADX INFO: renamed from: i */
    public static void m29005i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m29006j(int i10) {
        return Math.max(4, C6788p.m29028a(i10 + 1, 1.0d));
    }
}
