package bm;

import android.app.Activity;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import e3.k0;
import e3.l0;
import e3.o0;
import e3.p0;
import e3.r0;
import e3.t0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4248d = "t";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<e3.o> f4249a;
    public final m b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f4250c = Executors.newSingleThreadExecutor();

    public class a implements e3.p<l0, f3.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f4251a;
        public final /* synthetic */ String b;

        public a(d dVar, String str) {
            this.f4251a = dVar;
            this.b = str;
        }

        @Override // e3.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull f3.n nVar) {
            Log.e(t.f4248d, "Error getting credentials: ", nVar);
            if (nVar instanceof f3.o) {
                this.f4251a.b(2, nVar.getMessage());
                return;
            }
            if (nVar instanceof f3.l) {
                this.f4251a.b(1, nVar.getMessage());
                return;
            }
            if (nVar instanceof f3.s) {
                this.f4251a.b(6, nVar.getMessage());
            } else if (nVar instanceof f3.r) {
                this.f4251a.b(7, nVar.getMessage());
            } else {
                this.f4251a.b(0, nVar.getMessage());
            }
        }

        @Override // e3.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(l0 l0Var) {
            e3.m mVarA = l0Var.getCredential();
            if (mVarA instanceof t0) {
                this.f4251a.a(((t0) mVarA).getAuthenticationResponseJson(), this.b);
                return;
            }
            if (!(mVarA instanceof r0)) {
                this.f4251a.b(0, "Unexpected GetCredentialResponse");
                return;
            }
            r0 r0Var = (r0) mVarA;
            String strC = r0Var.getId();
            String strD = r0Var.getPassword();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("username", strC);
                jSONObject.put("password", strD);
                this.f4251a.a(jSONObject.toString(), this.b);
            } catch (JSONException e10) {
                this.f4251a.b(4, e10.getMessage());
            }
        }
    }

    public class b implements e3.p<e3.c, f3.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f4253a;

        public b(d dVar) {
            this.f4253a = dVar;
        }

        @Override // e3.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull f3.f fVar) {
            Log.e(t.f4248d, "Error registering credentials ", fVar);
            if (fVar instanceof h3.a) {
                if (((h3.a) fVar).getDomError() instanceof g3.l) {
                    this.f4253a.b(11, fVar.getMessage());
                    return;
                } else {
                    this.f4253a.b(0, fVar.getMessage());
                    return;
                }
            }
            if (fVar instanceof f3.d) {
                this.f4253a.b(1, fVar.getMessage());
                return;
            }
            if (fVar instanceof f3.g) {
                this.f4253a.b(2, fVar.getMessage());
                return;
            }
            Log.w(t.f4248d, "Unexpected exception type " + fVar.getClass().getName());
            this.f4253a.b(0, fVar.getMessage());
        }

        @Override // e3.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(e3.c cVar) {
            if (cVar instanceof e3.j) {
                this.f4253a.a(((e3.j) cVar).getRegistrationResponseJson(), "FIDO2");
            } else if (cVar instanceof e3.h) {
                this.f4253a.a("", "password");
            } else {
                this.f4253a.b(0, "Unexpected CreateCredentialResponse");
            }
        }
    }

    public static class c implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f4254a;

        public c(d dVar) {
            this.f4254a = dVar;
        }

        @Override // bm.m.a
        public void a(String str, String str2) {
            this.f4254a.a(str, str2);
        }

        @Override // bm.m.a
        public void b(int i10, String str) {
            this.f4254a.b(i10, str);
        }
    }

    public interface d {
        void a(String str, String str2);

        void b(int i10, String str);
    }

    public void b(Activity activity, JSONObject jSONObject, String str, d dVar) {
        try {
            if (str.equals("keystore")) {
                this.b.m(activity, jSONObject, new c(dVar));
                return;
            }
            e3.b bVarE = e(jSONObject, str);
            if (bVarE != null) {
                c(activity, bVarE, dVar, i(activity));
            } else {
                dVar.b(0, "");
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            dVar.b(3, e.getMessage());
        } catch (JSONException e11) {
            e = e11;
            dVar.b(3, e.getMessage());
        }
    }

    public void c(Activity activity, e3.b bVar, d dVar, e3.o oVar) {
        oVar.a(activity, bVar, new CancellationSignal(), this.f4250c, new b(dVar));
    }

    public void d(Activity activity, JSONObject jSONObject, d dVar) {
        try {
            if (jSONObject.optString("credentialType").equals("keystore")) {
                this.b.t(activity, jSONObject, new c(dVar));
            }
        } catch (Exception e10) {
            dVar.b(0, e10.getMessage());
        }
    }

    public e3.b e(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        e3.b gVar;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("CredentialType not set!");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("parameters");
        if (str.equals("FIDO2") && n()) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("publicKey");
            if (th.h.a().x0()) {
                gVar = new e3.i(jSONObject3.toString(), null, false, null, false, jSONObject2.optBoolean("isSilentPasskeyUpgrade"));
            } else {
                gVar = new e3.i(jSONObject3.toString());
            }
        } else {
            gVar = str.equals("password") ? new e3.g(jSONObject2.getString("username"), jSONObject2.getString("password")) : null;
        }
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Invalid create credential request!");
    }

    public void f(Activity activity, JSONObject jSONObject, d dVar) {
        Throwable th2;
        try {
            if (jSONObject.optString("credentialType").equals("keystore")) {
                try {
                    this.b.y(activity, jSONObject, new c(dVar));
                    return;
                } catch (IllegalArgumentException | JSONException e10) {
                    th2 = e10;
                }
            } else {
                k0 k0VarJ = j(jSONObject);
                try {
                    if (k0VarJ != null) {
                        g(activity, k0VarJ, h(jSONObject), dVar, i(activity));
                        return;
                    } else {
                        dVar.b(0, "");
                        return;
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                } catch (JSONException e12) {
                    e = e12;
                }
            }
        } catch (IllegalArgumentException e13) {
            e = e13;
        } catch (JSONException e14) {
            e = e14;
        }
        th2 = e;
        dVar.b(3, th2.getMessage());
    }

    public void g(Activity activity, k0 k0Var, String str, d dVar, e3.o oVar) {
        oVar.d(activity, k0Var, new CancellationSignal(), this.f4250c, new a(dVar, str));
    }

    public String h(JSONObject jSONObject) {
        return (jSONObject.has("credentialType") || !(jSONObject.has("FIDO2") || jSONObject.has("password"))) ? "FIDO2" : "all";
    }

    public final e3.o i(Activity activity) {
        WeakReference<e3.o> weakReference = this.f4249a;
        if (weakReference == null || weakReference.get() == null) {
            this.f4249a = new WeakReference<>(e3.o.create(activity));
        }
        return this.f4249a.get();
    }

    public k0 j(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        o0 o0Var;
        k0.a aVar = new k0.a();
        if (h(jSONObject).equalsIgnoreCase("FIDO2")) {
            jSONObject2 = jSONObject.getJSONObject("parameters");
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("FIDO2");
            if (jSONObject.has("password")) {
                if (th.h.a().s0()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("password");
                    String strOptString = jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.optString("username");
                    HashSet hashSet = new HashSet();
                    if (strOptString.length() > 0) {
                        hashSet.add(strOptString);
                    }
                    o0Var = new o0(hashSet);
                } else {
                    o0Var = new o0();
                }
                aVar.a(o0Var);
            }
            jSONObject2 = jSONObjectOptJSONObject;
        }
        if (jSONObject2 != null && n()) {
            aVar.a(new p0(jSONObject2.getJSONObject("publicKey").toString()));
            if (th.h.a().m3()) {
                aVar.c(jSONObject2.optBoolean("deviceBoundOnly"));
            }
        }
        return aVar.b();
    }

    public boolean k() {
        return n() || m();
    }

    public boolean l(Activity activity) {
        return gk.t.a(activity);
    }

    public boolean m() {
        return true;
    }

    public boolean n() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
