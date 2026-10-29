package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.kg */
/* JADX INFO: loaded from: classes.dex */
public final class C2164kg implements InterfaceC2146jg {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8383a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        f8383a = c2065f9M10009b.m10011d("measurement.session_stitching_token_enabled", false);
        c2065f9M10009b.m10011d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2146jg
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2146jg
    public final boolean zzb() {
        return ((Boolean) f8383a.m10363d()).booleanValue();
    }
}
