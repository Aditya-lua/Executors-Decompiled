package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ng implements mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6763a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6763a = f9VarB.d("measurement.client.sessions.enable_fix_background_engagement", false);
        f9VarB.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        f9VarB.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.mg
    public final boolean zza() {
        return ((Boolean) f6763a.d()).booleanValue();
    }
}
