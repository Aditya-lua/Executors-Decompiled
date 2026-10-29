package com.withpersona.sdk2.inquiry.p057ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.p057ui.network.C4178b;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p392qr.C10701a;
import p612zq.C14035a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4150c implements InterfaceC5830d<C4148a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f17659a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C4178b.a> f17660b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10701a.a> f17661c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C14035a.a> f17662d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C4155h.a> f17663e;

    public C4150c(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C4178b.a> interfaceC5835i2, InterfaceC5835i<C10701a.a> interfaceC5835i3, InterfaceC5835i<C14035a.a> interfaceC5835i4, InterfaceC5835i<C4155h.a> interfaceC5835i5) {
        this.f17659a = interfaceC5835i;
        this.f17660b = interfaceC5835i2;
        this.f17661c = interfaceC5835i3;
        this.f17662d = interfaceC5835i4;
        this.f17663e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C4150c m21353a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C4178b.a> interfaceC5835i2, InterfaceC5835i<C10701a.a> interfaceC5835i3, InterfaceC5835i<C14035a.a> interfaceC5835i4, InterfaceC5835i<C4155h.a> interfaceC5835i5) {
        return new C4150c(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C4148a m21354c(Context context, C4178b.a aVar, C10701a.a aVar2, C14035a.a aVar3, C4155h.a aVar4) {
        return new C4148a(context, aVar, aVar2, aVar3, aVar4);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4148a get() {
        return m21354c(this.f17659a.get(), this.f17660b.get(), this.f17661c.get(), this.f17662d.get(), this.f17663e.get());
    }
}
