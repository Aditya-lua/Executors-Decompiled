package p152go;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: go.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6169o implements InterfaceC5830d<InterfaceC6158d> {

    /* JADX INFO: renamed from: a */
    public final C6161g f23544a;

    public C6169o(C6161g c6161g) {
        this.f23544a = c6161g;
    }

    /* JADX INFO: renamed from: a */
    public static C6169o m27186a(C6161g c6161g) {
        return new C6169o(c6161g);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6158d m27187c(C6161g c6161g) {
        return (InterfaceC6158d) C5834h.m26194e(c6161g.m27160h());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6158d get() {
        return m27187c(this.f23544a);
    }
}
