package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class pf implements of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6780a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.gbraid_campaign.gbraid.client", true);
        f6780a = j9VarB.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final boolean zza() {
        return ((Boolean) f6780a.d()).booleanValue();
    }
}
