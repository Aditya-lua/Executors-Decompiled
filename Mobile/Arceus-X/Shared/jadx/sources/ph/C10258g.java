package ph;

import org.json.JSONObject;
import sg.C11295a1;

/* JADX INFO: renamed from: ph.g */
/* JADX INFO: loaded from: classes2.dex */
public class C10258g {

    /* JADX INFO: renamed from: a */
    public String f36866a;

    /* JADX INFO: renamed from: b */
    public String f36867b;

    /* JADX INFO: renamed from: c */
    public String f36868c;

    /* JADX INFO: renamed from: d */
    public JSONObject f36869d;

    /* JADX INFO: renamed from: e */
    public boolean f36870e = false;

    /* JADX INFO: renamed from: f */
    public boolean f36871f;

    public C10258g(String str) {
        this.f36866a = str;
    }

    /* JADX INFO: renamed from: a */
    public static C10258g m39408a(String str, String str2) {
        C10258g c10258g = new C10258g(str);
        c10258g.m39414g(str2);
        return c10258g;
    }

    /* JADX INFO: renamed from: b */
    public static C10258g m39409b(String str) {
        C10258g c10258g = new C10258g(str);
        c10258g.f36870e = true;
        return c10258g;
    }

    /* JADX INFO: renamed from: c */
    public static String m39410c(long j10) {
        if (j10 == -1) {
            return C11295a1.m42385B0();
        }
        return C11295a1.m42450g() + "users/" + j10 + "/profile/";
    }

    /* JADX INFO: renamed from: d */
    public String m39411d() {
        return this.f36868c;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m39412e() {
        return this.f36869d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m39413f() {
        return this.f36871f;
    }

    /* JADX INFO: renamed from: g */
    public void m39414g(String str) {
        this.f36868c = str;
    }

    /* JADX INFO: renamed from: h */
    public void m39415h(JSONObject jSONObject) {
        this.f36869d = jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public void m39416i(String str) {
        this.f36867b = str;
    }

    /* JADX INFO: renamed from: j */
    public void m39417j(boolean z10) {
        this.f36871f = z10;
    }
}
