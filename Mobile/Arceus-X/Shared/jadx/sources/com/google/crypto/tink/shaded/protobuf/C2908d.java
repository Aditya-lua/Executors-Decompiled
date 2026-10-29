package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2908d {

    /* JADX INFO: renamed from: a */
    public static boolean f10826a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f10827b = m13416a("libcore.io.Memory");

    /* JADX INFO: renamed from: c */
    public static final boolean f10828c;

    static {
        f10828c = (f10826a || m13416a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Class<T> m13416a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m13417b() {
        return f10827b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13418c() {
        if (f10826a) {
            return true;
        }
        return (f10827b == null || f10828c) ? false : true;
    }
}
