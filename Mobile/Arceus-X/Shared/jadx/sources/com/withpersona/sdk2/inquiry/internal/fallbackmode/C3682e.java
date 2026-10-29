package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3682e implements InterfaceC5830d<C3681d> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<FallbackModeService> f15201a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C11888w> f15202b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3686i.a> f15203c;

    public C3682e(InterfaceC5835i<FallbackModeService> interfaceC5835i, InterfaceC5835i<C11888w> interfaceC5835i2, InterfaceC5835i<C3686i.a> interfaceC5835i3) {
        this.f15201a = interfaceC5835i;
        this.f15202b = interfaceC5835i2;
        this.f15203c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C3682e m18497a(InterfaceC5835i<FallbackModeService> interfaceC5835i, InterfaceC5835i<C11888w> interfaceC5835i2, InterfaceC5835i<C3686i.a> interfaceC5835i3) {
        return new C3682e(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3681d m18498c(FallbackModeService fallbackModeService, C11888w c11888w, C3686i.a aVar) {
        return new C3681d(fallbackModeService, c11888w, aVar);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3681d get() {
        return m18498c(this.f15201a.get(), this.f15202b.get(), this.f15203c.get());
    }
}
