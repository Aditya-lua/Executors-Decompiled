package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.af */
/* JADX INFO: loaded from: classes.dex */
public final class C1976af implements InterfaceC2432ze {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8099a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2175l9 f8100b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2175l9 f8101c;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f8099a = c2065f9M10009b.m10011d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f8100b = c2065f9M10009b.m10011d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f8101c = c2065f9M10009b.m10011d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2432ze
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2432ze
    public final boolean zzb() {
        return ((Boolean) f8099a.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2432ze
    public final boolean zzc() {
        return ((Boolean) f8100b.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2432ze
    public final boolean zzd() {
        return ((Boolean) f8101c.m10363d()).booleanValue();
    }
}
