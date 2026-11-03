package nb;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import backtraceio.library.services.BacktraceMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class k6 extends k8 {
    public static final Pair A = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f26489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f26490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i6 f26491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h6 f26492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6 f26493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j6 f26494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f26497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h6 f26498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f6 f26499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j6 f26500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g6 f26501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f6 f26502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h6 f26503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h6 f26504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f26505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f6 f26506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f6 f26507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h6 f26508v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j6 f26509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j6 f26510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h6 f26511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g6 f26512z;

    public k6(g7 g7Var) {
        super(g7Var);
        this.f26498l = new h6(this, "session_timeout", BacktraceMetrics.defaultTimeIntervalMs);
        this.f26499m = new f6(this, "start_new_session", true);
        this.f26503q = new h6(this, "last_pause_time", 0L);
        this.f26504r = new h6(this, "session_id", 0L);
        this.f26500n = new j6(this, "non_personalized_ads", null);
        this.f26501o = new g6(this, "last_received_uri_timestamps_by_source", null);
        this.f26502p = new f6(this, "allow_remote_dynamite", false);
        this.f26492f = new h6(this, "first_open_time", 0L);
        this.f26493g = new h6(this, "app_install_time", 0L);
        this.f26494h = new j6(this, "app_instance_id", null);
        this.f26506t = new f6(this, "app_backgrounded", false);
        this.f26507u = new f6(this, "deep_link_retrieval_complete", false);
        this.f26508v = new h6(this, "deep_link_retrieval_attempts", 0L);
        this.f26509w = new j6(this, "firebase_feature_rollouts", null);
        this.f26510x = new j6(this, "deferred_attribution_cache", null);
        this.f26511y = new h6(this, "deferred_attribution_cache_timestamp", 0L);
        this.f26512z = new g6(this, "default_event_parameters", null);
    }

    public final boolean A(long j10) {
        return j10 - this.f26498l.a() > this.f26503q.a();
    }

    @Override // nb.k8
    public final boolean i() {
        return true;
    }

    @Override // nb.k8
    public final void j() {
        g7 g7Var = this.f26446a;
        SharedPreferences sharedPreferences = g7Var.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f26489c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f26505s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f26489c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        g7Var.w();
        this.f26491e = new i6(this, "health_monitor", Math.max(0L, ((Long) z4.f26978d.b(null)).longValue()), null);
    }

    public final Pair o(String str) {
        h();
        if (!w().o(p8.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        g7 g7Var = this.f26446a;
        long jB = g7Var.e().b();
        String str2 = this.f26495i;
        if (str2 != null && jB < this.f26497k) {
            return new Pair(str2, Boolean.valueOf(this.f26496j));
        }
        this.f26497k = jB + g7Var.w().D(str, z4.b);
        q8.a.b(true);
        try {
            q8.a.C0514a c0514aA = q8.a.a(g7Var.d());
            this.f26495i = "";
            String strA = c0514aA.a();
            if (strA != null) {
                this.f26495i = strA;
            }
            this.f26496j = c0514aA.b();
        } catch (Exception e10) {
            this.f26446a.a().v().b("Unable to get advertising id", e10);
            this.f26495i = "";
        }
        q8.a.b(false);
        return new Pair(this.f26495i, Boolean.valueOf(this.f26496j));
    }

    public final SharedPreferences p() {
        h();
        l();
        n9.m.l(this.f26489c);
        return this.f26489c;
    }

    public final SharedPreferences q() {
        h();
        l();
        if (this.f26490d == null) {
            g7 g7Var = this.f26446a;
            String strValueOf = String.valueOf(g7Var.d().getPackageName());
            u5 u5VarW = g7Var.a().w();
            String strConcat = strValueOf.concat("_preferences");
            u5VarW.b("Default prefs file", strConcat);
            this.f26490d = g7Var.d().getSharedPreferences(strConcat, 0);
        }
        return this.f26490d;
    }

    public final SparseArray r() {
        Bundle bundleA = this.f26501o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f26446a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final x u() {
        h();
        return x.g(p().getString("dma_consent_settings", null));
    }

    public final boolean v(int i10) {
        return q8.u(i10, p().getInt("consent_source", 100));
    }

    public final q8 w() {
        h();
        return q8.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    public final boolean x(md mdVar) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strA = mdVar.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void y(boolean z10) {
        h();
        this.f26446a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean z() {
        SharedPreferences sharedPreferences = this.f26489c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
