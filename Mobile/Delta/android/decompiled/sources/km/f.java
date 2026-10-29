package km;

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
import mm.l;
import mm.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f22330a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<Connection> f22332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f22333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Intent> f22334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f22336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Optional<i> f22337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Optional<h> f22338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public km.h f22339k;

    public class a implements mm.i {
        public a() {
        }

        @Override // mm.i
        public l a(JSONObject jSONObject) {
            return f.this.y(jSONObject);
        }
    }

    public class b implements mm.i {
        public b() {
        }

        @Override // mm.i
        public l a(JSONObject jSONObject) {
            return f.this.z(jSONObject);
        }
    }

    public class c implements mm.i {
        public c() {
        }

        @Override // mm.i
        public l a(JSONObject jSONObject) {
            return f.this.l(jSONObject);
        }
    }

    public class d implements mm.i {
        public d() {
        }

        @Override // mm.i
        public l a(JSONObject jSONObject) {
            return f.this.k(jSONObject);
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            f.this.t(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$f, reason: collision with other inner class name */
    public class C0397f implements Callback {
        public C0397f() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            f.this.j(jSONObject);
        }
    }

    public class g implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f22346a;

        public g(k kVar) {
            this.f22346a = kVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                this.f22346a.a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
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
        public static final f f22347a = new f();
    }

    public interface k {
        void a(boolean z10);
    }

    public static f v() {
        return j.f22347a;
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
                this.f22336h = null;
                return;
            }
        } else {
            jSONObject = null;
        }
        this.f22336h = jSONObject;
    }

    public void e(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            JSONObject jSONObject2 = this.f22336h;
            if (jSONObject2 != null) {
                jSONObject.put("dlicSeed", jSONObject2);
                this.f22336h = null;
            }
            if (th.h.a().Q3() && g(str)) {
                return;
            }
            this.f22330a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public void f(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            if (str2 != null) {
                jSONObject.put(JNILinkingProtocol.getAttributionUrlKey(), str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                jSONObject.put("attributionAdName", str3);
            }
            JSONObject jSONObject2 = this.f22336h;
            if (jSONObject2 != null) {
                jSONObject.put("dlicSeed", jSONObject2);
                this.f22336h = null;
            }
            this.f22330a.l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    public final boolean g(String str) {
        return h(str, true);
    }

    public final boolean h(String str, boolean z10) {
        String queryParameter;
        if (str == null || !str.regionMatches(true, 0, "roblox://open-external?", 0, 23) || (queryParameter = Uri.parse(str).getQueryParameter("url")) == null || !km.a.d(queryParameter)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        new km.a("LinkingProtocol").g(this.b, queryParameter);
        return true;
    }

    public void i(String str, final k kVar) {
        if (th.h.a().Q3() && h(str, false)) {
            kVar.a(true);
            return;
        }
        if (th.h.a().D()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
                this.f22330a.k(new mm.b(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsURLRegisteredId(), jSONObject, new mm.g() { // from class: km.e
                }));
                return;
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e10.getMessage());
                return;
            }
        }
        if (th.h.a().r()) {
            this.f22333e = this.f22330a.v(new n(JNILinkingProtocol.getIsURLRegisteredResponseId(), new mm.g() { // from class: km.e
            }));
        } else {
            this.f22333e = this.f22330a.u(JNILinkingProtocol.getIsURLRegisteredResponseId(), new g(kVar), true);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(JNILinkingProtocol.getUrlKey(), str);
            this.f22330a.l(JNILinkingProtocol.getIsURLRegisteredRequestId(), jSONObject2);
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e11.getMessage());
        }
    }

    public final void j(JSONObject jSONObject) {
        if (this.f22338j.isPresent()) {
            this.f22338j.get().a(jSONObject);
        } else {
            Log.e("LinkingProtocol", "Received adConsentResolved with no implementation available.");
        }
    }

    public l k(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(JNILinkingProtocol.getTrackingAvailableKey(), this.f22339k.a());
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to write failure JSON", e10);
        }
        lVar.f24430a = jSONObject2;
        return lVar;
    }

    public final l l(JSONObject jSONObject) {
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
        lVar.f24430a = jSONObject2;
        return lVar;
    }

    public void m() {
        Intent andSet = this.f22334f.getAndSet(null);
        if (andSet != null) {
            e(andSet.getDataString());
        }
    }

    public void n(h hVar) {
        this.f22338j = Optional.of(hVar);
    }

    public void o(i iVar) {
        this.f22337i = Optional.of(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void p(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
        if (th.h.a().a5()) {
            if (th.h.a().e()) {
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
                    this.f22336h = null;
                    return;
                }
            } else {
                jSONObject = null;
            }
            this.f22336h = jSONObject;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void q(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
        if (th.h.a().a5()) {
            if (th.h.a().e()) {
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
                    this.f22336h = null;
                    return;
                }
            } else {
                jSONObject = null;
            }
            this.f22336h = jSONObject;
        }
    }

    public void r(Context context) {
        this.b = context.getApplicationContext();
    }

    public void s(Intent intent) {
        this.f22334f.set(intent);
    }

    public void t(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.getBoolean(JNILinkingProtocol.getEnableTrackingKey());
            if (this.f22337i.isPresent()) {
                this.f22337i.get().a(z10);
            } else {
                Log.e("LinkingProtocol", "Recevied attempt to toggle tracking with no implementation available.");
            }
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Received exception while trying to check enableTracking value: " + e10.toString());
        }
    }

    public void u(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUIDKey(), str);
            this.f22330a.l(JNILinkingProtocol.getSetUIDId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for UID detection failed with error: " + e10.getMessage());
        }
    }

    public void w(Context context) {
        if (this.f22331c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Already started.");
            return;
        }
        this.f22331c = true;
        if (!this.f22335g) {
            if (th.h.a().r()) {
                this.f22330a.s(new mm.k(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new mm.i() { // from class: km.d
                    @Override // mm.i
                    public final l a(JSONObject jSONObject) {
                        return this.f22328a.l(jSONObject);
                    }
                }));
            } else {
                this.f22330a.p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new c());
            }
        }
        if (th.h.a().b4()) {
            this.f22330a.p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsTrackingAvailableId(), new d());
            this.f22332d.add(this.f22330a.t(MessageBus.getMessageId(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getSetTrackingEnabledId()), new e()));
        }
        this.f22332d.add(this.f22330a.t(MessageBus.getMessageId("Linking", "adConsentResolved"), new C0397f()));
        this.f22335g = true;
    }

    public void x() {
        if (!this.f22331c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Not started.");
            return;
        }
        int i10 = 0;
        this.f22331c = false;
        ArrayList<Connection> arrayList = this.f22332d;
        int size = arrayList.size();
        while (i10 < size) {
            Connection connection = arrayList.get(i10);
            i10++;
            connection.a();
        }
        this.f22332d.clear();
    }

    public l y(JSONObject jSONObject) {
        l lVar = new l();
        JSONObject jSONObject2 = new JSONObject();
        Log.d("LinkingProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        try {
            jSONObject2.put("support", true);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
        }
        lVar.f24430a = jSONObject2;
        return lVar;
    }

    public l z(JSONObject jSONObject) {
        Intent intent;
        Log.d("LinkingProtocol", "switchToSettingsApp: " + jSONObject.toString());
        l lVar = new l();
        new JSONObject();
        try {
            if (th.h.a().P1()) {
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

    public f() {
        MessageBus messageBusF = MessageBus.f();
        this.f22330a = messageBusF;
        this.f22331c = false;
        this.f22332d = new ArrayList<>();
        this.f22333e = null;
        this.f22334f = new AtomicReference<>(null);
        this.f22335g = false;
        this.f22336h = null;
        if (th.h.a().r()) {
            messageBusF.s(new mm.k("Linking", "supportsSwitchToSettingsApp", new mm.i() { // from class: km.b
                @Override // mm.i
                public final l a(JSONObject jSONObject) {
                    return this.f22326a.y(jSONObject);
                }
            }));
            messageBusF.s(new mm.k("Linking", "switchToSettingsApp", new mm.i() { // from class: km.c
                @Override // mm.i
                public final l a(JSONObject jSONObject) {
                    return this.f22327a.z(jSONObject);
                }
            }));
        } else {
            messageBusF.p("Linking", "supportsSwitchToSettingsApp", new a());
            messageBusF.p("Linking", "switchToSettingsApp", new b());
        }
        this.f22339k = new km.h();
        this.f22337i = Optional.empty();
        this.f22338j = Optional.empty();
    }
}
