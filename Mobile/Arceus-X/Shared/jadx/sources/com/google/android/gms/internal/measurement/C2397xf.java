package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.xf */
/* JADX INFO: loaded from: classes.dex */
public final class C2397xf implements InterfaceC2379wf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2175l9 f8848a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2175l9 f8849b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2175l9 f8850c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC2175l9 f8851d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC2175l9 f8852e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2175l9 f8853f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC2175l9 f8854g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC2175l9 f8855h;

    static {
        C2065f9 c2065f9M10009b = new C2065f9(C1970a9.m9762a("com.google.android.gms.measurement")).m10008a().m10009b();
        c2065f9M10009b.m10011d("measurement.rb.attribution.ad_campaign_info", true);
        c2065f9M10009b.m10011d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f8848a = c2065f9M10009b.m10011d("measurement.rb.attribution.client2", true);
        f8849b = c2065f9M10009b.m10011d("measurement.rb.attribution.followup1.service", false);
        c2065f9M10009b.m10011d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f8850c = c2065f9M10009b.m10011d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c2065f9M10009b.m10011d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f8851d = c2065f9M10009b.m10011d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f8852e = c2065f9M10009b.m10011d("measurement.rb.attribution.retry_disposition", false);
        f8853f = c2065f9M10009b.m10011d("measurement.rb.attribution.service", true);
        f8854g = c2065f9M10009b.m10011d("measurement.rb.attribution.enable_trigger_redaction", true);
        f8855h = c2065f9M10009b.m10011d("measurement.rb.attribution.uuid_generation", true);
        c2065f9M10009b.m10010c("measurement.id.rb.attribution.retry_disposition", 0L);
        c2065f9M10009b.m10011d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    /* JADX INFO: renamed from: c */
    public final boolean mo10955c() {
        return ((Boolean) f8853f.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    /* JADX INFO: renamed from: d */
    public final boolean mo10956d() {
        return ((Boolean) f8855h.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zzb() {
        return ((Boolean) f8848a.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zzc() {
        return ((Boolean) f8849b.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zzd() {
        return ((Boolean) f8850c.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zze() {
        return ((Boolean) f8851d.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zzf() {
        return ((Boolean) f8852e.m10363d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2379wf
    public final boolean zzh() {
        return ((Boolean) f8854g.m10363d()).booleanValue();
    }
}
