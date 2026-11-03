package j8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements d8.b<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f21733a;
    public final ft.a<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.a<Integer> f21734c;

    public u0(ft.a<Context> aVar, ft.a<String> aVar2, ft.a<Integer> aVar3) {
        this.f21733a = aVar;
        this.b = aVar2;
        this.f21734c = aVar3;
    }

    public static u0 a(ft.a<Context> aVar, ft.a<String> aVar2, ft.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f21733a.get(), this.b.get(), this.f21734c.get().intValue());
    }
}
