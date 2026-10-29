package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p306nb.InterfaceC9335v8;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2169l3 extends AbstractBinderC2001c2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9335v8 f8391a;

    public BinderC2169l3(InterfaceC9335v8 interfaceC9335v8) {
        this.f8391a = interfaceC9335v8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2039e2
    /* JADX INFO: renamed from: p */
    public final void mo9774p(String str, String str2, Bundle bundle, long j10) {
        this.f8391a.mo36918a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2039e2
    public final int zzf() {
        return System.identityHashCode(this.f8391a);
    }
}
