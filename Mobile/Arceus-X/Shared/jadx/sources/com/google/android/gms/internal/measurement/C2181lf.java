package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.lf */
/* JADX INFO: loaded from: classes.dex */
public final class C2181lf implements InterfaceC2163kf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8405a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.gbraid_campaign.gbraid.client", true);
        f8405a = c2065f9M10009b.m10011d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2163kf
    public final boolean zza() {
        return ((Boolean) f8405a.m10363d()).booleanValue();
    }
}
