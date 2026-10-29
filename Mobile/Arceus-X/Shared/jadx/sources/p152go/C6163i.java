package p152go;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: go.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6163i implements InterfaceC5830d<InterfaceC6158d> {

    /* JADX INFO: renamed from: a */
    public final C6161g f23538a;

    public C6163i(C6161g c6161g) {
        this.f23538a = c6161g;
    }

    /* JADX INFO: renamed from: a */
    public static C6163i m27168a(C6161g c6161g) {
        return new C6163i(c6161g);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6158d m27169b(C6161g c6161g) {
        return (InterfaceC6158d) C5834h.m26194e(c6161g.m27154b());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6158d get() {
        return m27169b(this.f23538a);
    }
}
