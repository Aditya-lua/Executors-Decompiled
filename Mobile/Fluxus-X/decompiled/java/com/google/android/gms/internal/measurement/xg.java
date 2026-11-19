package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class xg implements wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6938a;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        f6938a = j9VarB.d("measurement.tcf.consent_fix", true);
        j9VarB.d("measurement.tcf.client", true);
        j9VarB.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.wg
    public final boolean zza() {
        return ((Boolean) f6938a.d()).booleanValue();
    }
}
