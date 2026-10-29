package vi;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import fk.C5652a;
import fk.C5654c;
import org.json.JSONException;
import org.json.JSONObject;
import p078dh.C4608b;
import p104ei.C5129g;
import p104ei.C5131i;
import p104ei.C5132j;
import p104ei.InterfaceC5128f;
import p104ei.InterfaceC5135m;
import p151gk.C6124q;
import p222jj.C7196u;
import p468ui.HandlerC11856a;
import p520wk.C12488j;
import p548xi.C12836c;
import sg.C11295a1;
import sg.C11356t0;
import sg.C11370y;
import th.C11659h;

/* JADX INFO: renamed from: vi.h */
/* JADX INFO: loaded from: classes2.dex */
public class C12217h {

    /* JADX INFO: renamed from: a */
    public long f43078a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f43079b = false;

    /* JADX INFO: renamed from: vi.h$a */
    public class a extends C5131i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f43080a;

        public a(d dVar) {
            this.f43080a = dVar;
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: a */
        public void mo15091a(C5132j c5132j) {
            C5654c c5654cM25669c = C5654c.m25669c();
            int iM25674f = c5654cM25669c.m25674f();
            boolean z10 = false;
            if (!c5132j.m23932a().isEmpty()) {
                try {
                    iM25674f = new JSONObject(c5132j.m23932a()).optInt("robux");
                    c5654cM25669c.m25688t(iM25674f);
                    z10 = true;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            d dVar = this.f43080a;
            if (dVar != null) {
                dVar.mo15393a(z10, iM25674f);
            }
        }
    }

    /* JADX INFO: renamed from: vi.h$b */
    public class b implements HandlerC11856a.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f f43082a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(f fVar) {
            this.f43082a = fVar;
        }

        @Override // p468ui.HandlerC11856a.d
        /* JADX INFO: renamed from: a */
        public void mo44277a() {
            this.f43082a.mo1304a();
        }
    }

    /* JADX INFO: renamed from: vi.h$c */
    public class c extends C5131i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12836c.b f43084a;

        public c(C12836c.b bVar) {
            this.f43084a = bVar;
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: a */
        public void mo15091a(C5132j c5132j) {
            C6124q.m27063h("rbx.login", "Logout: " + c5132j);
            if (c5132j.m23933b() != 200) {
                C11356t0.m42537g("logout", c5132j.m23936e(), c5132j.m23933b(), -1);
                C12488j.m46781c().m46783e(C11295a1.m42410O(), C11295a1.m42450g());
            }
            C12836c.b bVar = this.f43084a;
            if (bVar != null) {
                bVar.mo45215a();
            }
        }
    }

    /* JADX INFO: renamed from: vi.h$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo15393a(boolean z10, int i10);
    }

    /* JADX INFO: renamed from: vi.h$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static final C12217h f43086a = new C12217h();
    }

    /* JADX INFO: renamed from: vi.h$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo1304a();
    }

    public C12217h() {
        m45299k();
    }

    /* JADX INFO: renamed from: e */
    public static C12217h m45288e() {
        return e.f43086a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m45289h() {
        return C11295a1.m42420T().getLong("userid_long", -1L) != -1;
    }

    /* JADX INFO: renamed from: l */
    public static JSONObject m45290l() {
        SharedPreferences sharedPreferencesM42420T = C11295a1.m42420T();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", sharedPreferencesM42420T.getLong("userid_long", -1L));
            jSONObject.put("isUnder13", sharedPreferencesM42420T.getBoolean("under13", true));
            jSONObject.put("username", sharedPreferencesM42420T.getString("username", ""));
            jSONObject.put("displayName", sharedPreferencesM42420T.getString("displayName", ""));
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("invalid UserInfo json");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m45291a(C12836c.b bVar) {
        c cVar = new c(bVar);
        C5129g.m23931a().mo23930b(C11295a1.m42481v0(), null, null, cVar).m23907b();
    }

    /* JADX INFO: renamed from: b */
    public final void m45292b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m45293c(Context context, boolean z10, C12836c.b bVar) {
        if (z10) {
            m45291a(bVar);
        }
        m45301n(context);
        if (!z10 && C11659h.m43403a().mo43530S1()) {
            C12488j.m46781c().m46783e(C11295a1.m42410O(), C11295a1.m42450g());
        }
        C11370y.m42581h().m42596p().m45309c();
    }

    /* JADX INFO: renamed from: d */
    public void m45294d(InterfaceC5135m interfaceC5135m) {
        C5652a c5652a = new C5652a(interfaceC5135m);
        c5652a.m25665b();
        C12216g.m45227a("activeSession");
        c5652a.m25666c();
    }

    /* JADX INFO: renamed from: f */
    public boolean m45295f() {
        return this.f43079b;
    }

    /* JADX INFO: renamed from: g */
    public long m45296g() {
        return this.f43078a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m45297i() {
        return this.f43078a != -1;
    }

    /* JADX INFO: renamed from: j */
    public void m45298j(Context context, String str, f fVar) {
        C6124q.m27063h("SessionManager", "didLoggedIn");
        this.f43079b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f43078a = jSONObject.optLong("userId", this.f43078a);
                C5654c.m25669c().m25690v(this.f43078a);
                C5654c.m25669c().m25685q(jSONObject.optBoolean("isUnder13"));
                C5654c.m25669c().m25691w(jSONObject.optString("username", C5654c.m25669c().m25679k()));
                C5654c.m25669c().m25683o(jSONObject.optString("displayName", ""));
                m45305r(false);
                C5654c.m25669c().m25686r(jSONObject.optInt("membershipType", 0));
                if (C11659h.m43403a().mo43668l1()) {
                    C5654c.m25669c().m25684p(jSONObject.optBoolean("hasRobloxSubscription", false));
                }
                jSONObject.optString("countryCode", "");
                if (C11659h.m43403a().mo43724t1()) {
                    C11370y.m42581h().m42585d().mo14936i(Long.toString(this.f43078a));
                }
            } catch (JSONException e10) {
                C6124q.m27065j("onAccountInfoFromLua: Exception: + " + e10.getMessage());
            }
        }
        HandlerC11856a handlerC11856a = new HandlerC11856a(context, "PostLogin", this.f43078a, C5654c.m25669c().m25679k());
        handlerC11856a.m44276g(new b(fVar));
        handlerC11856a.m23876e();
    }

    /* JADX INFO: renamed from: k */
    public final void m45299k() {
        SharedPreferences sharedPreferencesM42420T = C11295a1.m42420T();
        String string = sharedPreferencesM42420T.getString("username", "");
        String string2 = sharedPreferencesM42420T.getString("displayName", "");
        long j10 = sharedPreferencesM42420T.getLong("userid_long", -1L);
        this.f43078a = j10;
        if (j10 == -1) {
            this.f43078a = sharedPreferencesM42420T.getInt("userid", -1);
        }
        C5654c.m25669c().m25685q(sharedPreferencesM42420T.getBoolean("under13", true));
        C5654c.m25669c().m25691w(string);
        C5654c.m25669c().m25683o(string2);
    }

    /* JADX INFO: renamed from: m */
    public void m45300m(d dVar, InterfaceC5128f interfaceC5128f) {
        interfaceC5128f.mo23929a(C11295a1.m42448f(), null, new a(dVar)).m23907b();
    }

    /* JADX INFO: renamed from: n */
    public final void m45301n(Context context) {
        this.f43079b = false;
        m45302o(-1L);
        m45304q();
        m45303p();
        m45305r(true);
        C4608b.m22756b().m22757a();
        C5654c.m25669c().m25670a();
        C7196u.m30108c().m30109a();
        m45292b(context);
    }

    /* JADX INFO: renamed from: o */
    public void m45302o(long j10) {
        this.f43078a = j10;
    }

    /* JADX INFO: renamed from: p */
    public final void m45303p() {
        C11295a1.m42420T().edit().remove("last_auth_cookie_expir_key").apply();
    }

    /* JADX INFO: renamed from: q */
    public final void m45304q() {
        C11295a1.m42420T().edit().remove("user_logged_in_time").apply();
    }

    /* JADX INFO: renamed from: r */
    public final void m45305r(boolean z10) {
        SharedPreferences.Editor editorEdit = C11295a1.m42420T().edit();
        editorEdit.remove("userid");
        if (z10) {
            editorEdit.remove("userid_long");
            editorEdit.remove("displayName");
            editorEdit.remove("under13");
        } else {
            editorEdit.putString("username", C5654c.m25669c().m25679k());
            editorEdit.putString("displayName", C5654c.m25669c().m25671b());
            editorEdit.putLong("userid_long", this.f43078a);
            editorEdit.putBoolean("under13", C5654c.m25669c().m25682n());
        }
        editorEdit.apply();
    }
}
