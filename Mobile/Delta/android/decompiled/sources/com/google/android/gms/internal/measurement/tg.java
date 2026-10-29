package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class tg implements sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6817a;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6817a = f9VarB.d("measurement.tcf.consent_fix", true);
        f9VarB.d("measurement.tcf.client", true);
        f9VarB.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final boolean zza() {
        return ((Boolean) f6817a.d()).booleanValue();
    }
}
