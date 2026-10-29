package com.withpersona.sdk2.inquiry.network.dto;

import ft.d;
import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkInquiryModule_Companion_UserAgentFactory implements d<String> {

    public static final class InstanceHolder {
        static final NetworkInquiryModule_Companion_UserAgentFactory INSTANCE = new NetworkInquiryModule_Companion_UserAgentFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_Companion_UserAgentFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String userAgent() {
        return (String) h.e(NetworkInquiryModule.INSTANCE.userAgent());
    }

    @Override // ht.a
    public String get() {
        return userAgent();
    }
}
