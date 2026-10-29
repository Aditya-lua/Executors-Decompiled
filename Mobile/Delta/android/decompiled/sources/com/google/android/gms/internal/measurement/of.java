package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class of implements nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6716a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.gmscore_feature_tracking", true);
        f6716a = f9VarB.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.nf
    public final boolean zza() {
        return ((Boolean) f6716a.d()).booleanValue();
    }
}
