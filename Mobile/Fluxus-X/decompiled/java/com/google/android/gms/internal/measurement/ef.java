package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ef implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6494a;
    public static final p9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p9 f6495c;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6494a = j9VarB.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = j9VarB.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6495c = j9VarB.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean zzb() {
        return ((Boolean) f6494a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean zzd() {
        return ((Boolean) f6495c.d()).booleanValue();
    }
}
