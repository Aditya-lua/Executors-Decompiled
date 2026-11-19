package com.roblox.universalapp.messagebus;

import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBus {
    public static final int CANCELLED = 1;
    public static final int DENIED = 7;
    public static final int INTERNAL = 13;
    public static final int OK = 0;
    static final String TAG = "MessageBus";

    /* JADX INFO: renamed from: com.roblox.universalapp.messagebus.MessageBus$3, reason: invalid class name */
    public class AnonymousClass3 implements RequestHandlerAsyncRaw {
        final /* synthetic */ RequestHandlerAsync val$asyncCallback;
        final /* synthetic */ String val$methodName;
        final /* synthetic */ String val$protocolName;

        public AnonymousClass3(RequestHandlerAsync requestHandlerAsync, String str, String str2) {
            this.val$asyncCallback = requestHandlerAsync;
            this.val$protocolName = str;
            this.val$methodName = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(String str, String str2, String str3, Response response) {
            MessageBus.this.reportProtocolMethodResponseTelemetryData(str, str2, response.telemetryResponseCode, MessageBus.serializeMessageParams(response.customTelemetryData));
            MessageBus.this.callResponseHandlerRaw(str3, MessageBus.serializeMessageParams(response.params));
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandlerAsyncRaw
        public void run(String str, final String str2) {
            try {
                JSONObject jSONObjectDeserializeMessageParams = MessageBus.deserializeMessageParams(str);
                RequestHandlerAsync requestHandlerAsync = this.val$asyncCallback;
                final String str3 = this.val$protocolName;
                final String str4 = this.val$methodName;
                requestHandlerAsync.run(jSONObjectDeserializeMessageParams, new ResponseCallback() { // from class: com.roblox.universalapp.messagebus.b
                    @Override // com.roblox.universalapp.messagebus.ResponseCallback
                    public final void run(Response response) {
                        this.f9820a.lambda$run$0(str3, str4, str2, response);
                    }
                });
            } catch (JSONException e10) {
                Log.e(MessageBus.TAG, "Serializing message params in getRequestHandlerAsyncRaw failed with error: " + e10.getMessage());
            }
        }
    }

    public static class Holder {
        private static final MessageBus INSTANCE = new MessageBus();

        private Holder() {
        }
    }

    public static /* synthetic */ boolean a(NewCallback newCallback, String str) {
        try {
            return newCallback.run(deserializeMessageParams(str));
        } catch (JSONException e10) {
            Log.e(TAG, "Serializing message params in Do Subscribe failed with error: " + e10.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void callResponseHandlerRaw(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject deserializeMessageParams(String str) {
        return new JSONObject(str);
    }

    private native Connection doSubscribeProtocolMethodRequestRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeProtocolMethodResponseRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeRaw(String str, RawCallback rawCallback, boolean z10);

    public static MessageBus getInstance() {
        return Holder.INSTANCE;
    }

    public static native String getMessageId(String str, String str2);

    private static RawCallback getRawCallback(final Callback callback) {
        return new RawCallback() { // from class: com.roblox.universalapp.messagebus.MessageBus.1
            @Override // com.roblox.universalapp.messagebus.RawCallback
            public void run(String str) {
                try {
                    callback.run(MessageBus.deserializeMessageParams(str));
                } catch (JSONException e10) {
                    Log.e(MessageBus.TAG, "Serializing message params in Do Subscribe failed with error: " + e10.getMessage());
                }
            }
        };
    }

    private RequestHandlerAsyncRaw getRequestHandlerAsyncRaw(String str, String str2, RequestHandlerAsync requestHandlerAsync) {
        return new AnonymousClass3(requestHandlerAsync, str, str2);
    }

    private RequestHandlerRaw getRequestHandlerRaw(final String str, final String str2, final RequestHandler requestHandler) {
        return new RequestHandlerRaw() { // from class: com.roblox.universalapp.messagebus.MessageBus.2
            @Override // com.roblox.universalapp.messagebus.RequestHandlerRaw
            public String run(String str3) {
                try {
                    Response responseRun = requestHandler.run(MessageBus.deserializeMessageParams(str3));
                    MessageBus.this.reportProtocolMethodResponseTelemetryData(str, str2, responseRun.telemetryResponseCode, MessageBus.serializeMessageParams(responseRun.customTelemetryData));
                    return MessageBus.serializeMessageParams(responseRun.params);
                } catch (JSONException e10) {
                    Log.e(MessageBus.TAG, "Serializing message params in getRequestHandlerRaw failed with error: " + e10.getMessage());
                    return BuildConfig.FLAVOR;
                }
            }
        };
    }

    private native void makeRequest(MakeRequestContractRaw makeRequestContractRaw);

    private native void makeRequestRaw(String str, String str2, String str3, RawCallback rawCallback);

    private native void reportProtocolMethodRequestTelemetryData(String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void reportProtocolMethodResponseTelemetryData(String str, String str2, int i10, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public static String serializeMessageParams(JSONObject jSONObject) {
        return jSONObject.toString();
    }

    private static String serializeTelemetryMetadataMap(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private native void setRequestHandler(RawRequestHandlerContract rawRequestHandlerContract);

    private native void setRequestHandlerAsync(AsyncRequestHandlerRawContract asyncRequestHandlerRawContract);

    private native void setRequestHandlerAsyncRaw(String str, String str2, RequestHandlerAsyncRaw requestHandlerAsyncRaw);

    private native void setRequestHandlerRaw(String str, String str2, RequestHandlerRaw requestHandlerRaw);

    public native void clearRequestHandler(String str, String str2);

    public native String getLastRaw(String str);

    public void makeRequest(String str, String str2, JSONObject jSONObject, Callback callback) {
        reportProtocolMethodRequestTelemetryData(str, str2, BuildConfig.FLAVOR);
        makeRequestRaw(str, str2, serializeMessageParams(jSONObject), getRawCallback(callback));
    }

    public void publish(String str, JSONObject jSONObject) {
        publishRaw(str, serializeMessageParams(jSONObject));
    }

    public void publishProtocolMethodRequest(String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        Log.d(TAG, String.format("Publish request for protocol: %s, method: %s.", str, str2));
        publishProtocolMethodRequestRaw(str, str2, serializeMessageParams(jSONObject), serializeTelemetryMetadataMap(map));
    }

    public native void publishProtocolMethodRequestRaw(String str, String str2, String str3, String str4);

    public void publishProtocolMethodResponse(String str, String str2, JSONObject jSONObject, int i10, Map<String, String> map) {
        Log.d(TAG, String.format("Publish response for protocol: %s, method: %s.", str, str2));
        publishProtocolMethodResponseRaw(str, str2, serializeMessageParams(jSONObject), i10, serializeTelemetryMetadataMap(map));
    }

    public native void publishProtocolMethodResponseRaw(String str, String str2, String str3, int i10, String str4);

    public native void publishRaw(String str, String str2);

    public void setRequestHandler(String str, String str2, RequestHandler requestHandler) {
        setRequestHandlerRaw(str, str2, getRequestHandlerRaw(str, str2, requestHandler));
    }

    public native Connection subscribe(RawSubscriptionContract rawSubscriptionContract);

    public Connection subscribe(String str, Callback callback, boolean z10) {
        return doSubscribeRaw(str, getRawCallback(callback), z10);
    }

    public Connection subscribeProtocolMethodRequest(String str, String str2, Callback callback, boolean z10) {
        return doSubscribeProtocolMethodRequestRaw(str, str2, getRawCallback(callback), z10);
    }

    public Connection subscribeProtocolMethodResponse(String str, String str2, Callback callback, boolean z10) {
        return doSubscribeProtocolMethodResponseRaw(str, str2, getRawCallback(callback), z10);
    }

    public Connection subscribeRaw(String str, RawCallback rawCallback) {
        return doSubscribeRaw(str, rawCallback, false);
    }

    private MessageBus() {
    }

    private static NewRawCallback getRawCallback(final NewCallback newCallback) {
        return new NewRawCallback() { // from class: com.roblox.universalapp.messagebus.a
            @Override // com.roblox.universalapp.messagebus.NewRawCallback
            public final boolean run(String str) {
                return MessageBus.a(newCallback, str);
            }
        };
    }

    public void setRequestHandler(String str, String str2, RequestHandlerAsync requestHandlerAsync) {
        setRequestHandlerAsyncRaw(str, str2, getRequestHandlerAsyncRaw(str, str2, requestHandlerAsync));
    }

    public Connection subscribe(String str, Callback callback) {
        return subscribe(str, callback, false);
    }

    public Connection subscribeProtocolMethodRequest(String str, String str2, Callback callback) {
        return subscribeProtocolMethodRequest(str, str2, callback, false);
    }

    public Connection subscribeProtocolMethodResponse(String str, String str2, Callback callback) {
        return subscribeProtocolMethodResponse(str, str2, callback, false);
    }

    public Connection subscribeRaw(String str, RawCallback rawCallback, boolean z10) {
        return doSubscribeRaw(str, rawCallback, z10);
    }

    public void makeRequest(String str, String str2, JSONObject jSONObject, Callback callback, JSONObject jSONObject2) {
        reportProtocolMethodRequestTelemetryData(str, str2, serializeMessageParams(jSONObject2));
        makeRequestRaw(str, str2, serializeMessageParams(jSONObject), getRawCallback(callback));
    }

    public void setRequestHandler(RequestHandlerContract requestHandlerContract) {
        setRequestHandler(new RawRequestHandlerContract(requestHandlerContract.getProtocolName(), requestHandlerContract.getMethodName(), getRequestHandlerRaw(requestHandlerContract.getProtocolName(), requestHandlerContract.getMethodName(), requestHandlerContract.getCallback())));
    }

    public Connection subscribe(SubscriptionContract subscriptionContract) {
        return subscribe(new RawSubscriptionContract(subscriptionContract.getMid(), getRawCallback(subscriptionContract.getCallback()), subscriptionContract.getDomain(), subscriptionContract.getDisconnectAfterReceive()));
    }

    public void makeRequest(MakeRequestContract makeRequestContract) {
        reportProtocolMethodRequestTelemetryData(makeRequestContract.getProtocolName(), makeRequestContract.getMethodName(), BuildConfig.FLAVOR);
        makeRequest(new MakeRequestContractRaw(makeRequestContract.getProtocolName(), makeRequestContract.getMethodName(), serializeMessageParams(makeRequestContract.getParams()), getRawCallback(makeRequestContract.getCallback())));
    }

    public void setRequestHandler(AsyncRequestHandlerContract asyncRequestHandlerContract) {
        setRequestHandlerAsync(new AsyncRequestHandlerRawContract(asyncRequestHandlerContract.getProtocolName(), asyncRequestHandlerContract.getMethodName(), getRequestHandlerAsyncRaw(asyncRequestHandlerContract.getProtocolName(), asyncRequestHandlerContract.getProtocolName(), asyncRequestHandlerContract.getCallback())));
    }

    public void makeRequest(MakeRequestContract makeRequestContract, JSONObject jSONObject) {
        reportProtocolMethodRequestTelemetryData(makeRequestContract.getProtocolName(), makeRequestContract.getMethodName(), serializeMessageParams(jSONObject));
        makeRequest(new MakeRequestContractRaw(makeRequestContract.getProtocolName(), makeRequestContract.getMethodName(), serializeMessageParams(makeRequestContract.getParams()), getRawCallback(makeRequestContract.getCallback())));
    }
}
