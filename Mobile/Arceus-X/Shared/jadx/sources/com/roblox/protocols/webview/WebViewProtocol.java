package com.roblox.protocols.webview;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import mm.C8595l;
import mm.InterfaceC8592i;
import nl.InterfaceC9493b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewProtocol {

    /* JADX INFO: renamed from: a */
    public String f12681a = "WebViewProtocol";

    /* JADX INFO: renamed from: b */
    @NonNull
    public final InterfaceC9493b f12682b;

    /* JADX INFO: renamed from: c */
    public Connection f12683c;

    /* JADX INFO: renamed from: d */
    public Connection f12684d;

    /* JADX INFO: renamed from: e */
    public Connection f12685e;

    /* JADX INFO: renamed from: com.roblox.protocols.webview.WebViewProtocol$a */
    public class C3336a implements InterfaceC8592i {
        public C3336a() {
        }

        @Override // mm.InterfaceC8592i
        /* JADX INFO: renamed from: a */
        public C8595l mo15880a(JSONObject jSONObject) {
            C8595l c8595l = new C8595l();
            JSONObject jSONObject2 = new JSONObject();
            c8595l.f31556a = jSONObject2;
            try {
                jSONObject2.put(WebViewProtocol.getAvailableKey(), true);
                return c8595l;
            } catch (JSONException unused) {
                Log.e(WebViewProtocol.this.f12681a, "Failed to write Availability to JSON");
                return c8595l;
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.WebViewProtocol$b */
    public class C3337b implements Callback {
        public C3337b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            String strM15913t = WebViewProtocol.this.m15913t(jSONObject, WebViewProtocol.getUrlKey());
            if (strM15913t == null) {
                Log.e(WebViewProtocol.this.f12681a, "Attempted to open WebView window with no URL");
                return;
            }
            String strM15913t2 = WebViewProtocol.this.m15913t(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject jSONObjectM15912s = WebViewProtocol.this.m15912s(jSONObject, WebViewProtocol.getSearchParamsKey());
            String strM15913t3 = jSONObjectM15912s != null ? WebViewProtocol.this.m15913t(jSONObjectM15912s, WebViewProtocol.getSearchTypeKey()) : null;
            Boolean boolM15911r = WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getIsVisibleKey());
            String strM15913t4 = WebViewProtocol.this.m15913t(jSONObject, WebViewProtocol.getWindowTypeKey());
            Boolean boolM15911r2 = WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getShowDomainAsTitleKey());
            if (WebViewProtocol.getFFlagWebViewHasHideHeader()) {
                WebViewProtocol.this.f12682b.mo15917a(strM15913t, strM15913t2, strM15913t3, boolM15911r, strM15913t4, boolM15911r2, WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getBackButtonVisibleKey()), WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getHideHeaderKey()));
            } else if (WebViewProtocol.getFFlagWebViewHasBackButtonVisible()) {
                WebViewProtocol.this.f12682b.mo15920d(strM15913t, strM15913t2, strM15913t3, boolM15911r, strM15913t4, boolM15911r2, WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getBackButtonVisibleKey()));
            } else {
                WebViewProtocol.this.f12682b.mo15921e(strM15913t, strM15913t2, strM15913t3, boolM15911r, strM15913t4, boolM15911r2);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.WebViewProtocol$c */
    public class C3338c implements Callback {
        public C3338c() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            String strM15913t = WebViewProtocol.this.m15913t(jSONObject, WebViewProtocol.getUrlKey());
            String strM15913t2 = WebViewProtocol.this.m15913t(jSONObject, WebViewProtocol.getTitleKey());
            JSONObject jSONObjectM15912s = WebViewProtocol.this.m15912s(jSONObject, WebViewProtocol.getSearchParamsKey());
            WebViewProtocol.this.f12682b.mo15918b(strM15913t, strM15913t2, jSONObjectM15912s != null ? WebViewProtocol.this.m15913t(jSONObjectM15912s, WebViewProtocol.getSearchTypeKey()) : null, WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getIsVisibleKey()), WebViewProtocol.this.m15913t(jSONObject, WebViewProtocol.getWindowTypeKey()), WebViewProtocol.this.m15911r(jSONObject, WebViewProtocol.getShowDomainAsTitleKey()));
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.WebViewProtocol$d */
    public class C3339d implements Callback {
        public C3339d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            WebViewProtocol.this.f12682b.mo15919c();
        }
    }

    public WebViewProtocol(@NonNull C3340a.f fVar) {
        this.f12682b = new C3340a(fVar);
        MessageBus.m16016f().m16026p(getProtocolName(), getIsAvailableId(), new C3336a());
        this.f12683c = MessageBus.m16016f().m16030t(MessageBus.getMessageId(getProtocolName(), getOpenWindowId()), new C3337b());
        this.f12684d = MessageBus.m16016f().m16030t(MessageBus.getMessageId(getProtocolName(), getMutateWindowId()), new C3338c());
        this.f12685e = MessageBus.m16016f().m16030t(MessageBus.getMessageId(getProtocolName(), getCloseWindowId()), new C3339d());
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

    /* JADX INFO: renamed from: r */
    public final Boolean m15911r(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f12681a, String.format("Received \"%s\" that is not a Boolean type", str));
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final JSONObject m15912s(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getJSONObject(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f12681a, String.format("Received \"%s\" that is not a JSON Object type", str));
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final String m15913t(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        } catch (JSONException unused) {
            Log.e(this.f12681a, String.format("Received \"%s\" that is not a String type", str));
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m15914u(String str) {
        signalJavascriptCallback(str);
    }

    /* JADX INFO: renamed from: v */
    public void m15915v() {
        MessageBus.m16016f().m16024l(MessageBus.getMessageId(getProtocolName(), getHandleWindowCloseId()), new JSONObject());
    }
}
