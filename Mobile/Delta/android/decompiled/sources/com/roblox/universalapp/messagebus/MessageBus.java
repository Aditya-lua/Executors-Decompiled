package com.roblox.universalapp.messagebus;

import android.util.Log;
import java.util.Map;
import km.g;
import km.h;
import km.i;
import km.j;
import km.k;
import km.l;
import km.m;
import km.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBus {

    public class a implements RawCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f9888a;

        public a(Callback callback) {
            this.f9888a = callback;
        }

        public void run(String str) {
            try {
                this.f9888a.a(MessageBus.e(str));
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in Do Subscribe failed with error: " + e10.getMessage());
            }
        }
    }

    public class b implements RequestHandlerRaw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f9889a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9890c;

        public b(i iVar, String str, String str2) {
            this.f9889a = iVar;
            this.b = str;
            this.f9890c = str2;
        }

        public String run(String str) {
            try {
                l lVarA = this.f9889a.a(MessageBus.e(str));
                MessageBus.this.reportProtocolMethodResponseTelemetryData(this.b, this.f9890c, lVarA.f22910c, MessageBus.n(lVarA.b));
                return MessageBus.n(lVarA.f22909a);
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerRaw failed with error: " + e10.getMessage());
                return "";
            }
        }
    }

    public class c implements RequestHandlerAsyncRaw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f9892a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9893c;

        public c(j jVar, String str, String str2) {
            this.f9892a = jVar;
            this.b = str;
            this.f9893c = str2;
        }

        public final /* synthetic */ void b(String str, String str2, String str3, l lVar) {
            MessageBus.this.reportProtocolMethodResponseTelemetryData(str, str2, lVar.f22910c, MessageBus.n(lVar.b));
            MessageBus.this.callResponseHandlerRaw(str3, MessageBus.n(lVar.f22909a));
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandlerAsyncRaw
        public void run(String str, final String str2) {
            try {
                JSONObject jSONObjectE = MessageBus.e(str);
                j jVar = this.f9892a;
                final String str3 = this.b;
                final String str4 = this.f9893c;
                jVar.a(jSONObjectE, new m() { // from class: km.d
                    @Override // km.m
                    public final void a(l lVar) {
                        this.f22902a.b(str3, str4, str2, lVar);
                    }
                });
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerAsyncRaw failed with error: " + e10.getMessage());
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MessageBus f9895a = new MessageBus();
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
        return d.f9895a;
    }

    public static RawCallback g(Callback callback) {
        return new a(callback);
    }

    public static native String getMessageId(String str, String str2);

    public static h h(final g gVar) {
        return new h() { // from class: km.c
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

    public void k(km.b bVar) {
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

    public void r(km.a aVar) {
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
