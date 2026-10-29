package p582yn;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C13246i implements InterfaceC5830d<InterfaceC13240d> {

    /* JADX INFO: renamed from: a */
    public final C13242e f46594a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C13257t> f46595b;

    public C13246i(C13242e c13242e, InterfaceC5835i<C13257t> interfaceC5835i) {
        this.f46594a = c13242e;
        this.f46595b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13246i m48994a(C13242e c13242e, InterfaceC5835i<C13257t> interfaceC5835i) {
        return new C13246i(c13242e, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC13240d m48995b(C13242e c13242e, C13257t c13257t) {
        return (InterfaceC13240d) C5834h.m26194e(c13242e.m48983d(c13257t));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC13240d get() {
        return m48995b(this.f46594a, this.f46595b.get());
    }
}
