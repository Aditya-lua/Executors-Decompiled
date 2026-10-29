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
import p151gk.C6118k;
import th.C11659h;

/* JADX INFO: renamed from: bm.r */
/* JADX INFO: loaded from: classes2.dex */
public class C1466r {

    /* JADX INFO: renamed from: a */
    public final MessageBus f5681a;

    /* JADX INFO: renamed from: b */
    public final Connection f5682b;

    /* JADX INFO: renamed from: c */
    public final Connection f5683c;

    /* JADX INFO: renamed from: d */
    public final Connection f5684d;

    /* JADX INFO: renamed from: e */
    public final Connection f5685e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Activity> f5686f;

    /* JADX INFO: renamed from: g */
    public final C1468t f5687g;

    /* JADX INFO: renamed from: bm.r$a */
    public class a implements C1468t.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageBus f5688a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(MessageBus messageBus) {
            this.f5688a = messageBus;
        }

        @Override // bm.C1468t.d
        /* JADX INFO: renamed from: a */
        public void mo7518a(String str, String str2) {
            this.f5688a.m16024l("Credentials.registerCredentialsResponse", C1466r.this.m7516w(str));
        }

        @Override // bm.C1468t.d
        /* JADX INFO: renamed from: b */
        public void mo7519b(int i10, String str) {
            this.f5688a.m16024l("Credentials.registerCredentialsResponse", C1466r.this.m7501h(i10, str));
        }
    }

    /* JADX INFO: renamed from: bm.r$b */
    public class b implements C1468t.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageBus f5690a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(MessageBus messageBus) {
            this.f5690a = messageBus;
        }

        @Override // bm.C1468t.d
        /* JADX INFO: renamed from: a */
        public void mo7518a(String str, String str2) {
            this.f5690a.m16024l("Credentials.getCredentialsResponse", C1466r.this.m7500g(str, str2));
        }

        @Override // bm.C1468t.d
        /* JADX INFO: renamed from: b */
        public void mo7519b(int i10, String str) {
            this.f5690a.m16024l("Credentials.getCredentialsResponse", C1466r.this.m7501h(i10, str));
        }
    }

    /* JADX INFO: renamed from: bm.r$c */
    public class c implements C1468t.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageBus f5692a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(MessageBus messageBus) {
            this.f5692a = messageBus;
        }

        @Override // bm.C1468t.d
        /* JADX INFO: renamed from: a */
        public void mo7518a(String str, String str2) {
            this.f5692a.m16024l("Credentials.deleteKeystoreCredentialsResponse", C1466r.this.m7499f(str));
        }

        @Override // bm.C1468t.d
        /* JADX INFO: renamed from: b */
        public void mo7519b(int i10, String str) {
            this.f5692a.m16024l("Credentials.deleteKeystoreCredentialsResponse", C1466r.this.m7501h(i10, str));
        }
    }

    /* JADX INFO: renamed from: bm.r$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static final C1466r f5694a = new C1466r(MessageBus.m16016f());
    }

    /* JADX INFO: renamed from: y */
    public static C1466r m7498y() {
        return d.f5694a;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m7499f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", "");
            jSONObject.put("errorMsg", "");
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("CredentialsProtocol", "JSON exception on registering credentials: ", e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m7500g(String str, String str2) {
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
                Log.e("CredentialsProtocol", "JSON exception on getting credentials: ", e10);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m7501h(int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i10);
            if (str != null) {
                jSONObject.put("errorMsg", str);
            }
            return jSONObject;
        } catch (JSONException unused) {
            Log.e("CredentialsProtocol", "JSON exception when creating error response!");
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: i */
    public final JSONObject m7502i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAvailable", z10);
            jSONObject.put("supportsDeviceBoundOnly", z11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isAvailable", z10);
            jSONObject2.put("supportsDeviceBoundOnly", z11);
            if (C11659h.m43403a().mo43412B0()) {
                jSONObject2.put("supportsSilentPasskeyUpgrade", z13);
            }
            if (C11659h.m43403a().mo43620e3()) {
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
            Log.e("CredentialsProtocol", "JSON exception on checking credentials availability: " + e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m7503j(WeakReference<Activity> weakReference, C1468t c1468t) {
        if (weakReference != null && weakReference.get() != null) {
            return c1468t.m7531k();
        }
        Log.e("CredentialsProtocol", "Activity is not available!");
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: n(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m7507n(JSONObject jSONObject) {
        if (m7503j(this.f5686f, this.f5687g)) {
            m7509p(jSONObject, this.f5686f, this.f5687g, this.f5681a);
        } else {
            this.f5681a.m16024l("Credentials.deleteKeystoreCredentialsResponse", m7501h(5, null));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m7509p(JSONObject jSONObject, WeakReference<Activity> weakReference, C1468t c1468t, MessageBus messageBus) {
        c1468t.m7524d(weakReference.get(), jSONObject, new c(messageBus));
    }

    /* JADX DEBUG: Method merged with bridge method: m(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m7506m(JSONObject jSONObject) {
        Log.v("CredentialsProtocol", "getCredentials request: " + jSONObject.toString());
        if (m7503j(this.f5686f, this.f5687g)) {
            m7511r(jSONObject, this.f5686f, this.f5687g, this.f5681a);
        } else {
            Log.e("CredentialsProtocol", "CredentialManager not available while getting credentials.");
            this.f5681a.m16024l("Credentials.getCredentialsResponse", m7501h(5, null));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m7511r(JSONObject jSONObject, WeakReference<Activity> weakReference, C1468t c1468t, MessageBus messageBus) {
        c1468t.m7526f(weakReference.get(), jSONObject, new b(messageBus));
    }

    /* JADX DEBUG: Method merged with bridge method: k(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void m7504k(JSONObject jSONObject) {
        Log.v("CredentialsProtocol", "isAvailable request: " + jSONObject.toString());
        m7513t(jSONObject, this.f5686f, this.f5687g, this.f5681a);
    }

    /* JADX INFO: renamed from: t */
    public void m7513t(JSONObject jSONObject, WeakReference<Activity> weakReference, C1468t c1468t, MessageBus messageBus) {
        if (!m7503j(weakReference, c1468t)) {
            messageBus.m16024l("Credentials.isAvailableResponse", m7502i(false, false, false, false, false));
            return;
        }
        boolean zM7534n = c1468t.m7534n();
        boolean zM7533m = c1468t.m7533m();
        boolean z10 = false;
        if (C11659h.m43403a().mo43620e3() && zM7534n && c1468t.m7532l(weakReference.get())) {
            z10 = true;
        }
        messageBus.m16024l("Credentials.isAvailableResponse", m7502i(zM7534n, zM7534n, zM7533m, zM7534n, z10));
    }

    /* JADX DEBUG: Method merged with bridge method: l(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m7505l(JSONObject jSONObject) {
        Log.v("CredentialsProtocol", "registerCredentials request: " + jSONObject.toString());
        if (m7503j(this.f5686f, this.f5687g)) {
            m7515v(jSONObject, this.f5686f, this.f5687g, this.f5681a);
        } else {
            Log.e("CredentialsProtocol", "CredentialManager not available while registering credentials.");
            this.f5681a.m16024l("Credentials.registerCredentialsResponse", m7501h(5, null));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m7515v(JSONObject jSONObject, WeakReference<Activity> weakReference, C1468t c1468t, MessageBus messageBus) {
        Activity activity = weakReference.get();
        try {
            if (jSONObject.has("credentialType")) {
                String string = jSONObject.getString("credentialType");
                if (!string.isEmpty()) {
                    if (string.equalsIgnoreCase("FIDO2") && !c1468t.m7534n()) {
                        messageBus.m16024l("Credentials.registerCredentialsResponse", m7501h(5, null));
                        return;
                    }
                    if (!C11659h.m43403a().mo43760y2() || !string.equalsIgnoreCase("password") || !C6118k.m27041a(activity)) {
                        c1468t.m7522b(activity, jSONObject, string, new a(messageBus));
                        return;
                    } else {
                        Log.i("CredentialsProtocol", "Password credentials are not supported on TV.");
                        messageBus.m16024l("Credentials.registerCredentialsResponse", m7501h(5, null));
                        return;
                    }
                }
            }
            messageBus.m16024l("Credentials.registerCredentialsResponse", m7501h(3, "Credential type not specified!"));
        } catch (JSONException unused) {
            messageBus.m16024l("Credentials.registerCredentialsResponse", m7501h(4, null));
        }
    }

    /* JADX INFO: renamed from: w */
    public JSONObject m7516w(String str) {
        JSONObject jSONObject = new JSONObject();
        Log.v("CredentialsProtocol", "register credential result: " + str);
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
                Log.e("CredentialsProtocol", "JSON exception on registering credentials: ", e10);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: x */
    public void m7517x(Activity activity) {
        this.f5686f = new WeakReference<>(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1466r(MessageBus messageBus) {
        this.f5681a = messageBus;
        this.f5687g = new C1468t();
        this.f5682b = messageBus.m16030t("Credentials.isAvailableRequest", new Callback() { // from class: bm.n
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f5677a.m7504k(jSONObject);
            }
        });
        this.f5683c = messageBus.m16030t("Credentials.registerCredentialsRequest", new Callback() { // from class: bm.o
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f5678a.m7505l(jSONObject);
            }
        });
        this.f5684d = messageBus.m16030t("Credentials.getCredentialsRequest", new Callback() { // from class: bm.p
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f5679a.m7506m(jSONObject);
            }
        });
        this.f5685e = messageBus.m16030t("Credentials.deleteKeystoreCredentialsRequest", new Callback() { // from class: bm.q
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f5680a.m7507n(jSONObject);
            }
        });
    }
}
