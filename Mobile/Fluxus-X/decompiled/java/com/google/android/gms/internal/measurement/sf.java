package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class sf implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6839a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.gmscore_feature_tracking", true);
        f6839a = j9VarB.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.rf
    public final boolean zza() {
        return ((Boolean) f6839a.d()).booleanValue();
    }
}
