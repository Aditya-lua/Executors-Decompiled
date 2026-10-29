package com.withpersona.sdk2.inquiry.network.dto;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkInquiryModule_UserAgentFactory implements InterfaceC5830d<String> {

    public static final class InstanceHolder {
        static final NetworkInquiryModule_UserAgentFactory INSTANCE = new NetworkInquiryModule_UserAgentFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_UserAgentFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String userAgent() {
        return (String) C5834h.m26194e(NetworkInquiryModule.userAgent());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public String get() {
        return userAgent();
    }
}
