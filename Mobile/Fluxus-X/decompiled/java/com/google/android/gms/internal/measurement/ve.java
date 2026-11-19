package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ve implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6894a;
    public static final p9 b;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6894a = j9VarB.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        b = j9VarB.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.ue
    public final boolean zza() {
        return ((Boolean) f6894a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ue
    public final boolean zzb() {
        return ((Boolean) b.d()).booleanValue();
    }
}
