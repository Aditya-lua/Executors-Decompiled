package p212j8;

import android.content.Context;
import ht.InterfaceC6564a;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: j8.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7079u0 implements InterfaceC4470b<C7077t0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Context> f27673a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<String> f27674b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<Integer> f27675c;

    public C7079u0(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<String> interfaceC6564a2, InterfaceC6564a<Integer> interfaceC6564a3) {
        this.f27673a = interfaceC6564a;
        this.f27674b = interfaceC6564a2;
        this.f27675c = interfaceC6564a3;
    }

    /* JADX INFO: renamed from: a */
    public static C7079u0 m29842a(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<String> interfaceC6564a2, InterfaceC6564a<Integer> interfaceC6564a3) {
        return new C7079u0(interfaceC6564a, interfaceC6564a2, interfaceC6564a3);
    }

    /* JADX INFO: renamed from: c */
    public static C7077t0 m29843c(Context context, String str, int i10) {
        return new C7077t0(context, str, i10);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7077t0 get() {
        return m29843c(this.f27673a.get(), this.f27674b.get(), this.f27675c.get().intValue());
    }
}
