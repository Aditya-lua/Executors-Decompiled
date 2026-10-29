package com.roblox.protocols.webview;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import mm.i;
import mm.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9733a = "WebViewProtocol";

    @NonNull
    public final nl.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f9734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f9735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f9736e;

    public class a implements i {
        public a() {
        }

        @Override // mm.i
        public l a(JSONObject jSONObject) {
            l lVar = new l();
            JSONObject jSONObject2 = new JSONObject();
            lVar.f24430a = jSONObject2;
            try {
                jSONObject2.put(WebViewProtocol.getAvailableKey(), true);
                return lVar;
            } catch (JSONException unused) {
                Log.e(WebViewProtocol.this.f9733a, "Failed to write Availability to JSON");
                return lVar;
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String strT = WebViewProtocol.this.t(jSONObject, WebViewProtocol.getUrlKey());
            if (strT == null) {
                Log.e(WebViewProtocol.this.f9733a, "Attempted to open WebView window with no URL");
                return;
            }
            String strT2 = WebViewProtocol.this.t(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject jSONObjectS = WebViewProtocol.this.s(jSONObject, WebViewProtocol.getSearchParamsKey());
            String strT3 = jSONObjectS != null ? WebViewProtocol.this.t(jSONObjectS, WebViewProtocol.getSearchTypeKey()) : null;
            Boolean boolR = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getIsVisibleKey());
            String strT4 = WebViewProtocol.this.t(jSONObject, WebViewProtocol.getWindowTypeKey());
            Boolean boolR2 = WebViewProtocol.this.r(jSONObject, WebViewProtocol.getShowDomainAsTitleKey());
            if (WebViewProtocol.getFFlagWebViewHasHideHeader()) {
                WebViewProtocol.this.b.a(strT, strT2, strT3, boolR, strT4, boolR2, WebViewProtocol.this.r(jSONObject, WebViewProtocol.getBackButtonVisibleKey()), WebViewProtocol.this.r(jSONObject, WebViewProtocol.getHideHeaderKey()));
            } else if (WebViewProtocol.getFFlagWebViewHasBackButtonVisible()) {
                WebViewProtocol.this.b.d(strT, strT2, strT3, boolR, strT4, boolR2, WebViewProtocol.this.r(jSONObject, WebViewProtocol.getBackButtonVisibleKey()));
            } else {
                WebViewProtocol.this.b.e(strT, strT2, strT3, boolR, strT4, boolR2);
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String strT = WebViewProtocol.this.t(jSONObject, WebViewProtocol.getUrlKey());
            String strT2 = WebViewProtocol.this.t(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject jSONObjectS = WebViewProtocol.this.s(jSONObject, WebViewProtocol.getSearchParamsKey());
            WebViewProtocol.this.b.b(strT, strT2, jSONObjectS != null ? WebViewProtocol.this.t(jSONObjectS, WebViewProtocol.getSearchTypeKey()) : null, WebViewProtocol.this.r(jSONObject, WebViewProtocol.getIsVisibleKey()), WebViewProtocol.this.t(jSONObject, WebViewProtocol.getWindowTypeKey()), WebViewProtocol.this.r(jSONObject, WebViewProtocol.getShowDomainAsTitleKey()));
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            WebViewProtocol.this.b.c();
        }
    }

    public WebViewProtocol(@NonNull com.roblox.protocols.webview.a.f fVar) {
        this.b = new com.roblox.protocols.webview.a(fVar);
        MessageBus.f().p(getProtocolName(), getIsAvailableId(), new a());
        this.f9734c = MessageBus.f().t(MessageBus.getMessageId(getProtocolName(), getOpenWindowId()), new b());
        this.f9735d = MessageBus.f().t(MessageBus.getMessageId(getProtocolName(), getMutateWindowId()), new c());
        this.f9736e = MessageBus.f().t(MessageBus.getMessageId(getProtocolName(), getCloseWindowId()), new d());
        initializeAndroidWebViewProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAvailableKey();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getBackButtonVisibleKey();

    private static native String getCloseWindowId();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getFFlagWebViewHasBackButtonVisible();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getFFlagWebViewHasHideHeader();

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

    public final Boolean r(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9733a, String.format("Received \"%s\" that is not a Boolean type", str));
            return null;
        }
    }

    public final JSONObject s(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getJSONObject(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9733a, String.format("Received \"%s\" that is not a JSON Object type", str));
            return null;
        }
    }

    public final String t(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f9733a, String.format("Received \"%s\" that is not a String type", str));
            return null;
        }
    }

    public void u(String str) {
        signalJavascriptCallback(str);
    }

    public void v() {
        MessageBus.f().l(MessageBus.getMessageId(getProtocolName(), getHandleWindowCloseId()), new JSONObject());
    }
}
