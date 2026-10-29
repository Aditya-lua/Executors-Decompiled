package p152go;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: go.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6164j implements InterfaceC5830d<InterfaceC6158d> {

    /* JADX INFO: renamed from: a */
    public final C6161g f23539a;

    public C6164j(C6161g c6161g) {
        this.f23539a = c6161g;
    }

    /* JADX INFO: renamed from: a */
    public static C6164j m27171a(C6161g c6161g) {
        return new C6164j(c6161g);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6158d m27172b(C6161g c6161g) {
        return (InterfaceC6158d) C5834h.m26194e(c6161g.m27155c());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6158d get() {
        return m27172b(this.f23539a);
    }
}
