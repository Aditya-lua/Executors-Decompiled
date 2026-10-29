package p610zo;

import android.content.Context;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: zo.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C13978p implements InterfaceC5830d<Context> {

    /* JADX INFO: renamed from: a */
    public final C13974n f48845a;

    public C13978p(C13974n c13974n) {
        this.f48845a = c13974n;
    }

    /* JADX INFO: renamed from: a */
    public static Context m50515a(C13974n c13974n) {
        return (Context) C5834h.m26194e(c13974n.m50503b());
    }

    /* JADX INFO: renamed from: b */
    public static C13978p m50516b(C13974n c13974n) {
        return new C13978p(c13974n);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return m50515a(this.f48845a);
    }
}
