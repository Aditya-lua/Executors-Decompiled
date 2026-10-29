package com.withpersona.sdk2.inquiry.p057ui.network;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p392qr.InterfaceC10703c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4179c implements InterfaceC5830d<C4178b.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC10703c> f17875a;

    public C4179c(InterfaceC5835i<InterfaceC10703c> interfaceC5835i) {
        this.f17875a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C4179c m21645a(InterfaceC5835i<InterfaceC10703c> interfaceC5835i) {
        return new C4179c(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C4178b.a m21646c(InterfaceC10703c interfaceC10703c) {
        return new C4178b.a(interfaceC10703c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4178b.a get() {
        return m21646c(this.f17875a.get());
    }
}
