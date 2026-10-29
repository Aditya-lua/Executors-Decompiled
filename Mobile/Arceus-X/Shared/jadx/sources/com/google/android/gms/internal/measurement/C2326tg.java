package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.tg */
/* JADX INFO: loaded from: classes.dex */
public final class C2326tg implements InterfaceC2308sg {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8677a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        f8677a = c2065f9M10009b.m10011d("measurement.tcf.consent_fix", true);
        c2065f9M10009b.m10011d("measurement.tcf.client", true);
        c2065f9M10009b.m10011d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2308sg
    public final boolean zza() {
        return ((Boolean) f8677a.m10363d()).booleanValue();
    }
}
