package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ec */
/* JADX INFO: loaded from: classes.dex */
public final class C2049ec implements InterfaceC2196mc {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2196mc[] f8163a;

    public C2049ec(InterfaceC2196mc... interfaceC2196mcArr) {
        this.f8163a = interfaceC2196mcArr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2196mc
    /* JADX INFO: renamed from: a */
    public final boolean mo9794a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f8163a[i10].mo9794a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2196mc
    /* JADX INFO: renamed from: b */
    public final InterfaceC2178lc mo9795b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC2196mc interfaceC2196mc = this.f8163a[i10];
            if (interfaceC2196mc.mo9794a(cls)) {
                return interfaceC2196mc.mo9795b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
