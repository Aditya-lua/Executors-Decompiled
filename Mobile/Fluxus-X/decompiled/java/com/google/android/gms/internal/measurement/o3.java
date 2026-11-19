package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.z8 f6739a;

    public o3(ob.z8 z8Var) {
        this.f6739a = z8Var;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void p(String str, String str2, Bundle bundle, long j10) {
        this.f6739a.a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int zzf() {
        return System.identityHashCode(this.f6739a);
    }
}
