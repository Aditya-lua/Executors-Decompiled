package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class xf implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6942a;
    public static final l9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l9 f6943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l9 f6944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l9 f6945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9 f6946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l9 f6947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l9 f6948h;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f9VarB.d("measurement.rb.attribution.ad_campaign_info", true);
        f9VarB.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f6942a = f9VarB.d("measurement.rb.attribution.client2", true);
        b = f9VarB.d("measurement.rb.attribution.followup1.service", false);
        f9VarB.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f6943c = f9VarB.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        f9VarB.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f6944d = f9VarB.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f6945e = f9VarB.d("measurement.rb.attribution.retry_disposition", false);
        f6946f = f9VarB.d("measurement.rb.attribution.service", true);
        f6947g = f9VarB.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f6948h = f9VarB.d("measurement.rb.attribution.uuid_generation", true);
        f9VarB.c("measurement.id.rb.attribution.retry_disposition", 0L);
        f9VarB.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean c() {
        return ((Boolean) f6946f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean d() {
        return ((Boolean) f6948h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzb() {
        return ((Boolean) f6942a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzd() {
        return ((Boolean) f6943c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zze() {
        return ((Boolean) f6944d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzf() {
        return ((Boolean) f6945e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzh() {
        return ((Boolean) f6947g.d()).booleanValue();
    }
}
