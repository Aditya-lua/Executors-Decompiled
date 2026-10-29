package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.rf */
/* JADX INFO: loaded from: classes.dex */
public final class C2289rf implements InterfaceC2271qf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8629a;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f8629a = c2065f9M10009b.m10011d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c2065f9M10009b.m10010c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2271qf
    public final boolean zza() {
        return ((Boolean) f8629a.m10363d()).booleanValue();
    }
}
