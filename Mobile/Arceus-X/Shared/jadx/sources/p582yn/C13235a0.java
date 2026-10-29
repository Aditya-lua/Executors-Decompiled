package p582yn;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13235a0 implements InterfaceC5830d<C13263z> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f46575a;

    public C13235a0(InterfaceC5835i<Context> interfaceC5835i) {
        this.f46575a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13235a0 m48950a(InterfaceC5835i<Context> interfaceC5835i) {
        return new C13235a0(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C13263z m48951c(Context context) {
        return new C13263z(context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13263z get() {
        return m48951c(this.f46575a.get());
    }
}
