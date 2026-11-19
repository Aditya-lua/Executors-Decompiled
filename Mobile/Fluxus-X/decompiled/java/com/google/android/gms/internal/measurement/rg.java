package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class rg implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6813a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6813a = j9VarB.d("measurement.client.sessions.enable_fix_background_engagement", false);
        j9VarB.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        j9VarB.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.qg
    public final boolean zza() {
        return ((Boolean) f6813a.d()).booleanValue();
    }
}
