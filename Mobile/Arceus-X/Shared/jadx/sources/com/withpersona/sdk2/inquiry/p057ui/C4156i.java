package com.withpersona.sdk2.inquiry.p057ui;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C4156i implements InterfaceC5830d<C4155h.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<String[]>> f17732a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<AbstractC5854c<String[]>> f17733b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<Context> f17734c;

    public C4156i(InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i, InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i2, InterfaceC5835i<Context> interfaceC5835i3) {
        this.f17732a = interfaceC5835i;
        this.f17733b = interfaceC5835i2;
        this.f17734c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C4156i m21508a(InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i, InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i2, InterfaceC5835i<Context> interfaceC5835i3) {
        return new C4156i(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C4155h.a m21509c(AbstractC5854c<String[]> abstractC5854c, AbstractC5854c<String[]> abstractC5854c2, Context context) {
        return new C4155h.a(abstractC5854c, abstractC5854c2, context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4155h.a get() {
        return m21509c(this.f17732a.get(), this.f17733b.get(), this.f17734c.get());
    }
}
