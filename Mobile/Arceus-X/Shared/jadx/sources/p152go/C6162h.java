package p152go;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: go.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6162h implements InterfaceC5830d<InterfaceC6158d> {

    /* JADX INFO: renamed from: a */
    public final C6161g f23537a;

    public C6162h(C6161g c6161g) {
        this.f23537a = c6161g;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6158d m27165a(C6161g c6161g) {
        return (InterfaceC6158d) C5834h.m26194e(c6161g.m27153a());
    }

    /* JADX INFO: renamed from: b */
    public static C6162h m27166b(C6161g c6161g) {
        return new C6162h(c6161g);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6158d get() {
        return m27165a(this.f23537a);
    }
}
