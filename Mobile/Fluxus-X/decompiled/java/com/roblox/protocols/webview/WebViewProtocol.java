package com.roblox.protocols.webview;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.messagebus.RequestHandler;
import com.roblox.universalapp.messagebus.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9753a = "WebViewProtocol";

    @NonNull
    public final bm.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f9754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f9755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f9756e;

    public class a implements RequestHandler {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandler
        public Response run(JSONObject jSONObject) {
            Response response = new Response();
            JSONObject jSONObject2 = new JSONObject();
            response.params = jSONObject2;
            try {
                jSONObject2.put(WebViewProtocol.getAvailableKey(), true);
                return response;
            } catch (JSONException unused) {
                Log.e(WebViewProtocol.this.f9753a, "Failed to write Availability to JSON");
                return response;
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            String strR = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getUrlKey());
            if (strR == null) {
                Log.e(WebViewProtocol.this.f9753a, "Attempted to open WebView window with no URL");
                return;
            }
            String strR2 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject jSONObjectQ = WebViewProtocol.this.q(jSONObject, WebViewProtocol.getSearchParamsKey());
            WebViewProtocol.this.b.a(strR, strR2, jSONObjectQ != null ? WebViewProtocol.this.r(jSONObjectQ, WebViewProtocol.getSearchTypeKey()) : null, WebViewProtocol.this.p(jSONObject, WebViewProtocol.getIsVisibleKey()), WebViewProtocol.this.r(jSONObject, WebViewProtocol.getWindowTypeKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getShowDomainAsTitleKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getBackButtonVisibleKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getHideHeaderKey()));
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            String strR = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getUrlKey());
            String strR2 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject jSONObjectQ = WebViewProtocol.this.q(jSONObject, WebViewProtocol.getSearchParamsKey());
            WebViewProtocol.this.b.b(strR, strR2, jSONObjectQ != null ? WebViewProtocol.this.r(jSONObjectQ, WebViewProtocol.getSearchTypeKey()) : null, WebViewProtocol.this.p(jSONObject, WebViewProtocol.getIsVisibleKey()), WebViewProtocol.this.r(jSONObject, WebViewProtocol.getWindowTypeKey()), WebViewProtocol.this.p(jSONObject, WebViewProtocol.getShowDomainAsTitleKey()));
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            WebViewProtocol.this.b.c();
        }
    }

    public WebViewProtocol(@NonNull com.roblox.protocols.webview.a.d dVar) {
        this.b = new com.roblox.protocols.webview.a(dVar);
        MessageBus.getInstance().setRequestHandler(getProtocolName(), getIsAvailableId(), new a());
        this.f9754c = MessageBus.getInstance().subscribe(MessageBus.getMessageId(getProtocolName(), getOpenWindowId()), new b());
        this.f9755d = MessageBus.getInstance().subscribe(MessageBus.getMessageId(getProtocolName(), getMutateWindowId()), new c());
        this.f9756e = MessageBus.getInstance().subscribe(MessageBus.getMessageId(getProtocolName(), getCloseWindowId()), new d());
        initializeAndroidWebViewProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAvailableKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getBackButtonVisibleKey();

    private static native String getCloseWindowId();

    private static native String getHandleWindowCloseId();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getHideHeaderKey();

    private static native String getIsAvailableId();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getIsVisibleKey();

    private static native String getMutateWindowId();

    private static native String getOpenWindowId();

    private static native String getProtocolName();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getSearchParamsKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getSearchTypeKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getShowDomainAsTitleKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getTitleKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getUrlKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getWindowTypeKey();

    private static native void initializeAndroidWebViewProtocol();

    public static native void signalJavascriptCallback(String str);

    public final Boolean p(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9753a, String.format("Received \"%s\" that is not a Boolean type", str));
            return null;
        }
    }

    public final JSONObject q(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getJSONObject(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9753a, String.format("Received \"%s\" that is not a JSON Object type", str));
            return null;
        }
    }

    public final String r(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9753a, String.format("Received \"%s\" that is not a String type", str));
            return null;
        }
    }

    public void s(String str) {
        signalJavascriptCallback(str);
    }

    public void t() {
        MessageBus.getInstance().publish(MessageBus.getMessageId(getProtocolName(), getHandleWindowCloseId()), new JSONObject());
    }
}
