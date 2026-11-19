package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class pe implements oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6779a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.client.3p_consent_state_v1", true);
        f6779a = j9VarB.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final long zza() {
        return ((Long) f6779a.d()).longValue();
    }
}
