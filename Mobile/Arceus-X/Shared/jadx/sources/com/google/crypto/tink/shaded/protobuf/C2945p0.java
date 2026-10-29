package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2945p0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2939n0 f10962a = m14039c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2939n0 f10963b = new C2942o0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC2939n0 m14037a() {
        return f10962a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2939n0 m14038b() {
        return f10963b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2939n0 m14039c() {
        if (C2907c1.f10823d) {
            return null;
        }
        try {
            return (InterfaceC2939n0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
