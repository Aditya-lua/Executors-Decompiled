package j8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements d8.b<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Context> f21160a;
    public final ht.a<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<Integer> f21161c;

    public u0(ht.a<Context> aVar, ht.a<String> aVar2, ht.a<Integer> aVar3) {
        this.f21160a = aVar;
        this.b = aVar2;
        this.f21161c = aVar3;
    }

    public static u0 a(ht.a<Context> aVar, ht.a<String> aVar2, ht.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f21160a.get(), this.b.get(), this.f21161c.get().intValue());
    }
}
