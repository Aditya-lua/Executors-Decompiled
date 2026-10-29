package com.google.android.gms.internal.measurement;

import backtraceio.library.services.BacktraceMetrics;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class ie implements he {
    public static final l9 A;
    public static final l9 B;
    public static final l9 C;
    public static final l9 D;
    public static final l9 E;
    public static final l9 F;
    public static final l9 G;
    public static final l9 H;
    public static final l9 I;
    public static final l9 J;
    public static final l9 K;
    public static final l9 L;
    public static final l9 M;
    public static final l9 N;
    public static final l9 O;
    public static final l9 P;
    public static final l9 Q;
    public static final l9 R;
    public static final l9 S;
    public static final l9 T;
    public static final l9 U;
    public static final l9 V;
    public static final l9 W;
    public static final l9 X;
    public static final l9 Y;
    public static final l9 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f6496a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final l9 f6497a0;
    public static final l9 b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final l9 f6498b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l9 f6499c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final l9 f6500c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l9 f6501d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final l9 f6502d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l9 f6503e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final l9 f6504e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9 f6505f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final l9 f6506f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l9 f6507g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final l9 f6508g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l9 f6509h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final l9 f6510h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l9 f6511i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final l9 f6512i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l9 f6513j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final l9 f6514j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9 f6515k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final l9 f6516k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9 f6517l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final l9 f6518l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9 f6519m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final l9 f6520m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l9 f6521n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final l9 f6522n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l9 f6523o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final l9 f6524o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l9 f6525p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l9 f6526p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l9 f6527q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final l9 f6528q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l9 f6529r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final l9 f6530r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l9 f6531s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final l9 f6532s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l9 f6533t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final l9 f6534t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l9 f6535u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final l9 f6536u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l9 f6537v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final l9 f6538v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l9 f6539w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final l9 f6540w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l9 f6541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l9 f6542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l9 f6543z;

    static {
        f9 f9VarB = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6496a = f9VarB.c("measurement.ad_id_cache_time", 10000L);
        b = f9VarB.c("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f6499c = f9VarB.d("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f6501d = f9VarB.c("measurement.max_bundles_per_iteration", 100L);
        f6503e = f9VarB.f("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
        f6505f = f9VarB.c("measurement.config.cache_time", 86400000L);
        f9VarB.f("measurement.log_tag", "FA");
        f6507g = f9VarB.f("measurement.config.url_authority", "app-measurement.com");
        f6509h = f9VarB.f("measurement.config.url_scheme", "https");
        f6511i = f9VarB.c("measurement.upload.debug_upload_interval", 1000L);
        f9VarB.d("measurement.config.default_flag_values", true);
        f6513j = f9VarB.c("measurement.session.engagement_interval", 3600000L);
        f6515k = f9VarB.f("measurement.rb.attribution.event_params", "value|currency");
        f6517l = f9VarB.f("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
        f6519m = f9VarB.c("measurement.upload.google_signal_max_queue_time", 605000L);
        f6521n = f9VarB.f("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        f9VarB.c("measurement.id.upload.max_conversions_per_day", 0L);
        f6523o = f9VarB.c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f6525p = f9VarB.c("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        f6527q = f9VarB.c("measurement.upload.max_event_parameter_value_length", 500L);
        f6529r = f9VarB.c("measurement.store.max_stored_events_per_app", 100000L);
        f6531s = f9VarB.c("measurement.experiment.max_ids", 50L);
        f6533t = f9VarB.c("measurement.audience.filter_result_max_count", 200L);
        f6535u = f9VarB.c("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f6537v = f9VarB.c("measurement.rb.max_trigger_registrations_per_day", 1000L);
        f6539w = f9VarB.c("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        f6541x = f9VarB.c("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f6542y = f9VarB.c("measurement.alarm_manager.minimum_interval", RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        f6543z = f9VarB.c("measurement.upload.minimum_delay", 500L);
        A = f9VarB.c("measurement.monitoring.sample_period_millis", 86400000L);
        B = f9VarB.c("measurement.rb.attribution.notify_app_delay_millis", 3000L);
        C = f9VarB.d("measurement.config.notify_trigger_uris_on_backgrounded", true);
        D = f9VarB.f("measurement.rb.attribution.app_allowlist", "");
        E = f9VarB.c("measurement.upload.realtime_upload_interval", 10000L);
        F = f9VarB.c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f9VarB.c("measurement.config.cache_time.service", 3600000L);
        G = f9VarB.c("measurement.service_client.idle_disconnect_millis", 5000L);
        f9VarB.f("measurement.log_tag.service", "FA-SVC");
        H = f9VarB.c("measurement.service_client.reconnect_millis", 1000L);
        f9VarB.f("measurement.sgtm.app_allowlist", "*");
        I = f9VarB.c("measurement.sgtm.batch.long_queuing_threshold", 240000L);
        J = f9VarB.c("measurement.sgtm.batch.retry_interval", BacktraceMetrics.defaultTimeIntervalMs);
        K = f9VarB.c("measurement.sgtm.batch.retry_max_count", 10L);
        L = f9VarB.c("measurement.sgtm.batch.retry_max_wait", 21600000L);
        M = f9VarB.f("measurement.sgtm.service_upload_apps_list", "");
        N = f9VarB.f("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        O = f9VarB.c("measurement.sgtm.upload.batches_retrieval_limit", 5L);
        P = f9VarB.c("measurement.sgtm.upload.max_queued_batches", 5000L);
        Q = f9VarB.c("measurement.sgtm.upload.min_delay_after_background", 600000L);
        R = f9VarB.c("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
        S = f9VarB.c("measurement.sgtm.upload.min_delay_after_startup", 5000L);
        T = f9VarB.c("measurement.sgtm.upload.retry_interval", 600000L);
        U = f9VarB.c("measurement.sgtm.upload.retry_max_wait", 21600000L);
        V = f9VarB.c("measurement.upload.stale_data_deletion_interval", 86400000L);
        W = f9VarB.c("measurement.rb.attribution.max_retry_delay_seconds", 16L);
        X = f9VarB.c("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L);
        Y = f9VarB.f("measurement.rb.attribution.uri_authority", "google-analytics.com");
        Z = f9VarB.c("measurement.rb.attribution.max_queue_time", 864000000L);
        f6497a0 = f9VarB.f("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f6498b0 = f9VarB.f("measurement.rb.attribution.query_parameters_to_remove", "");
        f6500c0 = f9VarB.f("measurement.rb.attribution.uri_scheme", "https");
        f6502d0 = f9VarB.c("measurement.sdk.attribution.cache.ttl", 604800000L);
        f6504e0 = f9VarB.c("measurement.redaction.app_instance_id.ttl", 7200000L);
        f6506f0 = f9VarB.c("measurement.upload.backoff_period", 43200000L);
        f6508g0 = f9VarB.c("measurement.upload.initial_upload_delay_time", 15000L);
        f6510h0 = f9VarB.c("measurement.upload.interval", 3600000L);
        f6512i0 = f9VarB.c("measurement.upload.max_bundle_size", 65536L);
        f6514j0 = f9VarB.c("measurement.upload.max_bundles", 100L);
        f6516k0 = f9VarB.c("measurement.upload.max_conversions_per_day", 500L);
        f6518l0 = f9VarB.c("measurement.upload.max_error_events_per_day", 1000L);
        f6520m0 = f9VarB.c("measurement.upload.max_events_per_bundle", 1000L);
        f6522n0 = f9VarB.c("measurement.upload.max_events_per_day", 100000L);
        f6524o0 = f9VarB.c("measurement.upload.max_public_events_per_day", 50000L);
        f6526p0 = f9VarB.c("measurement.upload.max_queue_time", 518400000L);
        f6528q0 = f9VarB.c("measurement.upload.max_realtime_events_per_day", 10L);
        f6530r0 = f9VarB.c("measurement.upload.max_batch_size", 65536L);
        f6532s0 = f9VarB.c("measurement.upload.retry_count", 6L);
        f6534t0 = f9VarB.c("measurement.upload.retry_time", BacktraceMetrics.defaultTimeIntervalMs);
        f6536u0 = f9VarB.f("measurement.upload.url", "https://app-measurement.com/a");
        f6538v0 = f9VarB.c("measurement.upload.window_interval", 3600000L);
        f6540w0 = f9VarB.f("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long A() {
        return ((Long) G.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long B() {
        return ((Long) X.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long C() {
        return ((Long) f6510h0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long D() {
        return ((Long) f6504e0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long E() {
        return ((Long) f6538v0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String F() {
        return (String) D.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long G() {
        return ((Long) U.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long H() {
        return ((Long) E.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long I() {
        return ((Long) V.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long J() {
        return ((Long) f6541x.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long K() {
        return ((Long) f6506f0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String L() {
        return (String) f6540w0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long M() {
        return ((Long) f6518l0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long N() {
        return ((Long) J.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long O() {
        return ((Long) f6520m0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long P() {
        return ((Long) K.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long Q() {
        return ((Long) f6514j0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long R() {
        return ((Long) H.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String S() {
        return (String) Y.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long T() {
        return ((Long) f6512i0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long U() {
        return ((Long) f6516k0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long V() {
        return ((Long) I.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long W() {
        return ((Long) Z.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String X() {
        return (String) N.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long Y() {
        return ((Long) f6526p0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long Z() {
        return ((Long) O.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long a() {
        return ((Long) f6533t.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long a0() {
        return ((Long) f6528q0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long b0() {
        return ((Long) f6529r.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String c() {
        return (String) f6507g.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long c0() {
        return ((Long) f6522n0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long d() {
        return ((Long) f6511i.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long d0() {
        return ((Long) L.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long e() {
        return ((Long) f6513j.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String e0() {
        return (String) M.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String f() {
        return (String) f6517l.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long f0() {
        return ((Long) f6524o0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String g() {
        return (String) f6515k.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String g0() {
        return (String) f6500c0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long h0() {
        return ((Long) f6534t0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long i0() {
        return ((Long) B.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long j0() {
        return ((Long) f6535u.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long k0() {
        return ((Long) S.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long l0() {
        return ((Long) f6502d0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String m0() {
        return (String) f6536u0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long n0() {
        return ((Long) T.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean o0() {
        return ((Boolean) C.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long p0() {
        return ((Long) P.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String q0() {
        return (String) f6497a0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long r0() {
        return ((Long) f6530r0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long s0() {
        return ((Long) Q.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String t0() {
        return (String) f6498b0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long u() {
        return ((Long) f6519m.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long u0() {
        return ((Long) f6532s0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long v() {
        return ((Long) F.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long v0() {
        return ((Long) R.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long w() {
        return ((Long) W.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long w0() {
        return ((Long) A.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long x() {
        return ((Long) f6542y.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long y() {
        return ((Long) f6508g0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long z() {
        return ((Long) f6543z.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zza() {
        return ((Long) f6496a.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzb() {
        return ((Long) b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean zzc() {
        return ((Boolean) f6499c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzd() {
        return ((Long) f6501d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String zze() {
        return (String) f6503e.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzf() {
        return ((Long) f6505f.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String zzh() {
        return (String) f6509h.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String zzn() {
        return (String) f6521n.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzo() {
        return ((Long) f6523o.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzp() {
        return ((Long) f6525p.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzq() {
        return ((Long) f6527q.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzs() {
        return ((Long) f6531s.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzv() {
        return ((Long) f6537v.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzw() {
        return ((Long) f6539w.d()).longValue();
    }
}
