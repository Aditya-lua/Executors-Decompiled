package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class le implements ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6611a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.client.3p_consent_state_v1", true);
        f6611a = f9VarB.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final long zza() {
        return ((Long) f6611a.d()).longValue();
    }
}
