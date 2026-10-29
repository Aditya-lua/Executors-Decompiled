package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C2941o {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f10950a = m14014c();

    /* JADX INFO: renamed from: a */
    public static C2944p m14012a() {
        C2944p c2944pM14013b = m14013b("getEmptyRegistry");
        return c2944pM14013b != null ? c2944pM14013b : C2944p.f10958c;
    }

    /* JADX INFO: renamed from: b */
    public static final C2944p m14013b(String str) {
        Class<?> cls = f10950a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2944p) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m14014c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
