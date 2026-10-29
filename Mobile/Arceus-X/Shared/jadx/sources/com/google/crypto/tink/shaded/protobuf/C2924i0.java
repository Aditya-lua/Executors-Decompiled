package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2924i0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2918g0 f10888a = m13649c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2918g0 f10889b = new C2921h0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC2918g0 m13647a() {
        return f10888a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2918g0 m13648b() {
        return f10889b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2918g0 m13649c() {
        if (C2907c1.f10823d) {
            return null;
        }
        try {
            return (InterfaceC2918g0) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
