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
import mm.C8585b;
import mm.C8594k;
import mm.C8595l;
import mm.C8597n;
import mm.InterfaceC8590g;
import mm.InterfaceC8592i;
import org.json.JSONException;
import org.json.JSONObject;
import th.C11659h;

/* JADX INFO: renamed from: km.f */
/* JADX INFO: loaded from: classes2.dex */
public class C7635f {

    /* JADX INFO: renamed from: a */
    public final MessageBus f29150a;

    /* JADX INFO: renamed from: b */
    public Context f29151b;

    /* JADX INFO: renamed from: c */
    public boolean f29152c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<Connection> f29153d;

    /* JADX INFO: renamed from: e */
    public Connection f29154e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Intent> f29155f;

    /* JADX INFO: renamed from: g */
    public boolean f29156g;

    /* JADX INFO: renamed from: h */
    public final Object f29157h;

    /* JADX INFO: renamed from: i */
    public JSONObject f29158i;

    /* JADX INFO: renamed from: j */
    public Optional<i> f29159j;

    /* JADX INFO: renamed from: k */
    public Optional<h> f29160k;

    /* JADX INFO: renamed from: l */
    public C7637h f29161l;

    /* JADX INFO: renamed from: km.f$a */
    public class a implements InterfaceC8592i {
        public a() {
        }

        @Override // mm.InterfaceC8592i
        /* JADX INFO: renamed from: a */
        public C8595l mo15880a(JSONObject jSONObject) {
            return C7635f.this.m31533G(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$b */
    public class b implements InterfaceC8592i {
        public b() {
        }

        @Override // mm.InterfaceC8592i
        /* JADX INFO: renamed from: a */
        public C8595l mo15880a(JSONObject jSONObject) {
            return C7635f.this.m31534H(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$c */
    public class c implements InterfaceC8592i {
        public c() {
        }

        @Override // mm.InterfaceC8592i
        /* JADX INFO: renamed from: a */
        public C8595l mo15880a(JSONObject jSONObject) {
            return C7635f.this.m31551s(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$d */
    public class d implements InterfaceC8592i {
        public d() {
        }

        @Override // mm.InterfaceC8592i
        /* JADX INFO: renamed from: a */
        public C8595l mo15880a(JSONObject jSONObject) {
            return C7635f.this.m31550r(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$e */
    public class e implements Callback {
        public e() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            C7635f.this.m31529B(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$f */
    public class f implements Callback {
        public f() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            C7635f.this.m31549q(jSONObject);
        }
    }

    /* JADX INFO: renamed from: km.f$g */
    public class g implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ k f29168a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public g(k kVar) {
            this.f29168a = kVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                this.f29168a.mo31562a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to check whether this URL is registered due to: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: km.f$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo31559a(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: km.f$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo31560a(boolean z10);
    }

    /* JADX INFO: renamed from: km.f$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        public static final C7635f f29170a = new C7635f();
    }

    /* JADX INFO: renamed from: km.f$k */
    public interface k {
        /* JADX INFO: renamed from: a */
        void mo31562a(boolean z10);
    }

    /* JADX INFO: renamed from: D */
    public static C7635f m31524D() {
        return j.f29170a;
    }

    /* JADX INFO: renamed from: A */
    public void m31528A(Intent intent) {
        this.f29155f.set(intent);
    }

    /* JADX INFO: renamed from: B */
    public void m31529B(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.getBoolean(JNILinkingProtocol.getEnableTrackingKey());
            if (this.f29159j.isPresent()) {
                this.f29159j.get().mo31560a(z10);
            } else {
                Log.e("LinkingProtocol", "Recevied attempt to toggle tracking with no implementation available.");
            }
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Received exception while trying to check enableTracking value: " + e10.toString());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m31530C(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUIDKey(), str);
            this.f29150a.m16024l(JNILinkingProtocol.getSetUIDId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for UID detection failed with error: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: E */
    public void m31531E(Context context) {
        if (this.f29152c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Already started.");
            return;
        }
        this.f29152c = true;
        if (!this.f29156g) {
            if (C11659h.m43403a().mo43722t()) {
                this.f29150a.m16029s(new C8594k(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new InterfaceC8592i() { // from class: km.d
                    @Override // mm.InterfaceC8592i
                    /* JADX INFO: renamed from: a */
                    public final C8595l mo15880a(JSONObject jSONObject) {
                        return this.f29148a.m31551s(jSONObject);
                    }
                }));
            } else {
                this.f29150a.m16026p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new c());
            }
        }
        if (C11659h.m43403a().mo43636g4()) {
            this.f29150a.m16026p(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsTrackingAvailableId(), new d());
            this.f29153d.add(this.f29150a.m16030t(MessageBus.getMessageId(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getSetTrackingEnabledId()), new e()));
        }
        this.f29153d.add(this.f29150a.m16030t(MessageBus.getMessageId("Linking", "adConsentResolved"), new f()));
        this.f29156g = true;
    }

    /* JADX INFO: renamed from: F */
    public void m31532F() {
        if (!this.f29152c) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Not started.");
            return;
        }
        int i10 = 0;
        this.f29152c = false;
        ArrayList<Connection> arrayList = this.f29153d;
        int size = arrayList.size();
        while (i10 < size) {
            Connection connection = arrayList.get(i10);
            i10++;
            connection.m16010a();
        }
        this.f29153d.clear();
    }

    /* JADX INFO: renamed from: G */
    public C8595l m31533G(JSONObject jSONObject) {
        C8595l c8595l = new C8595l();
        JSONObject jSONObject2 = new JSONObject();
        Log.d("LinkingProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        try {
            jSONObject2.put("support", true);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
        }
        c8595l.f31556a = jSONObject2;
        return c8595l;
    }

    /* JADX INFO: renamed from: H */
    public C8595l m31534H(JSONObject jSONObject) {
        Intent intent;
        Log.d("LinkingProtocol", "switchToSettingsApp: " + jSONObject.toString());
        C8595l c8595l = new C8595l();
        new JSONObject();
        try {
            if (C11659h.m43403a().mo43551V1()) {
                intent = null;
                if (jSONObject.has("route")) {
                    String string = jSONObject.getString("route");
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1367751899) {
                        if (iHashCode != -567451565) {
                            if (iHashCode == 1370921258 && string.equals("microphone")) {
                                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent2.setData(Uri.fromParts("package", this.f29151b.getPackageName(), null));
                                intent = intent2;
                            }
                        } else if (string.equals("contacts")) {
                            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent3.setData(Uri.fromParts("package", this.f29151b.getPackageName(), null));
                            intent = intent3;
                        }
                    } else if (string.equals("camera")) {
                        Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent4.setData(Uri.fromParts("package", this.f29151b.getPackageName(), null));
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
            this.f29151b.startActivity(intent);
            return c8595l;
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found exception while handling switch to settings app request Activity Not Found: " + e10.toString());
            return c8595l;
        } catch (Exception e11) {
            Log.e("LinkingProtocol", "Exception while handling switch to settings app request: " + e11.toString());
            return c8595l;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m31535I(JSONObject jSONObject, String str) {
        synchronized (this.f29157h) {
            if (jSONObject != null) {
                if (jSONObject == this.f29158i) {
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
    /* JADX INFO: renamed from: d */
    public void m31536d(String str, String str2) {
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
                m31558z(null);
                return;
            }
        } else {
            jSONObject = null;
        }
        m31558z(jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX INFO: renamed from: e */
    public void m31537e(String str, String str2) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
        if (C11659h.m43403a().mo43637g5()) {
            if (C11659h.m43403a().mo43616e()) {
                m31536d(str, str2);
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
                    m31558z(null);
                    return;
                }
            } else {
                jSONObject = null;
            }
            m31558z(jSONObject);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX INFO: renamed from: f */
    public void m31538f(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
        if (C11659h.m43403a().mo43637g5()) {
            if (C11659h.m43403a().mo43616e()) {
                m31536d(str, str2);
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
                    m31558z(null);
                    return;
                }
            } else {
                jSONObject = null;
            }
            m31558z(jSONObject);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m31539g(JSONObject jSONObject) {
        synchronized (this.f29157h) {
            try {
                JSONObject jSONObject2 = this.f29158i;
                if (jSONObject2 != null) {
                    jSONObject.put("dlicSeed", jSONObject2);
                    this.f29158i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX INFO: renamed from: h */
    public JSONObject m31540h(String str, String str2, boolean z10) {
        JSONObject jSONObject;
        if (str != null && str2 != null) {
            m31555w(str, str2);
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
                    m31558z(null);
                }
            } else {
                jSONObject = null;
            }
            m31558z(jSONObject);
            return jSONObject;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public String m31541i(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return JNILinkingProtocol.nativeCreateInternalDlic(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public void m31542j(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (C11659h.m43403a().mo43553V3() && m31546n(JNILinkingProtocol.nativeDlicGetUrl(str))) {
            JNILinkingProtocol.nativeDlicSetTerminated(str, "success", "explicit_report", "external_browser_handoff");
        } else {
            JNILinkingProtocol.nativeDetectDlic(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m31543k(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            m31539g(jSONObject);
            if (C11659h.m43403a().mo43553V3() && m31546n(str)) {
                return;
            }
            this.f29150a.m16024l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m31544l(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            if (str2 != null) {
                jSONObject.put(JNILinkingProtocol.getAttributionUrlKey(), str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                jSONObject.put("attributionAdName", str3);
            }
            m31539g(jSONObject);
            this.f29150a.m16024l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m31545m(String str) {
        if (str == null) {
            return;
        }
        if (C11659h.m43403a().mo43553V3() && m31546n(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            this.f29150a.m16024l(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m31546n(String str) {
        return m31547o(str, true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m31547o(String str, boolean z10) {
        String queryParameter;
        if (str == null || !str.regionMatches(true, 0, "roblox://open-external?", 0, 23) || (queryParameter = Uri.parse(str).getQueryParameter("url")) == null || !C7630a.m31515d(queryParameter)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        new C7630a("LinkingProtocol").m31520g(this.f29151b, queryParameter);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m31548p(String str, final k kVar) {
        if (C11659h.m43403a().mo43553V3() && m31547o(str, false)) {
            kVar.mo31562a(true);
            return;
        }
        if (C11659h.m43403a().mo43446G()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
                this.f29150a.m16023k(new C8585b(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getIsURLRegisteredId(), jSONObject, new InterfaceC8590g() { // from class: km.e
                }));
                return;
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e10.getMessage());
                return;
            }
        }
        if (C11659h.m43403a().mo43722t()) {
            this.f29154e = this.f29150a.m16032v(new C8597n(JNILinkingProtocol.getIsURLRegisteredResponseId(), new InterfaceC8590g() { // from class: km.e
            }));
        } else {
            this.f29154e = this.f29150a.m16031u(JNILinkingProtocol.getIsURLRegisteredResponseId(), new g(kVar), true);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(JNILinkingProtocol.getUrlKey(), str);
            this.f29150a.m16024l(JNILinkingProtocol.getIsURLRegisteredRequestId(), jSONObject2);
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Failed to construct IsURLRegisteredRequest JSON due to: " + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m31549q(JSONObject jSONObject) {
        if (this.f29160k.isPresent()) {
            this.f29160k.get().mo31559a(jSONObject);
        } else {
            Log.e("LinkingProtocol", "Received adConsentResolved with no implementation available.");
        }
    }

    /* JADX INFO: renamed from: r */
    public C8595l m31550r(JSONObject jSONObject) {
        C8595l c8595l = new C8595l();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(JNILinkingProtocol.getTrackingAvailableKey(), this.f29161l.m31563a());
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to write failure JSON", e10);
        }
        c8595l.f31556a = jSONObject2;
        return c8595l;
    }

    /* JADX INFO: renamed from: s */
    public final C8595l m31551s(JSONObject jSONObject) {
        C8595l c8595l = new C8595l();
        JSONObject jSONObject2 = new JSONObject();
        try {
            String string = jSONObject.getString(JNILinkingProtocol.getUrlKey());
            Log.i("LinkingProtocol", "Opening URL: " + string);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            this.f29151b.startActivity(intent);
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
        c8595l.f31556a = jSONObject2;
        return c8595l;
    }

    /* JADX INFO: renamed from: t */
    public void m31552t() {
        Intent andSet = this.f29155f.getAndSet(null);
        if (andSet != null) {
            m31543k(andSet.getDataString());
        }
    }

    /* JADX INFO: renamed from: u */
    public void m31553u(h hVar) {
        this.f29160k = Optional.of(hVar);
    }

    /* JADX INFO: renamed from: v */
    public void m31554v(i iVar) {
        this.f29159j = Optional.of(iVar);
    }

    /* JADX INFO: renamed from: w */
    public void m31555w(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2);
    }

    /* JADX INFO: renamed from: x */
    public void m31556x(String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        JNILinkingProtocol.nativeReportReceived(str, str2, z10);
    }

    /* JADX INFO: renamed from: y */
    public void m31557y(Context context) {
        this.f29151b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: z */
    public final void m31558z(JSONObject jSONObject) {
        synchronized (this.f29157h) {
            this.f29158i = jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7635f() {
        MessageBus messageBusM16016f = MessageBus.m16016f();
        this.f29150a = messageBusM16016f;
        this.f29152c = false;
        this.f29153d = new ArrayList<>();
        this.f29154e = null;
        this.f29155f = new AtomicReference<>(null);
        this.f29156g = false;
        this.f29157h = new Object();
        this.f29158i = null;
        if (C11659h.m43403a().mo43722t()) {
            messageBusM16016f.m16029s(new C8594k("Linking", "supportsSwitchToSettingsApp", new InterfaceC8592i() { // from class: km.b
                @Override // mm.InterfaceC8592i
                /* JADX INFO: renamed from: a */
                public final C8595l mo15880a(JSONObject jSONObject) {
                    return this.f29146a.m31533G(jSONObject);
                }
            }));
            messageBusM16016f.m16029s(new C8594k("Linking", "switchToSettingsApp", new InterfaceC8592i() { // from class: km.c
                @Override // mm.InterfaceC8592i
                /* JADX INFO: renamed from: a */
                public final C8595l mo15880a(JSONObject jSONObject) {
                    return this.f29147a.m31534H(jSONObject);
                }
            }));
        } else {
            messageBusM16016f.m16026p("Linking", "supportsSwitchToSettingsApp", new a());
            messageBusM16016f.m16026p("Linking", "switchToSettingsApp", new b());
        }
        this.f29161l = new C7637h();
        this.f29159j = Optional.empty();
        this.f29160k = Optional.empty();
    }
}
