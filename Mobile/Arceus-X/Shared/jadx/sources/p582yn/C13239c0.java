package p582yn;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13239c0 implements InterfaceC5830d<C13237b0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f46581a;

    public C13239c0(InterfaceC5835i<Context> interfaceC5835i) {
        this.f46581a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13239c0 m48964a(InterfaceC5835i<Context> interfaceC5835i) {
        return new C13239c0(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C13237b0 m48965c(Context context) {
        return new C13237b0(context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13237b0 get() {
        return m48965c(this.f46581a.get());
    }
}
