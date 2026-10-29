package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ng */
/* JADX INFO: loaded from: classes.dex */
public final class C2218ng implements InterfaceC2200mg {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8516a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        f8516a = c2065f9M10009b.m10011d("measurement.client.sessions.enable_fix_background_engagement", false);
        c2065f9M10009b.m10011d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c2065f9M10009b.m10010c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2200mg
    public final boolean zza() {
        return ((Boolean) f8516a.m10363d()).booleanValue();
    }
}
