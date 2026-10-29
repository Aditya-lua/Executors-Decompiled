package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class af implements ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6378a;
    public static final l9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l9 f6379c;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6378a = f9VarB.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = f9VarB.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6379c = f9VarB.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zzb() {
        return ((Boolean) f6378a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zzd() {
        return ((Boolean) f6379c.d()).booleanValue();
    }
}
