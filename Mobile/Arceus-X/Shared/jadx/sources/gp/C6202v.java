package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;
import tr.InterfaceC11741a;

/* JADX INFO: renamed from: gp.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C6202v implements InterfaceC5830d<InterfaceC11741a> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23616a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23617b;

    public C6202v(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23616a = c3707f;
        this.f23617b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6202v m27309a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6202v(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC11741a m27310c(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC11741a) C5834h.m26194e(c3707f.m18769q(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC11741a get() {
        return m27310c(this.f23616a, this.f23617b.get());
    }
}
