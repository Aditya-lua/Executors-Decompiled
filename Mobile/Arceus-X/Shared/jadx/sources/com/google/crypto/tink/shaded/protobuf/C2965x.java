package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* JADX INFO: loaded from: classes2.dex */
public class C2965x implements InterfaceC2951r0 {

    /* JADX INFO: renamed from: a */
    public static final C2965x f11131a = new C2965x();

    /* JADX INFO: renamed from: c */
    public static C2965x m14305c() {
        return f11131a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2951r0
    /* JADX INFO: renamed from: a */
    public InterfaceC2948q0 mo13876a(Class<?> cls) {
        if (!AbstractC2967y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC2948q0) AbstractC2967y.m14308B(cls.asSubclass(AbstractC2967y.class)).m14331p();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2951r0
    /* JADX INFO: renamed from: b */
    public boolean mo13877b(Class<?> cls) {
        return AbstractC2967y.class.isAssignableFrom(cls);
    }
}
