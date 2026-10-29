package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p306nb.InterfaceC9319u8;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k3 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2151k3 extends AbstractBinderC2001c2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9319u8 f8361a;

    public BinderC2151k3(InterfaceC9319u8 interfaceC9319u8) {
        this.f8361a = interfaceC9319u8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2039e2
    /* JADX INFO: renamed from: p */
    public final void mo9774p(String str, String str2, Bundle bundle, long j10) {
        this.f8361a.mo36297a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2039e2
    public final int zzf() {
        return System.identityHashCode(this.f8361a);
    }
}
