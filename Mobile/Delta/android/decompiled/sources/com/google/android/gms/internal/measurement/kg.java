package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class kg implements jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6593a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6593a = f9VarB.d("measurement.session_stitching_token_enabled", false);
        f9VarB.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean zzb() {
        return ((Boolean) f6593a.d()).booleanValue();
    }
}
