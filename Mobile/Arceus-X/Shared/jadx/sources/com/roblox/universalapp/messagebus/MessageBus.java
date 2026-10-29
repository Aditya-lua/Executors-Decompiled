package com.roblox.universalapp.messagebus;

import android.util.Log;
import java.util.Map;
import mm.C8584a;
import mm.C8585b;
import mm.C8594k;
import mm.C8595l;
import mm.C8597n;
import mm.InterfaceC8590g;
import mm.InterfaceC8591h;
import mm.InterfaceC8592i;
import mm.InterfaceC8593j;
import mm.InterfaceC8596m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBus {

    /* JADX INFO: renamed from: com.roblox.universalapp.messagebus.MessageBus$a */
    public class C3361a implements RawCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f12771a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C3361a(Callback callback) {
            this.f12771a = callback;
        }

        public void run(String str) {
            try {
                this.f12771a.mo7492a(MessageBus.m16015e(str));
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in Do Subscribe failed with error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.messagebus.MessageBus$b */
    public class C3362b implements RequestHandlerRaw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8592i f12772a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12773b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f12774c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C3362b(InterfaceC8592i interfaceC8592i, String str, String str2) {
            this.f12772a = interfaceC8592i;
            this.f12773b = str;
            this.f12774c = str2;
        }

        public String run(String str) {
            try {
                C8595l c8595lMo15880a = this.f12772a.mo15880a(MessageBus.m16015e(str));
                MessageBus.this.reportProtocolMethodResponseTelemetryData(this.f12773b, this.f12774c, c8595lMo15880a.f31558c, MessageBus.m16019n(c8595lMo15880a.f31557b));
                return MessageBus.m16019n(c8595lMo15880a.f31556a);
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerRaw failed with error: " + e10.getMessage());
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.messagebus.MessageBus$c */
    public class C3363c implements RequestHandlerAsyncRaw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8593j f12776a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12777b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f12778c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C3363c(InterfaceC8593j interfaceC8593j, String str, String str2) {
            this.f12776a = interfaceC8593j;
            this.f12777b = str;
            this.f12778c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m16036b(String str, String str2, String str3, C8595l c8595l) {
            MessageBus.this.reportProtocolMethodResponseTelemetryData(str, str2, c8595l.f31558c, MessageBus.m16019n(c8595l.f31557b));
            MessageBus.this.callResponseHandlerRaw(str3, MessageBus.m16019n(c8595l.f31556a));
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandlerAsyncRaw
        public void run(String str, final String str2) {
            try {
                JSONObject jSONObjectM16015e = MessageBus.m16015e(str);
                InterfaceC8593j interfaceC8593j = this.f12776a;
                final String str3 = this.f12777b;
                final String str4 = this.f12778c;
                interfaceC8593j.mo15882a(jSONObjectM16015e, new InterfaceC8596m() { // from class: mm.d
                    @Override // mm.InterfaceC8596m
                    /* JADX INFO: renamed from: a */
                    public final void mo34618a(C8595l c8595l) {
                        this.f31546a.m16036b(str3, str4, str2, c8595l);
                    }
                });
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerAsyncRaw failed with error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.messagebus.MessageBus$d */
    public static class C3364d {

        /* JADX INFO: renamed from: a */
        public static final MessageBus f12780a = new MessageBus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void callResponseHandlerRaw(String str, String str2);

    private native Connection doSubscribeProtocolMethodRequestRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeProtocolMethodResponseRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeRaw(String str, RawCallback rawCallback, boolean z10);

    /* JADX INFO: renamed from: e */
    public static JSONObject m16015e(String str) {
        return new JSONObject(str);
    }

    /* JADX INFO: renamed from: f */
    public static MessageBus m16016f() {
        return C3364d.f12780a;
    }

    /* JADX INFO: renamed from: g */
    public static RawCallback m16017g(Callback callback) {
        return new C3361a(callback);
    }

    public static native String getMessageId(String str, String str2);

    /* JADX INFO: renamed from: h */
    public static InterfaceC8591h m16018h(final InterfaceC8590g interfaceC8590g) {
        return new InterfaceC8591h() { // from class: mm.c
        };
    }

    private native void makeRequest(MakeRequestContractRaw makeRequestContractRaw);

    private native void makeRequestRaw(String str, String str2, String str3, RawCallback rawCallback);

    /* JADX INFO: renamed from: n */
    public static String m16019n(JSONObject jSONObject) {
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m16020o(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private native void reportProtocolMethodRequestTelemetryData(String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void reportProtocolMethodResponseTelemetryData(String str, String str2, int i10, String str3);

    private native void setRequestHandler(RawRequestHandlerContract rawRequestHandlerContract);

    private native void setRequestHandlerAsync(AsyncRequestHandlerRawContract asyncRequestHandlerRawContract);

    private native void setRequestHandlerAsyncRaw(String str, String str2, RequestHandlerAsyncRaw requestHandlerAsyncRaw);

    private native void setRequestHandlerRaw(String str, String str2, RequestHandlerRaw requestHandlerRaw);

    public native void clearRequestHandler(String str, String str2);

    public native String getLastRaw(String str);

    /* JADX INFO: renamed from: i */
    public final RequestHandlerAsyncRaw m16021i(String str, String str2, InterfaceC8593j interfaceC8593j) {
        return new C3363c(interfaceC8593j, str, str2);
    }

    /* JADX INFO: renamed from: j */
    public final RequestHandlerRaw m16022j(String str, String str2, InterfaceC8592i interfaceC8592i) {
        return new C3362b(interfaceC8592i, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public void m16023k(C8585b c8585b) {
        reportProtocolMethodRequestTelemetryData(c8585b.m34617d(), c8585b.m34615b(), "");
        makeRequest(new MakeRequestContractRaw(c8585b.m34617d(), c8585b.m34615b(), m16019n(c8585b.m34616c()), m16018h(c8585b.m34614a())));
    }

    /* JADX INFO: renamed from: l */
    public void m16024l(String str, JSONObject jSONObject) {
        publishRaw(str, m16019n(jSONObject));
    }

    /* JADX INFO: renamed from: m */
    public void m16025m(String str, String str2, JSONObject jSONObject, int i10, Map<String, String> map) {
        Log.d("MessageBus", String.format("Publish response for protocol: %s, method: %s.", str, str2));
        publishProtocolMethodResponseRaw(str, str2, m16019n(jSONObject), i10, m16020o(map));
    }

    /* JADX INFO: renamed from: p */
    public void m16026p(String str, String str2, InterfaceC8592i interfaceC8592i) {
        setRequestHandlerRaw(str, str2, m16022j(str, str2, interfaceC8592i));
    }

    public native void publishProtocolMethodRequestRaw(String str, String str2, String str3, String str4);

    public native void publishProtocolMethodResponseRaw(String str, String str2, String str3, int i10, String str4);

    public native void publishRaw(String str, String str2);

    /* JADX INFO: renamed from: q */
    public void m16027q(String str, String str2, InterfaceC8593j interfaceC8593j) {
        setRequestHandlerAsyncRaw(str, str2, m16021i(str, str2, interfaceC8593j));
    }

    /* JADX INFO: renamed from: r */
    public void m16028r(C8584a c8584a) {
        setRequestHandlerAsync(new AsyncRequestHandlerRawContract(c8584a.m34613c(), c8584a.m34612b(), m16021i(c8584a.m34613c(), c8584a.m34613c(), c8584a.m34611a())));
    }

    /* JADX INFO: renamed from: s */
    public void m16029s(C8594k c8594k) {
        setRequestHandler(new RawRequestHandlerContract(c8594k.m34623c(), c8594k.m34622b(), m16022j(c8594k.m34623c(), c8594k.m34622b(), c8594k.m34621a())));
    }

    public native Connection subscribe(RawSubscriptionContract rawSubscriptionContract);

    /* JADX INFO: renamed from: t */
    public Connection m16030t(String str, Callback callback) {
        return m16031u(str, callback, false);
    }

    /* JADX INFO: renamed from: u */
    public Connection m16031u(String str, Callback callback, boolean z10) {
        return doSubscribeRaw(str, m16017g(callback), z10);
    }

    /* JADX INFO: renamed from: v */
    public Connection m16032v(C8597n c8597n) {
        return subscribe(new RawSubscriptionContract(c8597n.m34627d(), m16018h(c8597n.m34624a()), c8597n.m34626c(), c8597n.m34625b()));
    }

    /* JADX INFO: renamed from: w */
    public Connection m16033w(String str, String str2, Callback callback) {
        return m16034x(str, str2, callback, false);
    }

    /* JADX INFO: renamed from: x */
    public Connection m16034x(String str, String str2, Callback callback, boolean z10) {
        return doSubscribeProtocolMethodRequestRaw(str, str2, m16017g(callback), z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MessageBus() {
    }
}
