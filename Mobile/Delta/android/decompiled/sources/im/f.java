package im;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.universalapp.linking.JNILinkingProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import km.l;
import km.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f21150a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<Connection> f21152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f21153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Intent> f21154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f21156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JSONObject f21157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Optional<i> f21158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Optional<h> f21159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public im.h f21160l;

    public class a implements km.i {
        public a() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.I(jSONObject);
        }
    }

    public class b implements km.i {
        public b() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.J(jSONObject);
        }
    }

    public class c implements km.i {
        public c() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.u(jSONObject);
        }
    }

    public class d implements km.i {
        public d() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            return f.this.t(jSONObject);
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            f.this.D(jSONObject);
        }
    }

    /* JADX INFO: renamed from: im.f$f, reason: collision with other inner class name */
    public class C0367f implements Callback {
        public C0367f() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            f.this.s(jSONObject);
        }
    }

    public class g implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f21167a;

        public g(k kVar) {
            this.f21167a = kVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                this.f21167a.a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
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
        public static final f f21168a = new f();
    }

    public interface k {
        void a(boolean z10);
    }

    public static f F() {
        return j.f21168a;
    }

    public void A(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void B(JSONObject jSONObject) {
        synchronized (this.f21156h) {
            this.f21157i = jSONObject;
        }
    }

    public void C(Intent intent) {
        this.f21154f.set(intent);
    }

    public void D(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.getBoolean(JNILinkingProtocol.getEnableTrackingKey());
            if (this.f21158j.isPresent()) {
                this.f21158j.get().a(z10);
            } else {
                Log.e("LinkingProtocol", "Recevied attempt to toggle tracking with no implementation available.");
            }
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Received exception while trying to check enableTracking value: " + e10.toString());
        }
    }

    public void E(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUIDKey(), str);
            this.f21150a.l(JNILinkingProtocol.getSetUIDId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for UID detection failed with error: " + e10.getMessage());
        }
    }

    public void G(Context context) {
        if (this.f21151c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Already started.");
            return;
        }
        this.f21151c = true;
        if (!this.f21155g) {
            if (rh.h.a().s()) {
                this.f21150a.s(new km.k(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new km.i() { // from class: im.d
                    @Override // km.i
                    public final l a(JSONObject jSONObject) {
                        return this.f21148a.u(jSONObject);
                    }
                }));
            } else {
                this.f21150a.p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new c());
            }
        }
        if (rh.h.a().m4()) {
            this.f21150a.p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsTrackingAvailableId(), new d());
            this.f21152d.add(this.f21150a.t(MessageBus.getMessageId(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getSetTrackingEnabledId()), new e()));
        }
        this.f21152d.add(this.f21150a.t(MessageBus.getMessageId("Linking", "adConsentResolved"), new C0367f()));
        this.f21155g = true;
    }

    public void H() {
        if (!this.f21151c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Not started.");
            return;
        }
        int i10 = 0;
        this.f21151c = false;
        ArrayList<Connection> arrayList = this.f21152d;
        int size = arrayList.size();
        while (i10 < size) {
            Connection connection = arrayList.get(i10);
            i10++;
            connection.a();
        }
        this.f21152d.clear();
    }

    public l I(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        Log.d("LinkingProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        try {
            jSONObject2.put("support", true);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
        }
        lVar.f22909a = jSONObject2;
        return lVar;
    }

    public l J(JSONObject jSONObject) {
        Intent intent;
        Log.d("LinkingProtocol", "switchToSettingsApp: " + jSONObject.toString());
        l lVar = new l();
        new JSONObject();
        try {
            if (rh.h.a().Z1()) {
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
            return lVar;
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found exception while handling switch to settings app request Activity Not Found: " + e10.toString());
            return lVar;
        } catch (Exception e11) {
            Log.e("LinkingProtocol", "Exception while handling switch to settings app request: " + e11.toString());
            return lVar;
        }
    }

    public void K(JSONObject jSONObject, String str) {
        synchronized (this.f21156h) {
            if (jSONObject != null) {
                if (jSONObject == this.f21157i) {
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
    public void d(String str, String str2) {
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
                B(null);
                return;
            }
        } else {
            jSONObject = null;
        }
        B(jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void e(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
        if (rh.h.a().n5()) {
            if (rh.h.a().e()) {
                d(str, str2);
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
                    B(null);
                    return;
                }
            } else {
                jSONObject = null;
            }
            B(jSONObject);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void f(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
        if (rh.h.a().n5()) {
            if (rh.h.a().e()) {
                d(str, str2);
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
                    B(null);
                    return;
                }
            } else {
                jSONObject = null;
            }
            B(jSONObject);
        }
    }

    public final void g(JSONObject jSONObject) {
        synchronized (this.f21156h) {
            try {
                JSONObject jSONObject2 = this.f21157i;
                if (jSONObject2 != null) {
                    jSONObject.put("dlicSeed", jSONObject2);
                    this.f21157i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    public JSONObject h(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str != null && str2 != null) {
            y(str, str2);
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
                    B(null);
                }
            } else {
                jSONObject = null;
            }
            B(jSONObject);
            return jSONObject;
        }
        return null;
    }

    public String i(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return JNILinkingProtocol.nativeCreateInternalDlic(str, str2);
    }

    public void j(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (rh.h.a().b4() && p(JNILinkingProtocol.nativeDlicGetUrl(str))) {
            JNILinkingProtocol.nativeDlicSetTerminated(str, "success", "explicit_report", "external_browser_handoff");
        } else {
            JNILinkingProtocol.nativeDetectDlic(str);
        }
    }

    public void k(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            g(jSONObject);
            if (rh.h.a().b4() && p(str)) {
                return;
            }
            this.f21150a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void l(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            if (str2 != null) {
                jSONObject.put(JNILinkingProtocol.getAttributionUrlKey(), str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                jSONObject.put("attributionAdName", str3);
            }
            g(jSONObject);
            this.f21150a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void m(String str) {
        if (str == null) {
            return;
        }
        if (rh.h.a().b4() && p(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            this.f21150a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void n(String str, String str2, String str3) {
        if (str == null || str.isEmpty() || str2 == null || str3 == null) {
            return;
        }
        JNILinkingProtocol.nativeDlicSetTerminated(str, str2, "explicit_report", str3);
    }

    public void o(String str, k kVar) {
        if (rh.h.a().b4() && q(JNILinkingProtocol.nativeDlicGetUrl(str), false)) {
            kVar.a(true);
        } else {
            kVar.a(JNILinkingProtocol.nativeEngineShouldHandleDlic(str));
        }
    }

    public final boolean p(String str) {
        return q(str, true);
    }

    public final boolean q(String str, boolean z10) {
        String queryParameter;
        if (str == null || !str.regionMatches(true, 0, "roblox://open-external?", 0, 23) || (queryParameter = Uri.parse(str).getQueryParameter("url")) == null || !im.a.d(queryParameter)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        new im.a("LinkingProtocol").g(this.b, queryParameter);
        return true;
    }

    public void r(String str, final k kVar) {
        if (rh.h.a().b4() && q(str, false)) {
            kVar.a(true);
            return;
        }
        if (rh.h.a().F()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
                this.f21150a.k(new km.b(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsURLRegisteredId(), jSONObject, new km.g() { // from class: im.e
                }));
                return;
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e10.getMessage());
                return;
            }
        }
        if (rh.h.a().s()) {
            this.f21153e = this.f21150a.v(new n(JNILinkingProtocol.getIsURLRegisteredResponseId(), new km.g() { // from class: im.e
            }));
        } else {
            this.f21153e = this.f21150a.u(JNILinkingProtocol.getIsURLRegisteredResponseId(), new g(kVar), true);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(JNILinkingProtocol.getUrlKey(), str);
            this.f21150a.l(JNILinkingProtocol.getIsURLRegisteredRequestId(), jSONObject2);
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e11.getMessage());
        }
    }

    public final void s(JSONObject jSONObject) {
        if (this.f21159k.isPresent()) {
            this.f21159k.get().a(jSONObject);
        } else {
            Log.e("LinkingProtocol", "Received adConsentResolved with no implementation available.");
        }
    }

    public l t(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(JNILinkingProtocol.getTrackingAvailableKey(), this.f21160l.a());
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to write failure JSON", e10);
        }
        lVar.f22909a = jSONObject2;
        return lVar;
    }

    public final l u(JSONObject jSONObject) {
        l lVar = new l();
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
        lVar.f22909a = jSONObject2;
        return lVar;
    }

    public void v() {
        Intent andSet = this.f21154f.getAndSet(null);
        if (andSet != null) {
            k(andSet.getDataString());
        }
    }

    public void w(h hVar) {
        this.f21159k = Optional.of(hVar);
    }

    public void x(i iVar) {
        this.f21158j = Optional.of(iVar);
    }

    public void y(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
    }

    public void z(String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
    }

    public f() {
        MessageBus messageBusF = MessageBus.f();
        this.f21150a = messageBusF;
        this.f21151c = false;
        this.f21152d = new ArrayList<>();
        this.f21153e = null;
        this.f21154f = new AtomicReference<>(null);
        this.f21155g = false;
        this.f21156h = new Object();
        this.f21157i = null;
        if (rh.h.a().s()) {
            messageBusF.s(new km.k("Linking", "supportsSwitchToSettingsApp", new km.i() { // from class: im.b
                @Override // km.i
                public final l a(JSONObject jSONObject) {
                    return this.f21146a.I(jSONObject);
                }
            }));
            messageBusF.s(new km.k("Linking", "switchToSettingsApp", new km.i() { // from class: im.c
                @Override // km.i
                public final l a(JSONObject jSONObject) {
                    return this.f21147a.J(jSONObject);
                }
            }));
        } else {
            messageBusF.p("Linking", "supportsSwitchToSettingsApp", new a());
            messageBusF.p("Linking", "switchToSettingsApp", new b());
        }
        this.f21160l = new im.h();
        this.f21158j = Optional.empty();
        this.f21159k = Optional.empty();
    }
}
