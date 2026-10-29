package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p176ho.InterfaceC6474a;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6188h implements InterfaceC5830d<InterfaceC6474a> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23595a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23596b;

    public C6188h(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23595a = c3707f;
        this.f23596b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6188h m27267a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6188h(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6474a m27268b(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC6474a) C5834h.m26194e(c3707f.m18760c(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6474a get() {
        return m27268b(this.f23595a, this.f23596b.get());
    }
}
