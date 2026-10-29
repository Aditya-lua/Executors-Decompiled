package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class lf implements kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6612a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.gbraid_campaign.gbraid.client", true);
        f6612a = f9VarB.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.kf
    public final boolean zza() {
        return ((Boolean) f6612a.d()).booleanValue();
    }
}
