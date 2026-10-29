package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class re implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6777a;
    public static final l9 b;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6777a = f9VarB.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        b = f9VarB.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean zza() {
        return ((Boolean) f6777a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean zzb() {
        return ((Boolean) b.d()).booleanValue();
    }
}
