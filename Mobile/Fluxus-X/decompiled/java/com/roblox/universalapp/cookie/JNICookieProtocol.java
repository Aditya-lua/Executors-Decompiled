package com.roblox.universalapp.cookie;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public class JNICookieProtocol {

    @Keep
    public interface OnSetCookieHandler {
        void onSetCookie(String[] strArr, String str);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JNICookieProtocol f9806a = new JNICookieProtocol();
    }

    public static JNICookieProtocol a() {
        return a.f9806a;
    }

    public native void updateOnSetCookieHandler(OnSetCookieHandler onSetCookieHandler);
}
