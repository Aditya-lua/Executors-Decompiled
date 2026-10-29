package com.roblox.universalapp.cookie;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import com.roblox.universalapp.cookie.CookieProtocol;
import p151gk.C6124q;
import p311nm.C9495b;
import p520wk.C12483e;
import p520wk.C12488j;

/* JADX INFO: loaded from: classes2.dex */
public class CookieProtocol {

    public static class OnSetCookieHandlerImpl implements JNICookieProtocol.OnSetCookieHandler {
        private static final String TAG = "OnSetCookieHandlerImpl";

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m15985b(String str, Boolean bool) {
            if (bool.booleanValue()) {
                C6124q.m27063h(TAG, "Updated WebViewCookieHandler with Cookies from URL " + str);
                return;
            }
            C6124q.m27060e(TAG, "Failed to update WebViewCookieHandler with Cookies from URL " + str);
        }

        public void onSetCookie(String[] strArr, final String str) {
            for (final String str2 : strArr) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: am.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str;
                        C12488j.m46781c().m46784h(str3, str2, new ValueCallback() { // from class: am.a
                            @Override // android.webkit.ValueCallback
                            public final void onReceiveValue(Object obj) {
                                CookieProtocol.OnSetCookieHandlerImpl.m15985b(str3, (Boolean) obj);
                            }
                        }, C12483e.b.ENGINE_PUSH);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.cookie.CookieProtocol$a */
    public static class C3352a {

        /* JADX INFO: renamed from: a */
        public static final CookieProtocol f12746a = new CookieProtocol();
    }

    /* JADX INFO: renamed from: a */
    public static CookieProtocol m15983a() {
        return C3352a.f12746a;
    }

    @Keep
    public static void setCookie(String str, String str2) {
        C6124q.m27057b("CookieProtocol", "setCookie() url = " + str + " cookie = " + str2);
        C12488j.m46781c().m46785i(str, str2, C12483e.b.ENGINE_PUSH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CookieProtocol() {
        C9495b.m37431a(new OnSetCookieHandlerImpl());
    }
}
