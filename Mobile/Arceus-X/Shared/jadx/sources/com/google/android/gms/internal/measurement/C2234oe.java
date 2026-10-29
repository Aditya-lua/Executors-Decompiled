package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.oe */
/* JADX INFO: loaded from: classes.dex */
public final class C2234oe implements InterfaceC2216ne {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8545a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2175l9 f8546b;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c2065f9M10009b.m10011d("measurement.set_default_event_parameters_with_backfill.service", true);
        c2065f9M10009b.m10010c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f8545a = c2065f9M10009b.m10011d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f8546b = c2065f9M10009b.m10011d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c2065f9M10009b.m10011d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2216ne
    public final boolean zza() {
        return ((Boolean) f8545a.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2216ne
    public final boolean zzb() {
        return ((Boolean) f8546b.m10363d()).booleanValue();
    }
}
