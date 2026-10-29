package p152go;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: go.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C6170p implements InterfaceC5830d<InterfaceC6158d> {

    /* JADX INFO: renamed from: a */
    public final C6161g f23545a;

    public C6170p(C6161g c6161g) {
        this.f23545a = c6161g;
    }

    /* JADX INFO: renamed from: a */
    public static C6170p m27189a(C6161g c6161g) {
        return new C6170p(c6161g);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6158d m27190c(C6161g c6161g) {
        return (InterfaceC6158d) C5834h.m26194e(c6161g.m27161i());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6158d get() {
        return m27190c(this.f23545a);
    }
}
