package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2597o4 implements InterfaceC2675v5 {

    /* JADX INFO: renamed from: a */
    public static final C2597o4 f9179a = new C2597o4();

    /* JADX INFO: renamed from: c */
    public static C2597o4 m11633c() {
        return f9179a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2675v5
    /* JADX INFO: renamed from: a */
    public final InterfaceC2664u5 mo11592a(Class cls) {
        if (!AbstractC2652t4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC2664u5) AbstractC2652t4.m11742t(cls.asSubclass(AbstractC2652t4.class)).mo11269p(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2675v5
    /* JADX INFO: renamed from: b */
    public final boolean mo11593b(Class cls) {
        return AbstractC2652t4.class.isAssignableFrom(cls);
    }
}
