package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.of */
/* JADX INFO: loaded from: classes.dex */
public final class C2235of implements InterfaceC2217nf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8547a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.gmscore_feature_tracking", true);
        f8547a = c2065f9M10009b.m10011d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2217nf
    public final boolean zza() {
        return ((Boolean) f8547a.m10363d()).booleanValue();
    }
}
