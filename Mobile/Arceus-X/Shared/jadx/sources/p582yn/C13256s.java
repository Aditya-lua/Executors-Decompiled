package p582yn;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C13256s implements InterfaceC5830d<C13255r> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f46610a;

    public C13256s(InterfaceC5835i<Context> interfaceC5835i) {
        this.f46610a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13256s m49011a(InterfaceC5835i<Context> interfaceC5835i) {
        return new C13256s(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C13255r m49012c(Context context) {
        return new C13255r(context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13255r get() {
        return m49012c(this.f46610a.get());
    }
}
