package p152go;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: go.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6166l implements InterfaceC5830d<InterfaceC6158d> {

    /* JADX INFO: renamed from: a */
    public final C6161g f23541a;

    public C6166l(C6161g c6161g) {
        this.f23541a = c6161g;
    }

    /* JADX INFO: renamed from: a */
    public static C6166l m27177a(C6161g c6161g) {
        return new C6166l(c6161g);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6158d m27178b(C6161g c6161g) {
        return (InterfaceC6158d) C5834h.m26194e(c6161g.m27157e());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6158d get() {
        return m27178b(this.f23541a);
    }
}
