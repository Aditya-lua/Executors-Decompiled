package p306nb;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import backtraceio.library.services.BacktraceMetrics;
import p305n9.C8953m;
import p374q8.C10480a;

/* JADX INFO: renamed from: nb.k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9157k6 extends AbstractC9159k8 {

    /* JADX INFO: renamed from: A */
    public static final Pair f33114A = new Pair("", 0L);

    /* JADX INFO: renamed from: c */
    public SharedPreferences f33115c;

    /* JADX INFO: renamed from: d */
    public SharedPreferences f33116d;

    /* JADX INFO: renamed from: e */
    public C9125i6 f33117e;

    /* JADX INFO: renamed from: f */
    public final C9109h6 f33118f;

    /* JADX INFO: renamed from: g */
    public final C9109h6 f33119g;

    /* JADX INFO: renamed from: h */
    public final C9141j6 f33120h;

    /* JADX INFO: renamed from: i */
    public String f33121i;

    /* JADX INFO: renamed from: j */
    public boolean f33122j;

    /* JADX INFO: renamed from: k */
    public long f33123k;

    /* JADX INFO: renamed from: l */
    public final C9109h6 f33124l;

    /* JADX INFO: renamed from: m */
    public final C9077f6 f33125m;

    /* JADX INFO: renamed from: n */
    public final C9141j6 f33126n;

    /* JADX INFO: renamed from: o */
    public final C9093g6 f33127o;

    /* JADX INFO: renamed from: p */
    public final C9077f6 f33128p;

    /* JADX INFO: renamed from: q */
    public final C9109h6 f33129q;

    /* JADX INFO: renamed from: r */
    public final C9109h6 f33130r;

    /* JADX INFO: renamed from: s */
    public boolean f33131s;

    /* JADX INFO: renamed from: t */
    public final C9077f6 f33132t;

    /* JADX INFO: renamed from: u */
    public final C9077f6 f33133u;

    /* JADX INFO: renamed from: v */
    public final C9109h6 f33134v;

    /* JADX INFO: renamed from: w */
    public final C9141j6 f33135w;

    /* JADX INFO: renamed from: x */
    public final C9141j6 f33136x;

    /* JADX INFO: renamed from: y */
    public final C9109h6 f33137y;

    /* JADX INFO: renamed from: z */
    public final C9093g6 f33138z;

    public C9157k6(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33124l = new C9109h6(this, "session_timeout", BacktraceMetrics.defaultTimeIntervalMs);
        this.f33125m = new C9077f6(this, "start_new_session", true);
        this.f33129q = new C9109h6(this, "last_pause_time", 0L);
        this.f33130r = new C9109h6(this, "session_id", 0L);
        this.f33126n = new C9141j6(this, "non_personalized_ads", null);
        this.f33127o = new C9093g6(this, "last_received_uri_timestamps_by_source", null);
        this.f33128p = new C9077f6(this, "allow_remote_dynamite", false);
        this.f33118f = new C9109h6(this, "first_open_time", 0L);
        this.f33119g = new C9109h6(this, "app_install_time", 0L);
        this.f33120h = new C9141j6(this, "app_instance_id", null);
        this.f33132t = new C9077f6(this, "app_backgrounded", false);
        this.f33133u = new C9077f6(this, "deep_link_retrieval_complete", false);
        this.f33134v = new C9109h6(this, "deep_link_retrieval_attempts", 0L);
        this.f33135w = new C9141j6(this, "firebase_feature_rollouts", null);
        this.f33136x = new C9141j6(this, "deferred_attribution_cache", null);
        this.f33137y = new C9109h6(this, "deferred_attribution_cache_timestamp", 0L);
        this.f33138z = new C9093g6(this, "default_event_parameters", null);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m36440A(long j10) {
        return j10 - this.f33124l.m36345a() > this.f33129q.m36345a();
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: i */
    public final boolean mo36257i() {
        return true;
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: j */
    public final void mo36441j() {
        C9094g7 c9094g7 = this.f33067a;
        SharedPreferences sharedPreferences = c9094g7.mo36324d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f33115c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f33131s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f33115c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c9094g7.m36338w();
        this.f33117e = new C9125i6(this, "health_monitor", Math.max(0L, ((Long) C9395z4.f33766d.m37079b(null)).longValue()), null);
    }

    /* JADX INFO: renamed from: o */
    public final Pair m36442o(String str) {
        mo36088h();
        if (!m36450w().m36656o(EnumC9239p8.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        C9094g7 c9094g7 = this.f33067a;
        long jMo44176b = c9094g7.mo36325e().mo44176b();
        String str2 = this.f33121i;
        if (str2 != null && jMo44176b < this.f33123k) {
            return new Pair(str2, Boolean.valueOf(this.f33122j));
        }
        this.f33123k = jMo44176b + c9094g7.m36338w().m36402D(str, C9395z4.f33760b);
        C10480a.m40280b(true);
        try {
            C10480a.a aVarM40279a = C10480a.m40279a(c9094g7.mo36324d());
            this.f33121i = "";
            String strM40286a = aVarM40279a.m40286a();
            if (strM40286a != null) {
                this.f33121i = strM40286a;
            }
            this.f33122j = aVarM40279a.m40287b();
        } catch (Exception e10) {
            this.f33067a.mo36321a().m37010v().m36912b("Unable to get advertising id", e10);
            this.f33121i = "";
        }
        C10480a.m40280b(false);
        return new Pair(this.f33121i, Boolean.valueOf(this.f33122j));
    }

    /* JADX INFO: renamed from: p */
    public final SharedPreferences m36443p() {
        mo36088h();
        m36455l();
        C8953m.m36047l(this.f33115c);
        return this.f33115c;
    }

    /* JADX INFO: renamed from: q */
    public final SharedPreferences m36444q() {
        mo36088h();
        m36455l();
        if (this.f33116d == null) {
            C9094g7 c9094g7 = this.f33067a;
            String strValueOf = String.valueOf(c9094g7.mo36324d().getPackageName());
            C9316u5 c9316u5M37011w = c9094g7.mo36321a().m37011w();
            String strConcat = strValueOf.concat("_preferences");
            c9316u5M37011w.m36912b("Default prefs file", strConcat);
            this.f33116d = c9094g7.mo36324d().getSharedPreferences(strConcat, 0);
        }
        return this.f33116d;
    }

    /* JADX INFO: renamed from: r */
    public final SparseArray m36445r() {
        Bundle bundleM36298a = this.f33127o.m36298a();
        int[] intArray = bundleM36298a.getIntArray("uriSources");
        long[] longArray = bundleM36298a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f33067a.mo36321a().m37003o().m36911a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: s */
    public final void m36446s(Boolean bool) {
        mo36088h();
        SharedPreferences.Editor editorEdit = m36443p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: t */
    public final Boolean m36447t() {
        mo36088h();
        if (m36443p().contains("measurement_enabled")) {
            return Boolean.valueOf(m36443p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final C9358x m36448u() {
        mo36088h();
        return C9358x.m37016g(m36443p().getString("dma_consent_settings", null));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m36449v(int i10) {
        return C9255q8.m36650u(i10, m36443p().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: w */
    public final C9255q8 m36450w() {
        mo36088h();
        return C9255q8.m36644f(m36443p().getString("consent_settings", "G1"), m36443p().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m36451x(C9196md c9196md) {
        mo36088h();
        String string = m36443p().getString("stored_tcf_param", "");
        String strM36481a = c9196md.m36481a();
        if (strM36481a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m36443p().edit();
        editorEdit.putString("stored_tcf_param", strM36481a);
        editorEdit.apply();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m36452y(boolean z10) {
        mo36088h();
        this.f33067a.mo36321a().m37011w().m36912b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = m36443p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m36453z() {
        SharedPreferences sharedPreferences = this.f33115c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
