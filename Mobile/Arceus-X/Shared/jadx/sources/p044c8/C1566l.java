package p044c8;

import android.content.Context;
import ht.InterfaceC6564a;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: c8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1566l implements InterfaceC4470b<C1565k> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Context> f6274a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<C1563i> f6275b;

    public C1566l(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<C1563i> interfaceC6564a2) {
        this.f6274a = interfaceC6564a;
        this.f6275b = interfaceC6564a2;
    }

    /* JADX INFO: renamed from: a */
    public static C1566l m8174a(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<C1563i> interfaceC6564a2) {
        return new C1566l(interfaceC6564a, interfaceC6564a2);
    }

    /* JADX INFO: renamed from: c */
    public static C1565k m8175c(Context context, Object obj) {
        return new C1565k(context, (C1563i) obj);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1565k get() {
        return m8175c(this.f6274a.get(), this.f6275b.get());
    }
}
