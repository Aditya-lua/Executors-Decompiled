package p276ln;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: ln.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8171c implements InterfaceC5830d<C8170b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f30345a;

    public C8171c(InterfaceC5835i<Context> interfaceC5835i) {
        this.f30345a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C8171c m33450a(InterfaceC5835i<Context> interfaceC5835i) {
        return new C8171c(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C8170b m33451c(Context context) {
        return new C8170b(context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8170b get() {
        return m33451c(this.f30345a.get());
    }
}
