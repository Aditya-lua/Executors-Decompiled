package p082dp;

import androidx.p616lifecycle.C0967l0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: dp.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4653g implements InterfaceC5830d<C0967l0> {

    /* JADX INFO: renamed from: a */
    public final C4649c f19045a;

    public C4653g(C4649c c4649c) {
        this.f19045a = c4649c;
    }

    /* JADX INFO: renamed from: a */
    public static C4653g m22887a(C4649c c4649c) {
        return new C4653g(c4649c);
    }

    /* JADX INFO: renamed from: c */
    public static C0967l0 m22888c(C4649c c4649c) {
        return (C0967l0) C5834h.m26194e(c4649c.getSavedStateHandle());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0967l0 get() {
        return m22888c(this.f19045a);
    }
}
