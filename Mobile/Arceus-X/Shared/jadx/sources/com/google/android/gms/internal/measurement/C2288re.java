package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.re */
/* JADX INFO: loaded from: classes.dex */
public final class C2288re implements InterfaceC2270qe {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8627a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2175l9 f8628b;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        f8627a = c2065f9M10009b.m10011d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f8628b = c2065f9M10009b.m10011d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2270qe
    public final boolean zza() {
        return ((Boolean) f8627a.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2270qe
    public final boolean zzb() {
        return ((Boolean) f8628b.m10363d()).booleanValue();
    }
}
