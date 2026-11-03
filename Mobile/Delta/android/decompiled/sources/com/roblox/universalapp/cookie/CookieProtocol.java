package com.roblox.universalapp.cookie;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import com.roblox.universalapp.cookie.CookieProtocol;
import ek.q;
import lm.b;
import uk.e;
import uk.j;

/* JADX INFO: loaded from: classes2.dex */
public class CookieProtocol {

    public static class OnSetCookieHandlerImpl implements JNICookieProtocol.OnSetCookieHandler {
        private static final String TAG = "OnSetCookieHandlerImpl";

        public static /* synthetic */ void b(String str, Boolean bool) {
            if (bool.booleanValue()) {
                q.h(TAG, "Updated WebViewCookieHandler with Cookies from URL " + str);
                return;
            }
            q.e(TAG, "Failed to update WebViewCookieHandler with Cookies from URL " + str);
        }

        public void onSetCookie(String[] strArr, final String str) {
            for (final String str2 : strArr) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yl.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str;
                        j.c().h(str3, str2, new ValueCallback() { // from class: yl.a
                            @Override // android.webkit.ValueCallback
                            public final void onReceiveValue(Object obj) {
                                CookieProtocol.OnSetCookieHandlerImpl.b(str3, (Boolean) obj);
                            }
                        }, e.c.ENGINE_PUSH);
                    }
                });
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CookieProtocol f9868a = new CookieProtocol();
    }

    public static CookieProtocol a() {
        return a.f9868a;
    }

    @Keep
    public static void setCookie(String str, String str2) {
        q.b("CookieProtocol", "setCookie() url = " + str + " cookie = " + str2);
        j.c().i(str, str2, e.c.ENGINE_PUSH);
    }

    public CookieProtocol() {
        b.a(new OnSetCookieHandlerImpl());
    }
}
