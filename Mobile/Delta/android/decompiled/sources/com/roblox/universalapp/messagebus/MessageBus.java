package com.roblox.universalapp.messagebus;

import android.util.Log;
import java.util.Map;
import mm.g;
import mm.h;
import mm.i;
import mm.j;
import mm.k;
import mm.l;
import mm.m;
import mm.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBus {

    public class a implements RawCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f9807a;

        public a(Callback callback) {
            this.f9807a = callback;
        }

        public void run(String str) {
            try {
                this.f9807a.a(MessageBus.e(str));
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in Do Subscribe failed with error: " + e10.getMessage());
            }
        }
    }

    public class b implements RequestHandlerRaw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f9808a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9809c;

        public b(i iVar, String str, String str2) {
            this.f9808a = iVar;
            this.b = str;
            this.f9809c = str2;
        }

        public String run(String str) {
            try {
                l lVarA = this.f9808a.a(MessageBus.e(str));
                MessageBus.this.reportProtocolMethodResponseTelemetryData(this.b, this.f9809c, lVarA.f24431c, MessageBus.n(lVarA.b));
                return MessageBus.n(lVarA.f24430a);
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerRaw failed with error: " + e10.getMessage());
                return "";
            }
        }
    }

    public class c implements RequestHandlerAsyncRaw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f9811a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9812c;

        public c(j jVar, String str, String str2) {
            this.f9811a = jVar;
            this.b = str;
            this.f9812c = str2;
        }

        public final /* synthetic */ void b(String str, String str2, String str3, l lVar) {
            MessageBus.this.reportProtocolMethodResponseTelemetryData(str, str2, lVar.f24431c, MessageBus.n(lVar.b));
            MessageBus.this.callResponseHandlerRaw(str3, MessageBus.n(lVar.f24430a));
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandlerAsyncRaw
        public void run(String str, final String str2) {
            try {
                JSONObject jSONObjectE = MessageBus.e(str);
                j jVar = this.f9811a;
                final String str3 = this.b;
                final String str4 = this.f9812c;
                jVar.a(jSONObjectE, new m() { // from class: mm.d
                    @Override // mm.m
                    public final void a(l lVar) {
                        this.f24423a.b(str3, str4, str2, lVar);
                    }
                });
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerAsyncRaw failed with error: " + e10.getMessage());
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MessageBus f9814a = new MessageBus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void callResponseHandlerRaw(String str, String str2);

    private native Connection doSubscribeProtocolMethodRequestRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeProtocolMethodResponseRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeRaw(String str, RawCallback rawCallback, boolean z10);

    public static JSONObject e(String str) {
        return new JSONObject(str);
    }

    public static MessageBus f() {
        return d.f9814a;
    }

    public static RawCallback g(Callback callback) {
        return new a(callback);
    }

    public static native String getMessageId(String str, String str2);

    public static h h(final g gVar) {
        return new h() { // from class: mm.c
        };
    }

    private native void makeRequest(MakeRequestContractRaw makeRequestContractRaw);

    private native void makeRequestRaw(String str, String str2, String str3, RawCallback rawCallback);

    public static String n(JSONObject jSONObject) {
        return jSONObject.toString();
    }

    public static String o(Map<String, String> map) {
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

    public final RequestHandlerAsyncRaw i(String str, String str2, j jVar) {
        return new c(jVar, str, str2);
    }

    public final RequestHandlerRaw j(String str, String str2, i iVar) {
        return new b(iVar, str, str2);
    }

    public void k(mm.b bVar) {
        reportProtocolMethodRequestTelemetryData(bVar.d(), bVar.b(), "");
        makeRequest(new MakeRequestContractRaw(bVar.d(), bVar.b(), n(bVar.c()), h(bVar.a())));
    }

    public void l(String str, JSONObject jSONObject) {
        publishRaw(str, n(jSONObject));
    }

    public void m(String str, String str2, JSONObject jSONObject, int i10, Map<String, String> map) {
        Log.d("MessageBus", String.format("Publish response for protocol: %s, method: %s.", str, str2));
        publishProtocolMethodResponseRaw(str, str2, n(jSONObject), i10, o(map));
    }

    public void p(String str, String str2, i iVar) {
        setRequestHandlerRaw(str, str2, j(str, str2, iVar));
    }

    public native void publishProtocolMethodRequestRaw(String str, String str2, String str3, String str4);

    public native void publishProtocolMethodResponseRaw(String str, String str2, String str3, int i10, String str4);

    public native void publishRaw(String str, String str2);

    public void q(String str, String str2, j jVar) {
        setRequestHandlerAsyncRaw(str, str2, i(str, str2, jVar));
    }

    public void r(mm.a aVar) {
        setRequestHandlerAsync(new AsyncRequestHandlerRawContract(aVar.c(), aVar.b(), i(aVar.c(), aVar.c(), aVar.a())));
    }

    public void s(k kVar) {
        setRequestHandler(new RawRequestHandlerContract(kVar.c(), kVar.b(), j(kVar.c(), kVar.b(), kVar.a())));
    }

    public native Connection subscribe(RawSubscriptionContract rawSubscriptionContract);

    public Connection t(String str, Callback callback) {
        return u(str, callback, false);
    }

    public Connection u(String str, Callback callback, boolean z10) {
        return doSubscribeRaw(str, g(callback), z10);
    }

    public Connection v(n nVar) {
        return subscribe(new RawSubscriptionContract(nVar.d(), h(nVar.a()), nVar.c(), nVar.b()));
    }

    public Connection w(String str, String str2, Callback callback) {
        return x(str, str2, callback, false);
    }

    public Connection x(String str, String str2, Callback callback, boolean z10) {
        return doSubscribeProtocolMethodRequestRaw(str, str2, g(callback), z10);
    }

    public MessageBus() {
    }
}
