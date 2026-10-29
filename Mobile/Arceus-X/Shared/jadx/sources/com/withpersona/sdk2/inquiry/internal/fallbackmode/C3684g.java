package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import p136ft.InterfaceC5835i;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3684g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C11888w> f15208a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f15209b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3686i.a> f15210c;

    public C3684g(InterfaceC5835i<C11888w> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C3686i.a> interfaceC5835i3) {
        this.f15208a = interfaceC5835i;
        this.f15209b = interfaceC5835i2;
        this.f15210c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C3684g m18501a(InterfaceC5835i<C11888w> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C3686i.a> interfaceC5835i3) {
        return new C3684g(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3683f m18502c(C11888w c11888w, Context context, C3686i.a aVar, int i10) {
        return new C3683f(c11888w, context, aVar, i10);
    }

    /* JADX INFO: renamed from: b */
    public C3683f m18503b(int i10) {
        return m18502c(this.f15208a.get(), this.f15209b.get(), this.f15210c.get(), i10);
    }
}
