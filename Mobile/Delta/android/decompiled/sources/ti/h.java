package ti;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ci.i;
import ci.j;
import ci.m;
import ek.q;
import hj.u;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.t0;
import rg.y;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32402a = -1;
    public boolean b = false;

    public class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f32403a;

        public a(d dVar) {
            this.f32403a = dVar;
        }

        @Override // ci.l
        public void b(j jVar) {
            dk.c cVarC = dk.c.c();
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
            d dVar = this.f32403a;
            if (dVar != null) {
                dVar.a(z10, iF);
            }
        }
    }

    public class b implements si.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f32404a;

        public b(f fVar) {
            this.f32404a = fVar;
        }

        @Override // si.a.d
        public void a() {
            this.f32404a.a();
        }
    }

    public class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vi.c.b f32405a;

        public c(vi.c.b bVar) {
            this.f32405a = bVar;
        }

        @Override // ci.l
        public void b(j jVar) {
            q.h("rbx.login", "Logout: " + jVar);
            if (jVar.b() != 200) {
                t0.g("logout", jVar.e(), jVar.b(), -1);
                uk.j.c().e(a1.O(), a1.g());
            }
            vi.c.b bVar = this.f32405a;
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
        public static final h f32406a = new h();
    }

    public interface f {
        void a();
    }

    public h() {
        k();
    }

    public static h e() {
        return e.f32406a;
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
            jSONObject.put("username", sharedPreferencesT.getString("username", ""));
            jSONObject.put("displayName", sharedPreferencesT.getString("displayName", ""));
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("invalid UserInfo json");
        }
    }

    public final void a(vi.c.b bVar) {
        c cVar = new c(bVar);
        ci.g.a().a(a1.v0(), null, null, cVar).b();
    }

    public final void b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    public void c(Context context, boolean z10, vi.c.b bVar) {
        if (z10) {
            a(bVar);
        }
        n(context);
        if (!z10 && rh.h.a().W1()) {
            uk.j.c().e(a1.O(), a1.g());
        }
        y.h().p().c();
    }

    public void d(m mVar) {
        dk.a aVar = new dk.a(mVar);
        aVar.b();
        g.a("activeSession");
        aVar.c();
    }

    public boolean f() {
        return this.b;
    }

    public long g() {
        return this.f32402a;
    }

    public boolean i() {
        return this.f32402a != -1;
    }

    public void j(Context context, String str, f fVar) {
        q.h("SessionManager", "didLoggedIn");
        this.b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f32402a = jSONObject.optLong("userId", this.f32402a);
                dk.c.c().v(this.f32402a);
                dk.c.c().q(jSONObject.optBoolean("isUnder13"));
                dk.c.c().w(jSONObject.optString("username", dk.c.c().k()));
                dk.c.c().o(jSONObject.optString("displayName", ""));
                r(false);
                dk.c.c().r(jSONObject.optInt("membershipType", 0));
                if (rh.h.a().o1()) {
                    dk.c.c().p(jSONObject.optBoolean("hasRobloxSubscription", false));
                }
                jSONObject.optString("countryCode", "");
                if (rh.h.a().x1()) {
                    y.h().d().i(Long.toString(this.f32402a));
                }
            } catch (JSONException e10) {
                q.j("onAccountInfoFromLua: Exception: + " + e10.getMessage());
            }
        }
        si.a aVar = new si.a(context, "PostLogin", this.f32402a, dk.c.c().k());
        aVar.g(new b(fVar));
        aVar.e();
    }

    public final void k() {
        SharedPreferences sharedPreferencesT = a1.T();
        String string = sharedPreferencesT.getString("username", "");
        String string2 = sharedPreferencesT.getString("displayName", "");
        long j10 = sharedPreferencesT.getLong("userid_long", -1L);
        this.f32402a = j10;
        if (j10 == -1) {
            this.f32402a = sharedPreferencesT.getInt("userid", -1);
        }
        dk.c.c().q(sharedPreferencesT.getBoolean("under13", true));
        dk.c.c().w(string);
        dk.c.c().o(string2);
    }

    public void m(d dVar, ci.f fVar) {
        fVar.b(a1.f(), null, new a(dVar)).b();
    }

    public final void n(Context context) {
        this.b = false;
        o(-1L);
        q();
        p();
        r(true);
        ch.b.b().a();
        dk.c.c().a();
        u.c().a();
        b(context);
    }

    public void o(long j10) {
        this.f32402a = j10;
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
            editorEdit.putString("username", dk.c.c().k());
            editorEdit.putString("displayName", dk.c.c().b());
            editorEdit.putLong("userid_long", this.f32402a);
            editorEdit.putBoolean("under13", dk.c.c().n());
        }
        editorEdit.apply();
    }
}
