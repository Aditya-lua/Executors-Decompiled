package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class xf implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f7016a;
    public static final l9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l9 f7017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l9 f7018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l9 f7019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9 f7020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l9 f7021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l9 f7022h;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.rb.attribution.ad_campaign_info", true);
        f9VarB.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f7016a = f9VarB.d("measurement.rb.attribution.client2", true);
        b = f9VarB.d("measurement.rb.attribution.followup1.service", false);
        f9VarB.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f7017c = f9VarB.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        f9VarB.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f7018d = f9VarB.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f7019e = f9VarB.d("measurement.rb.attribution.retry_disposition", false);
        f7020f = f9VarB.d("measurement.rb.attribution.service", true);
        f7021g = f9VarB.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f7022h = f9VarB.d("measurement.rb.attribution.uuid_generation", true);
        f9VarB.c("measurement.id.rb.attribution.retry_disposition", 0L);
        f9VarB.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean c() {
        return ((Boolean) f7020f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean d() {
        return ((Boolean) f7022h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzb() {
        return ((Boolean) f7016a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzd() {
        return ((Boolean) f7017c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zze() {
        return ((Boolean) f7018d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzf() {
        return ((Boolean) f7019e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzh() {
        return ((Boolean) f7021g.d()).booleanValue();
    }
}
