package dj;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bh.a1;
import bh.t0;
import bh.y;
import com.github.luben.zstd.BuildConfig;
import mi.i;
import mi.j;
import mi.m;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;
import rj.u;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12494a = -1;
    public boolean b = false;

    public class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f12495a;

        public a(d dVar) {
            this.f12495a = dVar;
        }

        @Override // mi.l
        public void b(j jVar) {
            nk.c cVarC = nk.c.c();
            int iF = cVarC.f();
            boolean z10 = false;
            if (!jVar.a().isEmpty()) {
                try {
                    iF = new JSONObject(jVar.a()).optInt("robux");
                    cVarC.t(iF);
                    z10 = true;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            d dVar = this.f12495a;
            if (dVar != null) {
                dVar.a(z10, iF);
            }
        }
    }

    public class b implements cj.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f12496a;

        public b(f fVar) {
            this.f12496a = fVar;
        }

        @Override // cj.a.d
        public void a() {
            this.f12496a.a();
        }
    }

    public class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fj.c.b f12497a;

        public c(fj.c.b bVar) {
            this.f12497a = bVar;
        }

        @Override // mi.l
        public void b(j jVar) {
            q.h("rbx.login", "Logout: " + jVar);
            if (jVar.b() != 200) {
                t0.g("logout", jVar.e(), jVar.b(), -1);
                dl.j.e().g(a1.O(), a1.g());
            }
            fj.c.b bVar = this.f12497a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface d {
        void a(boolean z10, int i10);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12498a = new h();
    }

    public interface f {
        void a();
    }

    public h() {
        k();
    }

    public static h e() {
        return e.f12498a;
    }

    public static boolean h() {
        return a1.T().getLong("userid_long", -1L) != -1;
    }

    public static JSONObject l() {
        SharedPreferences sharedPreferencesT = a1.T();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", sharedPreferencesT.getLong("userid_long", -1L));
            jSONObject.put("isUnder13", sharedPreferencesT.getBoolean("under13", true));
            jSONObject.put("username", sharedPreferencesT.getString("username", BuildConfig.FLAVOR));
            jSONObject.put("displayName", sharedPreferencesT.getString("displayName", BuildConfig.FLAVOR));
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("invalid UserInfo json");
        }
    }

    public final void a(fj.c.b bVar) {
        c cVar = new c(bVar);
        mi.g.a().a(a1.v0(), null, null, cVar).b();
    }

    public final void b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    public void c(Context context, boolean z10, fj.c.b bVar) {
        if (z10) {
            a(bVar);
        }
        n(context);
        if (!z10 && bi.h.a().W1()) {
            dl.j.e().g(a1.O(), a1.g());
        }
        y.h().p().c();
    }

    public void d(m mVar) {
        nk.a aVar = new nk.a(mVar);
        aVar.b();
        g.a("activeSession");
        aVar.c();
    }

    public boolean f() {
        return this.b;
    }

    public long g() {
        return this.f12494a;
    }

    public boolean i() {
        return this.f12494a != -1;
    }

    public void j(Context context, String str, f fVar) {
        q.h("SessionManager", "didLoggedIn");
        this.b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f12494a = jSONObject.optLong("userId", this.f12494a);
                nk.c.c().v(this.f12494a);
                nk.c.c().q(jSONObject.optBoolean("isUnder13"));
                nk.c.c().w(jSONObject.optString("username", nk.c.c().k()));
                nk.c.c().o(jSONObject.optString("displayName", BuildConfig.FLAVOR));
                r(false);
                nk.c.c().r(jSONObject.optInt("membershipType", 0));
                if (bi.h.a().o1()) {
                    nk.c.c().p(jSONObject.optBoolean("hasRobloxSubscription", false));
                }
                jSONObject.optString("countryCode", BuildConfig.FLAVOR);
                if (bi.h.a().x1()) {
                    y.h().d().i(Long.toString(this.f12494a));
                }
            } catch (JSONException e10) {
                q.j("onAccountInfoFromLua: Exception: + " + e10.getMessage());
            }
        }
        cj.a aVar = new cj.a(context, "PostLogin", this.f12494a, nk.c.c().k());
        aVar.g(new b(fVar));
        aVar.e();
    }

    public final void k() {
        SharedPreferences sharedPreferencesT = a1.T();
        String string = sharedPreferencesT.getString("username", BuildConfig.FLAVOR);
        String string2 = sharedPreferencesT.getString("displayName", BuildConfig.FLAVOR);
        long j10 = sharedPreferencesT.getLong("userid_long", -1L);
        this.f12494a = j10;
        if (j10 == -1) {
            this.f12494a = sharedPreferencesT.getInt("userid", -1);
        }
        nk.c.c().q(sharedPreferencesT.getBoolean("under13", true));
        nk.c.c().w(string);
        nk.c.c().o(string2);
    }

    public void m(d dVar, mi.f fVar) {
        fVar.b(a1.f(), null, new a(dVar)).b();
    }

    public final void n(Context context) {
        this.b = false;
        o(-1L);
        q();
        p();
        r(true);
        mh.b.b().a();
        nk.c.c().a();
        u.c().a();
        b(context);
    }

    public void o(long j10) {
        this.f12494a = j10;
    }

    public final void p() {
        a1.T().edit().remove("last_auth_cookie_expir_key").apply();
    }

    public final void q() {
        a1.T().edit().remove("user_logged_in_time").apply();
    }

    public final void r(boolean z10) {
        SharedPreferences.Editor editorEdit = a1.T().edit();
        editorEdit.remove("userid");
        if (z10) {
            editorEdit.remove("userid_long");
            editorEdit.remove("displayName");
            editorEdit.remove("under13");
        } else {
            editorEdit.putString("username", nk.c.c().k());
            editorEdit.putString("displayName", nk.c.c().b());
            editorEdit.putLong("userid_long", this.f12494a);
            editorEdit.putBoolean("under13", nk.c.c().n());
        }
        editorEdit.apply();
    }
}
