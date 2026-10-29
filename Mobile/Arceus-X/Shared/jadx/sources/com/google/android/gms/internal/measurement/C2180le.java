package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.le */
/* JADX INFO: loaded from: classes.dex */
public final class C2180le implements InterfaceC2162ke {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8404a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.client.3p_consent_state_v1", true);
        f8404a = c2065f9M10009b.m10010c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2162ke
    public final long zza() {
        return ((Long) f8404a.m10363d()).longValue();
    }
}
