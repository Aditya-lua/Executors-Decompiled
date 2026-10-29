package bm;

import android.app.Activity;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p092e3.AbstractC4751b;
import p092e3.AbstractC4753c;
import p092e3.AbstractC4773m;
import p092e3.C4761g;
import p092e3.C4763h;
import p092e3.C4765i;
import p092e3.C4767j;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.C4778o0;
import p092e3.C4780p0;
import p092e3.C4784r0;
import p092e3.C4788t0;
import p092e3.InterfaceC4777o;
import p092e3.InterfaceC4779p;
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p117f3.C5330d;
import p117f3.C5333g;
import p117f3.C5338l;
import p117f3.C5341o;
import p117f3.C5344r;
import p117f3.C5345s;
import p143g3.C5987l;
import p151gk.C6128u;
import p158h3.C6272a;
import th.C11659h;

/* JADX INFO: renamed from: bm.t */
/* JADX INFO: loaded from: classes2.dex */
public class C1468t {

    /* JADX INFO: renamed from: d */
    public static final String f5695d = "t";

    /* JADX INFO: renamed from: a */
    public WeakReference<InterfaceC4777o> f5696a;

    /* JADX INFO: renamed from: b */
    public final C1461m f5697b = new C1461m();

    /* JADX INFO: renamed from: c */
    public final ExecutorService f5698c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: bm.t$a */
    public class a implements InterfaceC4779p<C4772l0, AbstractC5340n> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f5699a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5700b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(d dVar, String str) {
            this.f5699a = dVar;
            this.f5700b = str;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p092e3.InterfaceC4779p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7535a(@NonNull AbstractC5340n abstractC5340n) {
            Log.e(C1468t.f5695d, "Error getting credentials: ", abstractC5340n);
            if (abstractC5340n instanceof C5341o) {
                this.f5699a.mo7519b(2, abstractC5340n.getMessage());
                return;
            }
            if (abstractC5340n instanceof C5338l) {
                this.f5699a.mo7519b(1, abstractC5340n.getMessage());
                return;
            }
            if (abstractC5340n instanceof C5345s) {
                this.f5699a.mo7519b(6, abstractC5340n.getMessage());
            } else if (abstractC5340n instanceof C5344r) {
                this.f5699a.mo7519b(7, abstractC5340n.getMessage());
            } else {
                this.f5699a.mo7519b(0, abstractC5340n.getMessage());
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // p092e3.InterfaceC4779p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(C4772l0 c4772l0) {
            AbstractC4773m abstractC4773mM23198a = c4772l0.getCredential();
            if (abstractC4773mM23198a instanceof C4788t0) {
                this.f5699a.mo7518a(((C4788t0) abstractC4773mM23198a).getAuthenticationResponseJson(), this.f5700b);
                return;
            }
            if (!(abstractC4773mM23198a instanceof C4784r0)) {
                this.f5699a.mo7519b(0, "Unexpected GetCredentialResponse");
                return;
            }
            C4784r0 c4784r0 = (C4784r0) abstractC4773mM23198a;
            String strM23223c = c4784r0.getId();
            String strM23224d = c4784r0.getPassword();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("username", strM23223c);
                jSONObject.put("password", strM23224d);
                this.f5699a.mo7518a(jSONObject.toString(), this.f5700b);
            } catch (JSONException e10) {
                this.f5699a.mo7519b(4, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: bm.t$b */
    public class b implements InterfaceC4779p<AbstractC4753c, AbstractC5332f> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f5702a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(d dVar) {
            this.f5702a = dVar;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p092e3.InterfaceC4779p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7535a(@NonNull AbstractC5332f abstractC5332f) {
            Log.e(C1468t.f5695d, "Error registering credentials ", abstractC5332f);
            if (abstractC5332f instanceof C6272a) {
                if (((C6272a) abstractC5332f).getDomError() instanceof C5987l) {
                    this.f5702a.mo7519b(11, abstractC5332f.getMessage());
                    return;
                } else {
                    this.f5702a.mo7519b(0, abstractC5332f.getMessage());
                    return;
                }
            }
            if (abstractC5332f instanceof C5330d) {
                this.f5702a.mo7519b(1, abstractC5332f.getMessage());
                return;
            }
            if (abstractC5332f instanceof C5333g) {
                this.f5702a.mo7519b(2, abstractC5332f.getMessage());
                return;
            }
            Log.w(C1468t.f5695d, "Unexpected exception type " + abstractC5332f.getClass().getName());
            this.f5702a.mo7519b(0, abstractC5332f.getMessage());
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // p092e3.InterfaceC4779p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(AbstractC4753c abstractC4753c) {
            if (abstractC4753c instanceof C4767j) {
                this.f5702a.mo7518a(((C4767j) abstractC4753c).getRegistrationResponseJson(), "FIDO2");
            } else if (abstractC4753c instanceof C4763h) {
                this.f5702a.mo7518a("", "password");
            } else {
                this.f5702a.mo7519b(0, "Unexpected CreateCredentialResponse");
            }
        }
    }

    /* JADX INFO: renamed from: bm.t$c */
    public static class c implements C1461m.a {

        /* JADX INFO: renamed from: a */
        public final d f5704a;

        public c(d dVar) {
            this.f5704a = dVar;
        }

        @Override // bm.C1461m.a
        /* JADX INFO: renamed from: a */
        public void mo7490a(String str, String str2) {
            this.f5704a.mo7518a(str, str2);
        }

        @Override // bm.C1461m.a
        /* JADX INFO: renamed from: b */
        public void mo7491b(int i10, String str) {
            this.f5704a.mo7519b(i10, str);
        }
    }

    /* JADX INFO: renamed from: bm.t$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo7518a(String str, String str2);

        /* JADX INFO: renamed from: b */
        void mo7519b(int i10, String str);
    }

    /* JADX INFO: renamed from: b */
    public void m7522b(Activity activity, JSONObject jSONObject, String str, d dVar) {
        try {
            if (str.equals("keystore")) {
                this.f5697b.m7486m(activity, jSONObject, new c(dVar));
                return;
            }
            AbstractC4751b abstractC4751bM7525e = m7525e(jSONObject, str);
            if (abstractC4751bM7525e != null) {
                m7523c(activity, abstractC4751bM7525e, dVar, m7529i(activity));
            } else {
                dVar.mo7519b(0, "");
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            dVar.mo7519b(3, e.getMessage());
        } catch (JSONException e11) {
            e = e11;
            dVar.mo7519b(3, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7523c(Activity activity, AbstractC4751b abstractC4751b, d dVar, InterfaceC4777o interfaceC4777o) {
        interfaceC4777o.mo23207a(activity, abstractC4751b, new CancellationSignal(), this.f5698c, new b(dVar));
    }

    /* JADX INFO: renamed from: d */
    public void m7524d(Activity activity, JSONObject jSONObject, d dVar) {
        try {
            if (jSONObject.optString("credentialType").equals("keystore")) {
                this.f5697b.m7487t(activity, jSONObject, new c(dVar));
            }
        } catch (Exception e10) {
            dVar.mo7519b(0, e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public AbstractC4751b m7525e(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        AbstractC4751b c4761g;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("CredentialType not set!");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("parameters");
        if (str.equals("FIDO2") && m7534n()) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("publicKey");
            if (C11659h.m43403a().mo43412B0()) {
                c4761g = new C4765i(jSONObject3.toString(), null, false, null, false, jSONObject2.optBoolean("isSilentPasskeyUpgrade"));
            } else {
                c4761g = new C4765i(jSONObject3.toString());
            }
        } else {
            c4761g = str.equals("password") ? new C4761g(jSONObject2.getString("username"), jSONObject2.getString("password")) : null;
        }
        if (c4761g != null) {
            return c4761g;
        }
        throw new IllegalArgumentException("Invalid create credential request!");
    }

    /* JADX INFO: renamed from: f */
    public void m7526f(Activity activity, JSONObject jSONObject, d dVar) {
        Throwable th2;
        try {
            if (jSONObject.optString("credentialType").equals("keystore")) {
                try {
                    this.f5697b.m7489y(activity, jSONObject, new c(dVar));
                    return;
                } catch (IllegalArgumentException | JSONException e10) {
                    th2 = e10;
                }
            } else {
                C4770k0 c4770k0M7530j = m7530j(jSONObject);
                try {
                    if (c4770k0M7530j != null) {
                        m7527g(activity, c4770k0M7530j, m7528h(jSONObject), dVar, m7529i(activity));
                        return;
                    } else {
                        dVar.mo7519b(0, "");
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
        dVar.mo7519b(3, th2.getMessage());
    }

    /* JADX INFO: renamed from: g */
    public void m7527g(Activity activity, C4770k0 c4770k0, String str, d dVar, InterfaceC4777o interfaceC4777o) {
        interfaceC4777o.mo23209d(activity, c4770k0, new CancellationSignal(), this.f5698c, new a(dVar, str));
    }

    /* JADX INFO: renamed from: h */
    public String m7528h(JSONObject jSONObject) {
        return (jSONObject.has("credentialType") || !(jSONObject.has("FIDO2") || jSONObject.has("password"))) ? "FIDO2" : "all";
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC4777o m7529i(Activity activity) {
        WeakReference<InterfaceC4777o> weakReference = this.f5696a;
        if (weakReference == null || weakReference.get() == null) {
            this.f5696a = new WeakReference<>(InterfaceC4777o.create(activity));
        }
        return this.f5696a.get();
    }

    /* JADX INFO: renamed from: j */
    public C4770k0 m7530j(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        C4778o0 c4778o0;
        C4770k0.a aVar = new C4770k0.a();
        if (m7528h(jSONObject).equalsIgnoreCase("FIDO2")) {
            jSONObject2 = jSONObject.getJSONObject("parameters");
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("FIDO2");
            if (jSONObject.has("password")) {
                if (C11659h.m43403a().mo43744w0()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("password");
                    String strOptString = jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.optString("username");
                    HashSet hashSet = new HashSet();
                    if (strOptString.length() > 0) {
                        hashSet.add(strOptString);
                    }
                    c4778o0 = new C4778o0(hashSet);
                } else {
                    c4778o0 = new C4778o0();
                }
                aVar.m23193a(c4778o0);
            }
            jSONObject2 = jSONObjectOptJSONObject;
        }
        if (jSONObject2 != null && m7534n()) {
            aVar.m23193a(new C4780p0(jSONObject2.getJSONObject("publicKey").toString()));
            if (C11659h.m43403a().mo43719s3()) {
                aVar.m23195c(jSONObject2.optBoolean("deviceBoundOnly"));
            }
        }
        return aVar.m23194b();
    }

    /* JADX INFO: renamed from: k */
    public boolean m7531k() {
        return m7534n() || m7533m();
    }

    /* JADX INFO: renamed from: l */
    public boolean m7532l(Activity activity) {
        return C6128u.m27096a(activity);
    }

    /* JADX INFO: renamed from: m */
    public boolean m7533m() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m7534n() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
