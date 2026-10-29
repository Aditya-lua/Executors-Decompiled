package vi;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ei.i;
import ei.j;
import ei.m;
import gk.p;
import jj.u;
import org.json.JSONException;
import org.json.JSONObject;
import sg.a1;
import sg.t0;
import sg.y;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33267a = -1;
    public boolean b = false;

    public class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f33268a;

        public a(d dVar) {
            this.f33268a = dVar;
        }

        @Override // ei.l
        public void a(j jVar) {
            fk.c cVarC = fk.c.c();
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
            d dVar = this.f33268a;
            if (dVar != null) {
                dVar.a(z10, iF);
            }
        }
    }

    public class b implements ui.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f33269a;

        public b(f fVar) {
            this.f33269a = fVar;
        }

        @Override // ui.a.d
        public void a() {
            this.f33269a.a();
        }
    }

    public class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xi.c.b f33270a;

        public c(xi.c.b bVar) {
            this.f33270a = bVar;
        }

        @Override // ei.l
        public void a(j jVar) {
            p.h("rbx.login", "Logout: " + jVar);
            if (jVar.b() != 200) {
                t0.g("logout", jVar.e(), jVar.b(), -1);
                wk.j.c().e(a1.O(), a1.g());
            }
            xi.c.b bVar = this.f33270a;
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
        public static final h f33271a = new h();
    }

    public interface f {
        void a();
    }

    public h() {
        k();
    }

    public static h e() {
        return e.f33271a;
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

    public final void a(xi.c.b bVar) {
        c cVar = new c(bVar);
        ei.g.a().b(a1.v0(), null, null, cVar).b();
    }

    public final void b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    public void c(Context context, boolean z10, xi.c.b bVar) {
        if (z10) {
            a(bVar);
        }
        n(context);
        if (!z10 && th.h.a().M1()) {
            wk.j.c().e(a1.O(), a1.g());
        }
        y.h().p().c();
    }

    public void d(m mVar) {
        fk.a aVar = new fk.a(mVar);
        aVar.b();
        g.a("activeSession");
        aVar.c();
    }

    public boolean f() {
        return this.b;
    }

    public long g() {
        return this.f33267a;
    }

    public boolean i() {
        return this.f33267a != -1;
    }

    public void j(Context context, String str, f fVar) {
        p.h("SessionManager", "didLoggedIn");
        this.b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f33267a = jSONObject.optLong("userId", this.f33267a);
                fk.c.c().v(this.f33267a);
                fk.c.c().q(jSONObject.optBoolean("isUnder13"));
                fk.c.c().w(jSONObject.optString("username", fk.c.c().k()));
                fk.c.c().o(jSONObject.optString("displayName", ""));
                r(false);
                fk.c.c().r(jSONObject.optInt("membershipType", 0));
                if (th.h.a().g1()) {
                    fk.c.c().p(jSONObject.optBoolean("hasRobloxSubscription", false));
                }
                jSONObject.optString("countryCode", "");
                if (th.h.a().o1()) {
                    y.h().d().i(Long.toString(this.f33267a));
                }
            } catch (JSONException e10) {
                p.j("onAccountInfoFromLua: Exception: + " + e10.getMessage());
            }
        }
        ui.a aVar = new ui.a(context, "PostLogin", this.f33267a, fk.c.c().k());
        aVar.g(new b(fVar));
        aVar.e();
    }

    public final void k() {
        SharedPreferences sharedPreferencesT = a1.T();
        String string = sharedPreferencesT.getString("username", "");
        String string2 = sharedPreferencesT.getString("displayName", "");
        long j10 = sharedPreferencesT.getLong("userid_long", -1L);
        this.f33267a = j10;
        if (j10 == -1) {
            this.f33267a = sharedPreferencesT.getInt("userid", -1);
        }
        fk.c.c().q(sharedPreferencesT.getBoolean("under13", true));
        fk.c.c().w(string);
        fk.c.c().o(string2);
    }

    public void m(d dVar, ei.f fVar) {
        fVar.a(a1.f(), null, new a(dVar)).b();
    }

    public final void n(Context context) {
        this.b = false;
        o(-1L);
        q();
        p();
        r(true);
        dh.b.b().a();
        fk.c.c().a();
        u.c().a();
        b(context);
    }

    public void o(long j10) {
        this.f33267a = j10;
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
            editorEdit.putString("username", fk.c.c().k());
            editorEdit.putString("displayName", fk.c.c().b());
            editorEdit.putLong("userid_long", this.f33267a);
            editorEdit.putBoolean("under13", fk.c.c().n());
        }
        editorEdit.apply();
    }
}
