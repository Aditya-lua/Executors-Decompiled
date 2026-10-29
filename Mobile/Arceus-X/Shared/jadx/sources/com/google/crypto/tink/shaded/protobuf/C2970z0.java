package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2970z0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2966x0 f11153a = m14373c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2966x0 f11154b = new C2968y0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC2966x0 m14371a() {
        return f11153a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2966x0 m14372b() {
        return f11154b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2966x0 m14373c() {
        if (C2907c1.f10823d) {
            return null;
        }
        try {
            return (InterfaceC2966x0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
