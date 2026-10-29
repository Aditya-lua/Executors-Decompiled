package com.roblox.universalapp.cookie;

/* JADX INFO: loaded from: classes2.dex */
public class JNICookieProtocol {

    public interface OnSetCookieHandler {
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.cookie.JNICookieProtocol$a */
    public static class C3353a {

        /* JADX INFO: renamed from: a */
        public static final JNICookieProtocol f12747a = new JNICookieProtocol();
    }

    /* JADX INFO: renamed from: a */
    public static JNICookieProtocol m15987a() {
        return C3353a.f12747a;
    }

    public native void updateOnSetCookieHandler(OnSetCookieHandler onSetCookieHandler);
}
