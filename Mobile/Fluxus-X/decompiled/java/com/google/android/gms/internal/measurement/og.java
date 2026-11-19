package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class og implements ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6759a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6759a = j9VarB.d("measurement.session_stitching_token_enabled", false);
        j9VarB.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.ng
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ng
    public final boolean zzb() {
        return ((Boolean) f6759a.d()).booleanValue();
    }
}
