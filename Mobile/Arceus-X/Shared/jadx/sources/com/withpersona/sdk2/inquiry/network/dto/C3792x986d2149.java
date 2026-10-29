package com.withpersona.sdk2.inquiry.network.dto;

import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p471um.AbstractC11873h;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory */
/* JADX INFO: loaded from: classes3.dex */
public final class C3792x986d2149 implements InterfaceC5830d<Set<AbstractC11873h.e>> {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory$InstanceHolder */
    public static final class InstanceHolder {
        static final C3792x986d2149 INSTANCE = new C3792x986d2149();

        private InstanceHolder() {
        }
    }

    public static C3792x986d2149 create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory() {
        return (Set) C5834h.m26194e(NetworkInquiryModule.INSTANCE.provideMoshiJsonAdapterFactory());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Set<AbstractC11873h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
