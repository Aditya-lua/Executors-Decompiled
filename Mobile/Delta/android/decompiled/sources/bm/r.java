package bm;

import android.app.Activity;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f4237h = "r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f4238a;
    public final Connection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Connection f4239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Connection f4240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Connection f4241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<Activity> f4242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f4243g;

    public class a implements t.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MessageBus f4244a;

        public a(MessageBus messageBus) {
            this.f4244a = messageBus;
        }

        @Override // bm.t.d
        public void a(String str, String str2) {
            this.f4244a.l("Credentials.registerCredentialsResponse", r.this.w(str));
        }

        @Override // bm.t.d
        public void b(int i10, String str) {
            this.f4244a.l("Credentials.registerCredentialsResponse", r.this.h(i10, str));
        }
    }

    public class b implements t.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MessageBus f4245a;

        public b(MessageBus messageBus) {
            this.f4245a = messageBus;
        }

        @Override // bm.t.d
        public void a(String str, String str2) {
            this.f4245a.l("Credentials.getCredentialsResponse", r.this.g(str, str2));
        }

        @Override // bm.t.d
        public void b(int i10, String str) {
            this.f4245a.l("Credentials.getCredentialsResponse", r.this.h(i10, str));
        }
    }

    public class c implements t.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MessageBus f4246a;

        public c(MessageBus messageBus) {
            this.f4246a = messageBus;
        }

        @Override // bm.t.d
        public void a(String str, String str2) {
            this.f4246a.l("Credentials.deleteKeystoreCredentialsResponse", r.this.f(str));
        }

        @Override // bm.t.d
        public void b(int i10, String str) {
            this.f4246a.l("Credentials.deleteKeystoreCredentialsResponse", r.this.h(i10, str));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f4247a = new r(MessageBus.f());
    }

    public static r y() {
        return d.f4247a;
    }

    public JSONObject f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", "");
            jSONObject.put("errorMsg", "");
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(f4237h, "JSON exception on registering credentials: ", e10);
            return jSONObject;
        }
    }

    public JSONObject g(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject2.has("id")) {
                    jSONObject3.put("id", jSONObject2.getString("id"));
                }
                if (jSONObject2.has("rawId")) {
                    jSONObject3.put("rawId", jSONObject2.getString("rawId"));
                }
                if (jSONObject2.has(Payload.TYPE)) {
                    jSONObject3.put(Payload.TYPE, jSONObject2.getString(Payload.TYPE));
                }
                if (jSONObject2.has(Payload.RESPONSE)) {
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = jSONObject2.getJSONObject(Payload.RESPONSE);
                    if (jSONObject5.has("authenticatorData")) {
                        jSONObject4.put("authenticatorData", jSONObject5.getString("authenticatorData"));
                    }
                    if (jSONObject5.has("clientDataJSON")) {
                        jSONObject4.put("clientDataJSON", jSONObject5.getString("clientDataJSON"));
                    }
                    if (jSONObject5.has("signature")) {
                        jSONObject4.put("signature", jSONObject5.getString("signature"));
                    }
                    if (jSONObject5.has("userHandle")) {
                        jSONObject4.put("userHandle", jSONObject5.getString("userHandle"));
                    }
                    jSONObject3.put(Payload.RESPONSE, jSONObject4);
                }
                if (str2 != null && str2.equalsIgnoreCase("all")) {
                    JSONObject jSONObject6 = new JSONObject();
                    if (jSONObject2.has("username")) {
                        jSONObject6.put("username", jSONObject2.getString("username"));
                    }
                    if (jSONObject2.has("password")) {
                        jSONObject6.put("password", jSONObject2.getString("password"));
                    }
                    if (jSONObject6.length() > 0) {
                        jSONObject.put("credentialType", "password");
                        jSONObject.put(Payload.RESPONSE, jSONObject6);
                        return jSONObject;
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject.put("credentialType", "FIDO2");
                        jSONObject.put(Payload.RESPONSE, jSONObject3);
                        return jSONObject;
                    }
                } else {
                    if (str2 == null || !str2.equalsIgnoreCase("keystore")) {
                        return jSONObject3;
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    JSONObject jSONObject8 = jSONObject2.getJSONObject("parameters");
                    if (jSONObject8.has("username")) {
                        jSONObject7.put("username", jSONObject8.getString("username"));
                    }
                    if (jSONObject8.has("password")) {
                        jSONObject7.put("password", jSONObject8.getString("password"));
                    }
                    if (jSONObject8.has("userId")) {
                        jSONObject7.put("userId", jSONObject8.getString("userId"));
                    }
                    if (jSONObject8.has("experimentGroup")) {
                        jSONObject7.put("experimentGroup", jSONObject8.getString("experimentGroup"));
                    }
                    if (jSONObject7.length() > 0) {
                        jSONObject7.put("errorCode", "");
                        jSONObject7.put("errorMsg", "");
                        Object objPut = new JSONArray().put(jSONObject7);
                        jSONObject.put("credentialType", "keystore");
                        jSONObject.put(Payload.RESPONSE, objPut);
                        return jSONObject;
                    }
                }
            } catch (JSONException e10) {
                Log.e(f4237h, "JSON exception on getting credentials: ", e10);
            }
        }
        return jSONObject;
    }

    public final JSONObject h(int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i10);
            if (str != null) {
                jSONObject.put("errorMsg", str);
            }
            return jSONObject;
        } catch (JSONException unused) {
            Log.e(f4237h, "JSON exception when creating error response!");
            return jSONObject;
        }
    }

    public final JSONObject i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAvailable", z10);
            jSONObject.put("supportsDeviceBoundOnly", z11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isAvailable", z10);
            jSONObject2.put("supportsDeviceBoundOnly", z11);
            if (th.h.a().x0()) {
                jSONObject2.put("supportsSilentPasskeyUpgrade", z13);
            }
            if (th.h.a().Y2()) {
                jSONObject2.put("supportsPasskeyCreationOnDevice", z14);
            }
            jSONObject.put("FIDO2", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("isAvailable", z12);
            jSONObject.put("password", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("isAvailable", true);
            jSONObject.put("keystore", jSONObject4);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(f4237h, "JSON exception on checking credentials availability: " + e10);
            return jSONObject;
        }
    }

    public boolean j(WeakReference<Activity> weakReference, t tVar) {
        if (weakReference != null && weakReference.get() != null) {
            return tVar.k();
        }
        Log.e(f4237h, "Activity is not available!");
        return false;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void n(JSONObject jSONObject) {
        if (j(this.f4242f, this.f4243g)) {
            p(jSONObject, this.f4242f, this.f4243g, this.f4238a);
        } else {
            this.f4238a.l("Credentials.deleteKeystoreCredentialsResponse", h(5, null));
        }
    }

    public void p(JSONObject jSONObject, WeakReference<Activity> weakReference, t tVar, MessageBus messageBus) {
        tVar.d(weakReference.get(), jSONObject, new c(messageBus));
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m(JSONObject jSONObject) {
        String str = f4237h;
        Log.v(str, "getCredentials request: " + jSONObject.toString());
        if (j(this.f4242f, this.f4243g)) {
            r(jSONObject, this.f4242f, this.f4243g, this.f4238a);
        } else {
            Log.e(str, "CredentialManager not available while getting credentials.");
            this.f4238a.l("Credentials.getCredentialsResponse", h(5, null));
        }
    }

    public void r(JSONObject jSONObject, WeakReference<Activity> weakReference, t tVar, MessageBus messageBus) {
        tVar.f(weakReference.get(), jSONObject, new b(messageBus));
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void k(JSONObject jSONObject) {
        Log.v(f4237h, "isAvailable request: " + jSONObject.toString());
        t(jSONObject, this.f4242f, this.f4243g, this.f4238a);
    }

    public void t(JSONObject jSONObject, WeakReference<Activity> weakReference, t tVar, MessageBus messageBus) {
        if (!j(weakReference, tVar)) {
            messageBus.l("Credentials.isAvailableResponse", i(false, false, false, false, false));
            return;
        }
        boolean zN = tVar.n();
        boolean zM = tVar.m();
        boolean z10 = false;
        if (th.h.a().Y2() && zN && tVar.l(weakReference.get())) {
            z10 = true;
        }
        messageBus.l("Credentials.isAvailableResponse", i(zN, zN, zM, zN, z10));
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void l(JSONObject jSONObject) {
        String str = f4237h;
        Log.v(str, "registerCredentials request: " + jSONObject.toString());
        if (j(this.f4242f, this.f4243g)) {
            v(jSONObject, this.f4242f, this.f4243g, this.f4238a);
        } else {
            Log.e(str, "CredentialManager not available while registering credentials.");
            this.f4238a.l("Credentials.registerCredentialsResponse", h(5, null));
        }
    }

    public void v(JSONObject jSONObject, WeakReference<Activity> weakReference, t tVar, MessageBus messageBus) {
        Activity activity = weakReference.get();
        try {
            if (jSONObject.has("credentialType")) {
                String string = jSONObject.getString("credentialType");
                if (!string.isEmpty()) {
                    if (!string.equalsIgnoreCase("FIDO2") || tVar.n()) {
                        tVar.b(activity, jSONObject, string, new a(messageBus));
                        return;
                    } else {
                        messageBus.l("Credentials.registerCredentialsResponse", h(5, null));
                        return;
                    }
                }
            }
            messageBus.l("Credentials.registerCredentialsResponse", h(3, "Credential type not specified!"));
        } catch (JSONException unused) {
            messageBus.l("Credentials.registerCredentialsResponse", h(4, null));
        }
    }

    public JSONObject w(String str) {
        JSONObject jSONObject = new JSONObject();
        Log.v(f4237h, "register credential result: " + str);
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("id")) {
                    jSONObject.put("id", jSONObject2.getString("id"));
                }
                if (jSONObject2.has("rawId")) {
                    jSONObject.put("rawId", jSONObject2.getString("rawId"));
                }
                if (jSONObject2.has(Payload.TYPE)) {
                    jSONObject.put(Payload.TYPE, jSONObject2.getString(Payload.TYPE));
                }
                if (jSONObject2.has(Payload.RESPONSE)) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = jSONObject2.getJSONObject(Payload.RESPONSE);
                    if (jSONObject4.has("clientDataJSON")) {
                        jSONObject3.put("clientDataJSON", jSONObject4.getString("clientDataJSON"));
                    }
                    if (jSONObject4.has("attestationObject")) {
                        jSONObject3.put("attestationObject", jSONObject4.getString("attestationObject"));
                    }
                    jSONObject.put(Payload.RESPONSE, jSONObject3);
                }
                if (jSONObject2.has("authenticatorAttachment")) {
                    jSONObject.put("authenticatorAttachment", jSONObject2.getString("authenticatorAttachment"));
                    return jSONObject;
                }
            } catch (JSONException e10) {
                Log.e(f4237h, "JSON exception on registering credentials: ", e10);
            }
        }
        return jSONObject;
    }

    public void x(Activity activity) {
        this.f4242f = new WeakReference<>(activity);
    }

    public r(MessageBus messageBus) {
        this.f4238a = messageBus;
        this.f4243g = new t();
        this.b = messageBus.t("Credentials.isAvailableRequest", new Callback() { // from class: bm.n
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f4233a.k(jSONObject);
            }
        });
        this.f4239c = messageBus.t("Credentials.registerCredentialsRequest", new Callback() { // from class: bm.o
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f4234a.l(jSONObject);
            }
        });
        this.f4240d = messageBus.t("Credentials.getCredentialsRequest", new Callback() { // from class: bm.p
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f4235a.m(jSONObject);
            }
        });
        this.f4241e = messageBus.t("Credentials.deleteKeystoreCredentialsRequest", new Callback() { // from class: bm.q
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f4236a.n(jSONObject);
            }
        });
    }
}
