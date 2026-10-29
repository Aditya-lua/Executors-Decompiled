package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2900a0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f10794a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f10795b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f10796c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f10797d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f10798e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2923i f10799f;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$a */
    public interface a extends i<Boolean> {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$b */
    public interface b extends i<Double> {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$c */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$d */
    public interface d<T extends c> {
        /* JADX INFO: renamed from: a */
        T mo612a(int i10);
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean m13387a(int i10);
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$f */
    public interface f extends i<Float> {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$g */
    public interface g extends i<Integer> {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$h */
    public interface h extends i<Long> {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a0$i */
    public interface i<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: j */
        void mo13388j();

        /* JADX INFO: renamed from: n */
        boolean mo13389n();

        /* JADX INFO: renamed from: o */
        i<E> mo13390o(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f10797d = bArr;
        f10798e = ByteBuffer.wrap(bArr);
        f10799f = AbstractC2923i.m13585i(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m13379a(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m13380b(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m13381c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m13382d(byte[] bArr) {
        return m13383e(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    public static int m13383e(byte[] bArr, int i10, int i11) {
        int iM13386h = m13386h(i11, bArr, i10, i11);
        if (iM13386h == 0) {
            return 1;
        }
        return iM13386h;
    }

    /* JADX INFO: renamed from: f */
    public static int m13384f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: g */
    public static Object m13385g(Object obj, Object obj2) {
        return ((InterfaceC2954s0) obj).mo564a().mo576H((InterfaceC2954s0) obj2).mo577d();
    }

    /* JADX INFO: renamed from: h */
    public static int m13386h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
