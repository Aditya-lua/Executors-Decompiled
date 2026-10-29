package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f8388a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f8389c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f8390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f8391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.i f8392f;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
        T a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void j();

        boolean n();

        i<E> o(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f8390d = bArr;
        f8391e = ByteBuffer.wrap(bArr);
        f8392f = com.google.crypto.tink.shaded.protobuf.i.i(bArr);
    }

    public static <T> T a(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T b(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int iH = h(i11, bArr, i10, i11);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object g(Object obj, Object obj2) {
        return ((s0) obj).a().H((s0) obj2).d();
    }

    public static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
