package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6750a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        f6750a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = ja.f6566a;
        try {
            new ia(bArr, 0, 0, false, null).c(0);
        } catch (sb e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static boolean d(oc ocVar) {
        if (ocVar instanceof s9) {
            throw null;
        }
        return false;
    }
}
