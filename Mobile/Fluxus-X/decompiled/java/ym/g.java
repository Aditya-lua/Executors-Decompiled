package ym;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.universalapp.linking.JNILinkingProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MakeRequestContract;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.messagebus.NewCallback;
import com.roblox.universalapp.messagebus.RequestHandler;
import com.roblox.universalapp.messagebus.RequestHandlerContract;
import com.roblox.universalapp.messagebus.Response;
import com.roblox.universalapp.messagebus.SubscriptionContract;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f37944a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<Connection> f37946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f37947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Intent> f37948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f37950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JSONObject f37951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Optional<i> f37952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Optional<h> f37953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ym.i f37954l;

    public class a implements RequestHandler {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandler
        public Response run(JSONObject jSONObject) {
            return g.this.J(jSONObject);
        }
    }

    public class b implements RequestHandler {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandler
        public Response run(JSONObject jSONObject) {
            return g.this.K(jSONObject);
        }
    }

    public class c implements RequestHandler {
        public c() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandler
        public Response run(JSONObject jSONObject) {
            return g.this.v(jSONObject);
        }
    }

    public class d implements RequestHandler {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandler
        public Response run(JSONObject jSONObject) {
            return g.this.u(jSONObject);
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            g.this.E(jSONObject);
        }
    }

    public class f implements Callback {
        public f() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            g.this.t(jSONObject);
        }
    }

    /* JADX INFO: renamed from: ym.g$g, reason: collision with other inner class name */
    public class C0772g implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f37961a;

        public C0772g(k kVar) {
            this.f37961a = kVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            try {
                this.f37961a.a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to check whether this URL is registered due to: " + e10.getMessage());
            }
        }
    }

    public interface h {
        void a(JSONObject jSONObject);
    }

    public interface i {
        void a(boolean z10);
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f37962a = new g();
    }

    public interface k {
        void a(boolean z10);
    }

    public static g G() {
        return j.f37962a;
    }

    public static /* synthetic */ boolean a(k kVar, JSONObject jSONObject) {
        try {
            kVar.a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
            return true;
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to check whether this URL is registered due to: " + e10.getMessage());
            return true;
        }
    }

    public static /* synthetic */ boolean b(k kVar, JSONObject jSONObject) {
        try {
            kVar.a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
            return true;
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to check whether this URL is registered due to: " + e10.getMessage());
            return true;
        }
    }

    public void A(String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
    }

    public void B(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void C(JSONObject jSONObject) {
        synchronized (this.f37950h) {
            this.f37951i = jSONObject;
        }
    }

    public void D(Intent intent) {
        this.f37948f.set(intent);
    }

    public void E(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.getBoolean(JNILinkingProtocol.getEnableTrackingKey());
            if (this.f37952j.isPresent()) {
                this.f37952j.get().a(z10);
            } else {
                Log.e("LinkingProtocol", "Recevied attempt to toggle tracking with no implementation available.");
            }
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Received exception while trying to check enableTracking value: " + e10.toString());
        }
    }

    public void F(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUIDKey(), str);
            this.f37944a.publish(JNILinkingProtocol.getSetUIDId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for UID detection failed with error: " + e10.getMessage());
        }
    }

    public void H(Context context) {
        if (this.f37945c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Already started.");
            return;
        }
        this.f37945c = true;
        if (!this.f37949g) {
            if (bi.h.a().s()) {
                this.f37944a.setRequestHandler(new RequestHandlerContract(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new RequestHandler() { // from class: ym.d
                    @Override // com.roblox.universalapp.messagebus.RequestHandler
                    public final Response run(JSONObject jSONObject) {
                        return this.f37941a.v(jSONObject);
                    }
                }));
            } else {
                this.f37944a.setRequestHandler(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new c());
            }
        }
        if (bi.h.a().p4()) {
            this.f37944a.setRequestHandler(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsTrackingAvailableId(), new d());
            this.f37946d.add(this.f37944a.subscribe(MessageBus.getMessageId(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getSetTrackingEnabledId()), new e()));
        }
        this.f37946d.add(this.f37944a.subscribe(MessageBus.getMessageId("Linking", "adConsentResolved"), new f()));
        this.f37949g = true;
    }

    public void I() {
        if (!this.f37945c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Not started.");
            return;
        }
        int i10 = 0;
        this.f37945c = false;
        ArrayList<Connection> arrayList = this.f37946d;
        int size = arrayList.size();
        while (i10 < size) {
            Connection connection = arrayList.get(i10);
            i10++;
            connection.disconnect();
        }
        this.f37946d.clear();
    }

    public Response J(JSONObject jSONObject) {
        Response response = new Response();
        JSONObject jSONObject2 = new JSONObject();
        Log.d("LinkingProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        try {
            jSONObject2.put("support", true);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
        }
        response.params = jSONObject2;
        return response;
    }

    public Response K(JSONObject jSONObject) {
        Intent intent;
        Log.d("LinkingProtocol", "switchToSettingsApp: " + jSONObject.toString());
        Response response = new Response();
        new JSONObject();
        try {
            if (bi.h.a().Z1()) {
                intent = null;
                if (jSONObject.has("route")) {
                    String string = jSONObject.getString("route");
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1367751899) {
                        if (iHashCode != -567451565) {
                            if (iHashCode == 1370921258 && string.equals("microphone")) {
                                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent2.setData(Uri.fromParts("package", this.b.getPackageName(), null));
                                intent = intent2;
                            }
                        } else if (string.equals("contacts")) {
                            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent3.setData(Uri.fromParts("package", this.b.getPackageName(), null));
                            intent = intent3;
                        }
                    } else if (string.equals("camera")) {
                        Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent4.setData(Uri.fromParts("package", this.b.getPackageName(), null));
                        intent = intent4;
                    }
                }
                if (intent == null) {
                    intent = new Intent("android.settings.SETTINGS");
                }
            } else {
                intent = new Intent("android.settings.SETTINGS");
            }
            intent.setFlags(268435456);
            this.b.startActivity(intent);
            return response;
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found exception while handling switch to settings app request Activity Not Found: " + e10.toString());
            return response;
        } catch (Exception e11) {
            Log.e("LinkingProtocol", "Exception while handling switch to settings app request: " + e11.toString());
            return response;
        }
    }

    public void L(JSONObject jSONObject, String str) {
        synchronized (this.f37950h) {
            if (jSONObject != null) {
                if (jSONObject == this.f37951i) {
                    try {
                        jSONObject.put("url", str);
                    } catch (JSONException e10) {
                        Log.e("LinkingProtocol", "Failed to update DLIC seed URL: " + e10.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public void f(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        String strNativeCreateAtIngress = JNILinkingProtocol.nativeCreateAtIngress(str, str2);
        if (strNativeCreateAtIngress != null) {
            try {
                if (strNativeCreateAtIngress.isEmpty()) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(strNativeCreateAtIngress);
                }
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                C(null);
                return;
            }
        } else {
            jSONObject = null;
        }
        C(jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void g(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
        if (bi.h.a().m5()) {
            if (bi.h.a().e()) {
                f(str, str2);
                return;
            }
            String strNativeCreateAtIngress = JNILinkingProtocol.nativeCreateAtIngress(str, str2);
            if (strNativeCreateAtIngress != null) {
                try {
                    if (strNativeCreateAtIngress.isEmpty()) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(strNativeCreateAtIngress);
                    }
                } catch (JSONException e10) {
                    Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                    C(null);
                    return;
                }
            } else {
                jSONObject = null;
            }
            C(jSONObject);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void h(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
        if (bi.h.a().m5()) {
            if (bi.h.a().e()) {
                f(str, str2);
                return;
            }
            String strNativeCreateAtIngress = JNILinkingProtocol.nativeCreateAtIngress(str, str2);
            if (strNativeCreateAtIngress != null) {
                try {
                    if (strNativeCreateAtIngress.isEmpty()) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(strNativeCreateAtIngress);
                    }
                } catch (JSONException e10) {
                    Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                    C(null);
                    return;
                }
            } else {
                jSONObject = null;
            }
            C(jSONObject);
        }
    }

    public final void i(JSONObject jSONObject) {
        synchronized (this.f37950h) {
            try {
                JSONObject jSONObject2 = this.f37951i;
                if (jSONObject2 != null) {
                    jSONObject.put("dlicSeed", jSONObject2);
                    this.f37951i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    public JSONObject j(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str != null && str2 != null) {
            z(str, str2);
            String strNativeCreateAtIngressWithOrigin = JNILinkingProtocol.nativeCreateAtIngressWithOrigin(str, str2, z10);
            if (strNativeCreateAtIngressWithOrigin != null) {
                try {
                    if (strNativeCreateAtIngressWithOrigin.isEmpty()) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(strNativeCreateAtIngressWithOrigin);
                    }
                } catch (JSONException e10) {
                    Log.e("LinkingProtocol", "Failed to parse DLIC seed JSON: " + e10.getMessage());
                    C(null);
                }
            } else {
                jSONObject = null;
            }
            C(jSONObject);
            return jSONObject;
        }
        return null;
    }

    public String k(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return JNILinkingProtocol.nativeCreateInternalDlic(str, str2);
    }

    public void l(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (bi.h.a().f4() && q(JNILinkingProtocol.nativeDlicGetUrl(str))) {
            JNILinkingProtocol.nativeDlicSetTerminated(str, "success", "explicit_report", "external_browser_handoff");
        } else {
            JNILinkingProtocol.nativeDetectDlic(str);
        }
    }

    public void m(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            i(jSONObject);
            if (bi.h.a().f4() && q(str)) {
                return;
            }
            this.f37944a.publish(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void n(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            if (str2 != null) {
                jSONObject.put(JNILinkingProtocol.getAttributionUrlKey(), str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                jSONObject.put("attributionAdName", str3);
            }
            i(jSONObject);
            this.f37944a.publish(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void o(String str, String str2, String str3) {
        if (str == null || str.isEmpty() || str2 == null || str3 == null) {
            return;
        }
        JNILinkingProtocol.nativeDlicSetTerminated(str, str2, "explicit_report", str3);
    }

    public void p(String str, k kVar) {
        if (bi.h.a().f4() && r(JNILinkingProtocol.nativeDlicGetUrl(str), false)) {
            kVar.a(true);
        } else {
            kVar.a(JNILinkingProtocol.nativeEngineShouldHandleDlic(str));
        }
    }

    public final boolean q(String str) {
        return r(str, true);
    }

    public final boolean r(String str, boolean z10) {
        String queryParameter;
        if (str == null || !str.regionMatches(true, 0, "roblox://open-external?", 0, 23) || (queryParameter = Uri.parse(str).getQueryParameter("url")) == null || !ym.a.d(queryParameter)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        new ym.a("LinkingProtocol").g(this.b, queryParameter);
        return true;
    }

    public void s(String str, final k kVar) {
        if (bi.h.a().f4() && r(str, false)) {
            kVar.a(true);
            return;
        }
        if (bi.h.a().F()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
                this.f37944a.makeRequest(new MakeRequestContract(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsURLRegisteredId(), jSONObject, new NewCallback() { // from class: ym.e
                    @Override // com.roblox.universalapp.messagebus.NewCallback
                    public final boolean run(JSONObject jSONObject2) {
                        return g.a(kVar, jSONObject2);
                    }
                }));
                return;
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e10.getMessage());
                return;
            }
        }
        if (bi.h.a().s()) {
            this.f37947e = this.f37944a.subscribe(new SubscriptionContract(JNILinkingProtocol.getIsURLRegisteredResponseId(), new NewCallback() { // from class: ym.f
                @Override // com.roblox.universalapp.messagebus.NewCallback
                public final boolean run(JSONObject jSONObject2) {
                    return g.b(kVar, jSONObject2);
                }
            }));
        } else {
            this.f37947e = this.f37944a.subscribe(JNILinkingProtocol.getIsURLRegisteredResponseId(), new C0772g(kVar), true);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(JNILinkingProtocol.getUrlKey(), str);
            this.f37944a.publish(JNILinkingProtocol.getIsURLRegisteredRequestId(), jSONObject2);
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e11.getMessage());
        }
    }

    public final void t(JSONObject jSONObject) {
        if (this.f37953k.isPresent()) {
            this.f37953k.get().a(jSONObject);
        } else {
            Log.e("LinkingProtocol", "Received adConsentResolved with no implementation available.");
        }
    }

    public Response u(JSONObject jSONObject) {
        Response response = new Response();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(JNILinkingProtocol.getTrackingAvailableKey(), this.f37954l.a());
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to write failure JSON", e10);
        }
        response.params = jSONObject2;
        return response;
    }

    public final Response v(JSONObject jSONObject) {
        Response response = new Response();
        JSONObject jSONObject2 = new JSONObject();
        try {
            String string = jSONObject.getString(JNILinkingProtocol.getUrlKey());
            Log.i("LinkingProtocol", "Opening URL: " + string);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            this.b.startActivity(intent);
            jSONObject2.put(JNILinkingProtocol.getSuccessKey(), true);
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found: " + e10.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            } catch (JSONException unused) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e10.getMessage());
            }
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Retrieving URL from JSON params for Open URL Request failed with error: " + e11.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            } catch (JSONException unused2) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e11.getMessage());
            }
        }
        response.params = jSONObject2;
        return response;
    }

    public void w() {
        Intent andSet = this.f37948f.getAndSet(null);
        if (andSet != null) {
            m(andSet.getDataString());
        }
    }

    public void x(h hVar) {
        this.f37953k = Optional.of(hVar);
    }

    public void y(i iVar) {
        this.f37952j = Optional.of(iVar);
    }

    public void z(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
    }

    public g() {
        MessageBus messageBus = MessageBus.getInstance();
        this.f37944a = messageBus;
        this.f37945c = false;
        this.f37946d = new ArrayList<>();
        this.f37947e = null;
        this.f37948f = new AtomicReference<>(null);
        this.f37949g = false;
        this.f37950h = new Object();
        this.f37951i = null;
        if (bi.h.a().s()) {
            messageBus.setRequestHandler(new RequestHandlerContract("Linking", "supportsSwitchToSettingsApp", new RequestHandler() { // from class: ym.b
                @Override // com.roblox.universalapp.messagebus.RequestHandler
                public final Response run(JSONObject jSONObject) {
                    return this.f37939a.J(jSONObject);
                }
            }));
            messageBus.setRequestHandler(new RequestHandlerContract("Linking", "switchToSettingsApp", new RequestHandler() { // from class: ym.c
                @Override // com.roblox.universalapp.messagebus.RequestHandler
                public final Response run(JSONObject jSONObject) {
                    return this.f37940a.K(jSONObject);
                }
            }));
        } else {
            messageBus.setRequestHandler("Linking", "supportsSwitchToSettingsApp", new a());
            messageBus.setRequestHandler("Linking", "switchToSettingsApp", new b());
        }
        this.f37954l = new ym.i();
        this.f37952j = Optional.empty();
        this.f37953k = Optional.empty();
    }
}
