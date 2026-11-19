package ob;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends p8 {
    public static final Pair A = new Pair(BuildConfig.FLAVOR, 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f27683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f27684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n6 f27685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m6 f27686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m6 f27687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o6 f27688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f27691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m6 f27692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k6 f27693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o6 f27694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l6 f27695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k6 f27696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m6 f27697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m6 f27698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k6 f27700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k6 f27701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m6 f27702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o6 f27703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o6 f27704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m6 f27705y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l6 f27706z;

    public p6(l7 l7Var) {
        super(l7Var);
        this.f27692l = new m6(this, "session_timeout", BacktraceMetrics.defaultTimeIntervalMs);
        this.f27693m = new k6(this, "start_new_session", true);
        this.f27697q = new m6(this, "last_pause_time", 0L);
        this.f27698r = new m6(this, "session_id", 0L);
        this.f27694n = new o6(this, "non_personalized_ads", null);
        this.f27695o = new l6(this, "last_received_uri_timestamps_by_source", null);
        this.f27696p = new k6(this, "allow_remote_dynamite", false);
        this.f27686f = new m6(this, "first_open_time", 0L);
        this.f27687g = new m6(this, "app_install_time", 0L);
        this.f27688h = new o6(this, "app_instance_id", null);
        this.f27700t = new k6(this, "app_backgrounded", false);
        this.f27701u = new k6(this, "deep_link_retrieval_complete", false);
        this.f27702v = new m6(this, "deep_link_retrieval_attempts", 0L);
        this.f27703w = new o6(this, "firebase_feature_rollouts", null);
        this.f27704x = new o6(this, "deferred_attribution_cache", null);
        this.f27705y = new m6(this, "deferred_attribution_cache_timestamp", 0L);
        this.f27706z = new l6(this, "default_event_parameters", null);
    }

    public final boolean A(long j10) {
        return j10 - this.f27692l.a() > this.f27697q.a();
    }

    @Override // ob.p8
    public final boolean i() {
        return true;
    }

    @Override // ob.p8
    public final void j() {
        l7 l7Var = this.f27641a;
        SharedPreferences sharedPreferences = l7Var.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f27683c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f27699s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f27683c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        l7Var.w();
        this.f27685e = new n6(this, "health_monitor", Math.max(0L, ((Long) e5.f27232d.b(null)).longValue()), null);
    }

    public final Pair o(String str) {
        h();
        if (!w().o(u8.AD_STORAGE)) {
            return new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
        }
        l7 l7Var = this.f27641a;
        long jB = l7Var.e().b();
        String str2 = this.f27689i;
        if (str2 != null && jB < this.f27691k) {
            return new Pair(str2, Boolean.valueOf(this.f27690j));
        }
        this.f27691k = jB + l7Var.w().D(str, e5.b);
        r8.a.b(true);
        try {
            r8.a.C0598a c0598aA = r8.a.a(l7Var.d());
            this.f27689i = BuildConfig.FLAVOR;
            String strA = c0598aA.a();
            if (strA != null) {
                this.f27689i = strA;
            }
            this.f27690j = c0598aA.b();
        } catch (Exception e10) {
            this.f27641a.a().v().b("Unable to get advertising id", e10);
            this.f27689i = BuildConfig.FLAVOR;
        }
        r8.a.b(false);
        return new Pair(this.f27689i, Boolean.valueOf(this.f27690j));
    }

    public final SharedPreferences p() {
        h();
        l();
        o9.s.l(this.f27683c);
        return this.f27683c;
    }

    public final SharedPreferences q() {
        h();
        l();
        if (this.f27684d == null) {
            l7 l7Var = this.f27641a;
            String strValueOf = String.valueOf(l7Var.d().getPackageName());
            z5 z5VarW = l7Var.a().w();
            String strConcat = strValueOf.concat("_preferences");
            z5VarW.b("Default prefs file", strConcat);
            this.f27684d = l7Var.d().getSharedPreferences(strConcat, 0);
        }
        return this.f27684d;
    }

    public final SparseArray r() {
        Bundle bundleA = this.f27695o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f27641a.a().o().a("Trigger URI source and timestamp array lengths do not match");
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

    public final a0 u() {
        h();
        return a0.g(p().getString("dma_consent_settings", null));
    }

    public final boolean v(int i10) {
        return v8.u(i10, p().getInt("consent_source", 100));
    }

    public final v8 w() {
        h();
        return v8.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    public final boolean x(rd rdVar) {
        h();
        String string = p().getString("stored_tcf_param", BuildConfig.FLAVOR);
        String strA = rdVar.a();
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
        this.f27641a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean z() {
        SharedPreferences sharedPreferences = this.f27683c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
