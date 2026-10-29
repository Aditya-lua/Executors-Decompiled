package io;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.C3544e;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p391qq.C10700c;

/* JADX INFO: renamed from: io.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6856e implements InterfaceC5830d<C3544e> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<String[]>> f26903a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f26904b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10700c> f26905c;

    public C6856e(InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        this.f26903a = interfaceC5835i;
        this.f26904b = interfaceC5835i2;
        this.f26905c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C6856e m29305a(InterfaceC5835i<AbstractC5854c<String[]>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        return new C6856e(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3544e m29306c(AbstractC5854c<String[]> abstractC5854c, Context context, C10700c c10700c) {
        return new C3544e(abstractC5854c, context, c10700c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3544e get() {
        return m29306c(this.f26903a.get(), this.f26904b.get(), this.f26905c.get());
    }
}
