package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class bg implements ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9 f6449a;
    public static final p9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p9 f6450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p9 f6451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p9 f6452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p9 f6453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p9 f6454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p9 f6455h;

    static {
        j9 j9VarB = new j9(e9.a("com.google.android.gms.measurement")).a().b();
        j9VarB.d("measurement.rb.attribution.ad_campaign_info", true);
        j9VarB.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f6449a = j9VarB.d("measurement.rb.attribution.client2", true);
        b = j9VarB.d("measurement.rb.attribution.followup1.service", false);
        j9VarB.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f6450c = j9VarB.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        j9VarB.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f6451d = j9VarB.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f6452e = j9VarB.d("measurement.rb.attribution.retry_disposition", false);
        f6453f = j9VarB.d("measurement.rb.attribution.service", true);
        f6454g = j9VarB.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f6455h = j9VarB.d("measurement.rb.attribution.uuid_generation", true);
        j9VarB.c("measurement.id.rb.attribution.retry_disposition", 0L);
        j9VarB.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean c() {
        return ((Boolean) f6453f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean d() {
        return ((Boolean) f6455h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zzb() {
        return ((Boolean) f6449a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zzd() {
        return ((Boolean) f6450c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zze() {
        return ((Boolean) f6451d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zzf() {
        return ((Boolean) f6452e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean zzh() {
        return ((Boolean) f6454g.d()).booleanValue();
    }
}
