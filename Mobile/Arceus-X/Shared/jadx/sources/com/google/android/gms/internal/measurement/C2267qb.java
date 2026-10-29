package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.qb */
/* JADX INFO: loaded from: classes.dex */
public final class C2267qb {

    /* JADX INFO: renamed from: a */
    public static final Charset f8595a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f8596b;

    static {
        Charset.forName("US-ASCII");
        f8595a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8596b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = C2140ja.f8351a;
        try {
            new C2123ia(bArr, 0, 0, false, null).m10284c(0);
        } catch (C2303sb e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m10576a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    /* JADX INFO: renamed from: b */
    public static int m10577b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: c */
    public static int m10578c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10579d(InterfaceC2232oc interfaceC2232oc) {
        if (interfaceC2232oc instanceof AbstractC2301s9) {
            throw null;
        }
        return false;
    }
}
