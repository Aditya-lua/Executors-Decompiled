package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p139g.C5859h;
import p391qq.C10700c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3447j implements InterfaceC5830d<C3446i.b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<String[]>> f13262a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<AbstractC5854c<C5859h>> f13263b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<Context> f13264c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C10700c> f13265d;

    public C3447j(InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i, InterfaceC5835i<AbstractC5854c<C5859h>> interfaceC5835i2, InterfaceC5835i<Context> interfaceC5835i3, InterfaceC5835i<C10700c> interfaceC5835i4) {
        this.f13262a = interfaceC5835i;
        this.f13263b = interfaceC5835i2;
        this.f13264c = interfaceC5835i3;
        this.f13265d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C3447j m16643a(InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i, InterfaceC5835i<AbstractC5854c<C5859h>> interfaceC5835i2, InterfaceC5835i<Context> interfaceC5835i3, InterfaceC5835i<C10700c> interfaceC5835i4) {
        return new C3447j(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C3446i.b m16644c(AbstractC5854c<String[]> abstractC5854c, AbstractC5854c<C5859h> abstractC5854c2, Context context, C10700c c10700c) {
        return new C3446i.b(abstractC5854c, abstractC5854c2, context, c10700c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3446i.b get() {
        return m16644c(this.f13262a.get(), this.f13263b.get(), this.f13264c.get(), this.f13265d.get());
    }
}
