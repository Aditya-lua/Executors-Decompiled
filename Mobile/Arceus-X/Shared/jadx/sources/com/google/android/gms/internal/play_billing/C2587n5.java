package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2587n5 implements InterfaceC2675v5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2675v5[] f9169a;

    public C2587n5(InterfaceC2675v5... interfaceC2675v5Arr) {
        this.f9169a = interfaceC2675v5Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2675v5
    /* JADX INFO: renamed from: a */
    public final InterfaceC2664u5 mo11592a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC2675v5 interfaceC2675v5 = this.f9169a[i10];
            if (interfaceC2675v5.mo11593b(cls)) {
                return interfaceC2675v5.mo11592a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2675v5
    /* JADX INFO: renamed from: b */
    public final boolean mo11593b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f9169a[i10].mo11593b(cls)) {
                return true;
            }
        }
        return false;
    }
}
