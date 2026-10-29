package com.roblox.universalapp.cookie;

/* JADX INFO: loaded from: classes2.dex */
public class JNICookieProtocol {

    public interface OnSetCookieHandler {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JNICookieProtocol f9788a = new JNICookieProtocol();
    }

    public static JNICookieProtocol a() {
        return a.f9788a;
    }

    public native void updateOnSetCookieHandler(OnSetCookieHandler onSetCookieHandler);
}
