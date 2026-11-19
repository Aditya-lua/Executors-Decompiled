package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.a9 f6768a;

    public p3(ob.a9 a9Var) {
        this.f6768a = a9Var;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void p(String str, String str2, Bundle bundle, long j10) {
        this.f6768a.a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int zzf() {
        return System.identityHashCode(this.f6768a);
    }
}
